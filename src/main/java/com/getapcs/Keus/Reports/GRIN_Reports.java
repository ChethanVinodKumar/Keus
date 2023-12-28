package com.getapcs.Keus.Reports;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.getapcs.base.Testbase1;
import com.getapcs.home.login.HomePage;

public class GRIN_Reports extends Testbase1 {

	// Material Issue

	@FindBy(xpath = "(//input[@placeholder='DD-MM-YYYY'])[1]")
	WebElement fromDate;

	@FindBy(xpath = "(//input[@placeholder='DD-MM-YYYY'])[2]")
	WebElement toDate;

	@FindBy(xpath = "(//button[normalize-space()='Filter'])[1]")
	WebElement dateFilter;

	@FindBy(xpath = "(//button[normalize-space()='Clear'])[1]")
	WebElement clear;

	@FindBy(xpath = "(//span[contains(text(),'Select GRIN Number')])[1]")
	WebElement grinNum;

	@FindBy(xpath = "(//span[contains(text(),'Select Vendor Name')])[1]")
	WebElement venderName;

	@FindBy(xpath = "(//span[contains(text(),'Vendor Id')])[1]")
	WebElement vendorId;

	@FindBy(xpath = "(//span[contains(text(),'Invoice Number')])[1]")
	WebElement invoiceNum;

	@FindBy(xpath = "(//input[@placeholder='Search'])[2]")
	WebElement searchgrinNum;

	@FindBy(xpath = "(//input[@placeholder='Search'])[3]")
	WebElement searchvenderName;

	@FindBy(xpath = "(//input[@placeholder='Search'])[4]")
	WebElement searchvendorId;

	@FindBy(xpath = "(//input[@placeholder='Search'])[5]")
	WebElement searchinvoiceNum;

	@FindBy(xpath = "(//i[@class='mdi mdi-filter edit-icon'])[1]")
	WebElement itemFilter;

	@FindBy(xpath = "(//i[@class='mdi mdi-eye edit-icon'])[1]")
	WebElement viewButton;

	@FindBy(xpath = "(//a[normalize-space()='Billing & Shipping Details'])[1]")
	WebElement binningANDshipping;

	public GRIN_Reports() {

		PageFactory.initElements(driver, this);

	}

	// *************Purchase Reqisition Report Page******************//

	public HomePage GRIN_Reports_Page() throws Exception {

//Date Filter

		click(driver, fromDate);

		selectPreviousDate(driver, fromDate, 10);

		click(driver, toDate);

		datePicker(driver, toDate);

		click(driver, dateFilter);

		Thread.sleep(4000);

		click(driver, clear);

//Purchase Requisition Items Details

		driver.navigate().to("https://demo_keus.getapcs.com/transaction/grin/table");

		paginate(driver, 1, 4, true);

		paginate(driver, 1, 4, false);
		Thread.sleep(2000);

		// GRIN Number

		String tableXpath = "//table[@class='table table-striped']";

		String GRINNum = driver.findElement(By.xpath(tableXpath + "/tbody/tr[1]/td[2]")).getText();

		String elementXpath = "(//div[normalize-space()='271223SO-000434'])[1]";

		String updatedXpath = elementXpath.replace("271223SO-000434", GRINNum);

		System.out.println(updatedXpath);

		// Vender Name

		String venderName1 = driver.findElement(By.xpath(tableXpath + "/tbody/tr[1]/td[3]")).getText();

		String elementXpath1 = "(//div[normalize-space()='271223SO-000434'])[1]";

		String updatedXpath1 = elementXpath1.replace("271223SO-000434", venderName1);

		System.out.println(updatedXpath1);

		// Invoice Number

		String invoiceNumber = driver.findElement(By.xpath(tableXpath + "/tbody/tr[1]/td[4]")).getText();

		String elementXpath2 = "(//div[normalize-space()='271223SO-000434'])[1]";

		String updatedXpath2 = elementXpath2.replace("271223SO-000434", invoiceNumber);

		System.out.println(updatedXpath2);

		driver.navigate().to("https://demo_keus.getapcs.com/reports/grin-report");

		// GRIN Number

		click(driver, grinNum);

		click(driver, searchgrinNum);

		searchgrinNum.sendKeys(GRINNum);

		WebElement grinNumSelect = driver.findElement(By.xpath(updatedXpath));

		click(driver, grinNumSelect);

		click(driver, itemFilter);

		// Vender Name

		click(driver, venderName);

		click(driver, searchvenderName);

		searchvenderName.sendKeys(venderName1);

		WebElement venderNameSelect = driver.findElement(By.xpath(updatedXpath1));

		click(driver, venderNameSelect);

		click(driver, itemFilter);

		// Invoice Number

		click(driver, invoiceNum);

		click(driver, searchinvoiceNum);

		searchinvoiceNum.sendKeys(invoiceNumber);

		WebElement invoiceNumSelect = driver.findElement(By.xpath(updatedXpath2));

		click(driver, invoiceNumSelect);

		click(driver, itemFilter);

		return new HomePage();

	}

}
