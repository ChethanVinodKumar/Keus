package com.getapcs.Keus.TransactionSAFlow;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.getapcs.base.Testbase1;
import com.getapcs.home.login.HomePage;

public class Purchase_Requisation_SA2 extends Testbase1 {

	@FindBy(xpath = "(//button[@type='button'][normalize-space()='Issue Material'])[3]")
	WebElement issueMaterial;

	@FindBy(xpath = "//label[normalize-space(text())='PR Date']/following-sibling::div/input[@formcontrolname='prDate']")
	WebElement prDateElement;

	@FindBy(xpath = "(//input[@type='text'])[2]")
	WebElement procurementTypeDropDown;

	@FindBy(xpath = "(//span[text()='TEST Procutement'])[1]")
	WebElement selectProcurementTypeDropDownValue;

	@FindBy(xpath = "//textarea[@placeholder='Enter Special Terms and Conditions']")
	WebElement purposeTextField;

	@FindBy(xpath = "//input[@placeholder='Upload file']")
	WebElement uploadFiles;

	@FindBy(linkText = "Items")
	WebElement itemTab;

	@FindBy(xpath = "//input[@placeholder='Upload Items']")
	WebElement uploadItem;

	@FindBy(xpath = "(//input[@type='text'])[5]")
	WebElement itemNumberDropDown;
	@FindBy(xpath = "//span[text()='PP1-1']")
	WebElement selectItemNumberDropDownValue;

	@FindBy(xpath = "(//input[@type='text'])[6]")
	WebElement mftrItemNumberDropDown;
	@FindBy(xpath = "(//span[contains(text(),'PP1')])[1]")
	WebElement selectMftrItemNumberDropDownValue;

	@FindBy(xpath = "(//input[@type='text'])[8]")
	WebElement quantityTextField;

	@FindBy(xpath = "/html/body/app-root/div/div/div/div/div/app-create-purchase-requisition/div[2]/div/div/div/form/div/div[2]/div/div/div[4]/mat-expansion-panel/mat-expansion-panel-header")
	WebElement addProjectExpansionPanel;

	@FindBy(xpath = "(//input[@type='text'])[9]")
	WebElement projectNumberDropDown;
	@FindBy(xpath = "//span[normalize-space()='TISPL-1779']")
	WebElement selectProjectNumberDropDownValue;

	@FindBy(xpath = "//input[@formcontrolname='prProjectQuantity']")
	WebElement projectQuantityTextField;

	@FindBy(xpath = "(//button[contains(text(),'Add')])[1]")
	WebElement addButtonInProjectExpansionPanel;

	@FindBy(xpath = "/html/body/app-root/div/div/div/div/div/app-create-purchase-requisition/div[2]/div/div/div/form/div/div[2]/div/div/div[5]/mat-expansion-panel/mat-expansion-panel-header/span[2]")
	WebElement addDeliveryScheduleExpansionPanel;

	@FindBy(xpath = "(//input[@formcontrolname='deliveryScheduleDate'])[1]")
	WebElement scheduleDateDatePicker;

	@FindBy(xpath = "(//input[@type='text'])[11]")
	WebElement quantityTextField1;

	@FindBy(xpath = "(//button[contains(text(),'Add')])[2]")
	WebElement addButtonInDeliveryScheduleExpansionPanel;

	@FindBy(xpath = "//textarea[@placeholder='Enter Special Instruction']")
	WebElement specialInstructionTextField;

	@FindBy(xpath = "(//button[contains(text(),'Add')])[3]")
	WebElement addButtonInItemsTab;

	@FindBy(linkText = "Billing & Shipping Details")
	WebElement billing$ShippingDetailsTab;

	@FindBy(xpath = "(//input[@type='text'])[4]")
	WebElement deliveryTermsDropDown;
	@FindBy(xpath = "(//span[normalize-space()='TEST DeliveryTerms'])[1]")
	WebElement selectDeliveryTermsDropDownValue;

	@FindBy(xpath = "(//input[@type='text'])[5]")
	WebElement paymentTermsDropDown;

	@FindBy(xpath = "(//span[normalize-space()='15 days CREDIT'])[1]")
	WebElement selectPaymentTermsDropDownValue;

