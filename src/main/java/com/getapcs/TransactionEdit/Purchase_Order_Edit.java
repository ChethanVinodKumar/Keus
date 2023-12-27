package com.getapcs.TransactionEdit;

import java.awt.AWTException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.getapcs.base.Testbase1;
import com.getapcs.home.login.HomePage;

public class Purchase_Order_Edit extends Testbase1 {
	@FindBy(xpath = "(//input[@type='text'])[4]")
	WebElement procutementType;

	@FindBy(xpath = "(//span[normalize-space()='CUSTOMER SUPPLIED'])[1]")
	WebElement procutementTypeSelect;

	@FindBy(xpath = "(//input[@type='text'])[5]")
	WebElement currency;

	@FindBy(xpath = "(//span[normalize-space()='INR'])[1]")
	WebElement currencySelect;

//Vender Details

	@FindBy(xpath = "(//input[@type='text'])[6]")
	WebElement vendorName;

	@FindBy(xpath = "(//span[normalize-space()='ADVANCETECH INTERNATIONAL FZE'])[1]")
	WebElement vendorNameSelect;

	@FindBy(xpath = "(//input[@placeholder='Enter Quotation Reference No.'])[1]")
	WebElement quotationReferenceNo;

	@FindBy(xpath = "//input[@placeholder='DD-MM-YYYY']")
	WebElement quotationDate;

//Items

	@FindBy(xpath = "(//a[normalize-space()='Items'])[1]")
	WebElement items;

	@FindBy(xpath = "(//input[@type='text'])[6]")
	WebElement itemNumber;

	@FindBy(xpath = "(//span[normalize-space()='1616'])[1]")
	WebElement itemNumberSelect;

	@FindBy(xpath = "(//input[@placeholder='Enter Unit Price'])[1]")
	WebElement unitCost;

	@FindBy(xpath = "(//input[@formcontrolname='quantity'])[1]")
	WebElement quntity;

	@FindBy(xpath = "(//mat-panel-title)[1]")
	WebElement addProject;

	@FindBy(xpath = "(//input[@type='text'])[11]")
	WebElement projectNumber;

	@FindBy(xpath = "(//span[normalize-space()='TISPL-1796'])[1]")
	WebElement projectNumberSelect;

	@FindBy(xpath = "(//input[@formcontrolname='projectQty'])[1]")
	WebElement projectQuntity;

	@FindBy(xpath = "(//button[@class='btn btn_primary_add ng-star-inserted'][normalize-space()='Add'])[1]")
	WebElement addProjectNumber;

	@FindBy(xpath = "(//mat-panel-title)[2]")
	WebElement DeliveryShedule;

	@FindBy(xpath = "(//input[@placeholder='DD-MM-YYYY'])[1]")
	WebElement deliveryDate;

	@FindBy(xpath = "(//input[@placeholder='Enter Quantity'])[3]")
	WebElement deliverySheduleQuntity;

	@FindBy(xpath = "(//button[@class='btn btn_primary_add ng-star-inserted'][normalize-space()='Add'])[2]")
	WebElement addDeliveryShedule;

	@FindBy(xpath = "//textarea[@placeholder='Enter Special Instruction']")
	WebElement specialInstructions;

	@FindBy(xpath = "(//input[@placeholder='Enter SGST'])[1]")
	WebElement sgst;

	@FindBy(xpath = "(//input[@placeholder='Enter CGST'])[1]")
	WebElement cgst;

	@FindBy(xpath = "(//input[@placeholder='Enter '])[1]")
	WebElement igst;

	@FindBy(xpath = "(//input[@placeholder='Enter UTGST'])[1]")
	WebElement utgst;

	@FindBy(xpath = "(//button[normalize-space()='Update'])[1]")
	WebElement updateItems;

	@FindBy(xpath = "(//td[contains(text(),'1')])[1]")
	WebElement AddProj;

	@FindBy(xpath = "(//td[contains(text(),'1')])[2]")
	WebElement AddDelShedule;

//Billing and Shipping Details

	@FindBy(xpath = "(//a[normalize-space()='Billing & Shipping Details'])[1]")
	WebElement billing;

	@FindBy(xpath = "(//input[@type='text'])[6]")
	WebElement deliveryTerms;

	@FindBy(xpath = "(//span[normalize-space()='FCA'])[1]")
	WebElement deliveryTermsSelect;

	@FindBy(xpath = "(//input[@type='text'])[7]")
	WebElement paymentTerms;

