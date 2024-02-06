package com.getapcs.Reports;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.getapcs.base.Testbase1;
import com.getapcs.home.login.HomePage;

public class InventryReportAfterMI extends Testbase1 {

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

	@FindBy(xpath = "(//i[@class='mdi mdi-eye edit-icon'])[1]")
	WebElement editButton;

	@FindBy(xpath = "(//i[@title='Add Project'])[1]")
	WebElement addProject;

	@FindBy(xpath = "(//button[normalize-space()='Issue Material'])[1]")
	WebElement issueMaterial;

//	@FindBy(xpath = "(//i[@class='mdi mdi-eye edit-icon'])[1]")
//	WebElement ;
//
//	@FindBy(xpath = "(//i[@title='Add Project'])[1]")
//	WebElement addProject;

	public InventryReportAfterMI() {

		PageFactory.initElements(driver, this);

	}

	// *************Inventry Report Page******************//

	public HomePage InventryReportPage() throws InterruptedException, IOException {

//Part Type

		driver.navigate().to("https://demo_keus.getapcs.com/transaction/material-issue/table");

		String tableXpath = "//table[@class='table table-striped']";

		String partType1 = driver.findElement(By.xpath(tableXpath + "/tbody/tr[1]/td[3]")).getText();

		String elementXpath = "(//div[normalize-space()='PP-54'])[1]";

		String updatedXpath = elementXpath.replace("PP-54", partType1);

		System.out.println(updatedXpath);

		click(driver, issueMaterial);

		String tableXpath1 = "//table[@class='table mb-2 ng-untouched ng-pristine ng-valid']";

		String AvailableQty = driver.findElement(By.xpath(tableXpath1 + "/tbody/tr[1]/td[8]")).getText();

//project Number 
		driver.navigate().to("https://demo_keus.getapcs.com/engineering/item-master/table");

		String tableXpath2 = "//table[@class='table table-striped']";

		String partType2 = driver.findElement(By.xpath(tableXpath2 + "/tbody/tr[1]/td[2]")).getText();

		String elementXpath1 = "(//div[normalize-space()='PP-54'])[1]";

		String updatedXpath1 = elementXpath1.replace("PP-54", partType2);

		System.out.println(updatedXpath1);

		driver.navigate().to("https://demo_keus.getapcs.com/reports/inventory-report");

//Part Type

		click(driver, partType);

		click(driver, searchPartType);
		searchPartType.sendKeys(partType1);

		WebElement partTypeSelect = driver.findElement(By.xpath(updatedXpath));

		click(driver, partTypeSelect);

		click(driver, searchPartType);
		searchPartType.clear();
		searchPartType.sendKeys(partType2);

		WebElement partTypeSelect1 = driver.findElement(By.xpath(updatedXpath1));

		click(driver, partTypeSelect1);

//Filter

		click(driver, filter);

		int AvailableQty1 = Integer.parseInt(AvailableQty);

		System.out.println("Available Qty: " + AvailableQty1);

		// Find the table
		WebElement table = driver.findElement(By.xpath("//table[@class='table table-striped']"));

		// Find all rows in the table body
		List<WebElement> rows = table.findElements(By.xpath("./tbody/tr"));

		// Initialize variables for storing balance quantities and the total
		int totalBalanceQuantity = 0;

		// Iterate through each row
		for (WebElement row : rows) {
			// Find the balance quantity cell in the current row
			WebElement balanceQuantityCell = row.findElement(By.xpath("./td[8]")); // Adjust the column index if needed
			String balanceQuantityText = balanceQuantityCell.getText();

			// Convert balance quantity text to integer
			int balanceQuantity = Integer.parseInt(balanceQuantityText);

			// Add the balance quantity to the total
			totalBalanceQuantity += balanceQuantity;

		}

		// Print the total balance quantity
		System.out.println("Total Balance Quantity: " + totalBalanceQuantity);

		assertEquals(AvailableQty1, totalBalanceQuantity);

		Thread.sleep(1000);
		screenShot("After Material Issue");

		return new HomePage();
	}

}
