package com.getapcs.Transaction;

import static org.testng.Assert.assertTrue;

import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.getapcs.base.Testbase1;
import com.getapcs.pages.HomePage;

public class Purchase_Requisation extends Testbase1 {

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

	@FindBy(xpath = "//input[@placeholder='DD-MM-YYYY']")
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

	public Purchase_Requisation() {

		PageFactory.initElements(driver, this);
	}

//******************************************************PR CREATE*************************************************// 

	public HomePage prCreatePage() throws Throwable {

		boolean prDateElementIsDisplayed = prDateElement.isDisplayed();
		assertTrue(prDateElementIsDisplayed, "Project Number Element is not IsDisplayed.");
		// To extract Value Attribute and use same approach to retrieve
		String prDateElementValue = (String) js.executeScript("return arguments[0].value;", prDateElement);
		System.out.println("Pr Date : " + prDateElementValue + "\n");

		driver.navigate().to("https://demo_keus.getapcs.com/engineering/item-master/table");

		String tableXpath = "//table[@class='table table-striped']";

		// Get the first PR number text from table
		String ItemNumber = driver.findElement(By.xpath(tableXpath + "/tbody/tr[1]/td[2]")).getText();

		// Store the element with hard coded PR number
		String elementXpath = "(//span[normalize-space()='Item-FG-11-TEST'])[1]";

		String updatedXpath = elementXpath.replace("Item-FG-11-TEST", ItemNumber);

		System.out.println(updatedXpath);

		driver.navigate().to("https://demo_keus.getapcs.com/transaction/sales-order/table");

		String tableXpath1 = "//table[@class='table table-striped']";

		// Get the first PR number text from table
		String ProjectNumber = driver.findElement(By.xpath(tableXpath1 + "/tbody/tr[1]/td[4]")).getText();

		// Store the element with hard coded PR number
		String elementXpath1 = "(//span[normalize-space()='Item-FG-11-TEST'])[1]";

		String updatedXpath1 = elementXpath1.replace("Item-FG-11-TEST", ProjectNumber);

		System.out.println(updatedXpath1);

		driver.navigate().to("https://demo_keus.getapcs.com/transaction/purchase-requisition/create");

		// Verify and Select Value from Procurement Type DropDown in PR
		// Create-Transaction Module
//        WebElement procurementTypeDropDown = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//input[@type='text'])[2]")));
		boolean procurementTypeDropDownIsDisplayed = procurementTypeDropDown.isDisplayed();
		assertTrue(procurementTypeDropDownIsDisplayed, "Procurement Type DropDown is not Displayed.");
		procurementTypeDropDown.sendKeys(Keys.ENTER);
		WebElement procurementTypeDropDownFocusedElement = driver.switchTo().activeElement();
		boolean procurementTypeDropDownIsSelected = procurementTypeDropDownFocusedElement
				.equals(procurementTypeDropDown);
		assertTrue(procurementTypeDropDownIsSelected, "Procurement Type DropDown is not Selected");
//        ((JavascriptExecutor) driver).executeScript("arguments[0].click();" ,driver.findElement(By.xpath("(//span[text()='TEST Procurement Type Name'])[1]")));
		click(driver, selectProcurementTypeDropDownValue);

		// Verify and Select Value from Purpose Text Field in PR Create-Transaction
		// Module
//        WebElement purposeTextField = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//textarea[@placeholder='Enter Special Terms and Conditions']")));
		boolean purposeTextFieldIsDisplayed = purposeTextField.isDisplayed();
		assertTrue(purposeTextFieldIsDisplayed, "Purpose Text Field  is not Displayed.");
		purposeTextField.sendKeys(Keys.ENTER);
		WebElement purposeTextFieldFocusedElement = driver.switchTo().activeElement();
		boolean purposeTextFieldIsSelected = purposeTextFieldFocusedElement.equals(purposeTextField);
		assertTrue(purposeTextFieldIsSelected, "Purpose Text Field  is not Selected");
		purposeTextField.clear();
		purposeTextField.sendKeys("TEST Purpose");

		// Verifying and Upload Files in Add Vendor
//  		WebElement uploadFiles = driver.findElement(By.xpath("//input[@placeholder='Upload file']"));
		js.executeScript("arguments[0].click();", uploadFiles);
		robot.delay(1000);
		StringSelection stringSelection = new StringSelection("C:\\Users\\W2191\\Documents\\123.txt");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);

