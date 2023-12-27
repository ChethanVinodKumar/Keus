package com.getapcs.Reports;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

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

	@FindBy(xpath = "(//span[@class='dropdown-btn'])[3]")
	WebElement warehouse;

	@FindBy(xpath = "(//span[@class='dropdown-btn'])[4]")
	WebElement location;

	@FindBy(xpath = "(//span[normalize-space()='»»'])[1]")
	WebElement paginationLast;

	public InventryReportAfterBinning() {

		PageFactory.initElements(driver, this);

	}

	// *************Inventry Report Page******************//

	public HomePage InventryReportPage() throws InterruptedException, IOException {

//project Number 

		driver.navigate().to("https://demo_keus.getapcs.com/sales/rfq/table");

		String tableXpath1 = "//table[@class='table table-striped']";

		String projectNumber1 = driver.findElement(By.xpath(tableXpath1 + "/tbody/tr[1]/td[2]")).getText();

		String elementXpath1 = "(//div[normalize-space()='PP-54'])[1]";

		String updatedXpath1 = elementXpath1.replace("PP-54", projectNumber1);

		System.out.println(updatedXpath1);

//WareHouse

		driver.navigate().to("https://demo_keus.getapcs.com/transaction/binning/table");

		click(driver, paginationLast);

		Thread.sleep(4000);

		List<WebElement> viewButtons = wait.until(
				ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//i[@class='mdi mdi-eye edit-icon']")));

		if (!viewButtons.isEmpty()) {
			WebElement lastViewButton = viewButtons.get(viewButtons.size() - 1);

			// Click using JavaScript Executor to avoid stale element reference
			js.executeScript("arguments[0].click();", lastViewButton);
		} else {
			System.out.println("No 'view' buttons found on the page");
		}
		Thread.sleep(2000);

//Part Type

		String tableXpath = "//table[@class='table mb-2']";

		String partType1 = driver.findElement(By.xpath(tableXpath + "/tbody/tr[1]/td[3]")).getText();

		// Remove leading and trailing whitespaces
		partType1 = partType1.trim();

		// Remove the trailing hyphen and any characters after it
		int hyphenIndex = partType1.indexOf(" -");
		if (hyphenIndex != -1) {
			partType1 = partType1.substring(0, hyphenIndex);
		}

		System.out.println(partType1);
		String elementXpath = "(//div[normalize-space()='PP-54'])[1]";

		String originalxpath = elementXpath.replace("PP-54", partType1);

		String updatedXpath = originalxpath.replace(" -']", "']");

		System.out.println(updatedXpath);

		click(driver, binning);

//Warehouse

		String tableXpath2 = "//table[@class='table table-striped']";

		String warehouse1 = driver.findElement(By.xpath(tableXpath2 + "/tbody/tr[1]/td[1]")).getText();

		String elementXpath2 = "(//div[normalize-space()='HYD-BH-RD5'])[1]";

		String updatedXpath2 = elementXpath2.replace("HYD-BH-RD5", warehouse1);

		System.out.println(updatedXpath2);

		Thread.sleep(2000);

//Location

		String location1 = driver.findElement(By.xpath(tableXpath2 + "/tbody/tr[1]/td[2]")).getText();

		String elementXpath3 = "(//div[normalize-space()='HYD-BH-RD5'])[1]";

		String updatedXpath3 = elementXpath3.replace("HYD-BH-RD5", location1);

		System.out.println(updatedXpath3);

		driver.navigate().to("https://demo_keus.getapcs.com/reports/inventory-report");

//Part Type

		click(driver, partType);

		click(driver, searchPartType);

		searchPartType.sendKeys(partType1);

		WebElement partTypeSelect = driver.findElement(By.xpath(updatedXpath));

		click(driver, partTypeSelect);

//Part Type

		click(driver, projectNumber);

		click(driver, searchprojectNumber);

		searchprojectNumber.sendKeys(projectNumber1);

		WebElement projectNumberSelect1 = driver.findElement(By.xpath(updatedXpath1));

		click(driver, projectNumberSelect1);

////Warehouse
//
//		click(driver, warehouse);
//
//		click(driver, searchwareHouse);
//
//		searchwareHouse.sendKeys(warehouse1);
//
//		WebElement warehouseSelect = driver.findElement(By.xpath(updatedXpath2));
//
//		click(driver, warehouseSelect);
//
////Location
//
//		click(driver, location);
//
//		click(driver, searchlocation);
//
//		searchlocation.sendKeys(location1);
//
//		WebElement locationSelect = driver.findElement(By.xpath(updatedXpath3));
//
//		click(driver, locationSelect);

//Filter

		click(driver, filter);

		Thread.sleep(2000);

		screenShot("After Binning");

		return new HomePage();
	}
}
