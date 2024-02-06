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

public class InventryReportAfterReturnODO extends Testbase1 {

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

	@FindBy(xpath = "(//i[@title='Click to view'])[1]")
	WebElement viewButton;

	public InventryReportAfterReturnODO() {

		PageFactory.initElements(driver, this);

	}

	// *************Inventry Report Page******************//

	public HomePage InventryReportPage() throws InterruptedException, IOException {

//Part Type

		driver.navigate().to("https://demo_keus.getapcs.com/transaction/return-open-delivery-order-list/table");

		click(driver, viewButton);

		String tableXpath = "//table[@class='table mb-2 ng-untouched ng-pristine ng-valid']";

		String partType1 = driver.findElement(By.xpath(tableXpath + "/tbody/tr[1]/td[1]")).getText();

		// Remove leading and trailing whitespaces
		partType1 = partType1.trim();

		// Remove the trailing hyphen and any characters after it
		int hyphenIndex = partType1.indexOf(" - Test Description");
		if (hyphenIndex != -1) {
			partType1 = partType1.substring(0, hyphenIndex);
		}

		// Store the element with hard coded PR number
		String elementXpath = "(//div[normalize-space()='PP-54'])[1]";

		String updatedXpath = elementXpath.replace("PP-54", partType1);

		String availableQtyElement = driver.findElement(By.xpath(tableXpath + "/tbody/tr[1]/td[6]")).getText();

		String dispatchQtyElement = driver.findElement(By.xpath(tableXpath + "/tbody/tr[1]/td[7]")).getText();

		System.out.println(updatedXpath);

////part Type
//		driver.navigate().to("https://demo_keus.getapcs.com/engineering/item-master/table");
//
//		String tableXpath1 = "//table[@class='table table-striped']";
//
//		String partType1 = driver.findElement(By.xpath(tableXpath1 + "/tbody/tr[1]/td[2]")).getText();
//
//		String elementXpath = "(//div[normalize-space()='PP-54'])[1]";
//
//		String updatedXpath = elementXpath.replace("PP-54", partType1);
//
//		System.out.println(updatedXpath);
//
//		String partType2 = driver.findElement(By.xpath(tableXpath1 + "/tbody/tr[2]/td[2]")).getText();
//
//		String elementXpath1 = "(//div[normalize-space()='PP-54'])[1]";
//
//		String updatedXpath1 = elementXpath1.replace("PP-54", partType2);
//
//		System.out.println(updatedXpath1);

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

		// Convert text values to integers
		int availableQty;
		int dispatchQty;
		try {
			availableQty = Integer.parseInt(availableQtyElement);
			dispatchQty = Integer.parseInt(dispatchQtyElement);
		} catch (NumberFormatException e) {
			System.err.println("Error parsing quantities: " + e.getMessage());
			return null; // Handle error appropriately
		}

		// Calculate remaining quantity
		int remainingQty = availableQty - dispatchQty;

		// Do something with the calculated remaining quantity, e.g., print it
		System.out.println("Remaining Quantity: " + remainingQty);

		Thread.sleep(4000);
		screenShot("After Open Delivery Order");

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

//						int expectedorderBalanceQty = Integer.parseInt(orderBalanceQty);

		System.out.println("Expected: " + remainingQty);
		System.out.println("Actual: " + totalBalanceQuantityInt);

		assertEquals(remainingQty, totalBalanceQuantityInt);

		Thread.sleep(1000);
		screenShot("After Return Open Delivery Order");

		return new HomePage();
	}

}
