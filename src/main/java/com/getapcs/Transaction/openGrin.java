package com.getapcs.Transaction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.getapcs.base.Testbase1;
import com.getapcs.home.login.HomePage;

public class openGrin extends Testbase1 {

	// Shop Order

	@FindBy(xpath = "(//input[@type='text'])[1]")
	WebElement meterialSender;

	@FindBy(xpath = "(//span[normalize-space()='VD-6 - MULTECH PCB TECHNOLOGIES CO LTD'])[1]")
	WebElement meterialSenderSelect;

	@FindBy(xpath = "(//input[@placeholder='Enter Receipt Reference No'])[1]")
	WebElement receiptRefNum;

	@FindBy(xpath = "(//input[@placeholder='Remarks'])[1]")
	WebElement remarks;

	@FindBy(xpath = "(//input[@title='-'])[1]")
	WebElement itemNumber;

	@FindBy(xpath = "(//input[@type='text'])[7]")
	WebElement refSONumber;

	@FindBy(xpath = "(//input[@type=\"text\"])[8]")
	WebElement quantity;

	@FindBy(xpath = "(//button[normalize-space()='Binning Locations'])[1]")
	WebElement binningLocations;

	@FindBy(xpath = "(//input[@type='text'])[10]")
	WebElement warehouse;

	@FindBy(xpath = "(//span[normalize-space()='TEST Warehouse1'])[1]")
	WebElement warehouseSelect;

	@FindBy(xpath = "(//input[@type='text'])[11]")
	WebElement location;

	@FindBy(xpath = "(//span[normalize-space()='TEST'])[1]")
	WebElement locationSelect;

	@FindBy(xpath = "(//input[@placeholder='Enter quantity'])[1]")
	WebElement quantityBinning;

	@FindBy(xpath = "(//button[normalize-space()='Add'])[1]")
	WebElement add;

	@FindBy(xpath = "(//button[normalize-space()='Save'])[2]")
	WebElement save;

	@FindBy(xpath = "(//input[@class='check table_1'])[1]")
	WebElement returnable;

	@FindBy(xpath = "(//input[@type='text'])[9]")
	WebElement remarksItem;

	@FindBy(xpath = "(//button[normalize-space()='Save'])[1]")
	WebElement saveButton;

	public openGrin() {

		PageFactory.initElements(driver, this);
	}

//*************Open Grin Create Page******************

	public HomePage openGrinCreate() throws InterruptedException {
		// TODO Auto-generated method stub

		driver.navigate().to("https://demo_keus.getapcs.com/engineering/item-master/table");

		String tableXpath = "//table[@class='table table-striped']";

		// Get the first PR number text from table
		String ItemNumber1 = driver.findElement(By.xpath(tableXpath + "/tbody/tr[1]/td[2]")).getText();

		// Store the element with hard coded PR number
		String elementXpath = "(//span[normalize-space()='Item-FG-11-TEST'])[1]";

		String updatedXpath = elementXpath.replace("Item-FG-11-TEST", ItemNumber1 + "-Test Description");

		System.out.println(updatedXpath);

		// ***********//

		driver.navigate().to("https://demo_keus.getapcs.com/sales/rfq/table");

		String tableXpath1 = "//table[@class='table table-striped']";

		// Get the first PR number text from table
		String refSONumber1 = driver.findElement(By.xpath(tableXpath1 + "/tbody/tr[1]/td[2]")).getText();

		// Store the element with hard coded PR number
		String elementXpath1 = "(//span[normalize-space()='Item-FG-11-TEST'])[1]";

		String updatedXpath1 = elementXpath1.replace("Item-FG-11-TEST", refSONumber1);

		System.out.println(updatedXpath1);

		driver.navigate().to("https://demo_keus.getapcs.com/transaction/create-open-grin");

//Meterial Sender

		click(driver, meterialSender);

		isSelected(driver, meterialSender, "meterialSender");

		click(driver, meterialSenderSelect);

//Receipt Reference No

		click(driver, receiptRefNum);

		isSelected(driver, receiptRefNum, "receiptRefNum");

		receiptRefNum.sendKeys("REF-001");

//Remarks Text Field

		click(driver, remarks);

		isSelected(driver, remarks, "remarks");

		remarks.sendKeys("TEST Remarks");

//Items Tab

		// Item Number

		click(driver, itemNumber);

		isSelected(driver, itemNumber, "itemNumber");

		WebElement itemNumberSelect1 = driver.findElement(By.xpath(updatedXpath));

		click(driver, itemNumberSelect1);

		// Reference SO Number

		click(driver, refSONumber);

		isSelected(driver, refSONumber, "refSONumber");

		WebElement refSONumberSelect1 = driver.findElement(By.xpath(updatedXpath1));

		click(driver, refSONumberSelect1);

		// QTY

		click(driver, quantity);

		isSelected(driver, quantity, "quantity");

		quantity.clear();

		quantity.sendKeys("10");

		// Binning

		click(driver, binningLocations);

		// Warehouse

		click(driver, warehouse);

		isSelected(driver, warehouse, "warehouse");

		click(driver, warehouseSelect);

		// Location

		click(driver, location);

		isSelected(driver, location, "location");

		click(driver, locationSelect);

		// Quantity In Binning

		click(driver, quantityBinning);

		isSelected(driver, quantityBinning, "quantityBinning");

		quantityBinning.clear();

		quantityBinning.sendKeys("10");

		click(driver, add);

		click(driver, save);

		// Returnable

		click(driver, returnable);

		// remarks

		click(driver, remarksItem);

		isSelected(driver, remarksItem, "remarksItem");

		remarksItem.sendKeys("TEST Remarks1");

		click(driver, saveButton);

		return new HomePage();
	}
}
