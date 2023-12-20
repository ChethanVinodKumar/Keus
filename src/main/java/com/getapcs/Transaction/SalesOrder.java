package com.getapcs.Transaction;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.getapcs.base.Testbase1;
import com.getapcs.pages.HomePage;

public class SalesOrder extends Testbase1 {

	@FindBy(xpath = "(//button[text()='Release'])[1]")
	WebElement releaseButton;

	@FindBy(xpath = "//button[contains(text(),'Close')]")
	WebElement closeButton;

	@FindBy(xpath = "//button[normalize-space()='Convert To Sales Order']")
	WebElement convertToSalesOrderButton;

	@FindBy(xpath = "//label[normalize-space(text())='Project Number']/following-sibling::div/input[@formcontrolname='projectNumber']")
	WebElement projectNumberElement;

	@FindBy(xpath = "//label[normalize-space(text())='Quote Number']/following-sibling::div/input[@formcontrolname='quoteNumber']")
	WebElement quoteNumberElement;

	@FindBy(xpath = "//label[normalize-space(text())='Quote Rev No']/following-sibling::div/input[@formcontrolname='quoteRevNumber']")
	WebElement quoterevisionNumberField;

	@FindBy(xpath = "//label[normalize-space(text())='Order Date']/following-sibling::div/input[@formcontrolname='orderDate']")
	WebElement orderDatePicker1;

	@FindBy(xpath = "(//input[@type='text'])[5]")
	WebElement orderTypeDropDown;
	@FindBy(xpath = "//span[normalize-space()='Billing']")
	WebElement orderTypeDropDownSelectData;

	@FindBy(xpath = "//label[normalize-space(text())='Customer Name']/following-sibling::div/input[@formcontrolname='customerName']")
	WebElement customerNameElement;

	@FindBy(xpath = "//label[normalize-space(text())='Customer Id']/following-sibling::div/input[@formcontrolname='customerNumber']")
	WebElement customerIdElement;

	@FindBy(xpath = "//label[normalize-space(text())='Lead Id']/following-sibling::div/input[@formcontrolname='leadId']")
	WebElement leadIdField;

//	@FindBy(xpath = "//label[normalize-space(text())='Rev No.']/following-sibling::div/input[@formcontrolname='revNo']")
//	WebElement revisionNumberField;

	@FindBy(xpath = "//label[normalize-space(text())='Requested Date']/following-sibling::div/input[@formcontrolname='requestedDate']")
	WebElement requestDateElement;

	@FindBy(xpath = "//label[normalize-space(text())='Prouct Type']/following-sibling::div/input[@formcontrolname='productType']")
	WebElement productTypeElement;

	@FindBy(xpath = "//label[normalize-space(text())='Type Of Solution']/following-sibling::div/input[@formcontrolname='typeOfSolution']")
	WebElement typeOfSolutionElement;

	@FindBy(xpath = "//label[normalize-space(text())='Total']/following-sibling::div/input[@formcontrolname='totalAmount']")
	WebElement totalElement;

//	@FindBy(xpath = "//label[normalize-space(text())='Dispatched Value']/following-sibling::div/input[@formcontrolname='dispatchedValue']")
//	WebElement dispatchedValueElement;
//	
	@FindBy(xpath = "//label[normalize-space(text())='Balance SO Value']/following-sibling::div/input[@formcontrolname='balanceSo']")
	WebElement balanceSOvalueElement;

	@FindBy(xpath = "//textarea[@placeholder='Enter Reason For Modification']")
	WebElement reasonForModificationElement;

	@FindBy(xpath = "//label[normalize-space(text())='Pricelist']/following-sibling::div/input[@placeholder='PriceList Name']")
	WebElement priceListElement;

	@FindBy(xpath = "(//input[@type='text'])[12]")
	WebElement salesPersonDropDown;
	@FindBy(xpath = "(//span[normalize-space()='Abhilashpatil'])[1]")
	WebElement salesPersonDropDownSelectData;

	@FindBy(xpath = "//label[normalize-space(text())='Created By.']/following-sibling::div/input[@formcontrolname='createdBy']")
	WebElement createdByElement;

	// Items Tab
	@FindBy(linkText = "Items")
	WebElement itemsTab;

	@FindBy(id = "generalDiscPer")
	WebElement generalDiscountPercentageRadioButton;

	@FindBy(xpath = "//input[@value='Rupees']")
	WebElement generalDiscountRupeesRadioButton;

	@FindBy(xpath = "//input[@placeholder='Enter General Discount']")
	WebElement generalDiscountField3;

	@FindBy(xpath = "//strong[text()='Total Amount']/ancestor::label/following-sibling::div/input")
	WebElement totalAmountElement;

	@FindBy(xpath = "(//input[@placeholder='Enter Quantity'])[1]")
	WebElement OrderQtyField1;

	@FindBy(xpath = "(//input[@value='Percentage'])[2]")
	WebElement discountPercentageRadioButton1;

	@FindBy(xpath = "(//input[@value='Rupees'])[2]")
	WebElement discountRupeesRadioButton1;

	@FindBy(xpath = "//input[@placeholder='Enter Discount']")
	WebElement discountField1;

	@FindBy(xpath = "(//input[@placeholder='Enter Quantity'])[2]")
	WebElement sGSTField1;

	@FindBy(xpath = "(//input[@placeholder='Enter Quantity'])[3]")
	WebElement cGSTField1;

	@FindBy(xpath = "(//input[@placeholder='Enter Quantity'])[4]")
	WebElement iGSTField1;

	@FindBy(xpath = "(//input[@placeholder='Enter Quantity'])[5]")
	WebElement uTGSTField1;

	@FindBy(xpath = "(//input[@placeholder='DD-MM-YYYY'])[3]")
	WebElement requestDateElement1;

	@FindBy(xpath = "//input[@formcontrolname='deliveryScheduleQty']")
	WebElement quantityField1;

	@FindBy(xpath = "(//button[contains(text(),'Add')])[2]")
	WebElement addButton;

	@FindBy(xpath = "//button[contains(text(),'save')]")
	WebElement saveButton;

	@FindBy(xpath = "(//textarea)[1]")
	WebElement remarkField1;

	@FindBy(xpath = "(//input[@placeholder='Enter Quantity'])[6]")
	WebElement OrderQtyField2;

