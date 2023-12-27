package com.getapcs.Keus.Reports;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.getapcs.base.Testbase1;
import com.getapcs.pages.HomePage;

public class PurchaseRequisition_Reports extends Testbase1 {

	// Material Issue

	@FindBy(xpath = "(//input[@placeholder='DD-MM-YYYY'])[1]")
	WebElement fromDate;

	@FindBy(xpath = "(//input[@placeholder='DD-MM-YYYY'])[2]")
	WebElement toDate;

	@FindBy(xpath = "(//button[normalize-space()='Filter'])[1]")
	WebElement dateFilter;

	@FindBy(xpath = "(//button[normalize-space()='Clear'])[1]")
	WebElement clear;

	@FindBy(xpath = "(//span[contains(text(),'Select PR Number')])[1]")
	WebElement purchaseRequisitionNum;

	@FindBy(xpath = "(//span[contains(text(),'Procurement Type')])[1]")
	WebElement procutementType;

	@FindBy(xpath = "(//span[contains(text(),'Shipping Mode')])[1]")
	WebElement shippingMode;

	@FindBy(xpath = "(//span[contains(text(),'PR Status')])[1]")
	WebElement prStatus;

	@FindBy(xpath = "(//input[@placeholder='Search'])[2]")
	WebElement SearchpurchaseRequisitionNum;

	@FindBy(xpath = "(//input[@placeholder='Search'])[3]")
	WebElement SearchprocutementType;

	@FindBy(xpath = "(//input[@placeholder='Search'])[4]")
	WebElement SearchshippingMode;

	@FindBy(xpath = "(//div[normalize-space()='Short Close'])[1]")
	WebElement prStatusSelect;

	@FindBy(xpath = "(//i[@class='mdi mdi-filter edit-icon'])[1]")
	WebElement itemFilter;

	@FindBy(xpath = "(//i[@class='mdi mdi-eye edit-icon'])[1]")
	WebElement viewButton;

	@FindBy(xpath = "(//a[normalize-space()='Billing & Shipping Details'])[1]")
	WebElement binningANDshipping;

	public PurchaseRequisition_Reports() {

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

		driver.navigate().to("https://demo_keus.getapcs.com/transaction/purchase-requisition/table");

		paginate(driver, 1, 4, true);

		paginate(driver, 1, 4, false);
		Thread.sleep(2000);

		// PR Number

		String tableXpath = "//table[@class='table table-striped']";

		String PRNum = driver.findElement(By.xpath(tableXpath + "/tbody/tr[1]/td[2]")).getText();

		String elementXpath = "(//div[normalize-space()='271223SO-000434'])[1]";

		String updatedXpath = elementXpath.replace("271223SO-000434", PRNum);

		System.out.println(updatedXpath);

		// Procutement Type

		click(driver, viewButton);

		String procutementType1 = driver
				.findElement(By.xpath("(//div[@class='form-group main-div']/..//label[@class='field2'])[4]")).getText();

		String elementXpath1 = "(//div[normalize-space()='271223SO-000434'])[1]";

		String updatedXpath1 = elementXpath1.replace("271223SO-000434", procutementType1);

		System.out.println(updatedXpath1);

		// Shipping Mode

		click(driver, binningANDshipping);

		String shippingMode1 = driver
				.findElement(By.xpath("//label[text()='Shipping Mode']/..//label[@class='data_field']")).getText();

		String elementXpath2 = "(//div[normalize-space()='271223SO-000434'])[1]";

		String updatedXpath2 = elementXpath2.replace("271223SO-000434", shippingMode1);

		System.out.println(updatedXpath2);

		driver.navigate().to("https://demo_keus.getapcs.com/reports/purchase-requisition-report");

		// Sales Order Number

		click(driver, purchaseRequisitionNum);

		click(driver, SearchpurchaseRequisitionNum);

		SearchpurchaseRequisitionNum.sendKeys(PRNum);

		WebElement salesOrderNumberSelect = driver.findElement(By.xpath(updatedXpath));

		click(driver, salesOrderNumberSelect);

		click(driver, itemFilter);

		// Project Number

		click(driver, procutementType);

		click(driver, SearchprocutementType);

		SearchprocutementType.sendKeys(procutementType1);

		WebElement projectNumSelect = driver.findElement(By.xpath(updatedXpath1));

		click(driver, projectNumSelect);

		click(driver, itemFilter);

		// Customer Name

		click(driver, shippingMode);

		click(driver, SearchshippingMode);

		SearchshippingMode.sendKeys(shippingMode1);

		WebElement customerNameSelect = driver.findElement(By.xpath(updatedXpath2));

		click(driver, customerNameSelect);

		click(driver, itemFilter);

		// Sales Order Status

		click(driver, prStatus);

		click(driver, prStatusSelect);

		return new HomePage();

	}

}