		// Press Enter to open the file dialog

		robot.delay(1000);

		// Press Ctrl+V to paste the file path
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.delay(1000);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);

		robot.delay(1000);
		// Press Enter to confirm the file selection
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

		// ################## Item Tab ######################

		// Verify Item Tab in PR Create-Transaction Module
//  		WebElement itemTab = driver.findElement(By.linkText("Items"));
		boolean itemTabIsDisplayed = itemTab.isDisplayed();
		assertTrue(itemTabIsDisplayed, "item Tab is not Displayed.");
		itemTab.click();

		// Verify Upload File Element
//  		WebElement uploadFiles1 = driver.findElement(By.xpath("//input[@placeholder='Upload Items']"));
		boolean uploadFiles1IsDisplayed = uploadItem.isDisplayed();
		assertTrue(uploadFiles1IsDisplayed, "Upload item is not Displayed.");

		js.executeScript("arguments[0].click();", uploadItem);
		robot.delay(1000);
		StringSelection stringSelection1 = new StringSelection("C:\\Users\\W2191\\Documents\\123.txt");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection1, null);

		// Press Enter to open the file dialog

		robot.delay(1000);

		// Press Ctrl+V to paste the file path
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.delay(1000);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);

		robot.delay(1000);
		// Press Enter to confirm the file selection
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
//          driver.findElement(By.xpath("//button[normalize-space()='Close']")).click();

		// Verify and Select Value from Item Number DropDown in PR Create-Transaction
		// Module
//        WebElement itemNumberDropDown = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//input[@type='text'])[5]")));
		boolean itemNumberDropDownIsDisplayed = itemNumberDropDown.isDisplayed();
		assertTrue(itemNumberDropDownIsDisplayed, "Item Number DropDown is not Displayed.");
		itemNumberDropDown.sendKeys(Keys.ENTER);
		WebElement itemNumberDropDownFocusedElement = driver.switchTo().activeElement();
		boolean itemNumberDropDownIsSelected = itemNumberDropDownFocusedElement.equals(itemNumberDropDown);
		assertTrue(itemNumberDropDownIsSelected, "Item Number DropDown is not Selected");
		itemNumberDropDown.sendKeys("PP");

		WebElement itemNumberDropDownDataSelect = driver.findElement(By.xpath(updatedXpath));
		js.executeScript("arguments[0].click();", itemNumberDropDownDataSelect);

		// Verify and Select Value from Mftr Item Number DropDown in PR
		// Create-Transaction Module
//        WebElement mftrItemNumberDropDown = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//input[@type='text'])[6]")));
		boolean mftrItemNumberDropDownIsDisplayed = mftrItemNumberDropDown.isDisplayed();
		assertTrue(mftrItemNumberDropDownIsDisplayed, "Item Number DropDown is not Displayed.");
		mftrItemNumberDropDown.sendKeys(Keys.ENTER);
		WebElement mftrItemNumberDropDownFocusedElement = driver.switchTo().activeElement();
		boolean mftrItemNumberDropDownIsSelected = mftrItemNumberDropDownFocusedElement.equals(mftrItemNumberDropDown);
		assertTrue(mftrItemNumberDropDownIsSelected, "Mftr Item Number DropDown is not Selected");
		mftrItemNumberDropDown.sendKeys(Keys.ENTER);

		// Verify and Select Value from quantity Text Field in PR Create-Transaction
		// Module
//        WebElement quantityTextField = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@type='text'])[8]")));
		boolean quantityTextFieldIsDisplayed = quantityTextField.isDisplayed();
		assertTrue(quantityTextFieldIsDisplayed, "quantity Text Field  is not Displayed.");
		quantityTextField.sendKeys(Keys.ENTER);
		WebElement quantityTextFieldFocusedElement = driver.switchTo().activeElement();
		boolean quantityTextFieldIsSelected = quantityTextFieldFocusedElement.equals(quantityTextField);
		assertTrue(quantityTextFieldIsSelected, "quantity Text Field  is not Selected");
		quantityTextField.clear();
		quantityTextField.sendKeys("1000");

		// ************Add Project Expansion Panel************
