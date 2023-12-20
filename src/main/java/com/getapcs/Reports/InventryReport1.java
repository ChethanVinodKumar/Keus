package com.getapcs.Reports;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.getapcs.base.Testbase1;
import com.getapcs.pages.HomePage;

public class InventryReport1 extends Testbase1 {

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

	public InventryReport1() {

		PageFactory.initElements(driver, this);

	}

	// *************Inventry Report Page******************//

	public HomePage InventryReport1Page() throws InterruptedException {

//Part Type

		driver.navigate().to("https://demo_keus.getapcs.com/engineering/item-master/table");

		String tableXpath = "//table[@class='table table-striped']";

		// Get the first PR number text from table
		String partType1 = driver.findElement(By.xpath(tableXpath + "/tbody/tr[1]/td[2]")).getText();

		// Store the element with hard coded PR number
		String elementXpath = "(//div[normalize-space()='PP-54'])[1]";

		String updatedXpath = elementXpath.replace("PP-54", partType1);

		System.out.println(updatedXpath);

//project Number 

		driver.navigate().to("https://demo_keus.getapcs.com/sales/rfq/table");

		String tableXpath1 = "//table[@class='table table-striped']";

		// Get the first PR number text from table
		String projectNumber1 = driver.findElement(By.xpath(tableXpath1 + "/tbody/tr[1]/td[2]")).getText();

		// Store the element with hard coded PR number
		String elementXpath1 = "(//div[normalize-space()='PP-54'])[1]";

		String updatedXpath1 = elementXpath1.replace("PP-54", projectNumber1);

		System.out.println(updatedXpath1);

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

//Warehouse

		click(driver, warehouse);

		click(driver, searchwareHouse);
		searchwareHouse.sendKeys("HYD-BH-RD5");

		click(driver, warehouseSelect);

//Location

		click(driver, location);

		click(driver, searchlocation);
		searchlocation.sendKeys("room no1");

		click(driver, locationSelect);

//Filter

		click(driver, filter);

		return new HomePage();
	}
}