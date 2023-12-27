package com.getapcs.TransactionEdit;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.getapcs.base.Testbase1;
import com.getapcs.home.login.HomePage;

public class VerifySalesOrderEditPage extends Testbase1 {

	@FindBy(xpath = "//label[normalize-space(text())='Sales Order Number']/following-sibling::input")
	WebElement salesOrderNumberElement;

	@FindBy(xpath = "//label[normalize-space(text())='Project Number']/following-sibling::div/input[@formcontrolname='projectNumber']")
	WebElement projectNumberElement;

	@FindBy(xpath = "//label[normalize-space(text())='Quote Number']/following-sibling::div/input[@formcontrolname='quoteNumber']")
	WebElement quoteNumberElement;

	@FindBy(xpath = "//label[normalize-space(text())='Quote Rev No']/following-sibling::div/input[@formcontrolname='quoteRevNumber']")
	WebElement quoterevisionNumberField;

	@FindBy(xpath = "//label[normalize-space(text())='Requested Date']/following-sibling::div/input[@formcontrolname='requestedDate']")
	WebElement requestDateElement;

	@FindBy(xpath = "//label[normalize-space(text())='Order Date']/following-sibling::div/input[@formcontrolname='orderDate']")
	WebElement orderDatePicker1;

	@FindBy(xpath = "//label[normalize-space(text())='Order Type']/following-sibling::div/ng-select[@formcontrolname='orderType']")
	WebElement orderTypeDropDown;

	@FindBy(xpath = "//label[normalize-space(text())='Customer Name']/following-sibling::div/input[@formcontrolname='customerName']")
	WebElement customerNameElement;

	@FindBy(xpath = "//label[normalize-space(text())='Customer Id']/following-sibling::div/input[@formcontrolname='customerNumber']")
	WebElement customerIdElement;

	@FindBy(xpath = "//label[normalize-space(text())='Lead Id']/following-sibling::div/input[@formcontrolname='leadId']")
	WebElement leadIdField;

	@FindBy(xpath = "//label[normalize-space(text())='Rev No.']/following-sibling::div/input[@formcontrolname='revNo']")
	WebElement revisionNumberField;

	@FindBy(xpath = "//label[normalize-space(text())='Prouct Type']/following-sibling::div/input[@formcontrolname='productType']")
	WebElement productTypeElement;

	@FindBy(xpath = "//label[normalize-space(text())='Type Of Solution']/following-sibling::div/input[@formcontrolname='typeOfSolution']")
	WebElement typeOfSolutionElement;

	@FindBy(xpath = "//label[normalize-space(text())='SO Total']/following-sibling::div/input[@formcontrolname='totalAmount']")
	WebElement soTotalElement;

	@FindBy(xpath = "//label[normalize-space(text())='Dispatched Value']/following-sibling::div/input[@formcontrolname='dispatchedValue']")
	WebElement dispatchedValueElement;

	@FindBy(xpath = "//label[normalize-space(text())='Balance SO Value']/following-sibling::div/input[@formcontrolname='balanceSo']")
	WebElement balanceSOvalueElement;

	@FindBy(xpath = "//textarea[@placeholder='Enter Reason For Modification']")
	WebElement reasonForModificationElement;

	@FindBy(xpath = "//label[normalize-space(text())='Price List']/following-sibling::div/input[@placeholder='PriceList Name']")
	WebElement priceListElement;

	@FindBy(xpath = "(//input[@type='text'])[12]")
	WebElement salesPersonDropDown;
	@FindBy(xpath = "//span[normalize-space()='gopal']")
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
	WebElement generalDiscountField;

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

	@FindBy(xpath = "//tbody/tr[1]/td[3]/i[1]")
	WebElement deleteRow;

	@FindBy(xpath = "//input[@formcontrolname='deliveryScheduleDate']")
	WebElement scheduleDateDatePicker1;

	@FindBy(xpath = "//button[normalize-space()='Close']")
	WebElement closeButton;

	@FindBy(xpath = "(//textarea)[2]")
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

	@FindBy(xpath = "//button[normalize-space()='Close']")
	WebElement closeButton2;

	@FindBy(xpath = "(//textarea)[3]")
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

	@FindBy(xpath = "//input[@formcontrolname='deliveryScheduleDate']")
	WebElement scheduleDateDatePicker3;

	@FindBy(xpath = "//button[normalize-space()='Close']")
	WebElement closeButton3;

	@FindBy(xpath = "(//textarea)[4]")
	WebElement remarkField3;

	@FindBy(xpath = "(//input[@placeholder='Enter Quantity'])[16]")
	WebElement OrderQtyField4;

	@FindBy(xpath = "(//input[@value='Percentage'])[5]")
	WebElement discountPercentageRadioButton4;

	@FindBy(xpath = "(//input[@value='Rupees'])[5]")
	WebElement discountRupeesRadioButton4;

