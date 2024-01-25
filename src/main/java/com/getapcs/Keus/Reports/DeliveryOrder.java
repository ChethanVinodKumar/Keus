package com.getapcs.Keus.Reports;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.getapcs.base.Testbase1;
import com.getapcs.home.login.HomePage;

public class DeliveryOrder extends Testbase1 {

	// Selivery Order

	@FindBy(xpath = "(//input[@placeholder='DD-MM-YYYY'])[1]")
	WebElement fromDate;

	@FindBy(xpath = "(//input[@placeholder='DD-MM-YYYY'])[2]")
	WebElement toDate;

	@FindBy(xpath = "(//button[normalize-space()='Filter'])[1]")
	WebElement dateFilter;

	@FindBy(xpath = "(//button[normalize-space()='Clear'])[1]")
	WebElement clear;

	@FindBy(xpath = "(//span[contains(text(),'DO Number')])[1]")
	WebElement deliveryOrderNumber;

	@FindBy(xpath = "(//span[contains(text(),'Customer Name')])[1]")
	WebElement customerName1;

	@FindBy(xpath = "(//span[contains(text(),'Customer Alias Name')])[1]")
	WebElement customerAliasName1;

	@FindBy(xpath = "(//span[contains(text(),'Customer Id')])[1]")
	WebElement customerId;

	@FindBy(xpath = "(//span[contains(text(),'Sales Order Number')])[1]")
	WebElement salesOrderNumber;

	@FindBy(xpath = "(//span[contains(text(),'Warehouse')])[1]")
	WebElement warehouse1;

	@FindBy(xpath = "(//span[normalize-space()='Location'])[1]")
	WebElement location1;

	@FindBy(xpath = "(//span[contains(text(),'Product Type')])[1]")
	WebElement productType1;

	@FindBy(xpath = "(//input[@placeholder='Search'])[2]")
	WebElement SearchdeliveryOrderNumber;

	@FindBy(xpath = "(//input[@placeholder='Search'])[3]")
	WebElement SearchcustomerName1;

	@FindBy(xpath = "(//input[@placeholder='Search'])[4]")
	WebElement SearchcustomerAliasName1;

	@FindBy(xpath = "(//input[@placeholder='Search'])[5]")
	WebElement SearchcustomerId;

	@FindBy(xpath = "(//input[@placeholder='Search'])[6]")
	WebElement SearchsalesOrderNumber;

	@FindBy(xpath = "(//input[@placeholder='Search'])[7]")
	WebElement Searchwarehouse;

	@FindBy(xpath = "(//input[@placeholder='Search'])[8]")
	WebElement Searchlocation;

	@FindBy(xpath = "(//input[@placeholder='Search'])[9]")
	WebElement SearchproductType;

	@FindBy(xpath = "(//div[normalize-space()='Short Close'])[1]")
	WebElement prStatusSelect;

	@FindBy(xpath = "(//i[@class='mdi mdi-filter edit-icon'])[1]")
	WebElement itemFilter;

	@FindBy(xpath = "(//i[@class='mdi mdi-eye edit-icon'])[1]")
	WebElement viewButton;

	@FindBy(xpath = "(//button[normalize-space()='Binning'])[1]")
	WebElement binning;

	public DeliveryOrder() {

		PageFactory.initElements(driver, this);

	}

	// *************Purchase Reqisition Report Page******************//

