package com.getapcs.Reports;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.getapcs.base.Testbase1;
import com.getapcs.home.login.HomePage;

public class InventryReportAfterOQCBinning extends Testbase1 {

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

	@FindBy(xpath = "(//i[@class='mdi mdi-eye edit-icon'])[1]")
	WebElement editButton;

	@FindBy(xpath = "(//i[@title='Add Project'])[1]")
	WebElement addProject;

	@FindBy(xpath = "//*[@class='table table-striped']/tbody/tr[3]/td[9]")
	WebElement warehouse;

	@FindBy(xpath = "//*[@class='table table-striped']/tbody/tr[3]/td[10]")
	WebElement location;

	@FindBy(xpath = "//*[@class='table table-striped']/tbody/tr[4]/td[9]")
	WebElement warehouse1;

	@FindBy(xpath = "//*[@class='table table-striped']/tbody/tr[4]/td[10]")
	WebElement location1;

	@FindBy(xpath = "//*[@class='table table-striped']/tbody/tr[3]/td[8]")
	WebElement quantity;

	@FindBy(xpath = "//*[@class='table table-striped']/tbody/tr[4]/td[8]")
	WebElement quantity1;

	@FindBy(xpath = "(//i[@title='CLick to view'])[1]")
	WebElement viewButton;

	public InventryReportAfterOQCBinning() {

		PageFactory.initElements(driver, this);

	}

	// *************Inventry Report Page******************//

	public HomePage InventryReportPage() throws InterruptedException, IOException {

//Part Type

		driver.navigate().to("https://demo_keus.getapcs.com/transaction/oqc-binning");

		String tableXpath = "//table[@class='table table-striped']";

		String partType1 = driver.findElement(By.xpath(tableXpath + "/tbody/tr[1]/td[2]")).getText();

		String elementXpath = "(//div[normalize-space()='PP-54'])[1]";

		String updatedXpath = elementXpath.replace("PP-54", partType1);

		System.out.println(updatedXpath);

		click(driver, viewButton);

		String tableXpath1 = "//table[@class='table table-striped']";

		// Get the first PR number text from table
		String warehouseInOQCBinning = driver.findElement(By.xpath(tableXpath1 + "/tbody/tr[1]/td[1]")).getText();

		String locationInOQCBinning = driver.findElement(By.xpath(tableXpath1 + "/tbody/tr[1]/td[2]")).getText();

		String QuantityInOQCBinning = driver.findElement(By.xpath(tableXpath1 + "/tbody/tr[1]/td[3]")).getText();

		String warehouseInOQCBinning1 = driver.findElement(By.xpath(tableXpath1 + "/tbody/tr[2]/td[1]")).getText();

		String locationInOQCBinning1 = driver.findElement(By.xpath(tableXpath1 + "/tbody/tr[2]/td[2]")).getText();

		String QuantityInOQCBinning1 = driver.findElement(By.xpath(tableXpath1 + "/tbody/tr[2]/td[3]")).getText();

		driver.navigate().to("https://demo_keus.getapcs.com/reports/inventory-report");

//Part Type

		click(driver, partType);

		click(driver, searchPartType);
		searchPartType.sendKeys(partType1);

		WebElement partTypeSelect = driver.findElement(By.xpath(updatedXpath));

		click(driver, partTypeSelect);

//Filter

		click(driver, filter);

		String warehouse_text = warehouse.getText();
		String location_text = location.getText();
		String warehouse_text1 = warehouse1.getText();
		String location_text1 = location1.getText();
		String Quantity = quantity.getText();
		String Quantity1 = quantity1.getText();

//		 Assert that the warehouse and location texts are equal to Binning Warehouse
//		 and location
		assert warehouse_text.equals(warehouseInOQCBinning) && location_text.equals(locationInOQCBinning)
				: "Texts are not equal to Binning Wrehouse an location";
		assert warehouse_text1.equals(warehouseInOQCBinning1) && location_text1.equals(locationInOQCBinning1)
				: "Texts are not equal to Binning Wrehouse an location";
		assert Quantity.equals(QuantityInOQCBinning) && Quantity1.equals(QuantityInOQCBinning1)
				: "Quantity are not equal to Binning Wrehouse an location";

		Thread.sleep(4000);
		screenShot("After OQCBinning");

		return new HomePage();
	}
}
