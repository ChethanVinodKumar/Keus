package com.getapcs.Transaction;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.getapcs.base.Testbase1;
import com.getapcs.home.login.HomePage;

public class Grin extends Testbase1 {

	@FindBy(xpath = "(//input[@type='text'])[1]")
	WebElement venderNameDropDown;
	@FindBy(xpath = "(//span[normalize-space()='Keus Automation Pvt Ltd'])[1]")
	WebElement selectVenderNameDropDownValue;

	@FindBy(xpath = "//label[normalize-space(text())='Vendor Id']/following-sibling::div/input[@formcontrolname='vendorNumber']")
	WebElement venderIdField;

	@FindBy(xpath = "//input[@placeholder='Enter Invoice Number']")
	WebElement invoiceNumberField;

	@FindBy(xpath = "//input[@formcontrolname='invoiceDate']")
	WebElement invoiceDatePicker;

	@FindBy(xpath = "//input[@placeholder='Enter Invoice Value ']")
	WebElement invoiceValue_withGSTField;

	@FindBy(xpath = "//input[@placeholder='Total Invoice']")
	WebElement totalInvoiceField;

	@FindBy(xpath = "//input[@formcontrolname='gateEntryDate']")
	WebElement gateEntryDatePicker;

	@FindBy(xpath = "(//input[@placeholder='Gate Entry Number'])[1]")
	WebElement gateEntryNumber;

	@FindBy(linkText = "Items")
	WebElement itemTab;

	@FindBy(xpath = "(//input[@placeholder='Upload file'])[1]")
	WebElement uploadFiles;

	@FindBy(xpath = "(//button[normalize-space()='Save Files'])[1]")
	WebElement saveUploadFile;

	@FindBy(xpath = "(//button[normalize-space()='View Files'])[1]")
	WebElement viewButton;

	@FindBy(xpath = "(//button[@type='submit'][normalize-space()='Close'])[13]")
	WebElement fileCloseButton;

	@FindBy(xpath = "(//input[@type='text'])[5]")
	WebElement poNumberField;
	@FindBy(xpath = "//span[contains(text(),'TISPL-MFPO-1080-0019')]")
	WebElement selectPOnumberFieldValue;

	@FindBy(xpath = "(//input[@role='combobox'])[1]")
	WebElement itemOrDescriptionNumberField;
	@FindBy(xpath = "//span[contains(text(),'ECB0002-111M INS. SINGLE END SLEEVE 0.25MM, 24# VI')]")
	WebElement selectItemOrDescriptionNumberFieldValue;

	@FindBy(xpath = "(//input[@type='text'])[8]")
	WebElement mftrBatchNoNumberField;

	@FindBy(xpath = "(//input[@type='text'])[9]")
	WebElement unitPriceField;

	@FindBy(xpath = "(//input[@type='text'])[10]")
	WebElement quantityField;

	@FindBy(xpath = "(//i[@title='Add Project'])[1]")
	WebElement addProjectButton;

	@FindBy(xpath = "//i[@class='mdi mdi-delete edit-icon']")
	WebElement addProjectPopUp;

	@FindBy(xpath = "(//input[@type='text'])[15]")
	WebElement projectNumberDropDown;
	@FindBy(xpath = "//span[normalize-space()='TISPL-1080']")
	WebElement selectProjectNumberDropDownValue;

	@FindBy(xpath = "//input[@placeholder='Enter Quantity']")
	WebElement projectQuantityField;

	@FindBy(xpath = "//button[normalize-space()='Add']")
	WebElement addButton;

	@FindBy(xpath = "(//button[normalize-space()='Save'])[2]")
	WebElement saveButton1;

	@FindBy(xpath = "(//input[@type='date'])[4]")
	WebElement manufactureDatePicker;

	@FindBy(xpath = "(//input[@type='date'])[3]")
	WebElement expiryDate;

	@FindBy(xpath = "//input[@placeholder='Upload file']")
	WebElement UploadFiles;