	@FindBy(xpath = "(//input[@type='text'])[6]")
	WebElement shippingModeDropDown;
	@FindBy(xpath = "//span[normalize-space()='BY ROAD']")
	WebElement selectShippingModeDropDownValue;

	@FindBy(linkText = "Terms")
	WebElement termsTab;

	@FindBy(xpath = "//input[@placeholder='Enter Retention Period']")
	WebElement retentionPeriodTextField;

	@FindBy(xpath = "//textarea[@placeholder='Enter Special Terms & Conditions']")
	WebElement specialTerms$ConditionTextField;

	@FindBy(xpath = "(//button[contains(text(),'Save')])[1]")
	WebElement saveButtonInPRCreate;

	// PR Approval 1

	@FindBy(xpath = "//label[text()='PR Date']/..//label[@class='field2']")
	WebElement prDateElement1;

	@FindBy(xpath = "//input[@type='text']")
	WebElement prNumberDropDown;
//	@FindBy(xpath = "//span[normalize-space()='031023PR-00002']")
//	WebElement selectPRNumberDropDownValue;

//	@FindBy(xpath = "//label[text()='PR Date']/following-sibling::label[@class='field2']")
//	WebElement prDateElement;

	@FindBy(xpath = "//label[text()='Rev Number']/following-sibling::label[@class='field2']")
	WebElement revNumberElement;

	@FindBy(xpath = "//label[text()='Procurement Type']/following-sibling::label[@class='field2']")
	WebElement procurementTypeElement;

	@FindBy(xpath = "//label[text()='Purpose']/following-sibling::label[@class='field2']")
	WebElement purposeTextElement;

	@FindBy(xpath = "//label[text()='PR Files']/following-sibling::label[@class='field2']")
	WebElement prFileElement;

	// Items Tab
	@FindBy(linkText = "Items")
	WebElement itemsTab;

	@FindBy(xpath = "//table[@class='table table-striped']")
	WebElement table;

	@FindBy(xpath = "//i[@title='Project']")
	WebElement projectDeatilPopUp;

	@FindBy(xpath = "//div[@class='modal-body']/..//table[@class='table table-striped']")
	WebElement table1;

	@FindBy(xpath = "//button[normalize-space()='Close']")
	WebElement closeButton;

	@FindBy(xpath = "//i[@title='Delivery Schedule']")
	WebElement deliverySchedulePopUp;

//	@FindBy(linkText = "Billing & Shipping Details")
//	WebElement billing$ShippingDetailsTab;

	@FindBy(xpath = "//label[text()='Delivery Terms']/following-sibling::label[@class='data_field']")
	WebElement deliveryTermsElement;

	@FindBy(xpath = "//label[text()='Payment Terms']/following-sibling::label[@class='data_field']")
	WebElement paymentTermsElement;

	@FindBy(xpath = "//label[text()='Shipping Mode']/following-sibling::label[@class='data_field']")
	WebElement shippingModeElement;

//	@FindBy(linkText = "Terms")
//	WebElement termsTab;

	@FindBy(xpath = "//label[text()='Retention Period']/following-sibling::label[@class='data_field']")
	WebElement retentionPeriodElement;

	@FindBy(xpath = "//label[text()='Special Terms & Conditions']/following-sibling::label[@class='data_field']")
	WebElement specialTermsAndConditionElement;

	@FindBy(xpath = "//button[contains(text(),'Approve')]")
	WebElement approval1Button;

	@FindBy(xpath = "//button[contains(text(),'Yes')]")
	WebElement yesButton;

	// PR Approval 2

	@FindBy(xpath = "//table[@class='table table-striped']")
	WebElement table2;

	@FindBy(xpath = "//button[contains(text(),'Approve')]")
	WebElement approval2Button;

	public Purchase_Requisation_SA2() {

		PageFactory.initElements(driver, this);
	}

//******************************************************PR CREATE*************************************************// 

