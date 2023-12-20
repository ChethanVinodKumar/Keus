package com.getapcs.TransactionEdit;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.getapcs.base.Testbase1;
import com.getapcs.pages.HomePage;

public class VerifyPR_EditPage extends Testbase1 {

	@FindBy(xpath = "//label[normalize-space(text())='PR Number']/following-sibling::div/input[@formcontrolname='prNumber']")
	WebElement prNumberElement;

	@FindBy(xpath = "//label[normalize-space(text())='PR Date']/following-sibling::div/input[@formcontrolname='prDate']")
	WebElement prDateElement;

	@FindBy(xpath = "//label[normalize-space(text())='Rev Number']/following-sibling::div/input[@formcontrolname='revisionNumber']")
	WebElement revNumberElement;

	@FindBy(xpath = "(//input[@type='text'])[4]")
	WebElement procurementTypeDropDown;

	@FindBy(xpath = "//label[contains(text(),'Purpose')]/following-sibling::textarea")
	WebElement purposeTextField;

	@FindBy(xpath = "//button[contains(@title,'Upload Files')]")
	WebElement uploadFile;

	@FindBy(xpath = "//div[@class='modal-content']")
	WebElement uploadFilePopUp;

	@FindBy(xpath = "//button[normalize-space()='Close']")
	WebElement closeButton;

	@FindBy(linkText = "Items")
	WebElement itemTab;

	@FindBy(xpath = "//td[contains(text(),'PP1-1')]")
	WebElement clickOnrecordForEdit;

	@FindBy(xpath = "//input[@placeholder='Upload Items']")
	WebElement uploadItemsFile;

	@FindBy(xpath = "(//input[@type='text'])[6]")
	WebElement itemNumberDropDown;
	@FindBy(xpath = "//span[text()='PP1-1']")
	WebElement selectItemNumberDropDownValue;

	@FindBy(xpath = "(//input[@type='text'])[7]")
	WebElement mftrItemNumberDropDown;

	@FindBy(xpath = "(//span[contains(text(),'PP1')])[1]")
	WebElement selectMftrItemNumberDropDownValue;

	@FindBy(xpath = "//input[@formcontrolname='quantity']")
	WebElement quantityTextField;

	@FindBy(xpath = "//mat-panel-title[@class='mat-expansion-panel-header-title ng-tns-c160-3']")
	WebElement addProjectExpansionPanel;

	@FindBy(xpath = "(//i[@class='mdi mdi-delete edit-icon' and @aria-hidden='true'])[1]")
	WebElement deleteExistingRecord;

	@FindBy(xpath = "(//input[@type='text'])[10]")
	WebElement projectNumberDropDown;

	@FindBy(xpath = "//span[normalize-space()='TISPL-1779']")
	WebElement selectProjectNumberDropDownValue;

	@FindBy(xpath = "//input[@formcontrolname='prProjectQuantity']")
	WebElement projectQuantityTextField;

	@FindBy(xpath = "(//button[contains(text(),'Add')])[1]")
	WebElement addButtonInProjectExpansionPanel;

	@FindBy(xpath = "//*[@id=\"mat-expansion-panel-header-1\"]/span[2]")
	WebElement addDeliveryScheduleExpansionPanel;

	@FindBy(xpath = "(//i[@class='mdi mdi-delete edit-icon' and @aria-hidden='true'])[3]")
	WebElement deleteExistingRecord1;

	@FindBy(xpath = "//input[@placeholder='DD-MM-YYYY']")
	WebElement scheduleDateDatePicker;

	@FindBy(xpath = "//input[@formcontrolname='deliveryScheduleQty']")
	WebElement quantityTextField1;

	@FindBy(xpath = "(//button[contains(text(),'Add')])[2]")
	WebElement addButtonInDeliveryScheduleExpansionPanel;

	@FindBy(xpath = "//textarea[@placeholder='Enter Special Instruction']")
	WebElement specialInstructionTextField;