	@FindBy(xpath = "(//input[@value='Percentage'])[3]")
	WebElement discountPercentageRadioButton2;

	@FindBy(xpath = "(//input[@value='Rupees'])[3]")
	WebElement discountRupeesRadioButton2;

	@FindBy(xpath = "//input[@title='min:20, max:30']")
	WebElement discountField2;

	@FindBy(xpath = "(//input[@placeholder='Enter Quantity'])[7]")
	WebElement sGSTField2;

	@FindBy(xpath = "(//input[@placeholder='Enter Quantity'])[8]")
	WebElement cGSTField2;

	@FindBy(xpath = "(//input[@placeholder='Enter Quantity'])[9]")
	WebElement iGSTField2;

	@FindBy(xpath = "(//input[@placeholder='Enter Quantity'])[10]")
	WebElement uTGSTField2;

	@FindBy(xpath = "(//i[@title='Delivery Schedule'])[2]")
	WebElement scheduleDateElement2;

	@FindBy(xpath = "//input[@formcontrolname='deliveryScheduleDate']")
	WebElement scheduleDateDatePicker2;

	@FindBy(xpath = "//input[@formcontrolname='deliveryScheduleQty']")
	WebElement quantityField2;

	@FindBy(xpath = "(//button[contains(text(),'Add')])[2]")
	WebElement addButton2;

	@FindBy(xpath = "//button[normalize-space()='save']")
	WebElement saveButton2;

	@FindBy(xpath = "(//textarea)[2]")
	WebElement remarkField2;

	@FindBy(xpath = "(//input[@placeholder='Enter Quantity'])[11]")
	WebElement OrderQtyField3;

	@FindBy(xpath = "(//input[@value='Percentage'])[4]")
	WebElement discountPercentageRadioButton3;

	@FindBy(xpath = "(//input[@value='Rupees'])[4]")
	WebElement discountRupeesRadioButton3;

	@FindBy(xpath = "(//input[@placeholder='Enter Discount'])[3]")
	WebElement discountField3;

	@FindBy(xpath = "(//input[@placeholder='Enter Quantity'])[12]")
	WebElement sGSTField3;

	@FindBy(xpath = "(//input[@placeholder='Enter Quantity'])[13]")
	WebElement cGSTField3;

	@FindBy(xpath = "(//input[@placeholder='Enter Quantity'])[14]")
	WebElement iGSTField3;

	@FindBy(xpath = "(//input[@placeholder='Enter Quantity'])[15]")
	WebElement uTGSTField3;

	@FindBy(xpath = "(//i[@title='Delivery Schedule'])[3]")
	WebElement scheduleDateElement3;

	@FindBy(xpath = "(//input[@placeholder='DD-MM-YYYY'])[2]")
	WebElement scheduleDateDatePicker3;

	@FindBy(xpath = "//input[@formcontrolname='deliveryScheduleQty']")
	WebElement quantityField3;

	@FindBy(xpath = "(//button[contains(text(),'Add')])[2]")
	WebElement addButton3;

	@FindBy(xpath = "//button[normalize-space()='save']")
	WebElement saveButton3;

	@FindBy(xpath = "(//textarea)[3]")
	WebElement remarkField3;

	/*
	 * @FindBy(xpath = "(//input[@placeholder='Enter Quantity'])[16]") WebElement
	 * OrderQtyField4;
	 * 
	 * @FindBy(xpath = "(//input[@value='Percentage'])[5]") WebElement
	 * discountPercentageRadioButton4;
	 * 
	 * @FindBy(xpath = "(//input[@value='Rupees'])[5]") WebElement
	 * discountRupeesRadioButton4;
	 * 
	 * @FindBy(xpath = "(//input[@placeholder='Enter Discount'])[4]") WebElement
	 * discountField4;
	 * 
	 * @FindBy(xpath = "(//input[@placeholder='Enter Quantity'])[17]") WebElement
	 * sGSTField4;
	 * 
	 * @FindBy(xpath = "(//input[@placeholder='Enter Quantity'])[18]") WebElement
	 * cGSTField4;
	 * 
	 * @FindBy(xpath = "(//input[@placeholder='Enter Quantity'])[19]") WebElement
	 * iGSTField4;
	 * 
	 * @FindBy(xpath = "(//input[@placeholder='Enter Quantity'])[20]") WebElement
	 * uTGSTField4;
	 * 
	 * @FindBy(xpath = "(//i[@title='Delivery Schedule'])[4]") WebElement
	 * scheduleDateElement4;
	 * 
	 * @FindBy(xpath = "(//input[@placeholder='DD-MM-YYYY'])[2]") WebElement
	 * scheduleDateDatePicker4;
	 * 
	 * @FindBy(xpath = "//input[@formcontrolname='deliveryScheduleQty']") WebElement
	 * quantityField4;
	 * 
	 * @FindBy(xpath = "(//button[contains(text(),'Add')])[2]") WebElement
	 * addButton4;
	 * 
	 * @FindBy(xpath = "//button[normalize-space()='save']") WebElement saveButton4;
	 * 
	 * @FindBy(xpath =
	 * "//*[@id=\"ngb-nav-0-panel\"]/div[2]/table/tbody/tr[4]/td[18]/div/textarea")
	 * WebElement remarkField4;
	 */

	@FindBy(linkText = "PO Details")
	WebElement poDetailsTab;

	@FindBy(xpath = "//input[@placeholder='Enter PO Number']")
	WebElement poNumberTextField;

	@FindBy(xpath = "//label[normalize-space(text())='PO Date']/following-sibling::div/input[@formcontrolname='poDate']")
	WebElement poDatePicker;

	@FindBy(xpath = "//label[normalize-space(text())='Received Date']/following-sibling::div/input[@formcontrolname='receivedDate']")
	WebElement poReceivedDatePicker;

	@FindBy(linkText = "Billing & Shipping Details")
	WebElement billingandShippingDetailsTab;

	@FindBy(xpath = "(//input[@type='text'])[14]")
	WebElement billToDropDown;
	@FindBy(xpath = "//span[normalize-space()='TEST Address']")
	WebElement billToDropDownSelectData;

	@FindBy(xpath = "//label[normalize-space(text())='Bill To Id']/following-sibling::div/input[@formcontrolname='billToId']")
	WebElement billToIdElement;