	@FindBy(xpath = "(//span[normalize-space()='NET 90 DAYS'])[1]")
	WebElement paymentTermsSelect;

	@FindBy(xpath = "(//input[@type='text'])[8]")
	WebElement shippingMode;

	@FindBy(xpath = "(//span[normalize-space()='TEST Shipment Mode4'])[1]")
	WebElement shippingModeSelect;

	@FindBy(xpath = "(//input[@type='text'])[9]")
	WebElement shipTo;

	@FindBy(xpath = "(//span[normalize-space()='TISPL'])[1]")
	WebElement shipToSelect;

	@FindBy(xpath = "(//input[@type='text'])[10]")
	WebElement billTo;

	@FindBy(xpath = "(//span[normalize-space()='TISPL'])[2]")
	WebElement billToSelect;

//Terms

	@FindBy(xpath = "(//a[normalize-space()='Terms'])[1]")
	WebElement terms;

	@FindBy(xpath = "(//td[normalize-space()='1'])[1]")
	WebElement termstable;

	@FindBy(xpath = "(//input[@placeholder='Enter Retention Period'])[1]")
	WebElement retentionPeriod;

	@FindBy(xpath = "(//textarea[@placeholder='Enter Special Terms & Conditions'])[1]")
	WebElement specialTerms;

	@FindBy(xpath = "(//input[@placeholder='Enter Inco Terms'])[1]")
	WebElement incoTerms;

	@FindBy(xpath = "(//button[normalize-space()='Add'])[1]")
	WebElement addTerms;

	@FindBy(xpath = "(//button[normalize-space()='Update'])[1]")
	WebElement updateTerms;

	@FindBy(xpath = "(//button[normalize-space()='Save'])[1]")
	WebElement save;

	@FindBy(xpath = "(//i[@class='mdi mdi-pencil edit-icon'])[1]")
	WebElement editButton;

	@FindBy(xpath = "(//td[contains(text(),'1616')])[2]")
	WebElement tabel;

	public Purchase_Order_Edit() {
		PageFactory.initElements(driver, this);
	}

