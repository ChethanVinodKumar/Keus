package com.getapcs.Reports;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.getapcs.base.Testbase1;
import com.getapcs.home.login.HomePage;

public class InventryReportAfterReturnDO extends Testbase1 {

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

	@FindBy(xpath = "(//i[@class='mdi mdi-eye edit-icon'])[1]")
	WebElement viewButton;

	public InventryReportAfterReturnDO() {

		PageFactory.initElements(driver, this);

	}

	// *************Inventry Report Page******************//

	public HomePage InventryReportPage() throws InterruptedException, IOException {

//Part Type

		driver.navigate().to("https://demo_keus.getapcs.com/transaction/return-do-list/table");

		click(driver, viewButton);

		String tableXpath = "//table[@class='table mb-2 ng-untouched ng-pristine ng-valid']";

		String partType1 = driver.findElement(By.xpath(tableXpath + "/tbody/tr[1]/td[1]")).getText();

		// Store the element with hard coded PR number
		String elementXpath = "(//div[normalize-space()='PP-54'])[1]";

		String updatedXpath = elementXpath.replace("PP-54", partType1);

		System.out.println(updatedXpath);

		driver.navigate().to("https://demo_keus.getapcs.com/reports/inventory-report");

//Part Type

		click(driver, partType);

		click(driver, searchPartType);
		searchPartType.sendKeys(partType1);

		WebElement partTypeSelect = driver.findElement(By.xpath(updatedXpath));

		click(driver, partTypeSelect);

//		click(driver, searchPartType);
//		searchPartType.clear();
//		searchPartType.sendKeys(partType2);
//
//		WebElement partTypeSelect1 = driver.findElement(By.xpath(updatedXpath1));
//
//		click(driver, partTypeSelect1);

//Filter

		click(driver, filter);

		Thread.sleep(4000);
		screenShot("After Return Delivery Order");

		return new HomePage();
	}

}