	public HomePage prCreatePage() throws Throwable {

		boolean prDateElementIsDisplayed = prDateElement.isDisplayed();
		assertTrue(prDateElementIsDisplayed, "Project Number Element is not IsDisplayed.");
		// To extract Value Attribute and use same approach to retrieve
		String prDateElementValue = (String) js.executeScript("return arguments[0].value;", prDateElement);
		System.out.println("Pr Date : " + prDateElementValue + "\n");

		driver.navigate().to("https://demo_keus.getapcs.com/transaction/sales-order/table");

		String tableXpath1 = "//table[@class='table table-striped']";

		// Get the first PR number text from table
		String ProjectNumber = driver.findElement(By.xpath(tableXpath1 + "/tbody/tr[1]/td[4]")).getText();

		// Store the element with hard coded PR number
		String elementXpath1 = "(//span[normalize-space()='Item-FG-11-TEST'])[1]";

		String updatedXpath1 = elementXpath1.replace("Item-FG-11-TEST", ProjectNumber);

		System.out.println(updatedXpath1);

		driver.navigate().to("https://demo_keus.getapcs.com/transaction/material-issue/table");

		click(driver, issueMaterial);

		String tableXpath = "//table[@formarrayname='ItemData']";

		// Get the first PR number text from table
		String ItemNumber = driver.findElement(By.xpath(tableXpath + "/tbody/tr[1]/td[3]/div")).getText();

		String ItemNumber1 = driver.findElement(By.xpath(tableXpath + "/tbody/tr[2]/td[3]/div")).getText();

		String reqQty1 = driver.findElement(By.xpath(tableXpath + "/tbody/tr[2]/td[7]/div")).getText();

		int reqQty2 = Integer.parseInt(reqQty1) + 500;

		String reqQty = String.valueOf(reqQty2);

		// Store the element with hard coded PR number
		String elementXpathPP1 = "(//span[normalize-space()='Item-FG-11-TEST'])[1]";

		String updatedXpathPP1 = elementXpathPP1.replace("Item-FG-11-TEST", ItemNumber);

		System.out.println(updatedXpathPP1);

		String updatedXpathPP2 = elementXpathPP1.replace("Item-FG-11-TEST", ItemNumber1);

		System.out.println(updatedXpathPP2);

		driver.navigate().to("https://demo_keus.getapcs.com/transaction/purchase-requisition/create");

		// Verify and Select Value from Procurement Type DropDown in PR
		click(driver, procurementTypeDropDown);
		isSelected(driver, procurementTypeDropDown, "procurementTypeDropDown");
		click(driver, selectProcurementTypeDropDownValue);

		// Verify and Select Value from Purpose Text Field in PR Create-Transaction
		click(driver, purposeTextField);
		isSelected(driver, purposeTextField, "purposeTextField");
		purposeTextField.clear();
		purposeTextField.sendKeys("TEST Purpose");

//		uploadFile(driver, uploadFiles, 1);

		// ################## Item Tab ######################

		// Verify Item Tab in PR Create-Transaction Module
		click(driver, itemTab);

//		uploadFile(driver, uploadItem, 1);

		// click(driver, closeButton);

		for (int i = 1; i <= 2; i++) {
			// Verify and Select Value from Item Number DropDown in PR Create-Transaction
			click(driver, itemNumberDropDown);
			isSelected(driver, itemNumberDropDown, "itemNumberDropDown");

			if (i == 1) {
				WebElement itemNumberDropDownDataSelect = driver.findElement(By.xpath(updatedXpathPP1));
				click(driver, itemNumberDropDownDataSelect);
			}
			if (i == 2) {
				WebElement itemNumberDropDownDataSelect = driver.findElement(By.xpath(updatedXpathPP2));
				click(driver, itemNumberDropDownDataSelect);
			}

			// Verify and Select Value from Mftr Item Number DropDown in PR
			click(driver, mftrItemNumberDropDown);
			isSelected(driver, mftrItemNumberDropDown, "mftrItemNumberDropDown");
			mftrItemNumberDropDown.sendKeys(Keys.ENTER);

			// Verify and Select Value from quantity Text Field in PR Create-Transaction
			click(driver, quantityTextField);
			isSelected(driver, quantityTextField, "quantityTextField");
			quantityTextField.clear();
			quantityTextField.sendKeys(reqQty);

			// ************Add Project Expansion Panel************
			if (i == 1) {
				click(driver, addProjectExpansionPanel);
			}

			// Verify and Select Value from Project Number DropDown in PR Create-Transaction
			click(driver, projectNumberDropDown);
			isSelected(driver, projectNumberDropDown, "projectNumberDropDown");
			Thread.sleep(2000);

			WebElement selectProjectNumberDropDownValue = driver.findElement(By.xpath(updatedXpath1));
			click(driver, selectProjectNumberDropDownValue);

			// Verify and Select Value from Project Quantity Text Field in PR
			click(driver, projectQuantityTextField);
			isSelected(driver, projectQuantityTextField, "projectQuantityTextField");
			projectQuantityTextField.clear();
			projectQuantityTextField.sendKeys(reqQty);

			// Verify and Click on Add Button in Project Expansion Panel
			click(driver, addButtonInProjectExpansionPanel);

			if (i == 1) {
				click(driver, addDeliveryScheduleExpansionPanel);
			}

			// ************Add Delivery Schedule Expansion Panel************

			// scheduleDateDatePicker
//			datePicker(driver, scheduleDateDatePicker);
			Thread.sleep(2000);
			scheduleDateDatePicker.click();
			Thread.sleep(2000);
			for (int j = 0; j < 5; j++) {
				scheduleDateDatePicker.sendKeys(Keys.ARROW_DOWN);
				Thread.sleep(500); // Add a small delay if needed
			}

			// Verify and Select Value from quantity Text Field1 in PR Create-Transaction
			click(driver, quantityTextField1);
			isSelected(driver, quantityTextField1, "quantityTextField1");
			quantityTextField1.clear();
			quantityTextField1.sendKeys(reqQty);

			// Verify and Click on Add Button in DeliverySchedule Expansion Panel
			click(driver, addButtonInDeliveryScheduleExpansionPanel);

			// Verify the Special Instruction Text Field in Items Tab - PR
			specialInstructionTextField.clear();
			specialInstructionTextField.sendKeys("TEST Special Instruction");

			// Verify and Click on Add Button in Item Tab
			click(driver, addButtonInItemsTab);

		}

		// ################## Billing & Shipping Details Tab ######################

		// Verify Billing & Shipping Details Tab in Sales Order Create Page
		click(driver, billing$ShippingDetailsTab);

		// Verify and select data in Delivery Terms Drop Down in Billing & Shipping
		click(driver, deliveryTermsDropDown);
		isSelected(driver, deliveryTermsDropDown, "deliveryTermsDropDown");
		deliveryTermsDropDown.sendKeys("TEST Delivery");
		click(driver, selectDeliveryTermsDropDownValue);

		// Verify and select data in payment Terms Drop Down in Billing & Shipping
		click(driver, paymentTermsDropDown);
		isSelected(driver, paymentTermsDropDown, "paymentTermsDropDown");
		click(driver, selectPaymentTermsDropDownValue);

		// Verify and select data in Shipping Mode Drop Down in Billing & Shipping
		click(driver, shippingModeDropDown);
		isSelected(driver, shippingModeDropDown, "shippingModeDropDown");
		click(driver, selectShippingModeDropDownValue);

		// ##################################### Terms Tab
		// ############################################

		// Verify Terms Tab in PR Order Create Page
		click(driver, termsTab);

		// Verify the Retention Period Text Field in Items Tab - PR Create-Transaction
		click(driver, retentionPeriodTextField);
		isSelected(driver, retentionPeriodTextField, "retentionPeriodTextField");
		retentionPeriodTextField.clear();
		retentionPeriodTextField.sendKeys("TEST Retention Period");

		// Verify the Special Terms & Condition Text Field in Items Tab - PR
		click(driver, specialTerms$ConditionTextField);
		isSelected(driver, specialTerms$ConditionTextField, "specialTerms$ConditionTextField");
		specialTerms$ConditionTextField.clear();
		specialTerms$ConditionTextField.sendKeys("TEST Special Terms & Condition");

		String beforeSaveButton = driver.getCurrentUrl();
		System.out.println(beforeSaveButton);

		Thread.sleep(5000);

		click(driver, saveButtonInPRCreate);

		Thread.sleep(5000);
		String afterSaveButton = driver.getCurrentUrl();
		System.out.println(afterSaveButton);

		return new HomePage();

	}

}