	@FindBy(xpath = "(//input[@type='text'])[16]")
	WebElement shipToDropDown;
	@FindBy(xpath = "//span[normalize-space()='TEST Shipping Address']")
	WebElement shipToDropDownSelectData;

	@FindBy(xpath = "//label[normalize-space(text())='Ship To Id']/following-sibling::div/input[@formcontrolname='shipToId']")
	WebElement shipToIdElement;

	@FindBy(xpath = "(//input[@type='text'])[18]")
	WebElement paymentTermsDropDown;
	@FindBy(xpath = "//span[normalize-space()='ADV 50% AND BALANCE AGAINST THE DELIVERY']")
	WebElement paymentTermsDropDownSelectDate;

	@FindBy(xpath = "//textarea[@formcontrolname='remarks']")
	WebElement remarkTextField;

	@FindBy(linkText = "Total Calculation")
	WebElement totalCalculationTab;

	@FindBy(xpath = "//label[normalize-space(text())='Total Amount']/following-sibling::div/input[@placeholder='Enter Total Amount']")
	WebElement totalAmountElement1;

	@FindBy(xpath = "(//input[@type='text'])[15]")
	WebElement additionalChargesLabelNameDropDown;
	@FindBy(xpath = "//span[normalize-space()='Installation Charges']")
	WebElement additionalChargesLabelNameDropDownSelectDate;

	@FindBy(xpath = "//input[@id='addtionalPer']")
	WebElement additionalChargesValuePercentageRadioButton;

	@FindBy(xpath = "//input[@id='addtionalAmt']")
	WebElement additionalChargesValueRupeesRadioButton;

	@FindBy(xpath = "//input[@placeholder='Enter Additional Charges']")
	WebElement additionalChargesValueField;

	@FindBy(xpath = "//input[@placeholder='Enter IGST']")
	WebElement iGSTField;

	@FindBy(xpath = "//input[@placeholder='Enter CGST']")
	WebElement cGSTField;

	@FindBy(xpath = "//input[@placeholder='Enter SGST']")
	WebElement sGSTField;

	@FindBy(xpath = "//input[@placeholder='Enter UTGST']")
	WebElement uTGSTField;

	@FindBy(xpath = "//button[contains(normalize-space(),'Add')]")
	WebElement addButtoninTotalCalculationTab;

	@FindBy(xpath = "//label[normalize-space(text())='Total Additional Charges']/following-sibling::div/input[@placeholder='Enter Total Addtional Charges']")
	WebElement totaladditionalChargesElement;

	@FindBy(xpath = "//input[@id='specialDiscTotPer']")
	WebElement specialDiscountPercentageRadioButton;

	@FindBy(xpath = "//input[@id='specialDiscTotAmt']")
	WebElement specialDiscountRupeesRadioButton;

	@FindBy(xpath = "//input[@placeholder='Enter Special Discount']")
	WebElement specialDiscountField;

	@FindBy(xpath = "//label[normalize-space(text())='Total Final Amount']/following-sibling::div/input[@placeholder='Enter Total Final Amount']")
	WebElement totalFinalAmountElement;

	@FindBy(xpath = "//button[contains(text(),'Save')]")
	WebElement saveButtonOfSalesOrderCreatePage;

	public SalesOrder() {

		PageFactory.initElements(driver, this);
	}

