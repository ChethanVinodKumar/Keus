package com.getapcs.Transaction;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.getapcs.base.Testbase1;
import com.getapcs.home.login.HomePage;

public class Purchase_Order_FG extends Testbase1 {
	@FindBy(xpath = "(//input[@type='text'])[2]")
	WebElement procutementType;

	@FindBy(xpath = "(//span[normalize-space()='NON BOM'])[1]")
	WebElement procutementTypeSelect;

	@FindBy(xpath = "(//input[@type='text'])[3]")
	WebElement currency;

	@FindBy(xpath = "(//span[normalize-space()='INR'])[1]")
	WebElement currencySelect;

	// Vender Details

	@FindBy(xpath = "(//input[@type='text'])[5]")
	WebElement vendorName;

	@FindBy(xpath = "(//span[normalize-space()='Keus Automation Pvt Ltd'])[1]")
	WebElement vendorNameSelect;

	@FindBy(xpath = "(//input[@placeholder='Enter Quotation Reference No.'])[1]")
	WebElement quotationReferenceNo;

	@FindBy(xpath = "//input[@placeholder='DD-MM-YYYY']")
	WebElement quotationDate;

//	@FindBy(xpath = "(//input[@type='text'])[8]")
//	WebElement venderAddress;
//
//	@FindBy(xpath = "(//span[normalize-space()='TEST Address1'])[1]")
//	WebElement venderAddressSelect;

	// Items

	@FindBy(xpath = "(//a[normalize-space()='Items'])[1]")
	WebElement items;

	@FindBy(xpath = "(//input[@placeholder='Upload Items'])[1]")
	WebElement uploadItems;

	@FindBy(xpath = "(//input[@type='text'])[5]")
	WebElement itemNumber;

	@FindBy(xpath = "(//span[normalize-space()='1616'])[1]")
	WebElement itemNumberSelect;

	@FindBy(xpath = "(//input[@placeholder='Enter Unit Price'])[1]")
	WebElement unitCost;

	@FindBy(xpath = "(//input[@formcontrolname='quantity'])[1]")
	WebElement quntity;

	@FindBy(xpath = "(//mat-panel-title)[1]")
	WebElement addProject;

	@FindBy(xpath = "(//input[@type='text'])[10]")
	WebElement projectNumber;

	@FindBy(xpath = "(//span[normalize-space()='TISPL-1796'])[1]")
	WebElement projectNumberSelect;

	@FindBy(xpath = "(//input[@formcontrolname='projectQty'])[1]")
	WebElement projectQuntity;

	@FindBy(xpath = "/html/body/app-root/div/div/div/div/div/app-create-po/div[2]/div/div/div/form/div/div[2]/div/div/div[3]/mat-expansion-panel/div/div/div[2]/div/button")
	WebElement addProjectNumber;

	@FindBy(xpath = "(//mat-panel-title)[2]")
	WebElement DeliveryShedule;

	@FindBy(xpath = "(//input[@placeholder='DD-MM-YYYY'])[1]")
	WebElement deliveryDate;

	@FindBy(xpath = "(//input[@placeholder='Enter Quantity'])[3]")
	WebElement deliverySheduleQuntity;

	@FindBy(xpath = "(//button[normalize-space()='Add'])[2]")
	WebElement addDeliveryShedule;

	@FindBy(xpath = "//textarea[@placeholder='Enter Special Instruction']")
	WebElement specialInstructions;

	@FindBy(xpath = "(//input[@placeholder='Enter SGST'])[1]")
	WebElement sgst1;

	@FindBy(xpath = "(//input[@placeholder='Enter CGST'])[1]")
	WebElement cgst1;

	@FindBy(xpath = "(//input[@placeholder='Enter '])[1]")
	WebElement igst1;

	@FindBy(xpath = "(//input[@placeholder='Enter UTGST'])[1]")
	WebElement utgst1;

	@FindBy(xpath = "(//button[normalize-space()='Add'])[3]")
	WebElement addItems;

	// Billing and Shipping Details

	@FindBy(xpath = "(//a[normalize-space()='Billing & Shipping Details'])[1]")
	WebElement billing;

	@FindBy(xpath = "(//input[@type='text'])[5]")
	WebElement deliveryTerms;

	@FindBy(xpath = "(//span[normalize-space()='3WEEKS AGAINST THE ADVANCE'])[1]")
	WebElement deliveryTermsSelect;

	@FindBy(xpath = "(//input[@type='text'])[6]")
	WebElement paymentTerms;