	@FindBy(xpath = "(//input[@placeholder='Enter Discount'])[4]")
	WebElement discountField4;

	@FindBy(xpath = "(//input[@placeholder='Enter Quantity'])[17]")
	WebElement sGSTField4;

	@FindBy(xpath = "(//input[@placeholder='Enter Quantity'])[18]")
	WebElement cGSTField4;

	@FindBy(xpath = "(//input[@placeholder='Enter Quantity'])[19]")
	WebElement iGSTField4;

	@FindBy(xpath = "(//input[@placeholder='Enter Quantity'])[20]")
	WebElement uTGSTField4;

	@FindBy(xpath = "(//input[@placeholder='DD-MM-YYYY'])[3]")
	WebElement requestDateElement1;

	@FindBy(xpath = "//input[@formcontrolname='deliveryScheduleDate']")
	WebElement scheduleDateDatePicker4;

	@FindBy(xpath = "//button[normalize-space()='Close']")
	WebElement closeButton4;

	@FindBy(xpath = "(//textarea)[5]")
	WebElement remarkField4;

	@FindBy(xpath = "//button[normalize-space()='Add']")
	WebElement addButton;

	@FindBy(linkText = "PO Details")
	WebElement poDetailsTab;

	@FindBy(xpath = "//input[@placeholder='Enter PO Number']")
	WebElement poNumberTextField;

	@FindBy(xpath = "//input[@formcontrolname='poDate']")
	WebElement poDatePicker;

	@FindBy(xpath = "//input[@formcontrolname='receivedDate']")
	WebElement poReceivedDatePicker;

	@FindBy(linkText = "Billing & Shipping Details")
	WebElement billing$ShippingDetailsTab;

	@FindBy(xpath = "(//input[@type='text'])[18]")
	WebElement billToDropDown;

	@FindBy(xpath = "//label[normalize-space(text())='Bill To Id']/following-sibling::div/input[@formcontrolname='billToId']")
	WebElement billToIdElement;

	@FindBy(xpath = "(//input[@type='text'])[20]")
	WebElement shipToDropDown;

	@FindBy(xpath = "//label[normalize-space(text())='Ship To Id']/following-sibling::div/input[@formcontrolname='shipToId']")
	WebElement shipToIdElement;

	@FindBy(xpath = "(//input[@type='text'])[22]")
	WebElement paymentTermsDropDown;

	@FindBy(xpath = "//textarea[@formcontrolname='remarks']")
	WebElement remarkTextField;

	@FindBy(linkText = "Total Calculation")
	WebElement totalCalculationTab;

	@FindBy(xpath = "//label[normalize-space(text())='Total Amount']/following-sibling::div/input[@placeholder='Enter Total Amount']")
	WebElement totalAmountElement1;

	@FindBy(xpath = "(//input[@type='text'])[15]")
	WebElement additionalChargesLabelNameDropDown;

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
	WebElement totalAdditionalChargesElement;

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

	public VerifySalesOrderEditPage() {

		PageFactory.initElements(driver, this);
	}