	@FindBy(xpath = "//button[text()='Update']")
	WebElement updateButtonInItemsTab;

	@FindBy(linkText = "Billing & Shipping Details")
	WebElement billing$ShippingDetailsTab;

	@FindBy(xpath = "(//input[@type='text'])[5]")
	WebElement deliveryTermsDropDown;
	@FindBy(xpath = "(//span[contains(text(),'TEST Delivery Terms')])[1]")
	WebElement selectDeliveryTermsDropDownValue;

	@FindBy(xpath = "(//input[@type='text'])[6]")
	WebElement paymentTermsDropDown;
	@FindBy(xpath = "//span[normalize-space()='NET 15 DAYS']")
	WebElement selectPaymentTermsDropDownValue;

	@FindBy(xpath = "(//input[@type='text'])[7]")
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

	public VerifyPR_EditPage() {
		PageFactory.initElements(driver, this);
	}

	public HomePage verifyPR_Edit(String Purpose) throws Throwable {

		// Verify the PR Number Element in PR Edit View Page-Transaction Module
//	  		WebElement prNumberElement = driver.findElement(By.xpath("//label[normalize-space(text())='PR Number']/following-sibling::div/input[@formcontrolname='prNumber']"));
		boolean prNumberElementIsDisplayed = prNumberElement.isDisplayed();
		assertTrue(prNumberElementIsDisplayed, "PR Number Element is not Displayed.");
		// To extract Value Attribute and use same approach to retrieve
		String prNumberElementValue = (String) js.executeScript("return arguments[0].value;", prNumberElement);
		System.out.println("PR Number : " + prNumberElementValue + "\n");

		// Verify the PR Number Element in PR Edit Page-Transaction Module
//	  		WebElement prDateElement = driver.findElement(By.xpath("//label[normalize-space(text())='PR Date']/following-sibling::div/input[@formcontrolname='prDate']"));
		boolean prDateElementIsDisplayed = prDateElement.isDisplayed();
		assertTrue(prDateElementIsDisplayed, "PR Number Element is not Displayed.");
		// To extract Value Attribute and use same approach to retrieve
		String prDateElementValue = (String) js.executeScript("return arguments[0].value;", prDateElement);
		System.out.println("PR Date : " + prDateElementValue + "\n");

		// Verify the Rev Number Element in PR Edit Page-Transaction Module
//	  		WebElement revNumberElement = driver.findElement(By.xpath("//label[normalize-space(text())='Rev Number']/following-sibling::div/input[@formcontrolname='revisionNumber']"));
		boolean revNumberElementIsDisplayed = revNumberElement.isDisplayed();
		assertTrue(revNumberElementIsDisplayed, "rev Number Element is not Displayed.");
		// To extract Value Attribute and use same approach to retrieve
		String revNumberElementValue = (String) js.executeScript("return arguments[0].value;", revNumberElement);
		System.out.println("Rev Number : " + revNumberElementValue + "\n");

		// Verify the Procurement Type Drop Down in PR Edit Page-Transaction Module
//	  		WebElement procurementTypeDropDown = driver.findElement(By.xpath("(//input[@type='text'])[4]"));
		boolean procurementTypeDropDownIsDisplayed = procurementTypeDropDown.isDisplayed();
		assertTrue(procurementTypeDropDownIsDisplayed, "Procurement Type Drop Down is not Displayed.");

		// Verify the Purpose Text Field in Sales Order View Page-Transaction Module
//	  		WebElement purposeTextField = driver.findElement(By.xpath("//label[contains(text(),'Purpose')]/following-sibling::textarea"));
		boolean purposeTextFieldIsDisplayed = purposeTextField.isDisplayed();
		assertTrue(purposeTextFieldIsDisplayed, "Purpose Text Field is not Displayed.");
		// To extract Value Attribute and use same approach to retrieve
		String purposeTextFieldValue = (String) js.executeScript("return arguments[0].value;", purposeTextField);
		System.out.println("Purpose Text Field : " + purposeTextFieldValue + "\n");
		purposeTextField.clear();
		purposeTextField.sendKeys(Purpose);

		// Verify the Upload File in Sales Order View Page-Transaction Module
////	  		WebElement uploadFile = driver.findElement(By.xpath("//button[contains(@title,'Upload Files')]"));
//	  		boolean uploadFileIsDisplayed = uploadFile.isDisplayed();
//	  		assertTrue(uploadFileIsDisplayed, "Upload File is not Displayed."); 
//	  		uploadFile.click();
//	        
//	  		//Upload File Pop-Up
////	  		boolean uploadFilePopUpIsDisplayed = driver.findElement(By.xpath("//div[@class='modal-content']")).isDisplayed();
//	  		boolean uploadFilePopUpIsDisplayed = uploadFilePopUp.isDisplayed();
//	  		assertTrue(uploadFilePopUpIsDisplayed, "Upload File Pop Up is not Displayed."); 
////	  		closeButton.click(); 
//	  		js.executeScript("arguments[0].click();", closeButton);
//	  		
		// ################## Item Tab ######################
		/*
		 * // Verify Item Tab in PR Create-Transaction Module // WebElement itemTab =
		 * driver.findElement(By.linkText("Items")); // boolean itemTabIsDisplayed =
		 * itemTab.isDisplayed(); // assertTrue(itemTabIsDisplayed,
		 * "item Tab is not Displayed."); // itemTab.click();
		 * js.executeScript("arguments[0].click();", itemTab);
		 * 
		 * // Click On Records for Edit // ((JavascriptExecutor)
		 * driver).executeScript("arguments[0].click();",
		 * driver.findElement(By.xpath("//td[contains(text(),'PP1-1')]"))); //
		 * clickOnrecordForEdit.click(); js.executeScript("arguments[0].click();",
		 * clickOnrecordForEdit);
		 * 
		 * // Verify Upload File Element // WebElement uploadFiles1 =
		 * driver.findElement(By.xpath("//input[@placeholder='Upload Items']")); boolean
		 * uploadFiles1IsDisplayed = uploadItemsFile.isDisplayed();
		 * assertTrue(uploadFiles1IsDisplayed, "Upload item is not Displayed.");
		 * 
		 * js.executeScript("arguments[0].click();", uploadItemsFile);
		 * robot.delay(1000); StringSelection stringSelection1 = new StringSelection(
		 * "C:\\Users\\Gopal Reddy\\Desktop\\Gopal Reddy-Learnig Program.xlsx");
		 * Toolkit.getDefaultToolkit().getSystemClipboard().setContents(
		 * stringSelection1, null);
		 * 
		 * // Press Enter to open the file dialog
		 * 
		 * robot.delay(1000);
		 * 
		 * // Press Ctrl+V to paste the file path robot.keyPress(KeyEvent.VK_CONTROL);
		 * robot.keyPress(KeyEvent.VK_V); robot.delay(1000);
		 * robot.keyRelease(KeyEvent.VK_CONTROL); robot.keyRelease(KeyEvent.VK_V);
		 * 
		 * robot.delay(1000); // Press Enter to confirm the file selection
		 * robot.keyPress(KeyEvent.VK_ENTER); robot.keyRelease(KeyEvent.VK_ENTER);
		 * closeButton.click();
		 * 
		 * // Verify and Select Value from Item Number DropDown in PR Create-Transaction
		 * // Module // WebElement itemNumberDropDown =
		 * wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(
		 * "(//input[@type='text'])[6]"))); boolean itemNumberDropDownIsDisplayed =
		 * itemNumberDropDown.isDisplayed(); assertTrue(itemNumberDropDownIsDisplayed,
		 * "Item Number DropDown is not Displayed.");
		 * itemNumberDropDown.sendKeys(Keys.ENTER); WebElement
		 * itemNumberDropDownFocusedElement = driver.switchTo().activeElement(); boolean
		 * itemNumberDropDownIsSelected =
		 * itemNumberDropDownFocusedElement.equals(itemNumberDropDown);
		 * assertTrue(itemNumberDropDownIsSelected,
		 * "Item Number DropDown is not Selected"); itemNumberDropDown.sendKeys("PP");
		 * // selectItemNumberDropDownValue.click();
		 * js.executeScript("arguments[0].click();", selectItemNumberDropDownValue);
		 * 
		 * // Verify and Select Value from Mftr Item Number DropDown in PR //
		 * Create-Transaction Module // WebElement mftrItemNumberDropDown =
		 * wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(
		 * "(//input[@type='text'])[7]"))); boolean mftrItemNumberDropDownIsDisplayed =
		 * mftrItemNumberDropDown.isDisplayed();
		 * assertTrue(mftrItemNumberDropDownIsDisplayed,
		 * "Item Number DropDown is not Displayed.");
		 * mftrItemNumberDropDown.sendKeys(Keys.ENTER); WebElement
		 * mftrItemNumberDropDownFocusedElement = driver.switchTo().activeElement();
		 * boolean mftrItemNumberDropDownIsSelected =
		 * mftrItemNumberDropDownFocusedElement.equals(mftrItemNumberDropDown);
		 * assertTrue(mftrItemNumberDropDownIsSelected,
		 * "Mftr Item Number DropDown is not Selected");
		 * mftrItemNumberDropDown.sendKeys("PP");
		 * js.executeScript("arguments[0].click();", selectMftrItemNumberDropDownValue);
		 * // selectMftrItemNumberDropDownValue.click();
		 * 
		 * // Verify and Select Value from quantity Text Field in PR Create-Transaction
		 * // Module // WebElement quantityTextField =
		 * wait.until(ExpectedConditions.elementToBeClickable(By.xpath(
		 * "//input[@formcontrolname='quantity']"))); boolean
		 * quantityTextFieldIsDisplayed = quantityTextField.isDisplayed();
		 * assertTrue(quantityTextFieldIsDisplayed,
		 * "quantity Text Field  is not Displayed.");
		 * quantityTextField.sendKeys(Keys.ENTER); WebElement
		 * quantityTextFieldFocusedElement = driver.switchTo().activeElement(); boolean
		 * quantityTextFieldIsSelected =
		 * quantityTextFieldFocusedElement.equals(quantityTextField);
		 * assertTrue(quantityTextFieldIsSelected,
		 * "quantity Text Field  is not Selected"); quantityTextField.clear();
		 * quantityTextField.sendKeys("50");
		 * 
		 * // ************Add Project Expansion Panel************ // WebElement
		 * addProjectExpansionPanel = driver.findElement(By.
		 * xpath("//mat-panel-title[@class='mat-expansion-panel-header-title ng-tns-c160-3']"
		 * )); boolean addProjectExpansionPanelIsDisplayed =
		 * addProjectExpansionPanel.isDisplayed();
		 * assertTrue(addProjectExpansionPanelIsDisplayed,
		 * "Add Project Expansion Panel is not Displayed.");
		 * addProjectExpansionPanel.click();
		 * 
		 * // Delete The Existing js.executeScript("arguments[0].click();",
		 * deleteExistingRecord); js.executeScript("arguments[0].click();",
		 * deleteExistingRecord); // deleteExistingRecord.click(); //
		 * deleteExistingRecord.click();
		 * 
		 * for (int k = 1; k <= 2; k++) { // Verify and Select Value from Project Number
		 * DropDown in PR Create-Transaction // Module // WebElement
		 * projectNumberDropDown =
		 * wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(
		 * "(//input[@type='text'])[10]"))); boolean projectNumberDropDownIsDisplayed =
		 * projectNumberDropDown.isDisplayed();
		 * assertTrue(projectNumberDropDownIsDisplayed,
		 * "Project Number DropDown is not Displayed."); projectNumberDropDown.click();
		 * Thread.sleep(2000); WebElement projectNumberDropDownFocusedElement =
		 * driver.switchTo().activeElement(); boolean projectNumberDropDownIsSelected =
		 * projectNumberDropDownFocusedElement.equals(projectNumberDropDown);
		 * assertTrue(projectNumberDropDownIsSelected,
		 * "Project Number DropDown is not Selected");
		 * projectNumberDropDown.sendKeys("1779");
		 * selectProjectNumberDropDownValue.click(); // ((JavascriptExecutor)
		 * driver).executeScript("arguments[0].click();"
		 * ,driver.findElement(By.xpath("//span[normalize-space()='TISPL-1779']")));
		 * 
		 * // Verify and Select Value from Project Quantity Text Field in PR //
		 * Create-Transaction Module // WebElement projectQuantityTextField =
		 * wait.until(ExpectedConditions.elementToBeClickable(By.xpath(
		 * "//input[@formcontrolname='prProjectQuantity']"))); boolean
		 * projectQuantityTextFieldIsDisplayed = projectQuantityTextField.isDisplayed();
		 * assertTrue(projectQuantityTextFieldIsDisplayed,
		 * "Project Quantity Text Field  is not Displayed.");
		 * projectQuantityTextField.sendKeys(Keys.ENTER); WebElement
		 * projectQuantityTextFieldFocusedElement = driver.switchTo().activeElement();
		 * boolean projectQuantityTextFieldIsSelected =
		 * projectQuantityTextFieldFocusedElement .equals(projectQuantityTextField);
		 * assertTrue(projectQuantityTextFieldIsSelected,
		 * "Project Quantity Text Field  is not Selected");
		 * projectQuantityTextField.clear(); projectQuantityTextField.sendKeys("25");
		 * 
		 * // Verify and Click on Add Button in Project Expansion Panel // WebElement
		 * addButtonInProjectExpansionPanel =
		 * wait.until(ExpectedConditions.elementToBeClickable(By.xpath(
		 * "(//button[contains(text(),'Add')])[1]"))); boolean
		 * addButtonInProjectExpansionPanelIsDisplayed =
		 * addButtonInProjectExpansionPanel.isDisplayed();
		 * assertTrue(addButtonInProjectExpansionPanelIsDisplayed,
		 * "Add Button in Project Expansion Panel is not Displayed.");
		 * js.executeScript("arguments[0].click();", addButtonInProjectExpansionPanel);
		 * 
		 * }
		 * 
		 * // ************Add Delivery Schedule Expansion Panel************
		 * addDeliveryScheduleExpansionPanel.click(); // Delete Existing Records
		 * deleteExistingRecord1.click(); deleteExistingRecord1.click();
		 * 
		 * for (int n = 1; n <= 2; n++) { // Verify and Schedule Date Date Picker in
		 * General Tab // WebElement scheduleDateDatePicker =
		 * wait.until(ExpectedConditions.elementToBeClickable(By.xpath(
		 * "//input[@placeholder='DD-MM-YYYY']"))); boolean
		 * scheduleDateDatePickerIsDisplayed = scheduleDateDatePicker.isDisplayed();
		 * assertTrue(scheduleDateDatePickerIsDisplayed,
		 * "Schedule Date Date Picker is not Displayed.");
		 * scheduleDateDatePicker.click();
		 * 
		 * // scheduleDateDatePicker WebElement scheduleDateDatePickerFocusedElement =
		 * driver.switchTo().activeElement(); boolean scheduleDateDatePickerIsSelected =
		 * scheduleDateDatePickerFocusedElement .equals(scheduleDateDatePicker);
		 * assertTrue(scheduleDateDatePickerIsSelected,
		 * "Schedule Date Picker is not Selected"); for (int j = 0; j < 30; j++) {
		 * scheduleDateDatePicker.sendKeys(Keys.ARROW_DOWN); Thread.sleep(300); // Add a
		 * small delay if needed } scheduleDateDatePicker.sendKeys(Keys.ARROW_RIGHT);
		 * scheduleDateDatePicker.sendKeys(Keys.ARROW_RIGHT);
		 * scheduleDateDatePicker.sendKeys(Keys.ENTER);
		 * 
		 * // Verify and Select Value from quantity Text Field1 in PR Create-Transaction
		 * // Module // WebElement quantityTextField1 =
		 * wait.until(ExpectedConditions.elementToBeClickable(By.xpath(
		 * "//input[@formcontrolname='deliveryScheduleQty']"))); boolean
		 * quantityTextField1IsDisplayed = quantityTextField1.isDisplayed();
		 * assertTrue(quantityTextField1IsDisplayed,
		 * "quantity Text Field1  is not Displayed.");
		 * quantityTextField1.sendKeys(Keys.ENTER); WebElement
		 * quantityTextField1FocusedElement = driver.switchTo().activeElement(); boolean
		 * quantityTextField1IsSelected =
		 * quantityTextField1FocusedElement.equals(quantityTextField1);
		 * assertTrue(quantityTextField1IsSelected,
		 * "quantity Text Field1  is not Selected"); quantityTextField1.clear();
		 * quantityTextField1.sendKeys("25");
		 * 
		 * // Verify and Click on Add Button in DeliverySchedule Expansion Panel //
		 * WebElement addButtonInDeliveryScheduleExpansionPanel =
		 * wait.until(ExpectedConditions.elementToBeClickable(By.xpath(
		 * "(//button[contains(text(),'Add')])[2]"))); boolean
		 * addButtonInDeliveryScheduleExpansionPanelIsDisplayed =
		 * addButtonInDeliveryScheduleExpansionPanel .isDisplayed();
		 * assertTrue(addButtonInDeliveryScheduleExpansionPanelIsDisplayed,
		 * "Add Button in DeliverySchedule Expansion Panel is not Displayed.");
		 * js.executeScript("arguments[0].click();",
		 * addButtonInDeliveryScheduleExpansionPanel);
		 * 
		 * } // Verify the Special Instruction Text Field in Items Tab - PR //
		 * Create-Transaction Module // WebElement specialInstructionTextField =
		 * wait.until(ExpectedConditions.elementToBeClickable(By.
		 * xpath("//textarea[@placeholder='Enter Special Instruction']"))); boolean
		 * specialInstructionTextFieldIsDisplayed =
		 * specialInstructionTextField.isDisplayed();
		 * assertTrue(specialInstructionTextFieldIsDisplayed,
		 * "Special Instruction Text Field  is not Displayed.");
		 * specialInstructionTextField.sendKeys(Keys.ENTER); WebElement
		 * specialInstructionTextFieldFocusedElement =
		 * driver.switchTo().activeElement(); boolean
		 * specialInstructionTextFieldIsSelected =
		 * specialInstructionTextFieldFocusedElement
		 * .equals(specialInstructionTextField);
		 * assertTrue(specialInstructionTextFieldIsSelected,
		 * "Special Instruction Text Field  is not Selected");
		 * specialInstructionTextField.clear();
		 * specialInstructionTextField.sendKeys("TEST Special Instruction1");
		 * 
		 * // Verify and Click on Update Button in Item Tab // WebElement
		 * updateButtonInItemsTab =
		 * driver.findElement(By.xpath("//button[text()='Update']")); boolean
		 * updateButtonInItemsTabIsDisplayed = updateButtonInItemsTab.isDisplayed();
		 * assertTrue(updateButtonInItemsTabIsDisplayed,
		 * "Update Button in Items Tab is not Displayed.");
		 * actions.click(updateButtonInItemsTab).perform();
		 * 
		 * // ################## Billing & Shipping Details Tab ######################
		 * 
		 * // Verify Billing & Shipping Details Tab in Sales Order Create Page //
		 * WebElement billing$ShippingDetailsTab =
		 * driver.findElement(By.linkText("Billing & Shipping Details")); boolean
		 * billing$ShippingDetailsTabIsDisplayed =
		 * billing$ShippingDetailsTab.isDisplayed();
		 * assertTrue(billing$ShippingDetailsTabIsDisplayed,
		 * "Billing & Shipping Details Tab is not Displayed.");
		 * js.executeScript("arguments[0].click();", billing$ShippingDetailsTab);
		 * 
		 * // Verify and select data in Delivery Terms Drop Down in Billing & Shipping
		 * // Details Tab // WebElement deliveryTermsDropDown =
		 * wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(
		 * "(//input[@type='text'])[4]"))); boolean deliveryTermsDropDownIsDisplayed =
		 * deliveryTermsDropDown.isDisplayed();
		 * assertTrue(deliveryTermsDropDownIsDisplayed,
		 * "Delivery Terms DropDown is not Displayed."); deliveryTermsDropDown.click();
		 * WebElement deliveryTermsDropDownFocusedElement =
		 * driver.switchTo().activeElement(); boolean deliveryTermsDropDownIsSelected =
		 * deliveryTermsDropDownFocusedElement.equals(deliveryTermsDropDown);
		 * assertTrue(deliveryTermsDropDownIsSelected,
		 * "Delivery Terms DropDown is not Selected");
		 * deliveryTermsDropDown.sendKeys("TEST Delivery"); //
		 * selectDeliveryTermsDropDownValue.click();
		 * js.executeScript("arguments[0].click();", selectDeliveryTermsDropDownValue);
		 * 
		 * // Verify and select data in payment Terms Drop Down in Billing & Shipping //
		 * Details Tab // WebElement paymentTermsDropDown =
		 * wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(
		 * "(//input[@type='text'])[5]"))); boolean paymentTermsDropDownIsDisplayed =
		 * paymentTermsDropDown.isDisplayed();
		 * assertTrue(paymentTermsDropDownIsDisplayed,
		 * "payment Terms DropDown is not Displayed."); paymentTermsDropDown.click();
		 * WebElement paymentTermsDropDownFocusedElement =
		 * driver.switchTo().activeElement(); boolean paymentTermsDropDownIsSelected =
		 * paymentTermsDropDownFocusedElement.equals(paymentTermsDropDown);
		 * assertTrue(paymentTermsDropDownIsSelected,
		 * "payment Terms DropDown is not Selected");
		 * js.executeScript("arguments[0].click();", selectPaymentTermsDropDownValue);
		 * // selectPaymentTermsDropDownValue.clear(); //
		 * selectPaymentTermsDropDownValue.sendKeys(Keys.ENTER);
		 * 
		 * // Verify and select data in Shipping Mode Drop Down in Billing & Shipping //
		 * Details Tab // WebElement shippingModeDropDown =
		 * wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(
		 * "(//input[@type='text'])[6]"))); boolean shippingModeDropDownIsDisplayed =
		 * shippingModeDropDown.isDisplayed();
		 * assertTrue(shippingModeDropDownIsDisplayed,
		 * "Shipping Mode DropDown is not Displayed."); shippingModeDropDown.click();
		 * WebElement shippingModeDropDownFocusedElement =
		 * driver.switchTo().activeElement(); boolean shippingModeDropDownIsSelected =
		 * shippingModeDropDownFocusedElement.equals(shippingModeDropDown);
		 * assertTrue(shippingModeDropDownIsSelected,
		 * "Shipping Mode DropDown is not Selected"); shippingModeDropDown.clear();
		 * js.executeScript("arguments[0].click();", selectShippingModeDropDownValue);
		 * // selectShippingModeDropDownValue.click();
		 * 
		 * // ##################################### Terms Tab //
		 * ############################################
		 * 
		 * // Verify Terms Tab in Sales Order Create Page // WebElement termsTab =
		 * driver.findElement(By.linkText("Terms")); boolean termsTabIsDisplayed =
		 * termsTab.isDisplayed(); assertTrue(termsTabIsDisplayed,
		 * "Terms Tab is not Displayed."); js.executeScript("arguments[0].click();",
		 * termsTab);
		 * 
		 * // Verify the Retention Period Text Field in Items Tab - PR
		 * Create-Transaction // Module // WebElement retentionPeriodTextField =
		 * wait.until(ExpectedConditions.elementToBeClickable(By.
		 * xpath("//input[@placeholder='Enter Retention Period']"))); boolean
		 * retentionPeriodTextFieldIsDisplayed = retentionPeriodTextField.isDisplayed();
		 * assertTrue(retentionPeriodTextFieldIsDisplayed,
		 * "Retention Period Text Field  is not Displayed.");
		 * retentionPeriodTextField.sendKeys(Keys.ENTER); WebElement
		 * retentionPeriodTextFieldFocusedElement = driver.switchTo().activeElement();
		 * boolean retentionPeriodTextFieldIsSelected =
		 * retentionPeriodTextFieldFocusedElement .equals(retentionPeriodTextField);
		 * assertTrue(retentionPeriodTextFieldIsSelected,
		 * "Retention Period Text Field  is not Selected");
		 * retentionPeriodTextField.clear();
		 * retentionPeriodTextField.sendKeys("TEST Retention Period1");
		 * 
		 * // Verify the Special Terms & Condition Text Field in Items Tab - PR //
		 * Create-Transaction Module // WebElement specialTerms$ConditionTextField =
		 * wait.until(ExpectedConditions.elementToBeClickable(By.
		 * xpath("//textarea[@placeholder='Enter Special Terms & Conditions']")));
		 * boolean specialTerms$ConditionTextFieldIsDisplayed =
		 * specialTerms$ConditionTextField.isDisplayed();
		 * assertTrue(specialTerms$ConditionTextFieldIsDisplayed,
		 * "Special Terms & Condition Text Field  is not Displayed.");
		 * specialTerms$ConditionTextField.sendKeys(Keys.ENTER); WebElement
		 * specialTerms$ConditionTextFieldFocusedElement =
		 * driver.switchTo().activeElement(); boolean
		 * specialTerms$ConditionTextFieldIsSelected =
		 * specialTerms$ConditionTextFieldFocusedElement
		 * .equals(specialTerms$ConditionTextField);
		 * assertTrue(specialTerms$ConditionTextFieldIsSelected,
		 * "Special Terms & Condition Text Field  is not Selected");
		 * specialTerms$ConditionTextField.clear();
		 * specialTerms$ConditionTextField.sendKeys("TEST Special Terms & Condition1");
		 * 
		 * String beforeSaveButton = driver.getCurrentUrl();
		 * System.out.println(beforeSaveButton);
		 */
		// Verify and Click on save Button in PR Create
//		        WebElement saveButtonInPRCreate = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[contains(text(),'Save')])[1]")));
		boolean saveButtonInPRCreateIsDisplayed = saveButtonInPRCreate.isDisplayed();
		assertTrue(saveButtonInPRCreateIsDisplayed, "Save Button in Project Expansion Panel is not Displayed.");
		saveButtonInPRCreate.click();

		Thread.sleep(5000);
		String afterSaveButton = driver.getCurrentUrl();
		System.out.println(afterSaveButton);

//		        assertNotEquals(beforeSaveButton, afterSaveButton, "URLs are the same");
		return new HomePage();

	}

}
