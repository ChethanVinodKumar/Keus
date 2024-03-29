package com.getapcs.Reports;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.getapcs.base.Testbase1;
import com.getapcs.home.login.HomePage;

public class InventryReportAfterIQCConfirmation extends Testbase1 {

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

	@FindBy(xpath = "(//i[@class='mdi mdi-eye edit-table-icon'])[1]")
	WebElement viewButton;

	@FindBy(xpath = "(//i[@title='Add Project'])[1]")
	WebElement addProject;

	@FindBy(xpath = "//*[@class='table table-striped']/tbody/tr/td[9]")
	WebElement warehouse;

	@FindBy(xpath = "//*[@class='table table-striped']/tbody/tr/td[10]")
	WebElement location;

	public InventryReportAfterIQCConfirmation() {

		PageFactory.initElements(driver, this);

	}

	// *************Inventry Report Page******************//

	public HomePage InventryReportPage() throws InterruptedException, IOException {

//Part Type

		driver.navigate().to("https://demo_keus.getapcs.com/transaction/iqc-confirmation/table");

		click(driver, viewButton);

		String tableXpath = "//table[@class='table mb-2']";

		// Get the first PR number text from table
		String partType1 = driver.findElement(By.xpath(tableXpath + "/tbody/tr[1]/td[3]")).getText();

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

		System.out.println(updatedXpath);

////project Number 
//
//		click(driver, addProject);
//
//		String tableXpath1 = "//table[@class='table table-striped']";
//
//		// Get the first PR number text from table
//		String projectNumber1 = driver.findElement(By.xpath(tableXpath1 + "/tbody/tr[1]/td[1]")).getText();
//
//		// Store the element with hard coded PR number
//		String elementXpath1 = "(//div[normalize-space()='PP-54'])[1]";
//
//		String updatedXpath1 = elementXpath1.replace("PP-54", projectNumber1);
//
//		System.out.println(updatedXpath1);
//
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

		// Assert that the warehouse and location texts are equal to "GRIN"
		assert warehouse_text.equals("IQC") && location_text.equals("IQC") : "Texts are not equal to 'IQC'";

		Thread.sleep(2000);
		screenShot("After IQCConfirmation");

		return new HomePage();
	}
}