	@FindBy(xpath = "(//button[normalize-space()='Coc Upload'])[1]")
	WebElement cocUploadFiles;

	@FindBy(xpath = "(//button[normalize-space()='Upload'])[1]")
	WebElement uploadButton;

	@FindBy(xpath = "(//button[normalize-space()='Close'])[1]")
	WebElement closeButton;

	@FindBy(xpath = "//i[@title='Add Taxes']")
	WebElement taxesButton;

	@FindBy(xpath = "//input[@placeholder='Enter SGST']")
	WebElement sGSTField;

	@FindBy(xpath = "//input[@placeholder='Enter CGST']")
	WebElement cGSTField;

	@FindBy(xpath = "//input[@placeholder='Enter IGST']")
	WebElement iGSTField;

	@FindBy(xpath = "//input[@placeholder='Enter UTGST']")
	WebElement uTGSTField;

	@FindBy(xpath = "(//button[@type='submit'][normalize-space()='Save'])[1]")
	WebElement saveButtonInAddTaxesPOPUP;

	// Freight Charges Tab

	@FindBy(linkText = "Freight Charges")
	WebElement freightChargesTab;

	@FindBy(xpath = "//input[@placeholder='Enter AWB Number 1']")
	WebElement awbNumberField1;

	@FindBy(xpath = "(//input[@placeholder='DD-MM-YYYY'])[3]")
	WebElement awbDatePicker1;

	@FindBy(xpath = "//input[@placeholder='AWB Number 2']")
	WebElement awbNumberField2;

	@FindBy(xpath = "(//input[@placeholder='DD-MM-YYYY'])[4]")
	WebElement awbDatePicker2;

	@FindBy(xpath = "//input[@placeholder='Enter B/E Number']")
	WebElement beNumberField;

	@FindBy(xpath = "//input[@formcontrolname='be_Date']")
	WebElement beDatePicker;

	@FindBy(xpath = "//input[@placeholder='BE Currency Value']")
	WebElement beCurrencyValueField;

	@FindBy(linkText = "Other Cost")
	WebElement otherCostTab;

	@FindBy(xpath = "//input[@placeholder='Enter Freight']")
	WebElement freightField;

	@FindBy(xpath = "//input[@placeholder='Insurance']")
	WebElement insuranceField;

	@FindBy(xpath = "//input[@formcontrolname='loadingOrUnloading']")
	WebElement loadingOrUnloadingField;

	@FindBy(xpath = "//input[@placeholder='Enter Currency Conversion']")
	WebElement currencyConversionField;

	@FindBy(xpath = "//input[@placeholder='Transport']")
	WebElement transportField;

	@FindBy(linkText = "Other Charges")
	WebElement OtherChargesTab;

	@FindBy(xpath = "(//input[@type='text'])[6]")
	WebElement otherChargesDropDown;
	@FindBy(xpath = "//input[@placeholder='Enter UTGST']")
	WebElement selectOtherChargesDropDownValue;

	@FindBy(xpath = "//input[@placeholder='Other Charges Value']")
	WebElement otherChargesValueField;

	@FindBy(xpath = "//button[normalize-space()='Save']")
	WebElement saveButton;

	public Grin() {
		PageFactory.initElements(driver, this);
	}