	@FindBy(xpath = "(//span[normalize-space()='100% TT Advance'])[1]")
	WebElement paymentTermsSelect;

	@FindBy(xpath = "(//input[@type='text'])[7]")
	WebElement shippingMode;

	@FindBy(xpath = "(//span[normalize-space()='TEST Shipment_Mode1'])[1]")
	WebElement shippingModeSelect;

	@FindBy(xpath = "(//input[@type='text'])[8]")
	WebElement shipTo;

	@FindBy(xpath = "(//span[normalize-space()='KEUS AUTOMATION PRIVATE LIMITED'])[1]")
	WebElement shipToSelect;

	@FindBy(xpath = "(//input[@type='text'])[9]")
	WebElement billTo;

	@FindBy(xpath = "(//span[normalize-space()='KEUS AUTOMATION PRIVATE LIMITED'])[2]")
	WebElement billToSelect;

	// Terms

	@FindBy(xpath = "(//a[normalize-space()='Terms'])[1]")
	WebElement terms;

	@FindBy(xpath = "(//input[@placeholder='Enter Retention Period'])[1]")
	WebElement retentionPeriod;

	@FindBy(xpath = "(//textarea[@placeholder='Enter Special Terms & Conditions'])[1]")
	WebElement specialTerms;

	@FindBy(xpath = "(//input[@placeholder='Enter Inco Terms'])[1]")
	WebElement incoTerms;

	@FindBy(xpath = "(//button[normalize-space()='Add'])[1]")
	WebElement addTerms;

	@FindBy(xpath = "(//button[normalize-space()='Save'])[1]")
	WebElement save;

	@FindBy(xpath = "(//input[@placeholder='Upload file'])[1]")
	WebElement UploadFiles1;

	@FindBy(xpath = "(//button[normalize-space()='Issue Material'])[1]")
	WebElement issueMaterialButton;

	@FindBy(xpath = "(//button[normalize-space()='Save Files'])[1]")
	WebElement saveButton;

	@FindBy(xpath = "(//button[normalize-space()='View Files'])[1]")
	WebElement viewButton;

	@FindBy(xpath = "//button[normalize-space()='Close']")
	WebElement closeButton;

	@FindBy(xpath = "(//i[@class='mdi mdi-plus-circle-outline add-icon'])[1]")
	WebElement prNumberIcon;

	@FindBy(xpath = "(//input[@value='m1'])[1]")
	WebElement selectPRNumber;

	@FindBy(xpath = "(//button[normalize-space()='Save'])[2]")
	WebElement prsave;

	JavascriptExecutor executor = (JavascriptExecutor) driver;

	public Purchase_Order_FG() {
		PageFactory.initElements(driver, this);
	}

//*****************************PO Create Page*************************************//