//        WebElement addProjectExpansionPanel = driver.findElement(By.xpath("//mat-panel-title[@class='mat-expansion-panel-header-title ng-tns-c160-3']"));
		boolean addProjectExpansionPanelIsDisplayed = addProjectExpansionPanel.isDisplayed();
		assertTrue(addProjectExpansionPanelIsDisplayed, "Add Project Expansion Panel is not Displayed.");
		addProjectExpansionPanel.click();

		for (int k = 1; k <= 2; k++) {
			// Verify and Select Value from Project Number DropDown in PR Create-Transaction
			// Module
//        WebElement projectNumberDropDown = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//input[@type='text'])[9]")));
			js.executeScript("arguments[0].click();", projectNumberDropDown);
			boolean projectNumberDropDownIsDisplayed = projectNumberDropDown.isDisplayed();
			assertTrue(projectNumberDropDownIsDisplayed, "Project Number DropDown is not Displayed.");
			projectNumberDropDown.sendKeys(Keys.ENTER);
			Thread.sleep(2000);
			WebElement projectNumberDropDownFocusedElement = driver.switchTo().activeElement();
			boolean projectNumberDropDownIsSelected = projectNumberDropDownFocusedElement.equals(projectNumberDropDown);
			assertTrue(projectNumberDropDownIsSelected, "Project Number DropDown is not Selected");

			WebElement selectProjectNumberDropDownValue = driver.findElement(By.xpath(updatedXpath1));
			js.executeScript("arguments[0].click();", selectProjectNumberDropDownValue);

			// Verify and Select Value from Project Quantity Text Field in PR
			// Create-Transaction Module
//        WebElement projectQuantityTextField = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@formcontrolname='prProjectQuantity']")));
			boolean projectQuantityTextFieldIsDisplayed = projectQuantityTextField.isDisplayed();
			assertTrue(projectQuantityTextFieldIsDisplayed, "Project Quantity Text Field  is not Displayed.");
			projectQuantityTextField.sendKeys(Keys.ENTER);
			WebElement projectQuantityTextFieldFocusedElement = driver.switchTo().activeElement();
			boolean projectQuantityTextFieldIsSelected = projectQuantityTextFieldFocusedElement
					.equals(projectQuantityTextField);
			assertTrue(projectQuantityTextFieldIsSelected, "Project Quantity Text Field  is not Selected");
			projectQuantityTextField.clear();
			projectQuantityTextField.sendKeys("1000");

			// Verify and Click on Add Button in Project Expansion Panel
//        WebElement addButtonInProjectExpansionPanel = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[contains(text(),'Add')])[1]")));
			boolean addButtonInProjectExpansionPanelIsDisplayed = addButtonInProjectExpansionPanel.isDisplayed();
			assertTrue(addButtonInProjectExpansionPanelIsDisplayed,
					"Add Button in Project Expansion Panel is not Displayed.");
			js.executeScript("arguments[0].click();", addButtonInProjectExpansionPanel);

		}

		// ************Add Delivery Schedule Expansion Panel************
		js.executeScript("arguments[0].click();", addDeliveryScheduleExpansionPanel);

		for (int n = 1; n <= 2; n++) {
			// Verify and Schedule Date Date Picker in General Tab
//	        WebElement scheduleDateDatePicker = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='DD-MM-YYYY']")));
			scheduleDateDatePicker.sendKeys(Keys.ENTER);
			boolean scheduleDateDatePickerIsDisplayed = scheduleDateDatePicker.isDisplayed();
			assertTrue(scheduleDateDatePickerIsDisplayed, "Schedule Date Date Picker is not Displayed.");
			scheduleDateDatePicker.sendKeys(Keys.ENTER);

			// scheduleDateDatePicker

			WebElement scheduleDateDatePicker = driver.findElement(By.xpath("(//input[@placeholder='DD-MM-YYYY'])[1]"));
			js.executeScript("arguments[0].scrollIntoView(true);", scheduleDateDatePicker);
			Thread.sleep(5000);
			scheduleDateDatePicker.click();
			// js.executeScript("arguments[0].click();", scheduleDateDatePicker);
			scheduleDateDatePicker.sendKeys(Keys.RIGHT);
			scheduleDateDatePicker.sendKeys(Keys.ENTER);

			// Verify and Select Value from quantity Text Field1 in PR Create-Transaction
			// Module
//	        WebElement quantityTextField1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@type='text'])[11]")));
			boolean quantityTextField1IsDisplayed = quantityTextField1.isDisplayed();
			assertTrue(quantityTextField1IsDisplayed, "quantity Text Field1  is not Displayed.");
			quantityTextField1.sendKeys(Keys.ENTER);
			WebElement quantityTextField1FocusedElement = driver.switchTo().activeElement();
			boolean quantityTextField1IsSelected = quantityTextField1FocusedElement.equals(quantityTextField1);
			assertTrue(quantityTextField1IsSelected, "quantity Text Field1  is not Selected");
			quantityTextField1.clear();
			quantityTextField1.sendKeys("500");

			// Verify and Click on Add Button in DeliverySchedule Expansion Panel
//	        WebElement addButtonInDeliveryScheduleExpansionPanel = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[contains(text(),'Add')])[2]")));
			boolean addButtonInDeliveryScheduleExpansionPanelIsDisplayed = addButtonInDeliveryScheduleExpansionPanel
					.isDisplayed();
			assertTrue(addButtonInDeliveryScheduleExpansionPanelIsDisplayed,
					"Add Button in DeliverySchedule Expansion Panel is not Displayed.");
			js.executeScript("arguments[0].click();", addButtonInDeliveryScheduleExpansionPanel);

		}
		// Verify the Special Instruction Text Field in Items Tab - PR
		// Create-Transaction Module
