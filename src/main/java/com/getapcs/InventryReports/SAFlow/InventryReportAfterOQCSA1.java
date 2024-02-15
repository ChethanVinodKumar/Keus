package com.getapcs.InventryReports.SAFlow;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.getapcs.base.Testbase1;
import com.getapcs.home.login.HomePage;

public class InventryReportAfterOQCSA1 extends Testbase1 {

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

	@FindBy(xpath = "//table[@class='table table-striped']/tbody/tr[1]/td[8]")
	WebElement acceptedQty;

	@FindBy(xpath = "//table[@class='table table-striped']/tbody/tr[2]/td[8]")
	WebElement rejectedQty;

	@FindBy(xpath = "//table[@class='table table-striped']/tbody/tr[1]/td[9]")
	WebElement warehouse;

	@FindBy(xpath = "//table[@class='table table-striped']/tbody/tr[1]/td[10]")
	WebElement location;

	@FindBy(xpath = "//table[@class='table table-striped']/tbody/tr[2]/td[9]")
	WebElement warehouse1;

	@FindBy(xpath = "//table[@class='table table-striped']/tbody/tr[2]/td[10]")
	WebElement location1;

	public InventryReportAfterOQCSA1() {

		PageFactory.initElements(driver, this);

	}

	// *************Inventry Report Page******************//

	public HomePage InventryReportPage() throws InterruptedException, IOException {

//Part Type

		driver.navigate().to("https://demo_keus.getapcs.com/transaction/material-issue/table");

		String tableXpath1 = "//table[@class='table table-striped']";

		String SA1 = driver.findElement(By.xpath(tableXpath1 + "/tbody/tr[2]/td[3]")).getText();

		String elementXpath2 = "(//div[normalize-space()='PP-54'])[1]";

		String updatedXpath2 = elementXpath2.replace("PP-54", SA1);

		System.out.println(updatedXpath2);

		driver.navigate().to("https://demo_keus.getapcs.com/transaction/fg-oqc");

		click(driver, viewButton);
		Thread.sleep(3000);

		String OQCAcceptedQty = driver
				.findElement(By.xpath("//label[text()='Accepted Qty']/..//label[@class='field2']")).getText();
		System.out.println("OQCAcceptedQty:" + OQCAcceptedQty);
		String OQCRejectedQty = driver
				.findElement(By.xpath("//label[text()='Rejected Qty']/..//label[@class='field2']")).getText();
		System.out.println("OQCRejectedQty:" + OQCRejectedQty);

		driver.navigate().to("https://demo_keus.getapcs.com/reports/inventory-report");

//Part Type

		click(driver, partType);

		searchPartType.clear();
		searchPartType.sendKeys(SA1);

		WebElement partTypeSelect = driver.findElement(By.xpath(updatedXpath2));
		click(driver, partTypeSelect);

//Filter

		click(driver, filter);
		String acceptedQty_text = acceptedQty.getText();
		String rejectedQty_text = rejectedQty.getText();

		System.out.println(acceptedQty_text);
		System.out.println(rejectedQty_text);

		assertEquals(acceptedQty_text, OQCAcceptedQty);
		assertEquals(rejectedQty_text, OQCRejectedQty);

		String warehouse_text = warehouse.getText();
		String location_text = location.getText();

		// Assert that the warehouse and location texts are equal to "FG"
		assert warehouse_text.equals("SA") && location_text.equals("SA") : "Texts are not equal to 'SA'";

		String rejected_warehouse_text = warehouse1.getText();
		String rejected_location_text = location1.getText();

		// Assert that the warehouse and location texts are equal to "FG"
		assert rejected_warehouse_text.equals("Reject") && rejected_location_text.equals("Reject")
				: "Texts are not equal to 'FG'";

		Thread.sleep(4000);
		screenShot("After OQC SA1");

		return new HomePage();
	}

}
