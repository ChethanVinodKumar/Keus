package com.getapcs.Transaction;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.getapcs.base.Testbase1;
import com.getapcs.home.login.HomePage;

public class ReturnOpenDeliveryOrder extends Testbase1 {

	// Return Open Delivery Order

	@FindBy(xpath = "//label[text()='Customer Name']/..//input[@formcontrolname='customerName']")
	WebElement customerName;

	@FindBy(xpath = "//label[text()='Customer Id']/..//input[@formcontrolname='customerId']")
	WebElement customerId;

	@FindBy(xpath = "//label[text()='ODO Type']/..//input[@formcontrolname='doType']")
	WebElement odoType;

	@FindBy(xpath = "//table[@formarrayname='ItemData']/tbody/tr[1]/td[2]")
	WebElement itemType;

	@FindBy(xpath = "//table[@formarrayname='ItemData']/tbody/tr[1]/td[6]")
	WebElement avilableStock;

	@FindBy(xpath = "//table[@formarrayname='ItemData']/tbody/tr[1]/td[7]")
	WebElement dispatvhQty;

	@FindBy(xpath = "(//input[@type='text'])[9]")
	WebElement projectNumber;

	@FindBy(xpath = "(//input[@type='text'])[10]")
	WebElement returnQty;

	@FindBy(xpath = "(//button[normalize-space()='Binning'])[1]")
	WebElement binning;

	@FindBy(xpath = "(//input[@type='text'])[11]")
	WebElement warehouse;

	@FindBy(xpath = "(//input[@type='text'])[12]")
	WebElement location;

	@FindBy(xpath = "(//span[normalize-space()='HYD-BH-RD3'])[1]")
	WebElement warehouseSelect;

	@FindBy(xpath = "(//span[normalize-space()='HYD-BHRD3-Room1'])[1]")
	WebElement locationSelect;

	@FindBy(xpath = "(//input[@type='text'])[11]")
	WebElement warehouse1;

	@FindBy(xpath = "(//input[@type='text'])[12]")
	WebElement location1;

	@FindBy(xpath = "(//span[normalize-space()='HYD-BH-RD5'])[1]")
	WebElement warehouseSelect1;

	@FindBy(xpath = "(//span[normalize-space()='room no1'])[1]")
	WebElement locationSelect1;

	@FindBy(xpath = "(//input[@type='text'])[13]")
	WebElement quantityBinning;

	@FindBy(xpath = "(//button[normalize-space()='Add'])[1]")
	WebElement add;

	@FindBy(xpath = "(//button[normalize-space()='Save'])[2]")
	WebElement save;

	@FindBy(xpath = "(//textarea)[1]")
	WebElement remarks;

	@FindBy(xpath = "(//button[normalize-space()='Save'])[1]")
	WebElement saveButton;

	@FindBy(xpath = "//table[@formarrayname='ItemData']/tbody/tr[1]/td[7]")
	WebElement DispatchQty;

	@FindBy(xpath = "(//i[@title='Return Open Delivery Order'])[1]")
	WebElement returnODO;

	public ReturnOpenDeliveryOrder() {

		PageFactory.initElements(driver, this);
	}

//*************Return DO Create Page******************

	public HomePage ReturnOpenDOCreate() throws InterruptedException {

		// Part Type

		driver.navigate().to("https://demo_keus.getapcs.com/sales/rfq/table");

		String tableXpath = "//table[@class='table table-striped']";

		String projectNumber1 = driver.findElement(By.xpath(tableXpath + "/tbody/tr[1]/td[2]")).getText();

		String elementXpath = "(//div[normalize-space()='PP-54'])[1]";

		String updatedXpath = elementXpath.replace("PP-54", projectNumber1);

		System.out.println(updatedXpath);

		driver.navigate().to("https://demo_keus.getapcs.com/transaction/open-delivery-order/table");

		click(driver, returnODO);

//Customer Name

		dataPrint(driver, customerName, "customerName");

//Customer Id

		dataPrintFromInputtag(driver, customerId, "customerId");

//po Number

		dataPrintFromInputtag(driver, odoType, "poNumber");

//item Type

		dataPrint(driver, itemType, "itemType");

//avilable Stock

		dataPrint(driver, avilableStock, "returnDoDate");

//Dispatch Qty

		String DispatchQtyValue = DispatchQty.getText().trim();
		System.out.println("DispatchQty" + " : " + DispatchQtyValue + "\n");

//Item Type

		click(driver, projectNumber);

		isSelected(driver, projectNumber, "projectNumber");

		projectNumber.sendKeys(Keys.ENTER);

//Return Qty

		click(driver, returnQty);

		isSelected(driver, returnQty, "returnQty");

		// Use getText() to get the text content of the quantity WebElement
//		String quantityText = DispatchQtyValue.getText();

		// Convert the quantityText to an integer
		double quantityValue = Double.parseDouble(DispatchQtyValue);

		// Convert quantityValue to a String
		String quantity1 = String.valueOf(quantityValue);

		returnQty.sendKeys(quantity1);

// Binning

		click(driver, binning);

		for (int i = 1; i <= 2; i++) {

			if (i == 1) {

				// Warehouse

				click(driver, warehouse);

				isSelected(driver, warehouse, "warehouse");

				click(driver, warehouseSelect);

				// Location

				click(driver, location);

				isSelected(driver, location, "location");

				click(driver, locationSelect);
			}
			if (i == 2) {
				// Warehouse

				click(driver, warehouse1);

				isSelected(driver, warehouse1, "warehouse1");

				click(driver, warehouseSelect1);

				// Location

				click(driver, location1);

				isSelected(driver, location1, "location1");

				click(driver, locationSelect1);
			}

			// Quantity
			double acceptedQtyValue1 = quantityValue / 2;

			String acceptedQtyValue2 = String.valueOf(acceptedQtyValue1);

			click(driver, quantityBinning);

			quantityBinning.sendKeys(acceptedQtyValue2);

			click(driver, add);
		}
		click(driver, save);
//Remarks Field

		click(driver, remarks);

		isSelected(driver, remarks, "remarks");

		remarks.sendKeys("TEST remarks");

//Save Button

		click(driver, saveButton);

		return new HomePage();
	}

}
