package com.getapcs.Transaction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.getapcs.base.Testbase1;
import com.getapcs.pages.HomePage;

public class DeliveryOrder extends Testbase1 {

	// Delivery Order

	@FindBy(xpath = "(//input[@type='text'])[1]")
	WebElement customerNameDropDown;

	@FindBy(xpath = "(//span[normalize-space()='0003 - Test comName'])[1]")
	WebElement customerNameDropDownSelect;

	@FindBy(xpath = "(//input[@type='text'])[4]")
	WebElement salesOrderNum;

	@FindBy(xpath = "//label[text()='Customer Id']/..//input[@formcontrolname='customerLeadId']")
	WebElement customerId;

	@FindBy(xpath = "//label[text()='Customer Alias Name']/..//input[@formcontrolname='customerAliasName']")
	WebElement customerAliasName;

	@FindBy(xpath = "//label[text()='Sales order Rev no']/..//input[@formcontrolname='salesOrderRevNo']")
	WebElement salesOrderRevNo;

	@FindBy(xpath = "//label[text()='PO Number']/..//input[@formcontrolname='poNumber']")
	WebElement poNumber;

	@FindBy(xpath = "//label[text()='Prouct Type']/..//input[@formcontrolname='productType']")
	WebElement productType;

	@FindBy(xpath = "//label[text()='Type Of Solution']/..//input[@formcontrolname='typeOfSolution']")
	WebElement typeOfSolution;

	@FindBy(xpath = "//label[text()='DO Date']/..//input[@formcontrolname='doDate']")
	WebElement doDate;

	@FindBy(xpath = "//label[text()='Order Type']/..//input[@formcontrolname='orderType']")
	WebElement orderType;

	@FindBy(xpath = "//label[text()='SO Value']/..//input[@formcontrolname='soValue']")
	WebElement soValue;

	@FindBy(xpath = "//label[text()='Advance Value']/..//input[@formcontrolname='advanceValue']")
	WebElement advanceValue;

	@FindBy(xpath = "//label[text()='Already Dispatched Value']/..//input[@class=\"form-control ng-untouched ng-pristine ng-valid\"]")
	WebElement alreadyDispatchedValue;

	@FindBy(xpath = "//label[text()='Balance Advance Value']/..//input[@placeholder='Balance Advance Value']")
	WebElement balanceAdvanceValue;

	@FindBy(xpath = "//label[text()='Dispatch Value']/..//input[@formcontrolname='totalValue']")
	WebElement dispatchValue;

	@FindBy(xpath = "(//input[@placeholder='Enter Issued To'])[1]")
	WebElement issuedTo;

	@FindBy(xpath = "//table[@formarrayname='ItemData']/tbody/tr[1]/td[11]//input[@type='text']")
	WebElement dispatchQty;

	@FindBy(xpath = "//table[@formarrayname='ItemData']/tbody/tr[1]/td[7]")
	WebElement orderBalanceQty;

	@FindBy(xpath = "//table[@formarrayname='ItemData']/tbody/tr[1]/td[8]")
	WebElement availableStock;

	@FindBy(xpath = "//table[@formarrayname='ItemData']/tbody/tr[1]/td[6]")
	WebElement fgOrderQty;

	@FindBy(xpath = "(//button[normalize-space()='Binning'])[1]")
	WebElement binning;

	@FindBy(xpath = "(//input[@type='text'])[18]")
	WebElement warehouse;

	@FindBy(xpath = "(//span[normalize-space()='HYD-BH-RD5'])[1]")
	WebElement warehouseSelect;

	@FindBy(xpath = "(//input[@type='text'])[19]")
	WebElement location;

	@FindBy(xpath = "(//span[normalize-space()='room no1'])[1]")
	WebElement locationSelect;

	@FindBy(xpath = "(//input[@formcontrolname='availableQty'])[1]")
	WebElement auailableQty;

	@FindBy(xpath = "(//input[@formcontrolname='qty'])[1]")
	WebElement quantity;

	@FindBy(xpath = "(//button[normalize-space()='Add'])[1]")
	WebElement add;

	@FindBy(xpath = "(//button[@type='submit'][normalize-space()='Save'])[1]")
	WebElement save;

