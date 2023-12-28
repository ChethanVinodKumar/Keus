package com.getapcs.Keus.Reports;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.getapcs.base.Testbase1;
import com.getapcs.home.login.HomePage;

public class IQC_ConfirmationReports extends Testbase1 {

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

	@FindBy(xpath = "//span[contains(text(),'Select GRIN Number')]")
	WebElement grinNumberDropDown;
	@FindBy(xpath = "(//input[@type='text'])[1]")
	WebElement grinNumberDropDownSearch;

	@FindBy(xpath = "//span[contains(text(),'Select Vendor Name')]")
	WebElement venderNameTypeDropDown;
	@FindBy(xpath = "//div[normalize-space()='Test venderName1']")
	WebElement venderNameDropDownSelectData;

	@FindBy(xpath = "//span[contains(text(),'Vendor Id')]")
	WebElement venderIdDropDown;
	@FindBy(xpath = "//div[normalize-space()='VD-000016']")
	WebElement venderIdDropDownSelectData;

	@FindBy(xpath = "//span[contains(text(),'Select Vendor Name')]")
	WebElement selectVenderNameDropDown;
	@FindBy(xpath = "//div[normalize-space()='Test venderName1']")
	WebElement selectVenderNameDropDownSelectData;

	@FindBy(xpath = "//span[contains(text(),'Invoice Number')]")
	WebElement invoiceNumberDropDown;
	@FindBy(xpath = "//div[normalize-space()='Open']")
	WebElement invoiceNumberDropDownSelectData;

	@FindBy(xpath = "//button[@title='Filter data.']")
	WebElement itemLevelFiltterButton;

	public IQC_ConfirmationReports() {

		PageFactory.initElements(driver, this);
	}

	public HomePage iqcConfirmationPage() throws Throwable {

		driver.navigate().to("https://demo_keus.getapcs.com/transaction/iqc-confirmation/table");

//		paginate(driver, 1, 5, true);

		String tableXpath = "//table[@class='table table-striped']";

		String iqcNumber = driver.findElement(By.xpath(tableXpath + "/tbody/tr[1]/td[2]")).getText();

//		String itemNumberFG = driver.findElement(By.xpath(tableXpath + "/tbody/tr[2]/td[2]")).getText();

		driver.navigate().to("https://demo_keus.getapcs.com/reports/iqc-confirmation-report");

		Thread.sleep(2000);

		selectPreviousDate(driver, fromDatePicker, 10);
		datePicker(driver, toDatePicker);
		click(driver, dateFiltterButton);

		click(driver, clearButton);

		click(driver, grinNumberDropDown);
//		poNumberDropDown.sendKeys(poNumber1);
		WebElement iqcNumberClick = driver.findElement(By.xpath("//div[normalize-space()='" + iqcNumber + "']"));
		click(driver, iqcNumberClick);

		click(driver, selectVenderNameDropDown);
		click(driver, selectVenderNameDropDownSelectData);

		click(driver, venderIdDropDown);
		click(driver, venderIdDropDownSelectData);

		click(driver, itemLevelFiltterButton);
		Thread.sleep(2000);
		screenShot("iqcNumberReports");
		Thread.sleep(2000);
		click(driver, clearButton);

		return new HomePage();
	}

}