	public HomePage PurchaseRequisition_ReportsPage() throws Exception {

//Date Filter

		click(driver, fromDate);

		selectPreviousDate(driver, fromDate, 10);

		click(driver, toDate);

		datePicker(driver, toDate);

		click(driver, dateFilter);

		Thread.sleep(4000);

		click(driver, clear);

//Purchase Requisition Items Details

		driver.navigate().to("https://demo_keus.getapcs.com/transaction/delivery-order/table");

		paginate(driver, 1, 4, true);

		paginate(driver, 1, 4, false);
		Thread.sleep(2000);

		// PR Number

		String tableXpath = "//table[@class='table table-striped']";

		String doNum = driver.findElement(By.xpath(tableXpath + "/tbody/tr[1]/td[2]")).getText();

		String elementXpath = "(//div[normalize-space()='271223SO-000434'])[1]";

		String updatedXpath = elementXpath.replace("271223SO-000434", doNum);

		System.out.println(updatedXpath);

		String salesOrderNum = driver.findElement(By.xpath(tableXpath + "/tbody/tr[1]/td[2]")).getText();

		String elementXpath1 = "(//div[normalize-space()='271223SO-000434'])[1]";

		String updatedXpath1 = elementXpath1.replace("271223SO-000434", salesOrderNum);

		System.out.println(updatedXpath1);

		String customerName = driver.findElement(By.xpath(tableXpath + "/tbody/tr[1]/td[2]")).getText();

		String elementXpath2 = "(//div[normalize-space()='271223SO-000434'])[1]";

		String updatedXpath2 = elementXpath2.replace("271223SO-000434", customerName);

		System.out.println(updatedXpath2);

		String customerID = driver.findElement(By.xpath(tableXpath + "/tbody/tr[1]/td[2]")).getText();

		String elementXpath3 = "(//div[normalize-space()='271223SO-000434'])[1]";

		String updatedXpath3 = elementXpath3.replace("271223SO-000434", customerID);

		System.out.println(updatedXpath3);

		click(driver, viewButton);
		Thread.sleep(1000);

		String customerAliasName = driver
				.findElement(
						By.xpath("//label[text()='Customer Alias Name']/following-sibling::label[@class='field2']"))
				.getText();

		String elementXpath4 = "(//div[normalize-space()='271223SO-000434'])[1]";

		String updatedXpath4 = elementXpath4.replace("271223SO-000434", customerAliasName);

		System.out.println(updatedXpath4);

		String productType = driver
				.findElement(By.xpath("//label[text()='Product Type']/following-sibling::label[@class='field2']"))
				.getText();

		String elementXpath5 = "(//div[normalize-space()='271223SO-000535'])[1]";

		String updatedXpath5 = elementXpath5.replace("271223SO-000535", productType);

		System.out.println(updatedXpath5);

		// Shipping Mode

		click(driver, binning);

		String tableXpath1 = "//table[@class='table table-striped']";

		String warehouse = driver.findElement(By.xpath(tableXpath1 + "/tbody/tr[1]/td[1]")).getText();

		String elementXpath6 = "(//div[normalize-space()='271223SO-000434'])[1]";

		String updatedXpath6 = elementXpath6.replace("271223SO-000434", warehouse);

		System.out.println(updatedXpath6);

		String location = driver.findElement(By.xpath(tableXpath1 + "/tbody/tr[1]/td[2]")).getText();

		String elementXpath7 = "(//div[normalize-space()='271223SO-000434'])[1]";

		String updatedXpath7 = elementXpath7.replace("271223SO-000434", location);

		System.out.println(updatedXpath7);

		driver.navigate().to("https://demo_keus.getapcs.com/reports/delivery-order-report");

		// DO Number

		click(driver, deliveryOrderNumber);

		click(driver, SearchdeliveryOrderNumber);

		SearchdeliveryOrderNumber.sendKeys(doNum);

		WebElement deliveryOrderNumberSelect = driver.findElement(By.xpath(updatedXpath));

		click(driver, deliveryOrderNumberSelect);

		click(driver, itemFilter);
		click(driver, clear);

		// Customer Name

		click(driver, customerName1);

		click(driver, SearchcustomerName1);

		SearchcustomerName1.sendKeys(customerName);

		WebElement customerName1Select = driver.findElement(By.xpath(updatedXpath2));

		click(driver, customerName1Select);

		click(driver, itemFilter);
		click(driver, clear);

		// Customer Alias Name

		click(driver, customerAliasName1);

		click(driver, SearchcustomerAliasName1);

		SearchcustomerAliasName1.sendKeys(customerAliasName);

		WebElement customerAliasName1Select = driver.findElement(By.xpath(updatedXpath4));

		click(driver, customerAliasName1Select);

		click(driver, itemFilter);
		click(driver, clear);

		// Customer ID

		click(driver, customerId);

		click(driver, SearchcustomerId);

		SearchcustomerId.sendKeys(customerID);

		WebElement customerIdSelect1 = driver.findElement(By.xpath(updatedXpath3));

		click(driver, customerIdSelect1);

		click(driver, itemFilter);
		click(driver, clear);

		// Sales Order Number

		click(driver, salesOrderNumber);

		click(driver, SearchsalesOrderNumber);

		SearchsalesOrderNumber.sendKeys(salesOrderNum);

		WebElement salesOrderNumberSelect1 = driver.findElement(By.xpath(updatedXpath2));

		click(driver, salesOrderNumberSelect1);

		click(driver, itemFilter);
		click(driver, clear);

		// Warehouse

		click(driver, warehouse1);

		click(driver, Searchwarehouse);

		Searchwarehouse.sendKeys(warehouse);

		WebElement warehouseSelect1 = driver.findElement(By.xpath(updatedXpath6));

		click(driver, warehouseSelect1);

		click(driver, itemFilter);
		click(driver, clear);

		// Location

		click(driver, location1);

		click(driver, Searchlocation);

		Searchlocation.sendKeys(location);

		WebElement locationSelect1 = driver.findElement(By.xpath(updatedXpath7));

		click(driver, locationSelect1);

		click(driver, itemFilter);
		click(driver, clear);

		// Sales Order Status

		click(driver, productType1);

		click(driver, SearchproductType);

		SearchproductType.sendKeys(productType);

		WebElement productTypeSelect1 = driver.findElement(By.xpath(updatedXpath5));

		click(driver, productTypeSelect1);

		click(driver, itemFilter);
		click(driver, clear);

		// DO Number

		click(driver, deliveryOrderNumber);

		click(driver, SearchdeliveryOrderNumber);

		SearchdeliveryOrderNumber.sendKeys(doNum);

		WebElement deliveryOrderNumberSelect1 = driver.findElement(By.xpath(updatedXpath));

		click(driver, deliveryOrderNumberSelect1);

		click(driver, itemFilter);

		// Customer Name

		click(driver, customerName1);

		click(driver, SearchcustomerName1);

		SearchcustomerName1.sendKeys(customerName);

		WebElement customerName1Select1 = driver.findElement(By.xpath(updatedXpath2));

		click(driver, customerName1Select1);

		click(driver, itemFilter);

		// Customer Alias Name

		click(driver, customerAliasName1);

		click(driver, SearchcustomerAliasName1);

		SearchcustomerAliasName1.sendKeys(customerAliasName);

		WebElement customerAliasName1Select1 = driver.findElement(By.xpath(updatedXpath4));

		click(driver, customerAliasName1Select1);

		click(driver, itemFilter);

		// Customer ID

		click(driver, customerId);

		click(driver, SearchcustomerId);

		SearchcustomerId.sendKeys(customerID);

		WebElement customerIdSelect11 = driver.findElement(By.xpath(updatedXpath3));

		click(driver, customerIdSelect11);

		click(driver, itemFilter);

		// Sales Order Number

		click(driver, salesOrderNumber);

		click(driver, SearchsalesOrderNumber);

		SearchsalesOrderNumber.sendKeys(salesOrderNum);

		WebElement salesOrderNumberSelect11 = driver.findElement(By.xpath(updatedXpath2));

		click(driver, salesOrderNumberSelect11);

		click(driver, itemFilter);

		// Warehouse

		click(driver, warehouse1);

		click(driver, Searchwarehouse);

		Searchwarehouse.sendKeys(warehouse);

		WebElement warehouseSelect11 = driver.findElement(By.xpath(updatedXpath6));

		click(driver, warehouseSelect11);

		click(driver, itemFilter);

		// Location

		click(driver, location1);

		click(driver, Searchlocation);

		Searchlocation.sendKeys(location);

		WebElement locationSelect11 = driver.findElement(By.xpath(updatedXpath7));

		click(driver, locationSelect11);

		click(driver, itemFilter);

		// Sales Order Status

		click(driver, productType1);

		click(driver, SearchproductType);

		SearchproductType.sendKeys(productType);

		WebElement productTypeSelect11 = driver.findElement(By.xpath(updatedXpath5));

		click(driver, productTypeSelect11);

		click(driver, itemFilter);
		click(driver, clear);

		return new HomePage();

	}

}