	public HomePage salesOrderEdit(String poNumber) throws Throwable {

		// For Adjust the Web Page Size or Zoom
//		        ((JavascriptExecutor)driver).executeScript("document.body.style.zoom='75%'");

		// Verify the Project Number Element in Sales Order Create Page-Transaction
		// Module
		assertTrue(salesOrderNumberElement.isDisplayed(), "Project Number Element is not IsDisplayed.");
		// To extract Value Attribute and use same approach to retrieve
		String salesOrderNumberElementValue = (String) js.executeScript("return arguments[0].value;",
				salesOrderNumberElement);
		System.out.println("Sales Order Number : " + salesOrderNumberElementValue + "\n");

		// Verify the Project Number Element in Sales Order Create Page-Transaction
		// Module
		assertTrue(projectNumberElement.isDisplayed(), "Project Number Element is not IsDisplayed.");
		// To extract Value Attribute and use same approach to retrieve
		String projectNumberElementValue = (String) js.executeScript("return arguments[0].value;",
				projectNumberElement);
		System.out.println("Project Number : " + projectNumberElementValue + "\n");

		// Verify the Quote Number Element in Page-Transaction Module
		assertTrue(quoteNumberElement.isDisplayed(), "Quote Number Element is not Displayed.");
		// To extract Value Attribute and use same approach to retrieve
		String quoteNumberElementValue = (String) js.executeScript("return arguments[0].value;", quoteNumberElement);
		System.out.println("Quote Number : " + quoteNumberElementValue + "\n");

		// Verify the Quote Revision Number Field in Sales Order Create Page-Transaction
		// Module
		assertTrue(quoterevisionNumberField.isDisplayed(), "Quote revision Number Field is not Displayed.");
		// To extract Value Attribute and use same approach to retrieve
		String quoterevisionNumberFieldValue = (String) js.executeScript("return arguments[0].value;",
				quoterevisionNumberField);
		System.out.println("Quote Rev Number : " + quoterevisionNumberFieldValue + "\n");

		// Verify and Order Date Picker1 in Add Vendor
		assertTrue(orderDatePicker1.isDisplayed(), "Order Date Picker1 is not Displayed.");
		// To extract Value Attribute and use same approach to retrieve
		String orderDatePicker1Value = (String) js.executeScript("return arguments[0].value;", orderDatePicker1);
		System.out.println("Order Date : " + orderDatePicker1Value + "\n");

//  		        orderDatePicker1.click();
//  		        assertTrue(driver.switchTo().activeElement().equals(orderDatePicker1), "Order Date Date Picker1 is not Selected");
//  		        orderDatePicker1.sendKeys(Keys.ENTER);

		// Verify the Order Type Drop Down in Sales Order Create Page-Transaction Module
		assertTrue(orderTypeDropDown.isDisplayed(), "Order Type Drop Down is not Displayed.");
		// To extract Value Attribute and use same approach to retrieve
		String orderTypeDropDownValue = (String) js.executeScript("return arguments[0].value;", orderTypeDropDown);
		System.out.println("Order Type : " + orderTypeDropDownValue + "\n");

		// Verify the Customer Name Element in Sales Order Create Page-Transaction
		// Module
		assertTrue(customerNameElement.isDisplayed(), "Customer Name Element is not Displayed.");
		// To extract Value Attribute and use same approach to retrieve
		String customerNameElementValue = (String) js.executeScript("return arguments[0].value;", customerNameElement);
		System.out.println("Customer Name : " + customerNameElementValue + "\n");

		// Verify the Customer Id Element in Sales Order Create Page-Transaction Module
//  		  		WebElement customerIdElement = driver.findElement(By.xpath("//label[normalize-space(text())='Customer Id']/following-sibling::div/input[@formcontrolname='customerNumber']"));
		boolean customerIdElementIsDisplayed = customerIdElement.isDisplayed();
		assertTrue(customerIdElementIsDisplayed, "Customer Id Element is not Displayed.");
		// To extract Value Attribute and use same approach to retrieve
		String customerIdElementValue = (String) js.executeScript("return arguments[0].value;", customerIdElement);
		System.out.println("Customer Id : " + customerIdElementValue + "\n");

		// Verify the Lead Id Field in Sales Order Create Page-Transaction Module
		assertTrue(leadIdField.isDisplayed(), "Lead Id Field is not Displayed.");
		// To extract Value Attribute and use same approach to retrieve
		String leadIdFieldValue = (String) js.executeScript("return arguments[0].value;", leadIdField);
		System.out.println("Lead Id : " + leadIdFieldValue + "\n");

		// Verify the Revision Number Field in Sales Order Create Page-Transaction
		// Module
//  		 		WebElement revisionNumberField = driver.findElement(By.xpath("//label[normalize-space(text())='Rev No.']/following-sibling::div/input[@formcontrolname='revNo']"));
		boolean revisionNumberFieldIsDisplayed = revisionNumberField.isDisplayed();
		assertTrue(revisionNumberFieldIsDisplayed, " revision Number Field is not Displayed.");
		// To extract Value Attribute and use same approach to retrieve
		String revisionNumberFieldValue = (String) js.executeScript("return arguments[0].value;", revisionNumberField);
		System.out.println("Rev Number : " + revisionNumberFieldValue + "\n");

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

		// Verify the SO Total Element in Sales Order Create Page-Transaction Module
		assertTrue(soTotalElement.isDisplayed(), "SO Total Element is not Displayed.");
		// To extract Value Attribute and use same approach to retrieve
		String soTotalElementValue = (String) js.executeScript("return arguments[0].value;", soTotalElement);
		System.out.println("SO Total : " + soTotalElementValue + "\n");

		// Verify the Dispatched Value Element in Sales Order Create Page-Transaction
		// Module
		assertTrue(dispatchedValueElement.isDisplayed(), "Dispatched Value Element is not Displayed.");
		// To extract Value Attribute and use same approach to retrieve
		String dispatchedValueElementValue = (String) js.executeScript("return arguments[0].value;",
				dispatchedValueElement);
		System.out.println("Dispatched Value : " + dispatchedValueElementValue + "\n");

		// Verify the Balance SO Value Element in Sales Order Create Page-Transaction
		// Module
//  		  		WebElement balanceSOvalueElement = driver.findElement(By.xpath("//label[normalize-space(text())='Balance SO Value']/following-sibling::div/input[@formcontrolname='balanceSo']"));
		boolean balanceSOvalueElementIsDisplayed = balanceSOvalueElement.isDisplayed();
		assertTrue(balanceSOvalueElementIsDisplayed, "Balance SO Value Element is not Displayed.");
		// To extract Value Attribute and use same approach to retrieve
		String balanceSOvalueElementValue = (String) js.executeScript("return arguments[0].value;",
				balanceSOvalueElement);
		System.out.println("SO Total : " + balanceSOvalueElementValue + "\n");

		// Verify the Reason for Modification Element
		assertTrue(reasonForModificationElement.isDisplayed(), "Reason for Modification Element is not Displayed.");
		reasonForModificationElement.sendKeys("Test Reason for Modification");

		// Verify the Price List Element in Sales Order Create Page-Transaction Module
		assertTrue(priceListElement.isDisplayed(), "Price List Element is not Displayed.");
		// To extract Value Attribute and use same approach to retrieve
		String priceListElementValue = (String) js.executeScript("return arguments[0].value;", priceListElement);
		System.out.println("Price List : " + priceListElementValue + "\n");

//		 		//Verify the Sales Person Drop Down in Sales Order Create Page-Transaction Module
//		 		assertTrue(salesPersonDropDown.isDisplayed(), "Sales Person Drop Down is not Displayed.");
//		 		salesPersonDropDown.sendKeys(Keys.ENTER);
//		 		WebElement salesPersonDropDownFocusedElement = driver.switchTo().activeElement();
//		 	    boolean salesPersonDropDownIsSelected = salesPersonDropDownFocusedElement.equals(salesPersonDropDown);
//		 	    assertTrue(salesPersonDropDownIsSelected, "Sales Person Drop Down is not Selected");
////		 		salesPersonDropDownSelectData.click();
//		 		js.executeScript("arguments[0].click();", salesPersonDropDownSelectData);
//		 		
		// Verify the Created By Element in Sales Order Create Page-Transaction Module
		assertTrue(createdByElement.isDisplayed(), "Created By Element is not Displayed.");
		// To extract Value Attribute and use same approach to retrieve
		String createdByElementValue = (String) js.executeScript("return arguments[0].value;", createdByElement);
		System.out.println("Created By : " + createdByElementValue + "\n");

		// ################## Items Tab ######################

//  				//Verify Items Tab in Sales Order Create Page
//  			    assertTrue(itemsTab.isDisplayed(), "Items Tab is not Displayed.");
//  			    itemsTab.click();  
//  			    
//  		        //Verify General Discount Percentage Radio Button in General Tab
//  		  	    assertTrue(generalDiscountPercentageRadioButton.isDisplayed(), "General Discount Percentage Radio Button is not Displayed.");
////  		  	    generalDiscountPercentageRadioButton.click();
//  		          
//  		  		//Verify General Discount Rupees Radio Button in General Tab
////  		  		WebElement generalDiscountRupeesRadioButton = driver.findElement(By.xpath("//input[@value='Rupees']"));
//  		  	    assertTrue(generalDiscountRupeesRadioButton.isDisplayed(), "General Discount Rupees Radio Button is not Displayed.");
////  		  	    generalDiscountRupeesRadioButton.click();
//  		          
//  		          //Verify the General Discount Field in General Tab
//  		          assertTrue(generalDiscountField.isDisplayed(), "General Discount Field is not Displayed.");
////  		          generalDiscountField.sendKeys(Keys.ENTER);
////  		          assertTrue(driver.switchTo().activeElement().equals(generalDiscountField), "General Discount Field is not Selected");
////  		          generalDiscountField.clear();
////  		          generalDiscountField.sendKeys("75");
//  		        
//	            //Verify The Records In Table Of Sales Order Create Page
//	        /*  WebElement table = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//table[@formarrayname='ItemData']")));
//	          // Get headers (column names)
//	          List<WebElement> headers = table.findElements(By.tagName("th"));
//
//	          // Print headers
//	          for (WebElement header : headers) {
//	              System.out.print(header.getText() + "\t");
//	          }
//	          System.out.println(); // Move to the next line
//	          
//	           // Get all rows from the table
//	          List<WebElement> rows = table.findElements(By.tagName("tr"));
//	          
//	           // Loop through each row
//	            for (WebElement row : rows) {
//	               // Get all columns for each row
//	                 List<WebElement> columns = row.findElements(By.tagName("td"));
//	               
//	                  // Loop through each column
//	                  for (WebElement column : columns) {
//	                      // Extract and print the text from the column
//	                      System.out.print(column.getText() + "\t");
//	                    }
//	                    System.out.println(); // Move to the next row
//	                  }
//	            System.out.println(); */
//  		          
//  		      //<------------------------***************----------------------------->
//  		          
//  		        // First Row of Records
//  		          
//  				//Verify the Order Qty Field1 in Sales Order Create Page-Transaction Module
//  				assertTrue(OrderQtyField1.isDisplayed(), "Order Qty Field1 is not Displayed.");
////  				OrderQtyField1.sendKeys(Keys.ENTER);
////  			    assertTrue(driver.switchTo().activeElement().equals(OrderQtyField1), "Order Qty Field1 is not Selected");
////  			    OrderQtyField1.clear();
////  			    OrderQtyField1.sendKeys("50");
//  			    
//  		        
//  				//Verify Discount Percentage Radio Button1 in General Tab
//  			    assertTrue(discountPercentageRadioButton1.isDisplayed(), "Discount Percentage Radio Button1 is not Displayed.");
////  			    discountPercentageRadioButton1.click();
//  		        
//  				//Verify Discount Rupees Radio Button1 in General Tab
//  			    assertTrue(discountRupeesRadioButton1.isDisplayed(), "Discount Rupees Radio Button1 is not Displayed.");
////  			    discountRupeesRadioButton1.click();
//  		        
//  		        //Verify the discount Field1 in General Tab
//  		        assertTrue(discountField1.isDisplayed(), "discount Field1 is not Displayed.");
////  		        discountField1.sendKeys(Keys.ENTER);
////  		        assertTrue(driver.switchTo().activeElement().equals(discountField1), "discount Field1 is not Selected");
////  		        discountField1.clear();
////  		        discountField1.sendKeys("20");
//  		  		
//  		        //Verify the SGST Field1 in General Tab
//  		        assertTrue(sGSTField1.isDisplayed(), "SGST Field1 is not Displayed.");
//  		        sGSTField1.sendKeys(Keys.ENTER);
//  		        assertTrue(driver.switchTo().activeElement().equals(sGSTField1), "SGST Field1 is not Selected");
//  		        sGSTField1.clear();
//  		        sGSTField1.sendKeys("8");
//  		  		
//  		        //Verify the CGST Field1 in General Tab
//  		        assertTrue(cGSTField1.isDisplayed(), "CGST Field1 is not Displayed.");
//  		        cGSTField1.sendKeys(Keys.ENTER);
//  		        assertTrue(driver.switchTo().activeElement().equals(cGSTField1), "CGST Field1 is not Selected");
//  		        cGSTField1.clear();
//  		        cGSTField1.sendKeys("8");
//  		        
//  		        //Verify the IGST Field1 in General Tab
//  		        assertTrue(iGSTField1.isDisplayed(), "IGST Field1 is not Displayed.");
//  		        iGSTField1.sendKeys(Keys.ENTER);
//  		        assertTrue(driver.switchTo().activeElement().equals(iGSTField1), "IGST Field1 is not Selected");
//  		        iGSTField1.clear();
//  		        iGSTField1.sendKeys("8");
//  		        
//  		        //Verify the UTGST Field1 in General Tab
//  		        assertTrue(uTGSTField1.isDisplayed(), "UTGST Field1 is not Displayed.");
//  		        uTGSTField1.sendKeys(Keys.ENTER);
//  		        assertTrue(driver.switchTo().activeElement().equals(uTGSTField1), "UTGST Field1 is not Selected");
//  		        uTGSTField1.clear();
//  		        uTGSTField1.sendKeys("8");
//  		  		
//  		        
//  		        //Verify and Schedule Date Date Picker1 in General Tab
//  		        assertTrue(requestDateElement1.isDisplayed(), "Schedule Date Date Picker1 is not Displayed.");
//  		         //To extract Value Attribute and use same approach to retrieve
//  				 	    String requestDateElement1Value = (String) js.executeScript(
//  				 			    "return arguments[0].value;", 
//  				 			      requestDateElement1
//  				 			);
//  				 	    System.out.println("Request Date in Items Tab: " + requestDateElement1Value+"\n");
//  				 	    
////  		        requestDateElement1.click();
//  		        
//  		        //requestDatePicker1
////  		        assertTrue(driver.switchTo().activeElement().equals(requestDateElement1), "Schedule Date Picker1 is not Selected");
////  		    	for (int j = 0; j < 30; j++) {
////  		    		requestDateElement1.sendKeys( Keys.ARROW_DOWN);
////  		    	    Thread.sleep(100); // Add a small delay if needed
////  		    	}
////  		    	requestDateElement1.sendKeys( Keys.ARROW_RIGHT);
////  		    	requestDateElement1.sendKeys(Keys.ARROW_RIGHT);
////  		    	requestDateElement1.sendKeys(Keys.ENTER);
//  		    	
//  		    	
//  		 		 //Verify the Remark Field1
//  		        assertTrue(remarkField1.isDisplayed(), "Remark Field1 is not Displayed.");
//  		        js.executeScript("arguments[0].scrollIntoView(true);", remarkField1);
//  		        remarkField1.click();
//  		        assertTrue(driver.switchTo().activeElement().equals(remarkField1), "Remark Field1 is not Selected");
//  		        remarkField1.clear();
//  		        remarkField1.sendKeys("TEST RemarkEdit");
//  		        
//			      
		// ################## PO Details Tab ######################

		// Verify PO Details Tab in Sales Order Create Page
		assertTrue(poDetailsTab.isDisplayed(), "Items Tab is not Displayed.");
		poDetailsTab.click();

//		// Verify the PO Number Text Field
//		assertTrue(poNumberTextField.isDisplayed(), "PO Text Field is not Displayed.");
//		poNumberTextField.sendKeys(Keys.ENTER);
//		assertTrue(driver.switchTo().activeElement().equals(poNumberTextField), "PO Text Field is not Selected");
//		poNumberTextField.clear();
//		poNumberTextField.sendKeys(poNumber);
//
//		// Verify and PO Date Picker in in General Tab
//		assertTrue(poDatePicker.isDisplayed(), "PO Date Picker is not Displayed.");
//		// To extract Value Attribute and use same approach to retrieve
//		String poDatePickerValue = (String) js.executeScript("return arguments[0].value;", poDatePicker);
//		System.out.println("PO Date: " + poDatePickerValue + "\n");
//                poDatePicker.click();
//                assertTrue(driver.switchTo().activeElement().equals(poDatePicker), "PO Date Picker is not Selected");
//            	  for (int j = 0; j < 5; j++) {
//            		poDatePicker.sendKeys(Keys.ARROW_RIGHT);
//            	    Thread.sleep(100); // Add a small delay if needed
//            	   }
//            	poDatePicker.sendKeys(Keys.ARROW_RIGHT);
//            	poDatePicker.sendKeys(Keys.ARROW_RIGHT);
//            	poDatePicker.sendKeys(Keys.ENTER);  

		// Verify and PO Received Date Picker in in General Tab
		assertTrue(poReceivedDatePicker.isDisplayed(), "PO Received Date Picker is not Displayed.");
		// To extract Value Attribute and use same approach to retrieve
		String poReceivedDatePickerValue = (String) js.executeScript("return arguments[0].value;",
				poReceivedDatePicker);
		System.out.println("PO Request Date: " + poReceivedDatePickerValue + "\n");
//              poReceivedDatePicker.click();
//              assertTrue(driver.switchTo().activeElement().equals(poReceivedDatePicker), "PO Received Date Picker is not Selected");
//          		
//              poReceivedDatePicker.sendKeys(Keys.ARROW_UP);
//          	    Thread.sleep(100); // Add a small delay if needed
//          	   
//          	poReceivedDatePicker.sendKeys(Keys.ARROW_RIGHT);
//          	poReceivedDatePicker.sendKeys(Keys.ARROW_RIGHT);
//          	poReceivedDatePicker.sendKeys(Keys.ENTER); 

		// ################## Billing & Shipping Details Tab ######################

		// Verify billing & Shipping Details Tab in Sales Order Create Page
		assertTrue(billing$ShippingDetailsTab.isDisplayed(), "Billing & Shipping Details Tab is not Displayed.");
		billing$ShippingDetailsTab.click();

		// Verify the billTo Drop Down in Sales Order Create Page-Transaction Module
		assertTrue(billToDropDown.isDisplayed(), " billTo Drop Down is not Displayed.");
		billToDropDown.sendKeys(Keys.ENTER);
		assertTrue(driver.switchTo().activeElement().equals(billToDropDown), " billTo Drop Down is not Selected");

		// Verify the Bill To Id Element in Sales Order Create Page-Transaction Module
		assertTrue(billToIdElement.isDisplayed(), " billTo Id Element is not Displayed.");
		String billToIdElementValue = (String) js.executeScript("return arguments[0].value;", billToIdElement);
		System.out.println("Bill To Id : " + billToIdElementValue + "\n");

		// Verify the Ship To Drop Down in Sales Order Create Page-Transaction Module
		assertTrue(shipToDropDown.isDisplayed(), "Ship To Drop Down is not Displayed.");
		shipToDropDown.sendKeys(Keys.ENTER);
		assertTrue(driver.switchTo().activeElement().equals(shipToDropDown), "Ship To Drop Down is not Selected");

		// Verify the Ship To Id Element in Sales Order Create Page-Transaction Module
		assertTrue(shipToIdElement.isDisplayed(), "Ship To Id Element is not Displayed.");
		String shipToIdElementValue = (String) js.executeScript("return arguments[0].value;", shipToIdElement);
		System.out.println("Ship To Id : " + shipToIdElementValue + "\n");

		// Verify the Payment Terms Drop Down in Sales Order Create Page-Transaction
		// Module
		assertTrue(paymentTermsDropDown.isDisplayed(), "Payment Terms Drop Down is not Displayed.");
		String paymentTermsDropDownValue = (String) js.executeScript("return arguments[0].value;",
				paymentTermsDropDown);
		System.out.println("Ship To Id : " + paymentTermsDropDownValue + "\n");
//    		paymentTermsDropDown.sendKeys(Keys.ENTER);
//    	    assertTrue(driver.switchTo().activeElement().equals(paymentTermsDropDown), "Payment Terms Drop Down is not Selected");
//      	    

		// Verify the Remark Text Field
		assertTrue(remarkTextField.isDisplayed(), "Remark Text Field is not Displayed.");
		remarkTextField.sendKeys(Keys.ENTER);
		assertTrue(driver.switchTo().activeElement().equals(remarkTextField), "Remark Text Field is not Selected");
		remarkTextField.clear();
		remarkTextField.sendKeys("TEST Edit Remark Text1");

		// ################## Total Calculation Tab ######################

//      		//Verify and Click on Total Calculation Tab
//      	    assertTrue(totalCalculationTab.isDisplayed(), "Total Calculation Tab is not Displayed.");
//      	    js.executeScript("arguments[0].click();", totalCalculationTab);
//      	    //Scroll To View
//
//      	    //Verify the Total Amount Element1 in Sales Order Create Page-Transaction Module
//      		assertTrue(totalAmountElement1.isDisplayed(), "Total Amount Element1 is not Displayed.");
//      		 String totalAmountElement1Value = (String) js.executeScript(
//		    		    "return arguments[0].value;", 
//		    		    totalAmountElement1
//		    		);
//		     System.out.println("Total Amount in Total Calculation Tab : " + totalAmountElement1Value+"\n");
//            
//      	    
//       		//Verify the Additional Charges Label Name Drop Down in Quote Create Page-Sales Module
//       		assertTrue(additionalChargesLabelNameDropDown.isDisplayed(), "Additional Charges Label Name Drop Down is not Displayed.");
//       		additionalChargesLabelNameDropDown.click();
//       	    assertTrue(driver.switchTo().activeElement().equals(additionalChargesLabelNameDropDown), "Additional Charges Label Name Drop Down is not Selected");
//       	    
//       		//Verify Additional Charges Value Percentage Radio Button in General Tab
//       	    assertTrue(additionalChargesValuePercentageRadioButton.isDisplayed(), "Additional Charges Value Percentage Radio Button is not Displayed.");
//       	    additionalChargesValuePercentageRadioButton.click();
//               
//       		//Verify additionalChargesValue Rupees Radio Button in General Tab
//       	    assertTrue(additionalChargesValueRupeesRadioButton.isDisplayed(), "additionalChargesValue Rupees Radio Button is not Displayed.");
//       	    additionalChargesValueRupeesRadioButton.click();
//               
//               //Verify the additionalChargesValue Field in General Tab
//               assertTrue(additionalChargesValueField.isDisplayed(), "additionalChargesValue Field is not Displayed.");
//               additionalChargesValueField.sendKeys(Keys.ENTER);
//               assertTrue(driver.switchTo().activeElement().equals(additionalChargesValueField), "additionalChargesValue Field is not Selected");
//               additionalChargesValueField.clear();
//               additionalChargesValueField.sendKeys("100");
//         
//               //Verify the IGST Field in General Tab
//               assertTrue(iGSTField.isDisplayed(), "IGST Field is not Displayed.");
//               iGSTField.sendKeys(Keys.ENTER);
//               assertTrue(driver.switchTo().activeElement().equals(iGSTField), "IGST Field is not Selected");
//               iGSTField.clear();
//               iGSTField.sendKeys("8");
//               
//               //Verify the CGST Field in General Tab
//               assertTrue(cGSTField.isDisplayed(), "CGST Field is not Displayed.");
//               cGSTField.sendKeys(Keys.ENTER);
//               assertTrue(driver.switchTo().activeElement().equals(cGSTField), "CGST Field is not Selected");
//               cGSTField.clear();
//               cGSTField.sendKeys("8");
//               
//               //Verify the SGST Field in General Tab
////               WebElement sGSTField = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='Enter SGST']")));
//               boolean sGSTFieldFieldIsDisplayed = sGSTField.isDisplayed();
//               assertTrue(sGSTFieldFieldIsDisplayed, "SGST Field is not Displayed.");
//               sGSTField.sendKeys(Keys.ENTER);
//               WebElement sGSTFieldFocusedElement = driver.switchTo().activeElement();
//               boolean sGSTFieldIsSelected = sGSTFieldFocusedElement.equals(sGSTField);
//               assertTrue(sGSTFieldIsSelected, "SGST Field is not Selected");
//               sGSTField.clear();
//               sGSTField.sendKeys("8");
//               
//               //Verify the UTGST Field in General Tab
////               WebElement uTGSTField = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='Enter UTGST']")));
//               boolean uTGSTFieldFieldIsDisplayed = uTGSTField.isDisplayed();
//               assertTrue(uTGSTFieldFieldIsDisplayed, "UTGST Field is not Displayed.");
//               uTGSTField.sendKeys(Keys.ENTER);
//               WebElement uTGSTFieldFocusedElement = driver.switchTo().activeElement();
//               boolean uTGSTFieldIsSelected = uTGSTFieldFocusedElement.equals(uTGSTField);
//               assertTrue(uTGSTFieldIsSelected, "UTGST Field is not Selected");
//               uTGSTField.clear();
//               uTGSTField.sendKeys("8");
//               
// 		      //Verify and Click on Add Button in Total Calculation Tab
//// 		      WebElement addButtoninTotalCalculationTab = driver.findElement(By.xpath("//button[contains(normalize-space(),'Add')]"));
// 		      boolean addButtoninTotalCalculationTabIsDisplayed = addButtoninTotalCalculationTab.isDisplayed();
// 		      assertTrue(addButtoninTotalCalculationTabIsDisplayed, "Add Button in Total Calculation Tab is not Displayed.");
// 		      addButtoninTotalCalculationTab.click();
// 		      
//	   	    //Verify the Total Additional Charges Element in Sales Order Create Page-Transaction Module
////	 		WebElement totalAdditionalChargesElement = driver.findElement(By.xpath("//input[@placeholder='Enter Total Addtional Charges']"));
//	 		boolean totalAdditionalChargesElementIsDisplayed = totalAdditionalChargesElement.isDisplayed();
//	 		assertTrue(totalAdditionalChargesElementIsDisplayed, "Total Additional Charges Element is not Displayed.");
//	 		String totalAdditionalChargesElementValue = (String) js.executeScript(
//	    		    "return arguments[0].value;", 
//	    		    totalAdditionalChargesElement
//	    		);
//	         System.out.println("Total Additional Charges : " + totalAdditionalChargesElementValue+"\n");
// 		      
//       		//Verify specialDiscount Percentage Radio Button in Total Calculation Tab
////       		WebElement specialDiscountPercentageRadioButton = driver.findElement(By.xpath("//input[@id='specialDiscTotPer']"));
//       	    boolean specialDiscountPercentageRadioButtonIsDisplayed = specialDiscountPercentageRadioButton.isDisplayed();
//       	    assertTrue(specialDiscountPercentageRadioButtonIsDisplayed, "specialDiscount Percentage Radio Button is not Displayed.");
//       	    specialDiscountPercentageRadioButton.click();
//               
//       		//Verify specialDiscount Rupees Radio Button in Total Calculation Tab
////       		WebElement specialDiscountRupeesRadioButton = driver.findElement(By.xpath("//input[@id='specialDiscTotAmt']"));
//       	    boolean specialDiscountRupeesRadioButtonIsDisplayed = specialDiscountRupeesRadioButton.isDisplayed();
//       	    assertTrue(specialDiscountRupeesRadioButtonIsDisplayed, "specialDiscount Rupees Radio Button is not Displayed.");
//       	    specialDiscountRupeesRadioButton.click();
//               
//               //Verify the Special Discount Field in Total Calculation Tab
////               WebElement specialDiscountField = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='Enter Special Discount']")));
//               boolean specialDiscountFieldIsDisplayed = specialDiscountField.isDisplayed();
//               assertTrue(specialDiscountFieldIsDisplayed, "Special Discount Field is not Displayed.");
//               specialDiscountField.sendKeys(Keys.ENTER);
//               WebElement specialDiscountFieldFocusedElement = driver.switchTo().activeElement();
//               boolean specialDiscountFieldIsSelected = specialDiscountFieldFocusedElement.equals(specialDiscountField);
//               assertTrue(specialDiscountFieldIsSelected, "Special Discount Field is not Selected");
//               specialDiscountField.clear();
//               specialDiscountField.sendKeys("20");
//               
//   	    //Verify the Total Final Amount Element in Sales Order Create Page-Transaction Module
//// 		WebElement totalFinalAmountElement = driver.findElement(By.xpath("//input[@placeholder='Enter Total Final Amount']"));
// 		boolean totalFinalAmountElementIsDisplayed = totalFinalAmountElement.isDisplayed();
// 		assertTrue(totalFinalAmountElementIsDisplayed, "Total Final Amount Element is not Displayed.");
// 		 String totalFinalAmountElementValue = (String) js.executeScript(
//	    		    "return arguments[0].value;", 
//	    		    totalFinalAmountElement
//	    		);
//	         System.out.println("Total Final Amount : " + totalFinalAmountElementValue+"\n");
// 		
// 		String socpURl = driver.getCurrentUrl();
// 		System.out.println(socpURl);
// 		
		// Verify and Click on Save Button Of Sales Order Create Page in Add Vendor
//	      WebElement saveButtonOfSalesOrderCreatePage = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(),'Save')]")));
		boolean saveButtonOfSalesOrderCreatePageIsDisplayed = saveButtonOfSalesOrderCreatePage.isDisplayed();
		assertTrue(saveButtonOfSalesOrderCreatePageIsDisplayed,
				"Save Button Of Sales Order Create Page is not Displayed.");
		js.executeScript("arguments[0].scrollIntoView(true);", saveButtonOfSalesOrderCreatePage);
		saveButtonOfSalesOrderCreatePage.click();

		Thread.sleep(5000);

		String sotpURl = driver.getCurrentUrl();
		System.out.println(sotpURl);

		return new HomePage();
	}

}
