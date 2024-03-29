package com.getapcs.Transaction;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.getapcs.base.Testbase1;
import com.getapcs.home.login.HomePage;

public class ReturnDO extends Testbase1 {

	// Return Delivery Order

	@FindBy(xpath = "//label[text()='Customer Name']/..//input[@formcontrolname='customerName']")
	WebElement customerName;

	@FindBy(xpath = "//label[text()='Customer Id']/..//input[@formcontrolname='customerId']")
	WebElement customerId;

	@FindBy(xpath = "//label[text()='Sales Order Number']/..//input[@formcontrolname='salesOrderNumber']")
	WebElement salesOrderNumber;

	@FindBy(xpath = "//label[text()='PO Number']/..//input[@formcontrolname='poNumber']")
	WebElement poNumber;

	@FindBy(xpath = "//label[text()='Sales Order Rev Number']/..//input[@formcontrolname='salesOrderRevNo']")
	WebElement salesOrderRevNumber;

	@FindBy(xpath = "(//input[@placeholder='Enter Return By'])[1]")
	WebElement returnBy;

	@FindBy(xpath = "//label[text()='Return DO Date']/..//input[@formcontrolname='doDate']")
	WebElement returnDoDate;

	@FindBy(xpath = "(//input[@type='text'])[11]")
	WebElement returnQty;

	@FindBy(xpath = "(//button[normalize-space()='Binning'])[1]")
	WebElement binning;

	@FindBy(xpath = "(//input[@type='text'])[12]")
	WebElement projectNumber;

	@FindBy(xpath = "(//input[@type='text'])[13]")
	WebElement wareHouse;

	@FindBy(xpath = "(//input[@type='text'])[14]")
	WebElement location;

	@FindBy(xpath = "(//input[@placeholder='Enter quantity'])[1]")
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

	@FindBy(xpath = "(//span[normalize-space()='HYD-BH-RD5'])[1]")
	WebElement warehouseSelect;

	@FindBy(xpath = "(//span[normalize-space()='room no1'])[1]")
	WebElement locationSelect;

	@FindBy(xpath = "(//span[normalize-space()='HYD-BH-RD3'])[1]")
	WebElement warehouseSelect1;

	@FindBy(xpath = "(//span[normalize-space()='HYD-BHRD3-Room1'])[1]")
	WebElement locationSelect1;

	@FindBy(xpath = "(//span[normalize-space()='190623FC-000001'])[1]")
	WebElement projectNumberSelect;

	public ReturnDO() {

		PageFactory.initElements(driver, this);
	}

//*************Return DO Create Page******************

	public HomePage ReturnDOCreate() throws InterruptedException {

//Customer Name

		dataPrintFromInputtag(driver, customerName, "customerName");

//Customer Id

		dataPrintFromInputtag(driver, customerId, "customerId");

//Sales Order Number

		dataPrintFromInputtag(driver, salesOrderNumber, "salesOrderNumber");

//po Number

		dataPrintFromInputtag(driver, poNumber, "poNumber");

//Sales Order Rev Number

		dataPrintFromInputtag(driver, salesOrderRevNumber, "salesOrderRevNumber");

//return Do Date

		dataPrintFromInputtag(driver, returnDoDate, "returnDoDate");

//Dispatch Qty

		assertTrue(DispatchQty.isDisplayed(), DispatchQty + " is not IsDisplayed.");

//Return By

		click(driver, returnBy);

		isSelected(driver, returnBy, "returnBy");

		returnBy.sendKeys("TEST Return By");

//Return Qty

		click(driver, returnQty);

		isSelected(driver, returnQty, "returnQty");

		// Use getText() to get the text content of the quantity WebElement
		String quantityText = DispatchQty.getText();

		// Convert the quantityText to an integer
		double quantityValue = Integer.parseInt(quantityText);

		// Convert quantityValue to a String
		String quantity1 = String.valueOf(quantityValue);

		returnQty.sendKeys(quantity1);

//Binning

		click(driver, binning);

		for (int i = 1; i <= 2; i++) {

			if (i == 1) {
				// Project Number

				click(driver, projectNumber);
				click(driver, projectNumberSelect);

				// Warehouse

				click(driver, wareHouse);

				isSelected(driver, wareHouse, "warehouse");

				click(driver, warehouseSelect);

				// Location

				click(driver, location);

				isSelected(driver, location, "location");

				click(driver, locationSelect);
			}

			if (i == 2) {
				// Project Number

				click(driver, projectNumber);
				click(driver, projectNumberSelect);

				// Warehouse

				click(driver, wareHouse);

				isSelected(driver, wareHouse, "warehouse");

				click(driver, warehouseSelect1);

				// Location

				click(driver, location);

				isSelected(driver, location, "location");

				click(driver, locationSelect1);
			}

			// Quantity
			double acceptedQtyValue1 = quantityValue / 2;

			String acceptedQtyValue2 = String.valueOf(acceptedQtyValue1);

			click(driver, quantityBinning);

			isSelected(driver, quantityBinning, "quantityBinning");

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
