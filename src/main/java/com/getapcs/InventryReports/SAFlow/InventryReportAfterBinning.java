package com.getapcs.InventryReports.SAFlow;

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

	@FindBy(xpath = "(//span[@class='dropdown-btn'])[3]")
	WebElement warehouse;

	@FindBy(xpath = "(//span[@class='dropdown-btn'])[4]")
	WebElement location;

	@FindBy(xpath = "(//span[normalize-space()='»»'])[1]")
	WebElement paginationLast;

	@FindBy(xpath = "(//i[@class='mdi mdi-eye edit-icon'])[1]")
	WebElement viewButton;

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

		Thread.sleep(4000);
		screenShot("After Binning");

		return new HomePage();
	}

}
