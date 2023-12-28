package com.getapcs.Keus.Reports;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.getapcs.base.Testbase1;
import com.getapcs.home.login.HomePage;

public class PO_Reports extends Testbase1 {

	@FindBy(xpath = "(//input[@name='version'])[1]")
	WebElement latestVersionRadioButton;

	@FindBy(xpath = "(//input[@name='version'])[2]")
	WebElement allVersionRadioButton;

	@FindBy(xpath = "//input[@formcontrolname='fromDate']")
	WebElement fromDatePicker;

	@FindBy(xpath = "//input[@formcontrolname='toDate']")
	WebElement toDatePicker;

	@FindBy(xpath = "//button[normalize-space()='Filter']")
	WebElement dateFiltterButton;

	@FindBy(xpath = "//button[normalize-space()='Clear']")
	WebElement clearButton;

	@FindBy(xpath = "(//input[@placeholder='Search'])[1]")
	WebElement searchBar;

	@FindBy(xpath = "//i[@class='mdi mdi-magnify search_icon']")
	WebElement searchButton;

	@FindBy(xpath = "//span[contains(text(),'Select PO Number')]")
	WebElement poNumberDropDown;

	@FindBy(xpath = "(//input[@placeholder='Search'])[2]")
	WebElement poNumberDropDownSearch;

	@FindBy(xpath = "//span[contains(text(),'Procurement Type')]")
	WebElement procurementTypeDropDown;
	@FindBy(xpath = "(//div[contains(text(),'TEST Procutement')])[1]")
	WebElement procurementTypeDropDownSelectData;

	@FindBy(xpath = "//span[contains(text(),'Shipping Mode')]")
	WebElement shippingModeDropDown;
	@FindBy(xpath = "//div[normalize-space()='By Air']")
	WebElement shippingModeDropDownSelectData;

	@FindBy(xpath = "//span[contains(text(),'Select Vendor Name')]")
	WebElement selectVenderNameDropDown;
	@FindBy(xpath = "//div[normalize-space()='Test venderName1']")
	WebElement selectVenderNameDropDownSelectData;

	@FindBy(xpath = "//span[contains(text(),'PO Status')]")
	WebElement poStatusDropDown;
	@FindBy(xpath = "//div[normalize-space()='Open']")
	WebElement poStatusDropDownSelectData;

	@FindBy(xpath = "//button[@title='Filter data.']")
	WebElement itemLevelFiltterButton;

	public PO_Reports() {

		PageFactory.initElements(driver, this);
	}

	public HomePage poReportPage() throws Throwable {

//		driver.navigate().to("https://demo_keus.getapcs.com/transaction/purchase-order/table");
//
////		paginate(driver, 1, 5, true);
//
//		String tableXpath = "//table[@class='table table-striped']";
//
//		String poNumber = driver.findElement(By.xpath(tableXpath + "/tbody/tr[1]/td[2]")).getText();
//
////		String itemNumberFG = driver.findElement(By.xpath(tableXpath + "/tbody/tr[2]/td[2]")).getText();
//
//		driver.navigate().to("https://demo_keus.getapcs.com/reports/purchase-order-report");

		selectPreviousDate(driver, fromDatePicker, 10);
		datePicker(driver, toDatePicker);
		click(driver, dateFiltterButton);

		click(driver, clearButton);

//		String poNumber = "//div[normalize-space()='261223PO-00170']";
		String poNumber1 = "261223PO-00170";

		click(driver, poNumberDropDown);
//		poNumberDropDown.sendKeys(poNumber1);
		WebElement poNumberClick = driver.findElement(By.xpath("//div[normalize-space()='" + poNumber1 + "']"));
		click(driver, poNumberClick);

		click(driver, itemLevelFiltterButton);
		Thread.sleep(2000);
		screenShot("poNumberReports");
		Thread.sleep(2000);

		return new HomePage();
	}

}
