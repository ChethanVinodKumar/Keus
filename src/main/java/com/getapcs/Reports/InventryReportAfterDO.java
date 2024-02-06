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

public class InventryReportAfterDO extends Testbase1 {

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

	@FindBy(xpath = "(//i[@title='Click to View'])[1]")
	WebElement viewButton;

	public InventryReportAfterDO() {

		PageFactory.initElements(driver, this);

	}

	// *************Inventry Report Page******************//

	public HomePage InventryReportPage() throws InterruptedException, IOException {

//Part Type

		driver.navigate().to("https://demo_keus.getapcs.com/transaction/delivery-order/table");

		click(driver, viewButton);
		String tableXpath = "//table[@class='table mb-2']";

		String partType1 = driver.findElement(By.xpath(tableXpath + "/tbody/tr[1]/td[1]")).getText();

		String elementXpath = "(//div[normalize-space()='PP-54'])[1]";

		String updatedXpath = elementXpath.replace("PP-54", partType1);

		System.out.println(updatedXpath);

		String orderBalanceQty = driver.findElement(By.xpath(tableXpath + "/tbody/tr[1]/td[8]")).getText();

		driver.navigate().to("https://demo_keus.getapcs.com/reports/inventory-report");

//Part Type

		click(driver, partType);

		click(driver, searchPartType);
		searchPartType.sendKeys(partType1);

		WebElement partTypeSelect = driver.findElement(By.xpath(updatedXpath));

		click(driver, partTypeSelect);

//Filter

		click(driver, filter);

		// Find the table
		WebElement table = driver.findElement(By.xpath("//table[@class='table table-striped']"));

		// Find all rows in the table body
		List<WebElement> rows = table.findElements(By.xpath(".//tbody/tr"));

		// Initialize variables for storing balance quantities and the total
		double totalBalanceQuantity = 0.0;

		// Iterate through each row
		for (WebElement row : rows) {
			// Find the balance quantity cell in the current row
			WebElement balanceQuantityCell = row.findElement(By.xpath("./td[8]")); // Adjust the column index if needed
			String balanceQuantityText = balanceQuantityCell.getText();

			// Convert balance quantity text to double
			double balanceQuantity = Double.parseDouble(balanceQuantityText);

			// Add the balance quantity to the total
			totalBalanceQuantity += balanceQuantity;

			System.out.println(balanceQuantity);
		}

		// Cast totalBalanceQuantity to int
		int totalBalanceQuantityInt = (int) totalBalanceQuantity;

		// Print the total balance quantity as integer
		System.out.println("Total Balance Quantity: " + totalBalanceQuantityInt);

		int expectedorderBalanceQty = Integer.parseInt(orderBalanceQty);

		System.out.println("Expected: " + expectedorderBalanceQty);
		System.out.println("Actual: " + totalBalanceQuantityInt);

		assertEquals(expectedorderBalanceQty, totalBalanceQuantityInt);

		Thread.sleep(4000);
		screenShot("After Delivery Order");

		return new HomePage();

	}

}
