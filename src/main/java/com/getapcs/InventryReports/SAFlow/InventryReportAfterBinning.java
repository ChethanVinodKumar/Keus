package com.getapcs.InventryReports.SAFlow;

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

	@FindBy(xpath = "(//i[@class='mdi mdi-eye edit-icon'])[1]")
	WebElement viewButton;

	@FindBy(xpath = "(//i[@title='Binning Location'])[1]")
	WebElement binningWarehoseAndlocation1;

	@FindBy(xpath = "(//i[@title='Binning Location'])[2]")
	WebElement binningWarehoseAndlocation2;

	@FindBy(xpath = "(//i[@title='Binning Location'])[3]")
	WebElement binningWarehoseAndlocation3;

	@FindBy(xpath = "(//i[@title='Binning Location'])[4]")
	WebElement binningWarehoseAndlocation4;

	@FindBy(xpath = "(//i[@title='Binning Location'])[5]")
	WebElement binningWarehoseAndlocation5;

	@FindBy(xpath = "(//i[@title='Binning Location'])[6]")
	WebElement binningWarehoseAndlocation6;

	@FindBy(xpath = "//button[normalize-space()='Close']")
	WebElement closeButton;

	public InventryReportAfterBinning() {

		PageFactory.initElements(driver, this);

	}

	// *************Inventry Report Page******************//

	public HomePage InventryReportPage() throws InterruptedException, IOException {

		// Part Type

		driver.navigate().to("https://demo_keus.getapcs.com/transaction/binning/table");

		click(driver, viewButton);

		// 1

		String tableXpath1 = "//table[@class='table mb-2']";

		// Get the first PR number text from table
		String partType1 = driver.findElement(By.xpath(tableXpath1 + "/tbody/tr[1]/td[3]")).getText();

		// Remove leading and trailing whitespaces
		partType1 = partType1.trim();

		// Remove the trailing hyphen and any characters after it
		int hyphenIndex1 = partType1.indexOf(" -");
		if (hyphenIndex1 != -1) {
			partType1 = partType1.substring(0, hyphenIndex1);
		}

		// Store the element with hard coded PR number
		String elementXpath1 = "(//div[normalize-space()='PP-54'])[1]";

		String updatedXpath1 = elementXpath1.replace("PP-54", partType1);

		System.out.println(updatedXpath1);

		// 2

		String tableXpath2 = "//table[@class='table mb-2']";

		// Get the first PR number text from table
		String partType2 = driver.findElement(By.xpath(tableXpath2 + "/tbody/tr[2]/td[3]")).getText();

		// Remove leading and trailing whitespaces
		partType2 = partType2.trim();

		// Remove the trailing hyphen and any characters after it
		int hyphenIndex2 = partType2.indexOf(" -");
		if (hyphenIndex2 != -1) {
			partType2 = partType2.substring(0, hyphenIndex2);
		}

		// Store the element with hard coded PR number
		String elementXpath2 = "(//div[normalize-space()='PP-54'])[1]";

		String updatedXpath2 = elementXpath2.replace("PP-54", partType2);

		System.out.println(updatedXpath2);

		// 3

		String tableXpath3 = "//table[@class='table mb-2']";

		// Get the first PR number text from table
		String partType3 = driver.findElement(By.xpath(tableXpath3 + "/tbody/tr[3]/td[3]")).getText();

		// Remove leading and trailing whitespaces
		partType3 = partType3.trim();

		// Remove the trailing hyphen and any characters after it
		int hyphenIndex3 = partType3.indexOf(" -");
		if (hyphenIndex3 != -1) {
			partType3 = partType3.substring(0, hyphenIndex3);
		}

		// Store the element with hard coded PR number
		String elementXpath3 = "(//div[normalize-space()='PP-54'])[1]";

		String updatedXpath3 = elementXpath3.replace("PP-54", partType3);

		System.out.println(updatedXpath3);

		// 4

		String tableXpath4 = "//table[@class='table mb-2']";

		// Get the first PR number text from table
		String partType4 = driver.findElement(By.xpath(tableXpath4 + "/tbody/tr[4]/td[3]")).getText();

		// Remove leading and trailing whitespaces
		partType4 = partType4.trim();

		// Remove the trailing hyphen and any characters after it
		int hyphenIndex4 = partType4.indexOf(" -");
		if (hyphenIndex4 != -1) {
			partType4 = partType4.substring(0, hyphenIndex4);
		}

		// Store the element with hard coded PR number
		String elementXpath4 = "(//div[normalize-space()='PP-54'])[1]";

		String updatedXpath4 = elementXpath4.replace("PP-54", partType4);

		System.out.println(updatedXpath4);

		// 5

		String tableXpath5 = "//table[@class='table mb-2']";

		// Get the first PR number text from table
		String partType5 = driver.findElement(By.xpath(tableXpath5 + "/tbody/tr[5]/td[3]")).getText();

		// Remove leading and trailing whitespaces
		partType5 = partType5.trim();

		// Remove the trailing hyphen and any characters after it
		int hyphenIndex5 = partType5.indexOf(" -");
		if (hyphenIndex5 != -1) {
			partType5 = partType5.substring(0, hyphenIndex5);
		}

		// Store the element with hard coded PR number
		String elementXpath5 = "(//div[normalize-space()='PP-54'])[1]";

		String updatedXpath5 = elementXpath5.replace("PP-54", partType5);

		System.out.println(updatedXpath5);

		// 6

		String tableXpath6 = "//table[@class='table mb-2']";

		// Get the first PR number text from table
		String partType6 = driver.findElement(By.xpath(tableXpath6 + "/tbody/tr[6]/td[3]")).getText();

		// Remove leading and trailing whitespaces
		partType6 = partType6.trim();

		// Remove the trailing hyphen and any characters after it
		int hyphenIndex6 = partType6.indexOf(" -");
		if (hyphenIndex6 != -1) {
			partType6 = partType6.substring(0, hyphenIndex6);
		}

		// Store the element with hard coded PR number
		String elementXpath6 = "(//div[normalize-space()='PP-54'])[1]";

		String updatedXpath6 = elementXpath6.replace("PP-54", partType6);

		System.out.println(updatedXpath6);

		click(driver, binningWarehoseAndlocation1);

		String tableXpath7 = "(//table[@class='table table-striped'])[1]";
		// Get the first PR number text from table
		String warehouseInBinning1 = driver.findElement(By.xpath(tableXpath7 + "/tbody/tr[1]/td[1]")).getText();

		String locationInBinning1 = driver.findElement(By.xpath(tableXpath7 + "/tbody/tr[1]/td[2]")).getText();

		String warehouseInBinning11 = driver.findElement(By.xpath(tableXpath7 + "/tbody/tr[2]/td[1]")).getText();

		String locationInBinning11 = driver.findElement(By.xpath(tableXpath7 + "/tbody/tr[2]/td[2]")).getText();

		click(driver, closeButton);

		click(driver, binningWarehoseAndlocation2);

		// Get the first PR number text from table
		String warehouseInBinning2 = driver.findElement(By.xpath(tableXpath7 + "/tbody/tr[1]/td[1]")).getText();

		String locationInBinning2 = driver.findElement(By.xpath(tableXpath7 + "/tbody/tr[1]/td[2]")).getText();

		String warehouseInBinning22 = driver.findElement(By.xpath(tableXpath7 + "/tbody/tr[2]/td[1]")).getText();

		String locationInBinning22 = driver.findElement(By.xpath(tableXpath7 + "/tbody/tr[2]/td[2]")).getText();

		click(driver, closeButton);

		click(driver, binningWarehoseAndlocation3);

		// Get the first PR number text from table
		String warehouseInBinning3 = driver.findElement(By.xpath(tableXpath7 + "/tbody/tr[1]/td[1]")).getText();

		String locationInBinning3 = driver.findElement(By.xpath(tableXpath7 + "/tbody/tr[1]/td[2]")).getText();

		String warehouseInBinning33 = driver.findElement(By.xpath(tableXpath7 + "/tbody/tr[2]/td[1]")).getText();

		String locationInBinning33 = driver.findElement(By.xpath(tableXpath7 + "/tbody/tr[2]/td[2]")).getText();

		click(driver, closeButton);

		click(driver, binningWarehoseAndlocation4);

		// Get the first PR number text from table
		String warehouseInBinning4 = driver.findElement(By.xpath(tableXpath7 + "/tbody/tr[1]/td[1]")).getText();

		String locationInBinning4 = driver.findElement(By.xpath(tableXpath7 + "/tbody/tr[1]/td[2]")).getText();

		String warehouseInBinning44 = driver.findElement(By.xpath(tableXpath7 + "/tbody/tr[2]/td[1]")).getText();

		String locationInBinning44 = driver.findElement(By.xpath(tableXpath7 + "/tbody/tr[2]/td[2]")).getText();

		click(driver, closeButton);

		click(driver, binningWarehoseAndlocation5);

		// Get the first PR number text from table
		String warehouseInBinning5 = driver.findElement(By.xpath(tableXpath7 + "/tbody/tr[1]/td[1]")).getText();

		String locationInBinning5 = driver.findElement(By.xpath(tableXpath7 + "/tbody/tr[1]/td[2]")).getText();

		String warehouseInBinning55 = driver.findElement(By.xpath(tableXpath7 + "/tbody/tr[2]/td[1]")).getText();

		String locationInBinning55 = driver.findElement(By.xpath(tableXpath7 + "/tbody/tr[2]/td[2]")).getText();

		click(driver, closeButton);

		click(driver, binningWarehoseAndlocation6);

		// Get the first PR number text from table
		String warehouseInBinning6 = driver.findElement(By.xpath(tableXpath7 + "/tbody/tr[1]/td[1]")).getText();

		String locationInBinning6 = driver.findElement(By.xpath(tableXpath7 + "/tbody/tr[1]/td[2]")).getText();

		String warehouseInBinning66 = driver.findElement(By.xpath(tableXpath7 + "/tbody/tr[2]/td[1]")).getText();

		String locationInBinning66 = driver.findElement(By.xpath(tableXpath7 + "/tbody/tr[2]/td[2]")).getText();

		click(driver, closeButton);

		driver.navigate().to("https://demo_keus.getapcs.com/reports/inventory-report");

		// Part Type

		for (int i = 1; i <= 6; i++) {

			if (i == 1) {
				click(driver, partType);
			}

			if (i == 1) {
				js.executeScript("arguments[0].click();", searchPartType);
				searchPartType.clear();
				searchPartType.sendKeys(partType1);

				WebElement partTypeSelect = driver.findElement(By.xpath(updatedXpath1));
				click(driver, partTypeSelect);
			}

			if (i == 2) {
				searchPartType.clear();
				searchPartType.sendKeys(partType2);

				WebElement partTypeSelect = driver.findElement(By.xpath(updatedXpath2));
				click(driver, partTypeSelect);
			}

			if (i == 3) {
				searchPartType.clear();
				searchPartType.sendKeys(partType3);

				WebElement partTypeSelect = driver.findElement(By.xpath(updatedXpath3));
				click(driver, partTypeSelect);
			}

			if (i == 4) {
				searchPartType.clear();
				searchPartType.sendKeys(partType4);

				WebElement partTypeSelect = driver.findElement(By.xpath(updatedXpath4));
				click(driver, partTypeSelect);
			}

			if (i == 5) {
				searchPartType.clear();
				searchPartType.sendKeys(partType5);

				WebElement partTypeSelect = driver.findElement(By.xpath(updatedXpath5));
				click(driver, partTypeSelect);
			}

			if (i == 6) {
				searchPartType.clear();
				searchPartType.sendKeys(partType6);

				WebElement partTypeSelect = driver.findElement(By.xpath(updatedXpath6));
				click(driver, partTypeSelect);
			}
		}

		// Filter

		click(driver, filter);

		// Adjust the XPath selector to match your table structure

		int j = 0;
		List<WebElement> rows = driver.findElements(By.xpath("//table[@class='table table-striped']/tbody/tr"));

		Map<String, String> warehouseMap = new LinkedHashMap<>(); // LinkedHashMap to maintain insertion order
		Map<String, String> locationMap = new LinkedHashMap<>();

		for (int i = 0; i < rows.size(); i++) {
			WebElement currentRow = rows.get(i);

			String warehouse = currentRow.findElement(By.xpath(".//td[position() = 9]")).getText();
			String location = currentRow.findElement(By.xpath(".//td[position() = 10]")).getText();

			// Check if both warehouse and location are equal to "Reject"
			if ("Reject".equals(warehouse) && "Reject".equals(location)) {
				// Skip this row if both warehouse and location are "Reject"
				continue;
			}

			// Dynamically name the variables based on the iteration index
			warehouseMap.put("warehouse" + (j + 1), warehouse);
			locationMap.put("location" + (j + 1), location);

			j++;
		}
		// Example of retrieving values from the maps
		String warehouse1 = warehouseMap.get("warehouse1");
		String location1 = locationMap.get("location1");

		String warehouse2 = warehouseMap.get("warehouse2");
		String location2 = locationMap.get("location2");

		String warehouse3 = warehouseMap.get("warehouse3");
		String location3 = locationMap.get("location3");

		String warehouse4 = warehouseMap.get("warehouse4");
		String location4 = locationMap.get("location4");

		String warehouse5 = warehouseMap.get("warehouse5");
		String location5 = locationMap.get("location5");

		String warehouse6 = warehouseMap.get("warehouse6");
		String location6 = locationMap.get("location6");

		String warehouse7 = warehouseMap.get("warehouse7");
		String location7 = locationMap.get("location7");

		String warehouse8 = warehouseMap.get("warehouse8");
		String location8 = locationMap.get("location8");

		String warehouse9 = warehouseMap.get("warehouse9");
		String location9 = locationMap.get("location9");

		String warehouse10 = warehouseMap.get("warehouse10");
		String location10 = locationMap.get("location10");

		String warehouse11 = warehouseMap.get("warehouse11");
		String location11 = locationMap.get("location11");

		String warehouse12 = warehouseMap.get("warehouse12");
		String location12 = locationMap.get("location12");

		assert warehouse1.equals(warehouseInBinning1) && location1.equals(locationInBinning1)
				: "Row1 Texts are not equal to Binning Wrehouse an location";

		assert warehouse2.equals(warehouseInBinning11) && location2.equals(locationInBinning11)
				: "Row2 Texts are not equal to Binning Wrehouse an location";

		assert warehouse3.equals(warehouseInBinning2) && location3.equals(locationInBinning2)
				: "Row3 Texts are not equal to Binning Wrehouse an location";

		assert warehouse4.equals(warehouseInBinning22) && location4.equals(locationInBinning22)
				: "Row4 Texts are not equal to Binning Wrehouse an location";

		assert warehouse5.equals(warehouseInBinning3) && location5.equals(locationInBinning3)
				: "Row5 Texts are not equal to Binning Wrehouse an location";

		assert warehouse6.equals(warehouseInBinning33) && location6.equals(locationInBinning33)
				: "Row6 Texts are not equal to Binning Wrehouse an location";

		assert warehouse7.equals(warehouseInBinning4) && location7.equals(locationInBinning4)
				: "Row7 Texts are not equal to Binning Wrehouse an location";

		assert warehouse8.equals(warehouseInBinning44) && location8.equals(locationInBinning44)
				: "Row8 Texts are not equal to Binning Wrehouse an location";

		assert warehouse9.equals(warehouseInBinning5) && location9.equals(locationInBinning5)
				: "Row9 Texts are not equal to Binning Wrehouse an location";

		assert warehouse10.equals(warehouseInBinning55) && location10.equals(locationInBinning55)
				: "Row10 Texts are not equal to Binning Wrehouse an location";

		assert warehouse11.equals(warehouseInBinning6) && location11.equals(locationInBinning6)
				: "Row11 Texts are not equal to Binning Wrehouse an location";

		assert warehouse12.equals(warehouseInBinning66) && location12.equals(locationInBinning66)
				: "Row12 Texts are not equal to Binning Wrehouse an location";

		Thread.sleep(4000);
		screenShot("After Binning");

		return new HomePage();

	}
}