//	      WebElement specialInstructionTextField = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//textarea[@placeholder='Enter Special Instruction']")));
		boolean specialInstructionTextFieldIsDisplayed = specialInstructionTextField.isDisplayed();
		assertTrue(specialInstructionTextFieldIsDisplayed, "Special Instruction Text Field  is not Displayed.");
		specialInstructionTextField.sendKeys(Keys.ENTER);
		WebElement specialInstructionTextFieldFocusedElement = driver.switchTo().activeElement();
		boolean specialInstructionTextFieldIsSelected = specialInstructionTextFieldFocusedElement
				.equals(specialInstructionTextField);
		assertTrue(specialInstructionTextFieldIsSelected, "Special Instruction Text Field  is not Selected");
		specialInstructionTextField.clear();
		specialInstructionTextField.sendKeys("TEST Special Instruction");

		// Verify and Click on Add Button in Item Tab
//	        WebElement addButtonInItemsTab = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[contains(text(),'Add')])[3]")));
		boolean addButtonInItemsTabIsDisplayed = addButtonInItemsTab.isDisplayed();
		assertTrue(addButtonInItemsTabIsDisplayed, "Add Button in Project Expansion Panel is not Displayed.");
		js.executeScript("arguments[0].click();", addButtonInItemsTab);

		// ################## Billing & Shipping Details Tab ######################

		// Verify Billing & Shipping Details Tab in Sales Order Create Page
//      		WebElement billing$ShippingDetailsTab = driver.findElement(By.linkText("Billing & Shipping Details"));
		boolean billing$ShippingDetailsTabIsDisplayed = billing$ShippingDetailsTab.isDisplayed();
		assertTrue(billing$ShippingDetailsTabIsDisplayed, "Billing & Shippbilling Details Tab is not Displayed.");
		js.executeScript("arguments[0].click();", billing$ShippingDetailsTab);

		// Verify and select data in Delivery Terms Drop Down in Billing & Shipping
		// Details Tab
//	        WebElement deliveryTermsDropDown = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//input[@type='text'])[4]")));
		boolean deliveryTermsDropDownIsDisplayed = deliveryTermsDropDown.isDisplayed();
		assertTrue(deliveryTermsDropDownIsDisplayed, "Delivery Terms DropDown is not Displayed.");
		deliveryTermsDropDown.click();
		WebElement deliveryTermsDropDownFocusedElement = driver.switchTo().activeElement();
		boolean deliveryTermsDropDownIsSelected = deliveryTermsDropDownFocusedElement.equals(deliveryTermsDropDown);
		assertTrue(deliveryTermsDropDownIsSelected, "Delivery Terms DropDown is not Selected");
		deliveryTermsDropDown.sendKeys("TEST Delivery");
//	        ((JavascriptExecutor) driver).executeScript("arguments[0].click();" ,driver.findElement(By.xpath("(//span[contains(text(),'TEST Delivery Terms')])[1]")));
		selectDeliveryTermsDropDownValue.click();

		// Verify and select data in payment Terms Drop Down in Billing & Shipping
		// Details Tab