	public HomePage grinCreatePage(String invoiceNo, // TEST-IN-1122
			String invoiceGST, // 10
			String totalInvoice, // 10
			String mftrBatchNo, // 67356743
			String unitPrice, // 10

			String sgst, // 9
			String cgst, // 9
			String igst, // 9
			String utgst, // 9
			String awbNo1, // AWB-1-5657
			String awbNo2, // AWB-2-5657
			String beNo, // BE-557
			String beCurrencyValue, // 80
			String freight, // 10
			String insurance, // 10
			String loadingOrUnloading, // 10
			String currencyConversion, // 80
			String transport, // 10
			String otherChargesValue) throws Throwable {

		System.out.println("Grin Create Page");

		driver.navigate().to("https://demo_keus.getapcs.com/transaction/purchase-order/table");

		String tableXpath = "//table[@class='table table-striped']";

		// Get the first po number text from table
		String poNumber = driver.findElement(By.xpath(tableXpath + "/tbody/tr[1]/td[2]")).getText();

		System.out.println(poNumber);

		// Store the element with hard coded PR number
		String elementXpath = "//span[normalize-space()='031023PR-00002']";

		String updatedXpath = elementXpath.replace("031023PR-00002", poNumber);

		System.out.println(updatedXpath);

		Thread.sleep(3000);

		driver.navigate().to("https://demo_keus.getapcs.com/engineering/item-master/table");

		String tableXpath1 = "//table[@class='table table-striped']";

		// Get the first po number text from table
		String itemNumber = driver.findElement(By.xpath(tableXpath1 + "/tbody/tr[1]/td[2]")).getText();

		System.out.println(itemNumber);

		// Store the element with hard coded PR number
		String elementXpath1 = "//span[normalize-space()='031023PR-00002']";

		String updatedXpath1 = elementXpath1.replace("031023PR-00002", itemNumber + "-Test Description");

		System.out.println(updatedXpath1);

		driver.navigate().to("https://demo_keus.getapcs.com/transaction/sales-order/table");

		String tableXpath2 = "//table[@class='table table-striped']";

		// Get the first PR number text from table
		String ProjectNumber = driver.findElement(By.xpath(tableXpath2 + "/tbody/tr[1]/td[4]")).getText();

		// Store the element with hard coded PR number
		String elementXpath2 = "(//span[normalize-space()='Item-FG-11-TEST'])[1]";

		String updatedXpath2 = elementXpath2.replace("Item-FG-11-TEST", ProjectNumber);
		System.out.println(updatedXpath2);

		Thread.sleep(3000);

		driver.navigate().to("https://demo_keus.getapcs.com/transaction/grin/create");

		// venderNameDropDown

		click(driver, venderNameDropDown);
		click(driver, selectVenderNameDropDownValue);

		// Vender ID

		boolean venderIdFieldIsDisplayed = venderIdField.isDisplayed();
		assertTrue(venderIdFieldIsDisplayed, "Vender Id Field is not Displayed.");
		// To extract Value Attribute and use same approach to retrieve
		String venderIdFieldValue = (String) js.executeScript("return arguments[0].value;", venderIdField);
		System.out.println("Vender ID : " + venderIdFieldValue + "\n");

		// Invoice Number

		click(driver, invoiceNumberField);
		invoiceNumberField.sendKeys(invoiceNo);

		// Invoice Date Picker

		datePicker(driver, invoiceDatePicker);

		// Gate Entry Datepicker

		datePicker(driver, gateEntryDatePicker);

		// Gate Entry Number

		click(driver, gateEntryNumber);
		gateEntryNumber.sendKeys("10");

		// ################## Item Tab ######################

		// PO Number

		click(driver, poNumberField);
		WebElement selectPOnumberFieldValue = driver.findElement(By.xpath(updatedXpath));
		js.executeScript("arguments[0].click();", selectPOnumberFieldValue);

		// Item Number Field

		click(driver, itemOrDescriptionNumberField);
		WebElement selectItemOrDescriptionNumberFieldValue = driver.findElement(By.xpath(updatedXpath1));
		click(driver, selectItemOrDescriptionNumberFieldValue);

		// MFTR Number

		click(driver, mftrBatchNoNumberField);
		mftrBatchNoNumberField.sendKeys(mftrBatchNo);

		// UnitPrice

		click(driver, unitPriceField);
		unitPriceField.clear();
		unitPriceField.sendKeys(unitPrice);

		datePicker(driver, expiryDate);

		datePicker(driver, manufactureDatePicker);

		click(driver, cocUploadFiles);

		uploadFile(driver, UploadFiles, 3);

		click(driver, uploadButton);

		click(driver, closeButton);

		// Taxes Button

		click(driver, taxesButton);

		// SGST

		click(driver, sGSTField);
		sGSTField.clear();
		sGSTField.sendKeys(sgst);

		// CGST

		click(driver, cGSTField);
		cGSTField.clear();
		cGSTField.sendKeys(cgst);

		// IGST

		click(driver, iGSTField);
		iGSTField.clear();
		iGSTField.sendKeys("9");

		// UTGST

		click(driver, uTGSTField);
		uTGSTField.clear();
		uTGSTField.sendKeys(utgst);

		// Save Taxes

		click(driver, saveButtonInAddTaxesPOPUP);

		// Verify Freight Charges Tab

		click(driver, freightChargesTab);

		// Verify AWB Number Field 1

		click(driver, awbNumberField1);
		awbNumberField1.sendKeys(awbNo1);

		// Verify AWB Date Picker 1

		datePicker(driver, awbDatePicker1);

		// Verify AWB Number Field 2

		click(driver, awbNumberField2);
		awbNumberField2.sendKeys(awbNo2);

		// Verify AWB Date Picker 2

		datePicker(driver, awbDatePicker2);

		// Verify B/E Number Field

		click(driver, beNumberField);
		beNumberField.sendKeys(beNo);

		// Verify B/E Date Picker

		datePicker(driver, beDatePicker);

		// B/E Date Picker

		datePicker(driver, beDatePicker);

		// Verify B/E Currency Value Field

		click(driver, beCurrencyValueField);
		beCurrencyValueField.sendKeys(beCurrencyValue);

		// Upload Documents

		uploadFile(driver, uploadFiles, 1);

		click(driver, saveUploadFile);

//		click(driver, viewButton);
//
//		click(driver, closeButton);

		// Verify Other Cost Tab

		click(driver, otherCostTab);

		// Verify Freight Field

		click(driver, freightField);
		freightField.sendKeys(freight);

		// Verify Insurance Field

		click(driver, insuranceField);
		insuranceField.sendKeys(insurance);

		// Verify Loading Or Unloading Field

		click(driver, loadingOrUnloadingField);
		loadingOrUnloadingField.sendKeys(loadingOrUnloading);

		// Verify Currency Conversion Field

		click(driver, currencyConversionField);
		currencyConversionField.sendKeys(currencyConversion);

		// Verify Transport Field

		click(driver, transportField);
		transportField.sendKeys(transport);

		/*
		 * //Verify Other Charges Tab boolean OtherChargesTabIsDisplayed =
		 * OtherChargesTab.isDisplayed(); assertTrue(OtherChargesTabIsDisplayed,
		 * "Other Charges Tab is not Displayed."); OtherChargesTab.click();
		 * 
		 * 
		 * //Verify Other Charges Value Field boolean otherChargesValueFieldIsDisplayed
		 * = otherChargesValueField.isDisplayed();
		 * assertTrue(otherChargesValueFieldIsDisplayed,
		 * "Other Charges Value Field is not Displayed.");
		 * otherChargesValueField.click(); WebElement
		 * otherChargesValueFieldFocusedElement = driver.switchTo().activeElement();
		 * boolean otherChargesValueFieldIsSelected =
		 * otherChargesValueFieldFocusedElement.equals(otherChargesValueField);
		 * assertTrue(otherChargesValueFieldIsSelected,
		 * "Other Charges Value Field is not Selected");
		 * otherChargesValueField.sendKeys(otherChargesValue);
		 * 
		 * 
		 * //Verify Add Button in Other Charges Tab boolean addButtonIsDisplayed =
		 * addButton.isDisplayed(); assertTrue(addButtonIsDisplayed,
		 * "Add Button is not Displayed."); addButton.click();
		 */

		// Verify Save Button in Add Project Pop-UP

		click(driver, saveButton);

		return new HomePage();

	}

}
