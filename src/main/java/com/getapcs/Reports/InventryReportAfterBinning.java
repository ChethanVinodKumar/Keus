package com.getapcs.Reports;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.getapcs.base.Testbase1;
import com.getapcs.home.login.HomePage;

public class InventryReportAfterBinning extends Testbase1 {

	// Material Issue

	@FindBy(xpath = "(//span[@class='dropdown-multiselect__caret'])[1]")
	WebElement partType;

	@FindBy(xpath = "(//span[@class='dropdown-btn'])[2]")
	WebElement projectNumber;

	@FindBy(xpath = "(//input[@placeholder='Search'])[2]")
	WebElement searchPartType;

	@FindBy(xpath = "(//input[@placeholder='Search'])[3]")
	WebElement searchprojectNumber;

	@FindBy(xpath = "(//button[normalize-space()='Filter'])[1]")
	WebElement filter;

	@FindBy(xpath = "(//input[@placeholder='Search'])[4]")
	WebElement searchwareHouse;

	@FindBy(xpath = "(//div[normalize-space()='HYD-BH-RD5'])[1]")
	WebElement warehouseSelect;

	@FindBy(xpath = "(//div[normalize-space()='room no1'])[1]")
	WebElement locationSelect;

	@FindBy(xpath = "(//input[@placeholder='Search'])[5]")
	WebElement searchlocation;

	@FindBy(xpath = "(//i[@title='Project Numbers'])[1]")
	WebElement binning;

	@FindBy(xpath = "(//span[normalize-space()='»»'])[1]")
	WebElement paginationLast;

	@FindBy(xpath = "(//i[@class='mdi mdi-eye edit-icon'])[1]")
	WebElement viewButton;

	@FindBy(xpath = "(//i[@title='Binning Location'])[1]")
	WebElement binningWarehoseAndlocation;

	@FindBy(xpath = "//*[@class='table table-striped']/tbody/tr/td[9]")
	WebElement warehouse;

	@FindBy(xpath = "//*[@class='table table-striped']/tbody/tr/td[10]")
	WebElement location;

	@FindBy(xpath = "//*[@class='table table-striped']/tbody/tr[2]/td[9]")
	WebElement warehouse1;

	@FindBy(xpath = "//*[@class='table table-striped']/tbody/tr[2]/td[10]")
	WebElement location1;

	public InventryReportAfterBinning() {

		PageFactory.initElements(driver, this);

	}

	// *************Inventry Report Page******************//

	public HomePage InventryReportPage() throws InterruptedException, IOException {

		// Part Type

		driver.navigate().to("https://demo_keus.getapcs.com/transaction/binning/table");

		click(driver, viewButton);

		String tableXpath = "//table[@class='table mb-2']";

		// Get the first PR number text from table
		String partType1 = driver.findElement(By.xpath(tableXpath + "/tbody/tr[1]/td[3]")).getText();

		// Remove leading and trailing whitespaces
		partType1 = partType1.trim();

		// Remove the trailing hyphen and any characters after it
		int hyphenIndex = partType1.indexOf(" -");
		if (hyphenIndex != -1) {
			partType1 = partType1.substring(0, hyphenIndex);
		}

		// Store the element with hard coded PR number
		String elementXpath = "(//div[normalize-space()='PP-54'])[1]";

		String updatedXpath = elementXpath.replace("PP-54", partType1);

		System.out.println(updatedXpath);

		click(driver, binningWarehoseAndlocation);

		String tableXpath1 = "//table[@class='table table-striped']";

		// Get the first PR number text from table
		String warehouseInBinning = driver.findElement(By.xpath(tableXpath1 + "/tbody/tr[1]/td[1]")).getText();

		String locationInBinning = driver.findElement(By.xpath(tableXpath1 + "/tbody/tr[1]/td[2]")).getText();

		String warehouseInBinning1 = driver.findElement(By.xpath(tableXpath1 + "/tbody/tr[2]/td[1]")).getText();

		String locationInBinning1 = driver.findElement(By.xpath(tableXpath1 + "/tbody/tr[2]/td[2]")).getText();

//		// project Number
//
//		String tableXpath1 = "//table[@class='table table-striped']";
//
//		// Get the first PR number text from table
//		String projectNumber1 = driver.findElement(By.xpath(tableXpath1 + "/tbody/tr[1]/td[1]")).getText();
//
//		// Store the element with hard coded PR number
//		String elementXpath1 = "(//div[normalize-space()='PP-54'])[1]";
//
//		String updatedXpath1 = elementXpath1.replace("PP-54", projectNumber1);
//
//		System.out.println(updatedXpath1);
//
		driver.navigate().to("https://demo_keus.getapcs.com/reports/inventory-report");

		// Part Type

		click(driver, partType);

		click(driver, searchPartType);
		searchPartType.sendKeys(partType1);

		WebElement partTypeSelect = driver.findElement(By.xpath(updatedXpath));

		click(driver, partTypeSelect);

//		// Part Type
//
//		click(driver, projectNumber);
//
//		click(driver, searchprojectNumber);
//		searchprojectNumber.sendKeys(projectNumber1);
//
//		WebElement projectNumberSelect1 = driver.findElement(By.xpath(updatedXpath1));
//
//		click(driver, projectNumberSelect1);

		// Filter

		click(driver, filter);

		String warehouse_text = warehouse.getText();
		String location_text = location.getText();
		String warehouse_text1 = warehouse1.getText();
		String location_text1 = location1.getText();

//		 Assert that the warehouse and location texts are equal to Binning Warehouse
//		 and location
		assert warehouse_text.equals(warehouseInBinning) && location_text.equals(locationInBinning)
				: "Texts are not equal to Binning Wrehouse an location";
		assert warehouse_text1.equals(warehouseInBinning1) && location_text1.equals(locationInBinning1)
				: "Texts are not equal to Binning Wrehouse an location";

//		assertEquals("Concatenated warehouse and location texts are not equal to expected value",
//				warehouseInBinning + locationInBinning, warehouse_text + location_text);
//
//		assertEquals("Concatenated warehouse and location texts are not equal to expected value",
//				warehouseInBinning1 + locationInBinning1, warehouse_text1 + location_text1);

		Thread.sleep(4000);
		screenShot("After Binning");

		return new HomePage();
	}

}
