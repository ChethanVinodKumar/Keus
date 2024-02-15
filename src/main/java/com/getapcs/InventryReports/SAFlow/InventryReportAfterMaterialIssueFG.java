package com.getapcs.InventryReports.SAFlow;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.getapcs.base.Testbase1;
import com.getapcs.home.login.HomePage;

public class InventryReportAfterMaterialIssueFG extends Testbase1 {

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

	@FindBy(xpath = "(//i[@class='mdi mdi-eye edit-icon'])[2]")
	WebElement viewButton1;

	@FindBy(xpath = "(//button[normalize-space()='Issue Material'])[3]")
	WebElement issueMaterial3;

	@FindBy(xpath = "(//button[normalize-space()='Issue Material'])[2]")
	WebElement issueMaterial2;

	@FindBy(xpath = "(//button[normalize-space()='Issue Material'])[1]")
	WebElement issueMaterial1;

	@FindBy(xpath = "(//a[normalize-space()='Items'])[1]")
	WebElement itemsTab;

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

	public InventryReportAfterMaterialIssueFG() {

		PageFactory.initElements(driver, this);

	}

	// *************Inventry Report Page******************//

	public HomePage InventryReportPage() throws InterruptedException, IOException {

//Part Type

		driver.navigate().to("https://demo_keus.getapcs.com/transaction/material-issue/table");

		String tableXpath1 = "//table[@class='table table-striped']";

		String FG = driver.findElement(By.xpath(tableXpath1 + "/tbody/tr[1]/td[3]")).getText();

		String elementXpath1 = "(//div[normalize-space()='PP-54'])[1]";

		String updatedXpath1 = elementXpath1.replace("PP-54", FG);

		System.out.println(updatedXpath1);

		String tableXpath2 = "//table[@class='table mb-2 ng-untouched ng-pristine ng-valid']";

		click(driver, issueMaterial1);

		String PP5 = driver.findElement(By.xpath(tableXpath2 + "/tbody/tr[2]/td[3]")).getText();

		String elementXpath8 = "(//div[normalize-space()='PP-54'])[1]";

		String updatedXpath8 = elementXpath8.replace("PP-54", PP5);

		System.out.println(updatedXpath8);

		String PP6 = driver.findElement(By.xpath(tableXpath2 + "/tbody/tr[3]/td[3]")).getText();

		String elementXpath9 = "(//div[normalize-space()='PP-54'])[1]";

		String updatedXpath9 = elementXpath9.replace("PP-54", PP6);

		System.out.println(updatedXpath9);

		String quantityInBinning1 = driver.findElement(By.xpath(tableXpath2 + "/tbody/tr[1]/td[8]")).getText();

		String quantityInBinning2 = driver.findElement(By.xpath(tableXpath2 + "/tbody/tr[2]/td[8]")).getText();

		String quantityInBinning3 = driver.findElement(By.xpath(tableXpath2 + "/tbody/tr[3]/td[8]")).getText();

		System.out.println(quantityInBinning1);
		System.out.println(quantityInBinning2);

		driver.navigate().to("https://demo_keus.getapcs.com/reports/inventory-report");

//Part Type

		click(driver, partType);

		js.executeScript("arguments[0].click();", searchPartType);
		searchPartType.clear();
		searchPartType.sendKeys(FG);

		WebElement partTypeSelect = driver.findElement(By.xpath(updatedXpath1));
		click(driver, partTypeSelect);

		searchPartType.clear();
		searchPartType.sendKeys(PP5);

		WebElement partTypeSelect1 = driver.findElement(By.xpath(updatedXpath8));
		click(driver, partTypeSelect1);

		searchPartType.clear();
		searchPartType.sendKeys(PP6);

		WebElement partTypeSelect2 = driver.findElement(By.xpath(updatedXpath9));
		click(driver, partTypeSelect2);

//Filter

		click(driver, filter);

		double TotalQuantityInBinning = Double.parseDouble(quantityInBinning1) + Double.parseDouble(quantityInBinning2)
				+ Double.parseDouble(quantityInBinning3);

		System.out.println("TotalQuantityInBinning : " + TotalQuantityInBinning);

		int j = 0;
		List<WebElement> rows = driver.findElements(By.xpath("//table[@class='table table-striped']/tbody/tr"));

		Map<String, String> warehouseMap = new LinkedHashMap<>();
		Map<String, String> locationMap = new LinkedHashMap<>();
		int totalQuantity = 0; // Variable to store total quantity

		for (int i = 0; i < rows.size(); i++) {
			WebElement currentRow = rows.get(i);

			String warehouse = currentRow.findElement(By.xpath(".//td[position() = 9]")).getText();
			String location = currentRow.findElement(By.xpath(".//td[position() = 10]")).getText();
			String quantityText = currentRow.findElement(By.xpath(".//td[position() = 8]")).getText(); // Assuming
																										// quantity is
			if ("Reject".equals(warehouse) && "Reject".equals(location)) {
				// Skip this row if both warehouse and location are "Reject"
				continue;
			} // in the 8th
				// column
			int quantity = Integer.parseInt(quantityText); // Parse quantity from string

			// Store warehouse and location information
			warehouseMap.put("warehouse" + (j + 1), warehouse);
			locationMap.put("location" + (j + 1), location);

			// Add quantity to both total and map (optional)
			totalQuantity += quantity;
			// You can also add quantity to a map with dynamic keys if needed

			j++;
		}

// Print or use the total quantity as needed
		System.out.println("Total quantity : " + totalQuantity);

		assertEquals(TotalQuantityInBinning, totalQuantity);

		Thread.sleep(4000);
		screenShot("After Material Issue FG");

		return new HomePage();
	}

}