	@FindBy(xpath = "(//button[normalize-space()='Save'])[1]")
	WebElement saveButton;

	@FindBy(xpath = "(//textarea[@placeholder='Enter Remarks'])[1]")
	WebElement remarks;

	@FindBy(xpath = "(//button[normalize-space()='Yes'])[1]")
	WebElement yesButton;

	public DeliveryOrder() {

		PageFactory.initElements(driver, this);
	}

//*************Shop Order Create Page******************

	public HomePage DeliveryOrderCreate(String DispatchQuantity, String Quantity) throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("//*************Delivery Order Create Page******************");
		driver.navigate().to("https://demo_keus.getapcs.com/transaction/sales-order/table");

		String tableXpath = "//table[@class='table table-striped']";

		// Get the first PR number text from table
		String salesOrderNumber = driver.findElement(By.xpath(tableXpath + "/tbody/tr[1]/td[2]")).getText();

		// Store the element with hard coded PR number
		String elementXpath = "(//span[normalize-space()='Item-FG-11-TEST'])[1]";

		String updatedXpath = elementXpath.replace("Item-FG-11-TEST", salesOrderNumber);

		System.out.println(updatedXpath);

		driver.navigate().to("https://demo_keus.getapcs.com/transaction/delivery-order/create");

// Customer Name

		click(driver, customerNameDropDown);

		isSelected(driver, customerNameDropDown, "customerNameDropDown");

		click(driver, customerNameDropDownSelect);

//sales Order Number

		click(driver, salesOrderNum);

		isSelected(driver, salesOrderNum, "shopOrderNum");

		WebElement salesOrderNumSelect = driver.findElement(By.xpath(updatedXpath));

		click(driver, salesOrderNumSelect);
		Thread.sleep(2000);

//customerId

		dataPrintFromInputtag(driver, customerId, "customerId");

//customerAliasName

		dataPrintFromInputtag(driver, customerAliasName, "customerAliasName");

//shopOrderRevNo

		dataPrintFromInputtag(driver, salesOrderRevNo, "salesOrderRevNo");

//poNumber

		dataPrintFromInputtag(driver, poNumber, "poNumber");

//prouctType

		dataPrintFromInputtag(driver, productType, "productType");

//typeOfSolution

		dataPrintFromInputtag(driver, typeOfSolution, "typeOfSolution");

//doDate

		dataPrintFromInputtag(driver, doDate, "doDate");

//orderType

		dataPrintFromInputtag(driver, orderType, "orderType");

//soValue

		dataPrintFromInputtag(driver, soValue, "soValue");

//advanceValue

		dataPrintFromInputtag(driver, advanceValue, "advanceValue");

//alreadyDispatchedValue

		dataPrintFromInputtag(driver, alreadyDispatchedValue, "alreadyDispatchedValue");

//balanceAdvanceValue

		dataPrintFromInputtag(driver, balanceAdvanceValue, "balanceAdvanceValue");

//dispatchValue

		dataPrintFromInputtag(driver, dispatchValue, "dispatchValue");

//orderBalanceQty

		dataPrint(driver, orderBalanceQty, "orderBalanceQty");

//availableStock

		dataPrint(driver, availableStock, "availableStock");

//fgOrderQty

		dataPrint(driver, fgOrderQty, "fgOrderQty");

//Issued to 

		click(driver, issuedTo);

		isSelected(driver, issuedTo, "issuedTo");

		issuedTo.sendKeys("TEST Issued To");

//Dispatch Quantity

		click(driver, dispatchQty);
		dispatchQty.clear();
		dispatchQty.sendKeys(DispatchQuantity);

//Binning 

		click(driver, binning);

		click(driver, warehouse);

		isSelected(driver, warehouse, "warehouse");

		click(driver, warehouseSelect);

		click(driver, location);

		isSelected(driver, location, "location");

		click(driver, locationSelect);

		click(driver, quantity);

		quantity.sendKeys(Quantity);

		click(driver, add);
		click(driver, save);
		click(driver, saveButton);

		click(driver, remarks);
		remarks.sendKeys("TEST Remarks");

		click(driver, yesButton);

		return new HomePage();
	}

}