	public HomePage purchaseOrderEditPage(String refNo) throws AWTException, InterruptedException {
		js.executeScript("arguments[0].click()", editButton);
		Thread.sleep(4000);

		// Verify that procutementType Field is Displayed or not
//		boolean isDisabledprocutementTypeFieldn = !procutementType.isDisplayed();
//		Assert.assertFalse(isDisabledprocutementTypeFieldn);
//
//		// Verify that procutementType Field is clickable or not
//		WebElement procutementTypeFieldFocusedElement = driver.switchTo().activeElement();
//		boolean procutementTypeFieldIsSelected = procutementTypeFieldFocusedElement.equals(procutementType);
//		Assert.assertFalse(procutementTypeFieldIsSelected, "procutementType Text Field is not Selected");
//
//		procutementType.sendKeys(Keys.ENTER);
//		js.executeScript("arguments[0].click()", procutementTypeSelect);

//		//Verify that  currency Field is Displayed or not
//		boolean isDisabledcurrencyFieldn = !currency.isDisplayed(); 
//		Assert.assertFalse(isDisabledcurrencyFieldn);
//		
//		//Verify that  currency Field is clickable or not
//  		WebElement currencyFieldFocusedElement = driver.switchTo().activeElement();
//	    boolean currencyFieldIsSelected = currencyFieldFocusedElement.equals(currency);
//	    Assert.assertFalse(currencyFieldIsSelected, "currency Text Field is not Selected");
//	    
//		currency.sendKeys(Keys.ENTER);
//		executor.executeScript("arguments[0].click()", currencySelect);

//Vender Details

		/*
		 * // Verify that vendorName Field is Displayed or not boolean
		 * isDisabledvenderNameFieldn = !vendorName.isDisplayed();
		 * Assert.assertFalse(isDisabledvenderNameFieldn);
		 * 
		 * // Verify that venderName Field is clickable or not WebElement
		 * venderNameFieldFocusedElement = driver.switchTo().activeElement(); boolean
		 * venderNameFieldIsSelected = venderNameFieldFocusedElement.equals(vendorName);
		 * Assert.assertFalse(venderNameFieldIsSelected,
		 * "venderName Text Field is not Selected");
		 * 
		 * vendorName.sendKeys(Keys.ENTER); js.executeScript("arguments[0].click()",
		 * vendorNameSelect);
		 * 
		 * // 1Verifying that quotationReferenceNo Field is Enabled or not boolean
		 * isEnabledquotationReferenceNoField = quotationReferenceNo.isEnabled();
		 * Assert.assertTrue(isEnabledquotationReferenceNoField); boolean
		 * isDisabledquotationReferenceNoFieldn = !quotationReferenceNo.isEnabled();
		 * Assert.assertFalse(isDisabledquotationReferenceNoFieldn);
		 * 
		 * // Verifying that Quality Field is displayed or hidden. boolean
		 * isDisplayedquotationReferenceNoField = quotationReferenceNo.isDisplayed();
		 * Assert.assertTrue(isDisplayedquotationReferenceNoField); boolean
		 * isHiddenquotationReferenceNoField = !quotationReferenceNo.isDisplayed();
		 * Assert.assertFalse(isHiddenquotationReferenceNoField);
		 */
		// Verifying the Placeholder which is present in Quality field.
//		String displayedTextInquotationReferenceNo = quotationReferenceNo.getAttribute("placeholder");
//
//		String expected_placeholder = "Enter Quotation Reference No.";
//
//		if (displayedTextInquotationReferenceNo.equals(expected_placeholder))
//			System.out.println("placeholder text is displayed in the quotationReferenceNo field.");
//		else
//			System.out.println("placeholder text is not displayed in the quotationReferenceNo field.");
		quotationReferenceNo.clear();
		quotationReferenceNo.sendKeys(refNo);

		// Verify that Quotation date is selecting or not
//		quotationDate.click();
//		quotationDate.sendKeys(Keys.RIGHT);
//		quotationDate.sendKeys(Keys.ENTER);

//Items

		/*
		 * items.sendKeys(Keys.ENTER);
		 * 
		 * //Verifing that do we able to upload files or not. WebElement UploadFiles =
		 * driver.findElement(By.xpath("(//input[@placeholder='Upload file'])[1]"));
		 * js.executeScript("arguments[0].click();", UploadFiles); robot.delay(2000);
		 * StringSelection stringSelection = new
		 * StringSelection("C:\\Users\\Gopal Reddy\\Downloads\\TempletForTC.xlsx");
		 * Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection,
		 * null);
		 * 
		 * // Press Enter to open the file dialog
		 * 
		 * robot.delay(2000);
		 * 
		 * // Press Ctrl+V to paste the file path robot.keyPress(KeyEvent.VK_CONTROL);
		 * robot.keyPress(KeyEvent.VK_V); robot.delay(2000);
		 * robot.keyRelease(KeyEvent.VK_CONTROL); robot.keyRelease(KeyEvent.VK_V);
		 * 
		 * 
		 * robot.delay(2000); // Press Enter to confirm the file selection
		 * robot.keyPress(KeyEvent.VK_ENTER); robot.keyRelease(KeyEvent.VK_ENTER); //
		 * js.executeScript("arguments[0].click()", tabel);
		 * 
		 * //Verify that itemNumber Field is Displayed or not boolean
		 * isDisableditemNumberFieldn = !itemNumber.isDisplayed();
		 * Assert.assertFalse(isDisableditemNumberFieldn);
		 * 
		 * //Verify that itemNumber Field is clickable or not WebElement
		 * itemNumberFieldFocusedElement = driver.switchTo().activeElement(); boolean
		 * itemNumberFieldIsSelected = itemNumberFieldFocusedElement.equals(itemNumber);
		 * Assert.assertFalse(itemNumberFieldIsSelected,
		 * "itemNumber Text Field is not Selected");
		 * 
		 * itemNumber.sendKeys(Keys.ENTER); js.executeScript("arguments[0].click()",
		 * itemNumberSelect);
		 * 
		 * //1Verifying that unitCost Field is Enabled or not boolean
		 * isEnabledunitCostField = unitCost.isEnabled();
		 * Assert.assertTrue(isEnabledunitCostField); boolean isDisabledunitCostFieldn =
		 * !unitCost.isEnabled(); Assert.assertFalse(isDisabledunitCostFieldn);
		 * 
		 * //Verifying that Quality Field is displayed or hidden. boolean
		 * isDisplayedunitCostField = unitCost.isDisplayed();
		 * Assert.assertTrue(isDisplayedunitCostField); boolean isHiddenunitCostField =
		 * !unitCost.isDisplayed(); Assert.assertFalse(isHiddenunitCostField);
		 * 
		 * 
		 * 
		 * //Verifying the Placeholder which is present in Quality field. String
		 * displayedTextInunitCost = unitCost.getAttribute("placeholder");
		 * 
		 * String expected_placeholder_unitCost = "Enter Unit Price";
		 * 
		 * if(displayedTextInunitCost.equals(expected_placeholder_unitCost))
		 * System.out.println("placeholder text is displayed in the unitCost field.");
		 * else
		 * System.out.println("placeholder text is not displayed in the unitCost field."
		 * ); unitCost.clear(); unitCost.sendKeys(unitcst);
		 * 
		 * //1Verifying that quntity Field is Enabled or not boolean
		 * isEnabledquntityField = quntity.isEnabled();
		 * Assert.assertTrue(isEnabledquntityField); boolean isDisabledquntityFieldn =
		 * !quntity.isEnabled(); Assert.assertFalse(isDisabledquntityFieldn);
		 * 
		 * //Verifying that Quality Field is displayed or hidden. boolean
		 * isDisplayedquntityField = quntity.isDisplayed();
		 * Assert.assertTrue(isDisplayedquntityField); boolean isHiddenquntityField =
		 * !quntity.isDisplayed(); Assert.assertFalse(isHiddenquntityField);
		 * 
		 * 
		 * 
		 * //Verifying the Placeholder which is present in Quality field. String
		 * displayedTextInquntity = quntity.getAttribute("placeholder");
		 * 
		 * String expected_placeholderquntity = "Enter Quantity";
		 * 
		 * if(displayedTextInquntity.equals(expected_placeholderquntity))
		 * System.out.println("placeholder text is displayed in the quntity field.");
		 * else
		 * System.out.println("placeholder text is not displayed in the quntity field."
		 * ); quntity.clear(); quntity.sendKeys(quty);
		 * 
		 * js.executeScript("arguments[0].click()", addProject);
		 * js.executeScript("arguments[0].click()", AddProj); // //Verify that
		 * projectNumber Field is Displayed or not // boolean
		 * isDisabledprojectNumberFieldn = !projectNumber.isDisplayed(); //
		 * Assert.assertFalse(isDisabledprojectNumberFieldn); // // //Verify that
		 * projectNumber Field is clickable or not // WebElement
		 * projectNumberFieldFocusedElement = driver.switchTo().activeElement(); //
		 * boolean projectNumberFieldIsSelected =
		 * projectNumberFieldFocusedElement.equals(projectNumber); //
		 * Assert.assertTrue(projectNumberFieldIsSelected,
		 * "projectNumber Text Field is not Selected");
		 * 
		 * projectNumber.sendKeys(Keys.ENTER); js.executeScript("arguments[0].click()",
		 * projectNumberSelect);
		 * 
		 * //1Verifying that projectQuntity Field is Enabled or not boolean
		 * isEnabledprojectQuntityField = projectQuntity.isEnabled();
		 * Assert.assertTrue(isEnabledprojectQuntityField); boolean
		 * isDisabledprojectQuntityFieldn = !projectQuntity.isEnabled();
		 * Assert.assertFalse(isDisabledprojectQuntityFieldn);
		 * 
		 * //Verifying that Quality Field is displayed or hidden. boolean
		 * isDisplayedprojectQuntityField = projectQuntity.isDisplayed();
		 * Assert.assertTrue(isDisplayedprojectQuntityField); boolean
		 * isHiddenprojectQuntityField = !projectQuntity.isDisplayed();
		 * Assert.assertFalse(isHiddenprojectQuntityField);
		 * 
		 * 
		 * //Verifying the Placeholder which is present in Quality field. String
		 * displayedTextInprojectQuntity = projectQuntity.getAttribute("placeholder");
		 * 
		 * String expected_placeholderprojectQuntity = "Enter Quantity";
		 * 
		 * if(displayedTextInprojectQuntity.equals(expected_placeholderprojectQuntity))
		 * System.out.
		 * println("placeholder text is displayed in the projectQuntity field."); else
		 * System.out.
		 * println("placeholder text is not displayed in the projectQuntity field.");
		 * projectQuntity.clear(); projectQuntity.sendKeys(projectquty);
		 * 
		 * js.executeScript("arguments[0].click()", updateItems);
		 * 
		 * js.executeScript("arguments[0].click()", DeliveryShedule);
		 * js.executeScript("arguments[0].click()", AddDelShedule); //Verify that do we
		 * able to select the date in delevery schedule deliveryDate.click();
		 * deliveryDate.sendKeys(Keys.RIGHT); deliveryDate.sendKeys(Keys.ENTER);
		 * 
		 * //1Verifying that deliverySheduleQuntity Field is Enabled or not boolean
		 * isEnableddeliverySheduleQuntityField = deliverySheduleQuntity.isEnabled();
		 * Assert.assertTrue(isEnableddeliverySheduleQuntityField); boolean
		 * isDisableddeliverySheduleQuntityFieldn = !deliverySheduleQuntity.isEnabled();
		 * Assert.assertFalse(isDisableddeliverySheduleQuntityFieldn);
		 * 
		 * //Verifying that Quality Field is displayed or hidden. boolean
		 * isDisplayeddeliverySheduleQuntityField =
		 * deliverySheduleQuntity.isDisplayed();
		 * Assert.assertTrue(isDisplayeddeliverySheduleQuntityField); boolean
		 * isHiddendeliverySheduleQuntityField = !deliverySheduleQuntity.isDisplayed();
		 * Assert.assertFalse(isHiddendeliverySheduleQuntityField);
		 * 
		 * 
		 * //Verifying the Placeholder which is present in Quality field. String
		 * displayedTextIndeliverySheduleQuntity =
		 * deliverySheduleQuntity.getAttribute("placeholder");
		 * 
		 * String expected_placeholderdeliverySheduleQuntity = "Enter Quantity";
		 * 
		 * if(displayedTextIndeliverySheduleQuntity.equals(
		 * expected_placeholderdeliverySheduleQuntity)) System.out.
		 * println("placeholder text is displayed in the deliverySheduleQuntity field."
		 * ); else System.out.
		 * println("placeholder text is not displayed in the deliverySheduleQuntity field."
		 * ); deliverySheduleQuntity.clear();
		 * deliverySheduleQuntity.sendKeys(delprojectquty);
		 * 
		 * js.executeScript("arguments[0].click()", updateItems);
		 * 
		 * //1Verifying that specialInstructions Field is Enabled or not boolean
		 * isEnabledspecialInstructionsField = specialInstructions.isEnabled();
		 * Assert.assertTrue(isEnabledspecialInstructionsField); boolean
		 * isDisabledspecialInstructionsFieldn = !specialInstructions.isEnabled();
		 * Assert.assertFalse(isDisabledspecialInstructionsFieldn);
		 * 
		 * //Verifying that Quality Field is displayed or hidden. boolean
		 * isDisplayedspecialInstructionsField = specialInstructions.isDisplayed();
		 * Assert.assertTrue(isDisplayedspecialInstructionsField); boolean
		 * isHiddenspecialInstructionsField = !specialInstructions.isDisplayed();
		 * Assert.assertFalse(isHiddenspecialInstructionsField);
		 * 
		 * 
		 * //Verifying the Placeholder which is present in Quality field. String
		 * displayedTextInspecialInstructions =
		 * specialInstructions.getAttribute("placeholder");
		 * 
		 * String expected_placeholderspecialInstructions = "Enter Special Instruction";
		 * 
		 * if(displayedTextInspecialInstructions.equals(
		 * expected_placeholderspecialInstructions)) System.out.
		 * println("placeholder text is displayed in the specialInstructions field.");
		 * else System.out.
		 * println("placeholder text is not displayed in the specialInstructions field."
		 * ); specialInstructions.clear(); specialInstructions.sendKeys(instructions);
		 * 
		 * //1Verifying that sgst Field is Enabled or not boolean isEnabledsgstField =
		 * sgst.isEnabled(); Assert.assertTrue(isEnabledsgstField); boolean
		 * isDisabledsgstFieldn = !sgst.isEnabled();
		 * Assert.assertFalse(isDisabledsgstFieldn);
		 * 
		 * //Verifying that Quality Field is displayed or hidden. boolean
		 * isDisplayedsgstField = sgst.isDisplayed();
		 * Assert.assertTrue(isDisplayedsgstField); boolean isHiddensgstField =
		 * !sgst.isDisplayed(); Assert.assertFalse(isHiddensgstField);
		 * 
		 * 
		 * //Verifying the Placeholder which is present in Quality field. String
		 * displayedTextInsgst = sgst.getAttribute("placeholder");
		 * 
		 * String expected_placeholdersgst = "Enter SGST";
		 * 
		 * if(displayedTextInsgst.equals(expected_placeholdersgst))
		 * System.out.println("placeholder text is displayed in the sgst field."); else
		 * System.out.println("placeholder text is not displayed in the sgst field.");
		 * 
		 * sgst.clear(); sgst.sendKeys(s);
		 * 
		 * //1Verifying that cgst Field is Enabled or not boolean isEnabledcgstField =
		 * cgst.isEnabled(); Assert.assertTrue(isEnabledcgstField); boolean
		 * isDisabledcgstFieldn = !cgst.isEnabled();
		 * Assert.assertFalse(isDisabledcgstFieldn);
		 * 
		 * //Verifying that Quality Field is displayed or hidden. boolean
		 * isDisplayedcgstField = cgst.isDisplayed();
		 * Assert.assertTrue(isDisplayedcgstField); boolean isHiddencgstField =
		 * !cgst.isDisplayed(); Assert.assertFalse(isHiddencgstField);
		 * 
		 * 
		 * //Verifying the Placeholder which is present in Quality field. String
		 * displayedTextIncgst = cgst.getAttribute("placeholder");
		 * 
		 * String expected_placeholdercgst = "Enter CGST";
		 * 
		 * if(displayedTextIncgst.equals(expected_placeholdercgst))
		 * System.out.println("placeholder text is displayed in the cgst field."); else
		 * System.out.println("placeholder text is not displayed in the cgst field.");
		 * 
		 * cgst.clear(); cgst.sendKeys(c);
		 * 
		 * //1Verifying that igst Field is Enabled or not boolean isEnabledigstField =
		 * igst.isEnabled(); Assert.assertTrue(isEnabledigstField); boolean
		 * isDisabledigstFieldn = !igst.isEnabled();
		 * Assert.assertFalse(isDisabledigstFieldn);
		 * 
		 * //Verifying that Quality Field is displayed or hidden. boolean
		 * isDisplayedigstField = igst.isDisplayed();
		 * Assert.assertTrue(isDisplayedigstField); boolean isHiddenigstField =
		 * !igst.isDisplayed(); Assert.assertFalse(isHiddenigstField);
		 * 
		 * 
		 * //Verifying the Placeholder which is present in Quality field. String
		 * displayedTextInigst = igst.getAttribute("placeholder");
		 * 
		 * String expected_placeholderigst = "Enter ";
		 * 
		 * if(displayedTextInigst.equals(expected_placeholderigst))
		 * System.out.println("placeholder text is displayed in the igst field."); else
		 * System.out.println("placeholder text is not displayed in the igst field.");
		 * 
		 * igst.clear(); igst.sendKeys(i);
		 * 
		 * //1Verifying that utgst Field is Enabled or not boolean isEnabledutgstField =
		 * utgst.isEnabled(); Assert.assertTrue(isEnabledutgstField); boolean
		 * isDisabledutgstFieldn = !utgst.isEnabled();
		 * Assert.assertFalse(isDisabledutgstFieldn);
		 * 
		 * //Verifying that Quality Field is displayed or hidden. boolean
		 * isDisplayedutgstField = utgst.isDisplayed();
		 * Assert.assertTrue(isDisplayedutgstField); boolean isHiddenutgstField =
		 * !utgst.isDisplayed(); Assert.assertFalse(isHiddenutgstField);
		 * 
		 * 
		 * //Verifying the Placeholder which is present in Quality field. String
		 * displayedTextInutgst = utgst.getAttribute("placeholder");
		 * 
		 * String expected_placeholderutgst = "Enter UTGST";
		 * 
		 * if(displayedTextInutgst.equals(expected_placeholderutgst))
		 * System.out.println("placeholder text is displayed in the utgst field."); else
		 * System.out.println("placeholder text is not displayed in the utgst field.");
		 * 
		 * utgst.clear(); utgst.sendKeys(ut);
		 * 
		 * js.executeScript("arguments[0].click()", updateItems);
		 * 
		 * //Billing and Shipping Details
		 * 
		 * js.executeScript("arguments[0].click()", billing);
		 * 
		 * 
		 * //Verify that deliveryTerms Field is Displayed or not boolean
		 * isDisableddeliveryTermsFieldn = !deliveryTerms.isDisplayed();
		 * Assert.assertFalse(isDisableddeliveryTermsFieldn);
		 * 
		 * //Verify that deliveryTerms Field is clickable or not WebElement
		 * deliveryTermsFieldFocusedElement = driver.switchTo().activeElement(); boolean
		 * deliveryTermsFieldIsSelected =
		 * deliveryTermsFieldFocusedElement.equals(deliveryTerms);
		 * Assert.assertFalse(deliveryTermsFieldIsSelected,
		 * "deliveryTerms Text Field is not Selected");
		 * 
		 * deliveryTerms.sendKeys(Keys.ENTER); js.executeScript("arguments[0].click()",
		 * deliveryTermsSelect);
		 * 
		 * //Verify that paymentTerms Field is Displayed or not boolean
		 * isDisabledpaymentTermsFieldn = !paymentTerms.isDisplayed();
		 * Assert.assertFalse(isDisabledpaymentTermsFieldn);
		 * 
		 * //Verify that paymentTerms Field is clickable or not WebElement
		 * paymentTermsFieldFocusedElement = driver.switchTo().activeElement(); boolean
		 * paymentTermsFieldIsSelected =
		 * paymentTermsFieldFocusedElement.equals(paymentTerms);
		 * Assert.assertFalse(paymentTermsFieldIsSelected,
		 * "paymentTerms Text Field is not Selected");
		 * 
		 * paymentTerms.sendKeys(Keys.ENTER); js.executeScript("arguments[0].click()",
		 * paymentTermsSelect);
		 * 
		 * //Verify that shippingMode Field is Displayed or not boolean
		 * isDisabledshippingModeFieldn = !shippingMode.isDisplayed();
		 * Assert.assertFalse(isDisabledshippingModeFieldn);
		 * 
		 * //Verify that shippingMode Field is clickable or not WebElement
		 * shippingModeFieldFocusedElement = driver.switchTo().activeElement(); boolean
		 * shippingModeFieldIsSelected =
		 * shippingModeFieldFocusedElement.equals(shippingMode);
		 * Assert.assertFalse(shippingModeFieldIsSelected,
		 * "shippingMode Text Field is not Selected");
		 * 
		 * shippingMode.sendKeys(Keys.ENTER); js.executeScript("arguments[0].click()",
		 * shippingModeSelect);
		 * 
		 * //Verify that shipTo Field is Displayed or not boolean isDisabledshipToFieldn
		 * = !shipTo.isDisplayed(); Assert.assertFalse(isDisabledshipToFieldn);
		 * 
		 * //Verify that shipTo Field is clickable or not WebElement
		 * shipToFieldFocusedElement = driver.switchTo().activeElement(); boolean
		 * shipToFieldIsSelected = shipToFieldFocusedElement.equals(shipTo);
		 * Assert.assertFalse(shipToFieldIsSelected,
		 * "shipTo Text Field is not Selected");
		 * 
		 * shipTo.sendKeys(Keys.ENTER); js.executeScript("arguments[0].click()",
		 * shipToSelect);
		 * 
		 * //Verify that billTo Field is Displayed or not boolean isDisabledbillToFieldn
		 * = !billTo.isDisplayed(); Assert.assertFalse(isDisabledbillToFieldn);
		 * 
		 * //Verify that billTo Field is clickable or not WebElement
		 * billToFieldFocusedElement = driver.switchTo().activeElement(); boolean
		 * billToFieldIsSelected = billToFieldFocusedElement.equals(billTo);
		 * Assert.assertFalse(billToFieldIsSelected,
		 * "billTo Text Field is not Selected");
		 * 
		 * billTo.sendKeys(Keys.ENTER); js.executeScript("arguments[0].click()",
		 * billToSelect);
		 * 
		 * //terms
		 * 
		 * js.executeScript("arguments[0].click()", terms);
		 * 
		 * js.executeScript("arguments[0].click()", termstable);
		 * 
		 * //1Verifying that retentionPeriod Field is Enabled or not boolean
		 * isEnabledretentionPeriodField = retentionPeriod.isEnabled();
		 * Assert.assertTrue(isEnabledretentionPeriodField); boolean
		 * isDisabledretentionPeriodFieldn = !retentionPeriod.isEnabled();
		 * Assert.assertFalse(isDisabledretentionPeriodFieldn);
		 * 
		 * //Verifying that Quality Field is displayed or hidden. boolean
		 * isDisplayedretentionPeriodField = retentionPeriod.isDisplayed();
		 * Assert.assertTrue(isDisplayedretentionPeriodField); boolean
		 * isHiddenretentionPeriodField = !retentionPeriod.isDisplayed();
		 * Assert.assertFalse(isHiddenretentionPeriodField);
		 * 
		 * 
		 * //Verifying the Placeholder which is present in Quality field. String
		 * displayedTextInretentionPeriod = retentionPeriod.getAttribute("placeholder");
		 * 
		 * String expected_placeholderretentionPeriod = "Enter Retention Period";
		 * 
		 * if(displayedTextInretentionPeriod.equals(expected_placeholderretentionPeriod)
		 * ) System.out.
		 * println("placeholder text is displayed in the retentionPeriod field."); else
		 * System.out.
		 * println("placeholder text is not displayed in the retentionPeriod field.");
		 * retentionPeriod.clear(); retentionPeriod.sendKeys(retention);
		 * 
		 * //1Verifying that specialTerms Field is Enabled or not boolean
		 * isEnabledspecialTermsField = specialTerms.isEnabled();
		 * Assert.assertTrue(isEnabledspecialTermsField); boolean
		 * isDisabledspecialTermsFieldn = !specialTerms.isEnabled();
		 * Assert.assertFalse(isDisabledspecialTermsFieldn);
		 * 
		 * //Verifying that Quality Field is displayed or hidden. boolean
		 * isDisplayedspecialTermsField = specialTerms.isDisplayed();
		 * Assert.assertTrue(isDisplayedspecialTermsField); boolean
		 * isHiddenspecialTermsField = !specialTerms.isDisplayed();
		 * Assert.assertFalse(isHiddenspecialTermsField);
		 * 
		 * 
		 * //Verifying the Placeholder which is present in Quality field. String
		 * displayedTextInspecialTerms = specialTerms.getAttribute("placeholder");
		 * 
		 * String expected_placeholderspecialTerms = "Enter Special Terms & Conditions";
		 * 
		 * if(displayedTextInspecialTerms.equals(expected_placeholderspecialTerms))
		 * System.out.println("placeholder text is displayed in the specialTerms field."
		 * ); else System.out.
		 * println("placeholder text is not displayed in the specialTerms field.");
		 * specialTerms.clear(); specialTerms.sendKeys(special);
		 * 
		 * //1Verifying that incoTerms Field is Enabled or not boolean
		 * isEnabledincoTermsField = incoTerms.isEnabled();
		 * Assert.assertTrue(isEnabledincoTermsField); boolean isDisabledincoTermsFieldn
		 * = !incoTerms.isEnabled(); Assert.assertFalse(isDisabledincoTermsFieldn);
		 * 
		 * //Verifying that Quality Field is displayed or hidden. boolean
		 * isDisplayedincoTermsField = incoTerms.isDisplayed();
		 * Assert.assertTrue(isDisplayedincoTermsField); boolean isHiddenincoTermsField
		 * = !incoTerms.isDisplayed(); Assert.assertFalse(isHiddenincoTermsField);
		 * 
		 * 
		 * //Verifying the Placeholder which is present in Quality field. String
		 * displayedTextInincoTerms = incoTerms.getAttribute("placeholder");
		 * 
		 * String expected_placeholderincoTerms = "Enter Inco Terms";
		 * 
		 * if(displayedTextInincoTerms.equals(expected_placeholderincoTerms))
		 * System.out.println("placeholder text is displayed in the incoTerms field.");
		 * else System.out.
		 * println("placeholder text is not displayed in the incoTerms field.");
		 * incoTerms.clear(); incoTerms.sendKeys(inco);
		 * 
		 * js.executeScript("arguments[0].click()", updateTerms);
		 * 
		 * 
		 * //Verifing that do we able to upload files or not. WebElement UploadFiles1 =
		 * driver.findElement(By.xpath("//button[normalize-space()='Upload Files']"));
		 * js.executeScript("arguments[0].click();", UploadFiles1);
		 * 
		 * driver.findElement(By.xpath("(//input[@placeholder='Upload file'])[1]")).
		 * click();
		 * 
		 * robot.delay(2000); StringSelection stringSelection1 = new
		 * StringSelection("C:\\Users\\Gopal Reddy\\Downloads\\TempletForTC.xlsx");
		 * Toolkit.getDefaultToolkit().getSystemClipboard().setContents(
		 * stringSelection1, null);
		 * 
		 * // Press Enter to open the file dialog
		 * 
		 * robot.delay(2000);
		 * 
		 * // Press Ctrl+V to paste the file path robot.keyPress(KeyEvent.VK_CONTROL);
		 * robot.keyPress(KeyEvent.VK_V); robot.delay(2000);
		 * robot.keyRelease(KeyEvent.VK_CONTROL); robot.keyRelease(KeyEvent.VK_V);
		 * 
		 * 
		 * robot.delay(2000); // Press Enter to confirm the file selection
		 * robot.keyPress(KeyEvent.VK_ENTER); robot.keyRelease(KeyEvent.VK_ENTER);
		 */

		save.click();

		return new HomePage();
	}
}