	public HomePage purchaseOrderCreatePage(String refNo, String unitcost, String quantity, String projectQty,
			String deliveryProjectQty, String instructions, String sgst, String cgst, String igst, String utgst,
			String retention, String special, String inco) throws Throwable {

		driver.navigate().to("https://demo_keus.getapcs.com/transaction/material-issue/table");

		click(driver, issueMaterialButton);

		// PP - Item Number

		String tableXpath = "//table[@class='table mb-2 ng-untouched ng-pristine ng-valid']";

		String ItemNumber = driver.findElement(By.xpath(tableXpath + "/tbody/tr[2]/td[3]")).getText();

		String elementXpath = "(//span[normalize-space()='Item-FG-11-TEST'])[1]";

		String updatedXpath = elementXpath.replace("Item-FG-11-TEST", ItemNumber);
		System.out.println(updatedXpath);

		String tableXpath1 = "//table[@class='table mb-2 ng-untouched ng-pristine ng-valid']";

		String ItemNumber1 = driver.findElement(By.xpath(tableXpath1 + "/tbody/tr[3]/td[3]")).getText();

		String reqQty1 = driver.findElement(By.xpath(tableXpath1 + "/tbody/tr[2]/td[7]")).getText();

		int reqQty2 = Integer.parseInt(reqQty1) + 500;

		String reqQty = String.valueOf(reqQty2);

		String elementXpath1 = "(//span[normalize-space()='Item-FG-11-TEST'])[1]";

		String updatedXpath1 = elementXpath1.replace("Item-FG-11-TEST", ItemNumber1);
		System.out.println(updatedXpath1);

		// Project Number

		driver.navigate().to("https://demo_keus.getapcs.com/transaction/sales-order/table");

		String tableXpath2 = "//table[@class='table table-striped']";

		// Get the first PR number text from table
		String ProjectNumber = driver.findElement(By.xpath(tableXpath2 + "/tbody/tr[1]/td[4]")).getText();

		// Store the element with hard coded PR number
		String elementXpath2 = "(//span[normalize-space()='Item-FG-11-TEST'])[1]";

		String updatedXpath2 = elementXpath2.replace("Item-FG-11-TEST", ProjectNumber);
		System.out.println(updatedXpath2);

		driver.navigate().to("https://demo_keus.getapcs.com/transaction/purchase-order/create");

		// Procurement Type
		click(driver, procutementType);
		click(driver, procutementTypeSelect);

		// Currency Field
		click(driver, currency);
		click(driver, currencySelect);

//Vender Details

		// Vender Name
		click(driver, vendorName);
		click(driver, vendorNameSelect);

		// quotationReferenceNumber
		click(driver, quotationReferenceNo);
		quotationReferenceNo.sendKeys(refNo);

		// Verify that Quotation date is selecting or not
		datePicker(driver, quotationDate);

//Items

		click(driver, items);

		for (int i = 1; i <= 2; i++) {

			// Item Number
			click(driver, itemNumber);

			if (i == 1) {
				WebElement itemNumberSelect = driver.findElement(By.xpath(updatedXpath));
				click(driver, itemNumberSelect);
			}
			if (i == 2) {
				WebElement itemNumberSelect = driver.findElement(By.xpath(updatedXpath1));
				click(driver, itemNumberSelect);
			}

			// Unit Cost
			click(driver, unitCost);
			unitCost.sendKeys(unitcost);

			// Quantity
			click(driver, quntity);
			quntity.sendKeys(reqQty);

			click(driver, prNumberIcon);
			click(driver, selectPRNumber);
			click(driver, prsave);

			if (i == 1) {
				click(driver, addProject);
			}

			if (i == 1) {
				click(driver, projectNumber);
				WebElement projectNumberSelect = driver.findElement(By.xpath(updatedXpath2));
				click(driver, projectNumberSelect);
			}

			// Project Quantity
			click(driver, projectQuntity);
			projectQuntity.sendKeys(reqQty);

			click(driver, addProjectNumber);

			if (i == 1) {
				click(driver, DeliveryShedule);
			}

			// delivery Schedule
			datePicker(driver, deliveryDate);

			// Quantity In Delivery Schedule
			click(driver, deliverySheduleQuntity);
			deliverySheduleQuntity.sendKeys(reqQty);

			// Add button
			click(driver, addDeliveryShedule);

			// Special Instructions
			click(driver, specialInstructions);
			specialInstructions.sendKeys(instructions);

			// SGST
			click(driver, sgst1);
			sgst1.clear();
			sgst1.sendKeys(sgst);

			// CGST
			click(driver, cgst1);
			cgst1.clear();
			cgst1.sendKeys(cgst);

			// IGST
			click(driver, igst1);
			igst1.clear();
			igst1.sendKeys(igst);

			// UTGST
			click(driver, utgst1);
			utgst1.clear();
			utgst1.sendKeys(utgst);
			Thread.sleep(2000);

			click(driver, addItems);

		}

//Billing and Shipping Details

		click(driver, billing);

		// Delivery Terms
		click(driver, deliveryTerms);
		click(driver, deliveryTermsSelect);

		// Payment Terms
		click(driver, paymentTerms);
		click(driver, paymentTermsSelect);

		// shippingMode
		click(driver, shippingMode);
		click(driver, shippingModeSelect);

		// Ship To
		click(driver, shipTo);
		click(driver, shipToSelect);

		// Verify that billTo Field is Displayed or not
		click(driver, billTo);
		click(driver, billToSelect);

//terms

		click(driver, terms);

		// Retention Period
		click(driver, retentionPeriod);
		retentionPeriod.sendKeys(retention);

		// Special Terms
		click(driver, specialTerms);
		specialTerms.sendKeys(special);

		// Inco Terms
		click(driver, incoTerms);
		incoTerms.sendKeys(inco);

		click(driver, addTerms);

		// Upload Filea
		uploadFile(driver, UploadFiles1, 2);

		click(driver, saveButton);

		click(driver, viewButton);

		click(driver, closeButton);

		click(driver, save);
		Thread.sleep(4000);
		return new HomePage();

	}

}
