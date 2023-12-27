package com.getapcs.Keus.Reports;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.getapcs.base.Testbase1;
import com.getapcs.home.login.HomePage;

public class SalesOrder_Reports extends Testbase1 {

	// Material Issue

	@FindBy(xpath = "(//input[@placeholder='DD-MM-YYYY'])[1]")
	WebElement fromDate;

	@FindBy(xpath = "(//input[@placeholder='DD-MM-YYYY'])[2]")
	WebElement toDate;

	@FindBy(xpath = "(//button[normalize-space()='Filter'])[1]")
	WebElement dateFilter;

	@FindBy(xpath = "(//button[normalize-space()='Clear'])[1]")
	WebElement clear;

	@FindBy(xpath = "(//span[@class='dropdown-btn'])[1]")
	WebElement salesOrderNum;

	@FindBy(xpath = "(//span[@class='dropdown-btn'])[2]")
	WebElement projectNum;

	@FindBy(xpath = "(//span[@class='dropdown-btn'])[3]")
	WebElement customerName;

	@FindBy(xpath = "(//span[@class='dropdown-btn'])[4]")
	WebElement salesOrderStatus;

	@FindBy(xpath = "(//input[@placeholder='Search'])[2]")
	WebElement SearchsalesOrderNum;

	@FindBy(xpath = "(//input[@placeholder='Search'])[3]")
	WebElement SearchprojectNum;

	@FindBy(xpath = "(//input[@placeholder='Search'])[4]")
	WebElement SearchcustomerName;

	@FindBy(xpath = "(//div[normalize-space()='Short Close'])[1]")
	WebElement salesOrderStatusSelect;

	@FindBy(xpath = "(//i[@class='mdi mdi-filter edit-icon'])[1]")
	WebElement itemFilter;

	public SalesOrder_Reports() {

		PageFactory.initElements(driver, this);

	}

	// *************Sales Order Report Page******************//

	public HomePage SalesOrder_ReportsPage() throws Exception {

//Date Filter

		datePicker(driver, fromDate);

		datePicker(driver, toDate);

		click(driver, dateFilter);

		Thread.sleep(4000);

		click(driver, clear);

//SalesOrder Items Details

		driver.navigate().to("https://demo_keus.getapcs.com/transaction/sales-order/table");

		paginate(driver, 1, 5, true);

		paginate(driver, 1, 5, false);

		String tableXpath = "//table[@class='table table-striped']";

		// Sales Order Number

		String salesOrderNumber = driver.findElement(By.xpath(tableXpath + "/tbody/tr[1]/td[2]")).getText();

		String elementXpath = "(//span[normalize-space()='Item-FG-11-TEST'])[1]";

		String updatedXpath = elementXpath.replace("Item-FG-11-TEST", salesOrderNumber);

		System.out.println(updatedXpath);

		// Project Number

		String projectNumber = driver.findElement(By.xpath(tableXpath + "/tbody/tr[1]/td[4]")).getText();

		String elementXpath1 = "(//span[normalize-space()='Item-FG-11-TEST'])[1]";

		String updatedXpath1 = elementXpath1.replace("Item-FG-11-TEST", projectNumber);

		System.out.println(updatedXpath1);

		// Customer Name

		String customerName1 = driver.findElement(By.xpath(tableXpath + "/tbody/tr[1]/td[7]")).getText();

		String elementXpath2 = "(//span[normalize-space()='Item-FG-11-TEST'])[1]";

		String updatedXpath2 = elementXpath2.replace("Item-FG-11-TEST", customerName1);

		System.out.println(updatedXpath2);

		driver.navigate().to("https://demo_keus.getapcs.com/reports/sales-order-report");

		// Sales Order Number

		click(driver, salesOrderNum);

		isSelected(driver, salesOrderNum, "salesOrderNum");

		click(driver, SearchsalesOrderNum);

		SearchsalesOrderNum.sendKeys(salesOrderNumber);

		WebElement salesOrderNumberSelect = driver.findElement(By.xpath(updatedXpath));

		click(driver, salesOrderNumberSelect);

		click(driver, itemFilter);

		// Project Number

		click(driver, projectNum);

		isSelected(driver, projectNum, "projectNum");

		click(driver, SearchprojectNum);

		SearchprojectNum.sendKeys(projectNumber);

		WebElement projectNumSelect = driver.findElement(By.xpath(updatedXpath1));

		click(driver, projectNumSelect);

		click(driver, itemFilter);

		// Customer Name

		click(driver, customerName);

		isSelected(driver, customerName, "customerName");

		click(driver, SearchcustomerName);

		SearchcustomerName.sendKeys(customerName1);

		WebElement customerNameSelect = driver.findElement(By.xpath(updatedXpath2));

		click(driver, customerNameSelect);

		click(driver, itemFilter);

		// Sales Order Status

		click(driver, salesOrderStatus);

		click(driver, salesOrderStatusSelect);

		return new HomePage();

	}

}