//	        WebElement paymentTermsDropDown = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//input[@type='text'])[5]")));
		boolean paymentTermsDropDownIsDisplayed = paymentTermsDropDown.isDisplayed();
		assertTrue(paymentTermsDropDownIsDisplayed, "payment Terms DropDown is not Displayed.");
		paymentTermsDropDown.click();
		WebElement paymentTermsDropDownFocusedElement = driver.switchTo().activeElement();
		boolean paymentTermsDropDownIsSelected = paymentTermsDropDownFocusedElement.equals(paymentTermsDropDown);
		assertTrue(paymentTermsDropDownIsSelected, "payment Terms DropDown is not Selected");
//	        ((JavascriptExecutor) driver).executeScript("arguments[0].click();" ,driver.findElement(By.xpath("(//span[normalize-space()='COD'])[1]")));
		selectPaymentTermsDropDownValue.click();

		// Verify and select data in Shipping Mode Drop Down in Billing & Shipping
		// Details Tab
//	        WebElement shippingModeDropDown = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//input[@type='text'])[6]")));
		boolean shippingModeDropDownIsDisplayed = shippingModeDropDown.isDisplayed();
		assertTrue(shippingModeDropDownIsDisplayed, "Shipping Mode DropDown is not Displayed.");
		shippingModeDropDown.click();
		WebElement shippingModeDropDownFocusedElement = driver.switchTo().activeElement();
		boolean shippingModeDropDownIsSelected = shippingModeDropDownFocusedElement.equals(shippingModeDropDown);
		assertTrue(shippingModeDropDownIsSelected, "Shipping Mode DropDown is not Selected");
//	        ((JavascriptExecutor) driver).executeScript("arguments[0].click();" ,driver.findElement(By.xpath("//span[normalize-space()='BY ROAD']")));
		selectShippingModeDropDownValue.click();

		// ##################################### Terms Tab
		// ############################################

		// Verify Terms Tab in PR Order Create Page
//      		WebElement termsTab = driver.findElement(By.linkText("Terms"));
		boolean termsTabIsDisplayed = termsTab.isDisplayed();
		assertTrue(termsTabIsDisplayed, "Terms Tab is not Displayed.");
		js.executeScript("arguments[0].click();", termsTab);

		// Verify the Retention Period Text Field in Items Tab - PR Create-Transaction
		// Module
//		      WebElement retentionPeriodTextField = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='Enter Retention Period']")));
		boolean retentionPeriodTextFieldIsDisplayed = retentionPeriodTextField.isDisplayed();
		assertTrue(retentionPeriodTextFieldIsDisplayed, "Retention Period Text Field  is not Displayed.");
		retentionPeriodTextField.sendKeys(Keys.ENTER);
		WebElement retentionPeriodTextFieldFocusedElement = driver.switchTo().activeElement();
		boolean retentionPeriodTextFieldIsSelected = retentionPeriodTextFieldFocusedElement
				.equals(retentionPeriodTextField);
		assertTrue(retentionPeriodTextFieldIsSelected, "Retention Period Text Field  is not Selected");
		retentionPeriodTextField.clear();
		retentionPeriodTextField.sendKeys("TEST Retention Period");

		// Verify the Special Terms & Condition Text Field in Items Tab - PR
		// Create-Transaction Module
//		      WebElement specialTerms$ConditionTextField = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//textarea[@placeholder='Enter Special Terms & Conditions']")));
		boolean specialTerms$ConditionTextFieldIsDisplayed = specialTerms$ConditionTextField.isDisplayed();
		assertTrue(specialTerms$ConditionTextFieldIsDisplayed,
				"Special Terms & Condition Text Field  is not Displayed.");
		specialTerms$ConditionTextField.sendKeys(Keys.ENTER);
		WebElement specialTerms$ConditionTextFieldFocusedElement = driver.switchTo().activeElement();
		boolean specialTerms$ConditionTextFieldIsSelected = specialTerms$ConditionTextFieldFocusedElement
				.equals(specialTerms$ConditionTextField);
		assertTrue(specialTerms$ConditionTextFieldIsSelected, "Special Terms & Condition Text Field  is not Selected");
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
