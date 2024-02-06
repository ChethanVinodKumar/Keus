package com.getapcs.Reports;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.getapcs.base.Testbase1;
import com.getapcs.home.login.HomePage;

public class InventryReportAfterOQC extends Testbase1 {

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

	@FindBy(xpath = "(//i[@title='Click to view'])[1]")
	WebElement viewButton;

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

	public InventryReportAfterOQC() {

		PageFactory.initElements(driver, this);

	}

	// *************Inventry Report Page******************//

	public HomePage InventryReportPage() throws InterruptedException, IOException {

//Part Type

		driver.navigate().to("https://demo_keus.getapcs.com/transaction/fg-oqc");

		String tableXpath = "//table[@class='table table-striped']";

		String partType1 = driver.findElement(By.xpath(tableXpath + "/tbody/tr[1]/td[4]")).getText();

		String elementXpath = "(//div[normalize-space()='PP-54'])[1]";

		String updatedXpath = elementXpath.replace("PP-54", partType1);

		System.out.println(updatedXpath);

		click(driver, viewButton);

		String OQCAcceptedQty = driver
				.findElement(By.xpath("//label[text()='Accepted Qty']/..//label[@class='field2']")).getText();
		System.out.println("OQCAcceptedQty:" + OQCAcceptedQty);
		String OQCRejectedQty = driver
				.findElement(By.xpath("//label[text()='Rejected Qty']/..//label[@class='field2']")).getText();
		System.out.println("OQCRejectedQty:" + OQCRejectedQty);

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

		String acceptedQty_text = acceptedQty.getText();
		String rejectedQty_text = rejectedQty.getText();

		System.out.println(acceptedQty_text);
		System.out.println(rejectedQty_text);

		assertEquals(acceptedQty_text, OQCAcceptedQty);
		assertEquals(rejectedQty_text, OQCRejectedQty);

		String warehouse_text = warehouse.getText();
		String location_text = location.getText();

		// Assert that the warehouse and location texts are equal to "FG"
		assert warehouse_text.equals("FG") && location_text.equals("FG") : "Texts are not equal to 'FG'";

		String rejected_warehouse_text = warehouse1.getText();
		String rejected_location_text = location1.getText();

		// Assert that the warehouse and location texts are equal to "FG"
		assert rejected_warehouse_text.equals("Scrap") && rejected_location_text.equals("Reject")
				: "Texts are not equal to 'FG'";

		Thread.sleep(1000);
		screenShot("After OQC");

		return new HomePage();
	}

}