	public HomePage salesOrderCreate(String generalDiscount, String orderQty, String discount1, String sgst1,
			String cgst1, String igst1, String utgst1, String quantity1, String remark1, String orderqty2,
			String discount2, String sgst2, String cgst2, String igst2, String utgst2, String quantity2, String remark2,
			String orderQty3, String discount3, String sgst3, String cgst3, String igst3, String utgst3,
			String quantity3, String remark3, String orderQty4, String discount4, String sgst4, String cgst4,
			String igst4, String utgst4, String quantity4, String remark4, String poNumber,
			String billingandShippingRemark, String additionalCharges, String sgst, String cgst, String igst,
			String utgst, String specialDiscount) throws Throwable {

//        js.executeScript("arguments[0].click();", threeLineIconBar);

		// Verify and Click on Release Button in Quote Table Page
		boolean releaseButtonIsDisplayed = releaseButton.isDisplayed();
		assertTrue(releaseButtonIsDisplayed, "Release Button is not Displayed.");
		releaseButton.click();

		// Verify the Close Button in Release Quote Pop-Up
		boolean closeButtonIsDisplayed = closeButton.isDisplayed();
		assertTrue(closeButtonIsDisplayed, "Close Button IsDisplayed.");
		closeButton.click();

		// to Print Option in Release Quote Pop-Up-Quote Table -Sales
		releaseButton.click();

//		WebElement toPrintButton = driver.findElement(By.xpath("//button[contains(text(),'Build To Print')]"));
		assertTrue(convertToSalesOrderButton.isDisplayed(), "Convert to SalesOrder Button IsDisplayed.");
		convertToSalesOrderButton.click();

		// ################ Sales Order Create Page ##################

		// Verify the Project Number Element in Sales Order Create Page-Transaction
		// Module
//	 		 WebElement projectNumberElement = driver.findElement(By.xpath("//label[normalize-space(text())='Project Number']/following-sibling::div/input[@formcontrolname='projectNumber']"));
		assertTrue(projectNumberElement.isDisplayed(), "Project Number Element is not IsDisplayed.");
		// To extract Value Attribute and use same approach to retrieve
		String projectNumberElementValue = (String) js.executeScript("return arguments[0].value;",
				projectNumberElement);
		System.out.println("Project Number : " + projectNumberElementValue + "\n");

		// Verify the Quote Number Element in Page-Transaction Module
//	  		WebElement quoteNumberElement = driver.findElement(By.xpath("//label[normalize-space(text())='Quote Number']/following-sibling::div/input[@formcontrolname='quoteNumber']"));
		assertTrue(quoteNumberElement.isDisplayed(), "Quote Number Element is not Displayed.");
		// To extract Value Attribute and use same approach to retrieve
		String quoteNumberElementValue = (String) js.executeScript("return arguments[0].value;", quoteNumberElement);
		System.out.println("Quote Number : " + quoteNumberElementValue + "\n");

		// Verify the Quote Revision Number Field in Sales Order Create Page-Transaction
		// Module
//	 		WebElement quoterevisionNumberField = driver.findElement(By.xpath("//label[normalize-space(text())='Quote Rev No']/following-sibling::div/input[@formcontrolname='quoteRevNumber']"));
		assertTrue(quoterevisionNumberField.isDisplayed(), "Quote revision Number Field is not Displayed.");
		// To extract Value Attribute and use same approach to retrieve
		String quoterevisionNumberFieldValue = (String) js.executeScript("return arguments[0].value;",
				quoterevisionNumberField);
		System.out.println("Quote Rev Number : " + quoterevisionNumberFieldValue + "\n");

		// Verify and Order Date Picker1 in Add Vendor
//	        WebElement orderDatePicker1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[normalize-space(text())='Order Date']/following-sibling::div/input[@formcontrolname='orderDate']")));
		assertTrue(orderDatePicker1.isDisplayed(), "Order Date Picker1 is not Displayed.");
		// To extract Value Attribute and use same approach to retrieve
		String orderDatePicker1Value = (String) js.executeScript("return arguments[0].value;", orderDatePicker1);
		System.out.println("Order Date : " + orderDatePicker1Value + "\n");

		// Verify the Order Type Drop Down in Sales Order Create Page-Transaction Module
		assertTrue(orderTypeDropDown.isDisplayed(), "order Type Drop Down is not Displayed.");
		orderTypeDropDown.sendKeys(Keys.ENTER);
		WebElement orderTypeDropDownFocusedElement = driver.switchTo().activeElement();
		boolean orderTypeDropDownIsSelected = orderTypeDropDownFocusedElement.equals(orderTypeDropDown);
		assertTrue(orderTypeDropDownIsSelected, "Order Type Drop Down is not Selected");
		js.executeScript("arguments[0].click();", orderTypeDropDownSelectData);

		// Verify the Customer Name Element in Sales Order Create Page-Transaction
		// Module
		assertTrue(customerNameElement.isDisplayed(), "Customer Name Element is not Displayed.");
		// To extract Value Attribute and use same approach to retrieve
		String customerNameElementValue = (String) js.executeScript("return arguments[0].value;", customerNameElement);
		System.out.println("Customer Name : " + customerNameElementValue + "\n");

		// Verify the Customer Id Element in Sales Order Create Page-Transaction Module
		assertTrue(customerIdElement.isDisplayed(), "Customer Id Element is not Displayed.");
		// To extract Value Attribute and use same approach to retrieve
		String customerIdElementValue = (String) js.executeScript("return arguments[0].value;", customerIdElement);
		System.out.println("Customer Id : " + customerIdElementValue + "\n");

		// Verify the Lead Id Element in Sales Order Create Page-Transaction Module
		assertTrue(leadIdField.isDisplayed(), "Lead Id Element is not Displayed.");
		// To extract Value Attribute and use same approach to retrieve
		String leadIdFieldValue = (String) js.executeScript("return arguments[0].value;", leadIdField);
		System.out.println("Lead Id : " + leadIdFieldValue + "\n");

//	    //Verify the Rev No. Element in Sales Order Create Page-Transaction Module
//  		assertTrue(revisionNumberField.isDisplayed(), "Rev No. Element is not Displayed.");
//        //To extract Value Attribute and use same approach to retrieve
//	    String revisionNumberFieldValue = (String) js.executeScript(
//			    "return arguments[0].value;", 
//			    revisionNumberField
//			);
//	    System.out.println("Rev No. : " + revisionNumberFieldValue+"\n");

		// Verify the Request Date Element in Sales Order Create Page-Transaction Module
		assertTrue(requestDateElement.isDisplayed(), "Request Date Element is not Displayed.");
		// To extract Value Attribute and use same approach to retrieve
		String requestDateElementValue = (String) js.executeScript("return arguments[0].value;", requestDateElement);
		System.out.println("Request Date : " + requestDateElementValue + "\n");

		// Verify the Product Type Element in Sales Order Create Page-Transaction Module
		assertTrue(productTypeElement.isDisplayed(), "Product Type Element is not Displayed.");
		// To extract Value Attribute and use same approach to retrieve
		String productTypeElementValue = (String) js.executeScript("return arguments[0].value;", productTypeElement);
		System.out.println("Product Type : " + productTypeElementValue + "\n");

		// Verify the Type of Solution Element in Sales Order Create Page-Transaction
		// Module
		assertTrue(typeOfSolutionElement.isDisplayed(), "Type of Solution Element is not Displayed.");
		// To extract Value Attribute and use same approach to retrieve
		String typeOfSolutionElementValue = (String) js.executeScript("return arguments[0].value;",
				typeOfSolutionElement);
		System.out.println("Type of Solution : " + typeOfSolutionElementValue + "\n");

		// Verify the Total Element in Sales Order Create Page-Transaction Module
		assertTrue(totalElement.isDisplayed(), "Total Element is not Displayed.");
		// To extract Value Attribute and use same approach to retrieve
		String totalElementValue = (String) js.executeScript("return arguments[0].value;", totalElement);
		System.out.println("Total : " + totalElementValue + "\n");

//	    //Verify the Dispatched Value Element in Sales Order Create Page-Transaction Module
//  	assertTrue(dispatchedValueElement.isDisplayed(), "Dispatched Value Element is not Displayed.");
//        //To extract Value Attribute and use same approach to retrieve
//	    String dispatchedValueElementValue = (String) js.executeScript(
//			    "return arguments[0].value;", 
//			    dispatchedValueElement
//			);
//	    System.out.println("Dispatched Value : " + dispatchedValueElementValue+"\n");

//	    //Verify the Balance SO Value Element in Sales Order Create Page-Transaction Module
//  		assertTrue(balanceSOvalueElement.isDisplayed(), "Balance SO Value Element is not Displayed.");
//        //To extract Value Attribute and use same approach to retrieve
//	    String balanceSOvalueElementValue = (String) js.executeScript(
//			    "return arguments[0].value;", 
//			    balanceSOvalueElement
//			);
//	    System.out.println("Balance SO Value : " + balanceSOvalueElementValue+"\n");

//	    //Verify the Reason for Modification Element
//	    assertTrue(reasonForModificationElement.isDisplayed(), "Reason for Modification Element is not Displayed.");
//	    reasonForModificationElement.sendKeys("Test Reason for Modification");
//	    
		// Verify the Price List Element in Sales Order Create Page-Transaction Module
		assertTrue(priceListElement.isDisplayed(), "Price List Element is not Displayed.");
		// To extract Value Attribute and use same approach to retrieve
		String priceListElementValue = (String) js.executeScript("return arguments[0].value;", priceListElement);
		System.out.println("Price List : " + priceListElementValue + "\n");

		// Verify the Sales Person Drop Down in Sales Order Create Page-Transaction
		// Module
		assertTrue(salesPersonDropDown.isDisplayed(), "Sales Person Drop Down is not Displayed.");
		salesPersonDropDown.sendKeys(Keys.ENTER);
		WebElement salesPersonDropDownFocusedElement = driver.switchTo().activeElement();
		boolean salesPersonDropDownIsSelected = salesPersonDropDownFocusedElement.equals(salesPersonDropDown);
		assertTrue(salesPersonDropDownIsSelected, "Sales Person Drop Down is not Selected");
		click(driver, salesPersonDropDownSelectData);

		// Verify the Created By Element in Sales Order Create Page-Transaction Module
		assertTrue(createdByElement.isDisplayed(), "Created By Element is not Displayed.");
		// To extract Value Attribute and use same approach to retrieve
		String createdByElementValue = (String) js.executeScript("return arguments[0].value;", createdByElement);
		System.out.println("Created By : " + createdByElementValue + "\n");

		// ################## Items Tab ######################

		// Verify Items Tab in Sales Order Create Page
		assertTrue(itemsTab.isDisplayed(), "Items Tab is not Displayed.");
		itemsTab.click();

		// Verify General Discount Percentage Radio Button in General Tab
		assertTrue(generalDiscountPercentageRadioButton.isDisplayed(),
				"General Discount Percentage Radio Button is not Displayed.");
		generalDiscountPercentageRadioButton.click();

		// Verify General Discount Rupees Radio Button in General Tab
		assertTrue(generalDiscountRupeesRadioButton.isDisplayed(),
				"General Discount Rupees Radio Button is not Displayed.");
		generalDiscountRupeesRadioButton.click();

		// Verify the General Discount Field3 in General Tab
		assertTrue(generalDiscountField3.isDisplayed(), "General Discount Field3 is not Displayed.");
		generalDiscountField3.sendKeys(Keys.ENTER);
		WebElement generalDiscountField3FocusedElement = driver.switchTo().activeElement();
		assertTrue(generalDiscountField3FocusedElement.equals(generalDiscountField3),
				"General Discount Field3 is not Selected");
		generalDiscountField3.clear();
		generalDiscountField3.sendKeys(generalDiscount);

		// Verify the Total Amount Element in Sales Order Create Page-Transaction Module
		assertTrue(totalAmountElement.isDisplayed(), "Total Amount Element is not Displayed.");
		// To extract Value Attribute and use same approach to retrieve
		String totalAmountElementValue = (String) js.executeScript("return arguments[0].value;", totalAmountElement);
		System.out.println("Total Amount : " + totalAmountElementValue + "\n");

		// -------------------------------------------------------------------------------------------------------------------------------------------------------------------

		// Verify the Order Qty Field1 in Sales Order Create Page-Transaction Module
		assertTrue(OrderQtyField1.isDisplayed(), "Order Qty Field1 is not Displayed.");
//		OrderQtyField1.sendKeys(Keys.ENTER);
//		WebElement OrderQtyField1FocusedElement = driver.switchTo().activeElement();
//	    boolean OrderQtyField1IsSelected = OrderQtyField1FocusedElement.equals(OrderQtyField1);
//	    assertTrue(OrderQtyField1IsSelected, "Order Qty Field1 is not Selected");
//	    OrderQtyField1.clear();
//	    OrderQtyField1.sendKeys(orderQty);

		// Verify Discount Percentage Radio Button1 in General Tab
		assertTrue(discountPercentageRadioButton1.isDisplayed(), "Discount Percentage Radio Button1 is not Displayed.");
//	    discountPercentageRadioButton1.click();

		// Verify Discount Rupees Radio Button1 in General Tab
		assertTrue(discountRupeesRadioButton1.isDisplayed(), "Discount Rupees Radio Button1 is not Displayed.");
//	    discountRupeesRadioButton1.click();

		// Verify the discount Field1 in General Tab
		assertTrue(discountField1.isDisplayed(), "discount Field1 is not Displayed.");
//        discountField1.sendKeys(Keys.ENTER);
//        WebElement discountField1FocusedElement = driver.switchTo().activeElement();
//        boolean discountField1IsSelected = discountField1FocusedElement.equals(discountField1);
//        assertTrue(discountField1IsSelected, "discount Field1 is not Selected");
//        discountField1.clear();
//        discountField1.sendKeys(discount1);

		// Verify the SGST Field1 in General Tab
		assertTrue(sGSTField1.isDisplayed(), "SGST Field1 is not Displayed.");
		sGSTField1.sendKeys(Keys.ENTER);
		WebElement sGSTField1FocusedElement = driver.switchTo().activeElement();
		assertTrue(sGSTField1FocusedElement.equals(sGSTField1), "SGST Field1 is not Selected");
		sGSTField1.clear();
		sGSTField1.sendKeys(sgst1);

		// Verify the CGST Field1 in General Tab
		boolean cGSTField1Field1IsDisplayed = cGSTField1.isDisplayed();
		assertTrue(cGSTField1Field1IsDisplayed, "CGST Field1 is not Displayed.");
		cGSTField1.sendKeys(Keys.ENTER);
		WebElement cGSTField1FocusedElement = driver.switchTo().activeElement();
		boolean cGSTField1IsSelected = cGSTField1FocusedElement.equals(cGSTField1);
		assertTrue(cGSTField1IsSelected, "CGST Field1 is not Selected");
		cGSTField1.clear();
		cGSTField1.sendKeys(cgst1);

		// Verify the IGST Field1 in General Tab
		boolean iGSTField1Field1IsDisplayed = iGSTField1.isDisplayed();
		assertTrue(iGSTField1Field1IsDisplayed, "IGST Field1 is not Displayed.");
		iGSTField1.sendKeys(Keys.ENTER);
		WebElement iGSTField1FocusedElement = driver.switchTo().activeElement();
		boolean iGSTField1IsSelected = iGSTField1FocusedElement.equals(iGSTField1);
		assertTrue(iGSTField1IsSelected, "IGST Field1 is not Selected");
		iGSTField1.clear();
		iGSTField1.sendKeys(igst1);

		// Verify the UTGST Field1 in General Tab
		boolean uTGSTField1Field1IsDisplayed = uTGSTField1.isDisplayed();
		assertTrue(uTGSTField1Field1IsDisplayed, "UTGST Field1 is not Displayed.");
		uTGSTField1.sendKeys(Keys.ENTER);
		WebElement uTGSTField1FocusedElement = driver.switchTo().activeElement();
		boolean uTGSTField1IsSelected = uTGSTField1FocusedElement.equals(uTGSTField1);
		assertTrue(uTGSTField1IsSelected, "UTGST Field1 is not Selected");
		uTGSTField1.clear();
		uTGSTField1.sendKeys(utgst1);

		// Verify and Request Date in Items Tab
//        WebElement scheduleDateElement1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//i[@title='Delivery Schedule'])[1]")));
		assertTrue(requestDateElement1.isDisplayed(), "Request Date Element in Items Tab  is not Displayed.");
		// To extract Value Attribute and use same approach to retrieve
		String requestDateElement1Value = (String) js.executeScript("return arguments[0].value;", requestDateElement1);
		System.out.println("Request Date in Items Tab : " + requestDateElement1Value + "\n");

//      requestDateElement1.click();
//        //scheduleDateDatePicker1
//        WebElement requestDateElement1FocusedElement = driver.switchTo().activeElement();
//        boolean requestDateElement1IsSelected = requestDateElement1FocusedElement.equals(requestDateElement1);
//        assertTrue(requestDateElement1IsSelected, "Request Date Picker is not Selected");
//    	for (int j = 0; j < 30; j++) {
//    		requestDateElement1.sendKeys( Keys.ARROW_DOWN);
//    	    Thread.sleep(100); // Add a small delay if needed
//    	}
//    	requestDateElement1.sendKeys( Keys.ARROW_RIGHT);
//    	requestDateElement1.sendKeys(Keys.ARROW_RIGHT);
//    	requestDateElement1.sendKeys(Keys.ENTER);

		// Verify the Remark Field1
//        WebElement remarkField1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"ngb-nav-0-panel\"]/div[2]/table/tbody/tr[1]/td[18]/div/textarea")));
		boolean remarkField1IsDisplayed = remarkField1.isDisplayed();
		assertTrue(remarkField1IsDisplayed, "Remark Field1 is not Displayed.");
		remarkField1.sendKeys(Keys.ENTER);
		WebElement remarkField1FocusedElement = driver.switchTo().activeElement();
		boolean remarkField1IsSelected = remarkField1FocusedElement.equals(remarkField1);
		assertTrue(remarkField1IsSelected, "Remark Field1 is not Selected");
		remarkField1.clear();
		remarkField1.sendKeys(remark1);

		// ################## PO Details Tab ######################

		// Verify PO Details Tab in Sales Order Create Page
		assertTrue(poDetailsTab.isDisplayed(), "Items Tab is not Displayed.");
		poDetailsTab.click();

		// Verify the PO Number Text Field
		assertTrue(poNumberTextField.isDisplayed(), "PO Text Field is not Displayed.");
		poNumberTextField.sendKeys(Keys.ENTER);
		WebElement poNumberTextFieldFocusedElement = driver.switchTo().activeElement();
		boolean poNumberTextFieldIsSelected = poNumberTextFieldFocusedElement.equals(poNumberTextField);
		assertTrue(poNumberTextFieldIsSelected, "PO Text Field is not Selected");
		poNumberTextField.clear();
		poNumberTextField.sendKeys(poNumber);

		// Verify and PO Date Picker in in General Tab
		assertTrue(poDatePicker.isDisplayed(), "PO Date Picker is not Displayed.");
		poDatePicker.click();
		WebElement poDatePickerFocusedElement = driver.switchTo().activeElement();
		boolean poDatePickerIsSelected = poDatePickerFocusedElement.equals(poDatePicker);
		assertTrue(poDatePickerIsSelected, "PO Date Picker is not Selected");
		for (int j = 0; j < 5; j++) {
			poDatePicker.sendKeys(Keys.ARROW_RIGHT);
			Thread.sleep(100); // Add a small delay if needed
		}
		poDatePicker.sendKeys(Keys.ARROW_RIGHT);
		poDatePicker.sendKeys(Keys.ARROW_RIGHT);
		poDatePicker.sendKeys(Keys.ENTER);

		// Verify and PO Received Date Picker in in General Tab
		assertTrue(poReceivedDatePicker.isDisplayed(), "PO Received Date Picker is not Displayed.");
		poReceivedDatePicker.click();
		WebElement poReceivedDatePickerFocusedElement = driver.switchTo().activeElement();
		boolean poReceivedDatePickerIsSelected = poReceivedDatePickerFocusedElement.equals(poReceivedDatePicker);
		assertTrue(poReceivedDatePickerIsSelected, "PO Received Date Picker is not Selected");

		poReceivedDatePicker.sendKeys(Keys.ARROW_UP);
		Thread.sleep(100); // Add a small delay if needed

		poReceivedDatePicker.sendKeys(Keys.ARROW_RIGHT);
		poReceivedDatePicker.sendKeys(Keys.ARROW_RIGHT);
		poReceivedDatePicker.sendKeys(Keys.ENTER);

		// ################## Billing & Shipping Details Tab ######################

		// Verify billing & Shipping Details Tab in Sales Order Create Page
		assertTrue(billingandShippingDetailsTab.isDisplayed(), "Billing & Shipping Details Tab is not Displayed.");
		billingandShippingDetailsTab.click();

		// Verify the billTo Drop Down in Sales Order Create Page-Transaction Module
		assertTrue(billToDropDown.isDisplayed(), " billTo Drop Down is not Displayed.");
		billToDropDown.click();
		WebElement billToDropDownFocusedElement = driver.switchTo().activeElement();
		boolean billToDropDownIsSelected = billToDropDownFocusedElement.equals(billToDropDown);
		assertTrue(billToDropDownIsSelected, " billTo Drop Down is not Selected");
		billToDropDownSelectData.click();

		// Verify the billTo Id Element in Sales Order Create Page-Transaction Module
		assertTrue(billToIdElement.isDisplayed(), " billTo Id Element is not Displayed.");
		// To extract Value Attribute and use same approach to retrieve
		String billToIdElementValue = (String) js.executeScript("return arguments[0].value;", billToIdElement);
		System.out.println("Bill To Id : " + billToIdElementValue + "\n");

		// Verify the Ship To Drop Down in Sales Order Create Page-Transaction Module
		assertTrue(shipToDropDown.isDisplayed(), "Ship To Drop Down is not Displayed.");
		shipToDropDown.click();
		WebElement shipToDropDownFocusedElement = driver.switchTo().activeElement();
		boolean shipToDropDownIsSelected = shipToDropDownFocusedElement.equals(shipToDropDown);
		assertTrue(shipToDropDownIsSelected, "Ship To Drop Down is not Selected");
		shipToDropDownSelectData.click();

		// Verify the Ship To Id Element in Sales Order Create Page-Transaction Module
		assertTrue(shipToIdElement.isDisplayed(), "Ship To Id Element is not Displayed.");
		// To extract Value Attribute and use same approach to retrieve
		String shippToIdElementValue = (String) js.executeScript("return arguments[0].value;", shipToIdElement);
		System.out.println("Shipp To Id : " + shippToIdElementValue + "\n");

		// Verify the Payment Terms Drop Down in Sales Order Create Page-Transaction
		// Module
		assertTrue(paymentTermsDropDown.isDisplayed(), "Payment Terms Drop Down is not Displayed.");
		paymentTermsDropDown.sendKeys(Keys.ENTER);
		WebElement paymentTermsDropDownFocusedElement = driver.switchTo().activeElement();
		boolean paymentTermsDropDownIsSelected = paymentTermsDropDownFocusedElement.equals(paymentTermsDropDown);
		assertTrue(paymentTermsDropDownIsSelected, "Payment Terms Drop Down is not Selected");
		paymentTermsDropDownSelectDate.click();

		// Verify the Remark Text Field
//                WebElement remarkTextField = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//textarea[@formcontrolname='remarks']")));
		boolean remarkTextFieldIsDisplayed = remarkTextField.isDisplayed();
		assertTrue(remarkTextFieldIsDisplayed, "Remark Text Field is not Displayed.");
		remarkTextField.sendKeys(Keys.ENTER);
		WebElement remarkTextFieldFocusedElement = driver.switchTo().activeElement();
		boolean remarkTextFieldIsSelected = remarkTextFieldFocusedElement.equals(remarkTextField);
		assertTrue(remarkTextFieldIsSelected, "Remark Text Field is not Selected");
		remarkTextField.clear();
		remarkTextField.sendKeys(billingandShippingRemark);

		// ################## Total Calculation Tab ######################

		// Verify and Click on Total Calculation Tab
		assertTrue(totalCalculationTab.isDisplayed(), "Total Calculation Tab is not Displayed.");
		js.executeScript("arguments[0].click();", totalCalculationTab);

		// Verify the Total Amount Element1 in Sales Order Create Page-Transaction
		// Module
		assertTrue(totalAmountElement1.isDisplayed(), "Total Amount Element1 is not Displayed.");
		// To extract Value Attribute and use same approach to retrieve
		String totalAmountElement1Value = (String) js.executeScript("return arguments[0].value;", totalAmountElement1);
		System.out.println("Total Amount in Total Calculation Tab : " + totalAmountElement1Value + "\n");

		// Verify the Additional Charges Label Name Drop Down in Quote Create Page-Sales
		// Module
		assertTrue(additionalChargesLabelNameDropDown.isDisplayed(),
				"Additional Charges Label Name Drop Down is not Displayed.");
		additionalChargesLabelNameDropDown.click();
		WebElement additionalChargesLabelNameDropDownFocusedElement = driver.switchTo().activeElement();
		boolean additionalChargesLabelNameDropDownIsSelected = additionalChargesLabelNameDropDownFocusedElement
				.equals(additionalChargesLabelNameDropDown);
		assertTrue(additionalChargesLabelNameDropDownIsSelected,
				"Additional Charges Label Name Drop Down is not Selected");
		additionalChargesLabelNameDropDownSelectDate.click();
//           		//Verify Additional Charges Value Percentage Radio Button in General Tab
////           		WebElement additionalChargesValuePercentageRadioButton = driver.findElement(By.xpath("//input[@id='addtionalPer']"));
//           	    boolean additionalChargesValuePercentageRadioButtonIsDisplayed = additionalChargesValuePercentageRadioButton.isDisplayed();
//           	    assertTrue(additionalChargesValuePercentageRadioButtonIsDisplayed, "Additional Charges Value Percentage Radio Button is not Displayed.");
//           	    additionalChargesValuePercentageRadioButton.click();
//                   
//           		//Verify additionalChargesValue Rupees Radio Button in General Tab
////           		WebElement additionalChargesValueRupeesRadioButton = driver.findElement(By.xpath("//input[@id='addtionalAmt']"));
//           	    boolean additionalChargesValueRupeesRadioButtonIsDisplayed = additionalChargesValueRupeesRadioButton.isDisplayed();
//           	    assertTrue(additionalChargesValueRupeesRadioButtonIsDisplayed, "additionalChargesValue Rupees Radio Button is not Displayed.");
//           	    additionalChargesValueRupeesRadioButton.click();
//                   
//                   //Verify the additionalChargesValue Field in General Tab
////                   WebElement additionalChargesValueField = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='Enter Additional Charges']")));
//                   boolean additionalChargesValueFieldIsDisplayed = additionalChargesValueField.isDisplayed();
//                   assertTrue(additionalChargesValueFieldIsDisplayed, "additionalChargesValue Field is not Displayed.");
//                   additionalChargesValueField.sendKeys(Keys.ENTER);
//                   WebElement additionalChargesValueFieldFocusedElement = driver.switchTo().activeElement();
//                   boolean additionalChargesValueFieldIsSelected = additionalChargesValueFieldFocusedElement.equals(additionalChargesValueField);
//                   assertTrue(additionalChargesValueFieldIsSelected, "additionalChargesValue Field is not Selected");
//                   additionalChargesValueField.clear();
//                   additionalChargesValueField.sendKeys(additionalCharges);
//             
//                   //Verify the IGST Field in General Tab
////                   WebElement iGSTField = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='Enter IGST']")));
//                   boolean iGSTFieldFieldIsDisplayed = iGSTField.isDisplayed();
//                   assertTrue(iGSTFieldFieldIsDisplayed, "IGST Field is not Displayed.");
//                   iGSTField.sendKeys(Keys.ENTER);
//                   WebElement iGSTFieldFocusedElement = driver.switchTo().activeElement();
//                   boolean iGSTFieldIsSelected = iGSTFieldFocusedElement.equals(iGSTField);
//                   assertTrue(iGSTFieldIsSelected, "IGST Field is not Selected");
//                   iGSTField.clear();
//                   iGSTField.sendKeys(igst);
//                   
//                   //Verify the CGST Field in General Tab
////                   WebElement cGSTField = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='Enter CGST']")));
//                   boolean cGSTFieldFieldIsDisplayed = cGSTField.isDisplayed();
//                   assertTrue(cGSTFieldFieldIsDisplayed, "CGST Field is not Displayed.");
//                   cGSTField.sendKeys(Keys.ENTER);
//                   WebElement cGSTFieldFocusedElement = driver.switchTo().activeElement();
//                   boolean cGSTFieldIsSelected = cGSTFieldFocusedElement.equals(cGSTField);
//                   assertTrue(cGSTFieldIsSelected, "CGST Field is not Selected");
//                   cGSTField.clear();
//                   cGSTField.sendKeys(cgst);
//                   
//                   //Verify the SGST Field in General Tab
////                   WebElement sGSTField = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='Enter SGST']")));
//                   boolean sGSTFieldFieldIsDisplayed = sGSTField.isDisplayed();
//                   assertTrue(sGSTFieldFieldIsDisplayed, "SGST Field is not Displayed.");
//                   sGSTField.sendKeys(Keys.ENTER);
//                   WebElement sGSTFieldFocusedElement = driver.switchTo().activeElement();
//                   boolean sGSTFieldIsSelected = sGSTFieldFocusedElement.equals(sGSTField);
//                   assertTrue(sGSTFieldIsSelected, "SGST Field is not Selected");
//                   sGSTField.clear();
//                   sGSTField.sendKeys(sgst);
//                   
//                   //Verify the UTGST Field in General Tab
////                   WebElement uTGSTField = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='Enter UTGST']")));
//                   boolean uTGSTFieldFieldIsDisplayed = uTGSTField.isDisplayed();
//                   assertTrue(uTGSTFieldFieldIsDisplayed, "UTGST Field is not Displayed.");
//                   uTGSTField.sendKeys(Keys.ENTER);
//                   WebElement uTGSTFieldFocusedElement = driver.switchTo().activeElement();
//                   boolean uTGSTFieldIsSelected = uTGSTFieldFocusedElement.equals(uTGSTField);
//                   assertTrue(uTGSTFieldIsSelected, "UTGST Field is not Selected");
//                   uTGSTField.clear();
//                   uTGSTField.sendKeys(utgst);

		// Verify and Click on Add Button in Total Calculation Tab
		assertTrue(addButtoninTotalCalculationTab.isDisplayed(),
				"Add Button in Total Calculation Tab is not Displayed.");
		addButtoninTotalCalculationTab.click();

		// Verify the Total additionalCharges Element in Sales Order Create
		// Page-Transaction Module
		assertTrue(totaladditionalChargesElement.isDisplayed(), "Total additionalCharges Element is not Displayed.");
		// To extract Value Attribute and use same approach to retrieve
		String totaladditionalChargesElementValue = (String) js.executeScript("return arguments[0].value;",
				totaladditionalChargesElement);
		System.out.println(
				"Total additionalCharges in Total Calculation Tab : " + totaladditionalChargesElementValue + "\n");

//           		//Verify specialDiscount Percentage Radio Button in Total Calculation Tab
////           		WebElement specialDiscountPercentageRadioButton = driver.findElement(By.xpath("//input[@id='specialDiscTotPer']"));
//           	    boolean specialDiscountPercentageRadioButtonIsDisplayed = specialDiscountPercentageRadioButton.isDisplayed();
//           	    assertTrue(specialDiscountPercentageRadioButtonIsDisplayed, "specialDiscount Percentage Radio Button is not Displayed.");
//           	    specialDiscountPercentageRadioButton.click();
//                   
//           		//Verify specialDiscount Rupees Radio Button in Total Calculation Tab
////           		WebElement specialDiscountRupeesRadioButton = driver.findElement(By.xpath("//input[@id='specialDiscTotAmt']"));
//           	    boolean specialDiscountRupeesRadioButtonIsDisplayed = specialDiscountRupeesRadioButton.isDisplayed();
//           	    assertTrue(specialDiscountRupeesRadioButtonIsDisplayed, "specialDiscount Rupees Radio Button is not Displayed.");
//           	    specialDiscountRupeesRadioButton.click();
//                   
//                   //Verify the Special Discount Field in Total Calculation Tab
////                   WebElement specialDiscountField = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='Enter Special Discount']")));
//                   boolean specialDiscountFieldIsDisplayed = specialDiscountField.isDisplayed();
//                   assertTrue(specialDiscountFieldIsDisplayed, "Special Discount Field is not Displayed.");
//                   specialDiscountField.sendKeys(Keys.ENTER);
//                   WebElement specialDiscountFieldFocusedElement = driver.switchTo().activeElement();
//                   boolean specialDiscountFieldIsSelected = specialDiscountFieldFocusedElement.equals(specialDiscountField);
//                   assertTrue(specialDiscountFieldIsSelected, "Special Discount Field is not Selected");
//                   specialDiscountField.clear();
//                   specialDiscountField.sendKeys(specialDiscount);

		// Verify the totalFinal Amount Element in Sales Order Create Page-Transaction
		// Module
		assertTrue(totalFinalAmountElement.isDisplayed(), "Total Final Amount Element is not Displayed.");
		// To extract Value Attribute and use same approach to retrieve
		String totalFinalAmountElementValue = (String) js.executeScript("return arguments[0].value;",
				totalFinalAmountElement);
		System.out.println("Total Final Amount in Total Calculation Tab : " + totalFinalAmountElementValue + "\n");

		// Verify and Click on Save Button Of Sales Order Create Page in Add Vendor
		assertTrue(saveButtonOfSalesOrderCreatePage.isDisplayed(),
				"Save Button Of Sales Order Create Page is not Displayed.");
		js.executeScript("arguments[0].scrollIntoView(true);", saveButtonOfSalesOrderCreatePage);
		saveButtonOfSalesOrderCreatePage.click();

		return new HomePage();

	}

}
