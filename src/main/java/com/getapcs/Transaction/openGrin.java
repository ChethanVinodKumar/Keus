package com.getapcs.Transaction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.getapcs.base.Testbase1;
import com.getapcs.pages.HomePage;

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

	@FindBy(xpath = "(//input[@type='text'])[11]")
	WebElement location;

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

	public HomePage openGrinCreate(String AcceptedQunatity) throws InterruptedException {
		// TODO Auto-generated method stub

		driver.navigate().to("https://demo_keus.getapcs.com/engineering/engg-bom/table");

		String tableXpath = "//table[@class='table table-striped']";

		// Get the first PR number text from table
		String fgItemNumber1 = driver.findElement(By.xpath(tableXpath + "/tbody/tr[1]/td[2]")).getText();

		// Store the element with hard coded PR number
		String elementXpath = "(//span[normalize-space()='Item-FG-11-TEST'])[1]";

		String updatedXpath = elementXpath.replace("Item-FG-11-TEST", fgItemNumber1 + "-Test Description");

		System.out.println(updatedXpath);

		// ***********//

		driver.navigate().to("https://demo_keus.getapcs.com/transaction/shop-order/table");

		String tableXpath2 = "//table[@class='table table-striped']";

		// Get the first PR number text from table
		String shopOrderNumber = driver.findElement(By.xpath(tableXpath2 + "/tbody/tr[1]/td[2]")).getText();

		// Store the element with hard coded PR number
		String elementXpath2 = "(//span[normalize-space()='Item-FG-11-TEST'])[1]";

		String updatedXpath2 = elementXpath2.replace("Item-FG-11-TEST", shopOrderNumber);

		System.out.println(updatedXpath2);

		driver.navigate().to("https://demo_keus.getapcs.com/transaction/create-open-grin");

//Meterial Sender

		click(driver, meterialSender);

		isSelected(driver, meterialSender, "meterialSender");

		click(driver, meterialSenderSelect);

//Receipt Reference No

		click(driver, receiptRefNum);

		isSelected(driver, receiptRefNum, "receiptRefNum");

		receiptRefNum.sendKeys("REF-001");

		return new HomePage();
	}
}
