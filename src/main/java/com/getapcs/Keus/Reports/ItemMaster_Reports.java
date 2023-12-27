package com.getapcs.Keus.Reports;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.getapcs.base.Testbase1;
import com.getapcs.home.login.HomePage;

public class ItemMaster_Reports extends Testbase1 {

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

	@FindBy(xpath = "//span[contains(text(),'Select Item Type')]")
	WebElement itemTypeDropDown;

	@FindBy(xpath = "//div[normalize-space()='PurchasePart']")
	WebElement purchasePartCheckBox;

	@FindBy(xpath = "//div[normalize-space()='FG']")
	WebElement fgCheckBox;

	@FindBy(xpath = "//div[normalize-space()='SA']")
	WebElement saCheckBox;

	@FindBy(xpath = "//span[contains(text(),'Select Item Number')]")
	WebElement itemNumberDropDown;

	@FindBy(xpath = "(//input[@placeholder='Search'])[3]")
	WebElement itemNumberDropDownSearch;

	@FindBy(xpath = "//span[contains(text(),'Select Commodity')]")
	WebElement commodityTypeDropDown;

	@FindBy(xpath = "//ng-multiselect-dropdown[@formcontrolname='materialTypeName']")
	WebElement materialTypeNameDropDown;

	@FindBy(xpath = "//ng-multiselect-dropdown[@formcontrolname='purchaseGroupName']")
	WebElement purchaseGroupNameDropDown;

	@FindBy(xpath = "//ng-multiselect-dropdown[@formcontrolname='departmentName']")
	WebElement departmentNameDropDown;

	@FindBy(xpath = "//button[@title='Filter data.']")
	WebElement itemLevelFiltterButton;

//	@FindBy(xpath = "(//input[@type='checkbox' and @aria-label='SA'])[1]")
//	WebElement saCheckBox1;
//
//	@FindBy(xpath = "(//button[normalize-space()='Return DO'])[1]")
//	WebElement returnDo1;
//
//	@FindBy(xpath = "(//button[normalize-space()='Return DO'])[1]")
//	WebElement returnDo1;
//
//	@FindBy(xpath = "(//button[normalize-space()='Return DO'])[1]")
//	WebElement returnDo1;
//
//	@FindBy(xpath = "(//button[normalize-space()='Return DO'])[1]")
//	WebElement returnDo1;
//
//	@FindBy(xpath = "(//button[normalize-space()='Return DO'])[1]")
//	WebElement returnDo1;
//
//	@FindBy(xpath = "(//button[normalize-space()='Return DO'])[1]")
//	WebElement returnDo1;
//
//	@FindBy(xpath = "(//button[normalize-space()='Return DO'])[1]")
//	WebElement returnDo1;
//
//	@FindBy(xpath = "(//button[normalize-space()='Return DO'])[1]")
//	WebElement returnDo1;
//
//	@FindBy(xpath = "(//button[normalize-space()='Return DO'])[1]")
//	WebElement returnDo1;
//
//	@FindBy(xpath = "(//button[normalize-space()='Return DO'])[1]")
//	WebElement returnDo1;
//
//	@FindBy(xpath = "(//button[normalize-space()='Return DO'])[1]")
//	WebElement returnDo1;
//
//	@FindBy(xpath = "(//button[normalize-space()='Return DO'])[1]")
//	WebElement returnDo1;

	public ItemMaster_Reports() {

		PageFactory.initElements(driver, this);
	}

	public HomePage itemMasterReport() throws Throwable {

		driver.navigate().to("https://demo_keus.getapcs.com/engineering/item-master/table");

//		paginate(driver, 1, 5, true);

		String tableXpath = "//table[@class='table table-striped']";

		String itemNumberPP = driver.findElement(By.xpath(tableXpath + "/tbody/tr[1]/td[2]")).getText();

		String itemNumberFG = driver.findElement(By.xpath(tableXpath + "/tbody/tr[2]/td[2]")).getText();

		driver.navigate().to("https://demo_keus.getapcs.com/reports/item-master-report");

//		datePicker(driver, fromDatePicker);
//
//		for (int i = 1; i <= 2; i++) {
//			datePicker(driver, toDatePicker);
//		}

//		click(driver, dateFiltterButton);

//		click(driver, clearButton);

		click(driver, itemTypeDropDown);
		click(driver, purchasePartCheckBox);
//		click(driver, saCheckBox);

		// PP Filter
		click(driver, itemNumberDropDown);
		itemNumberDropDownSearch.sendKeys(itemNumberPP);
		WebElement itemNoforPP = driver.findElement(By.xpath("//div[normalize-space()='" + itemNumberPP + "']"));
		click(driver, itemNoforPP);

		click(driver, itemLevelFiltterButton);
		Thread.sleep(2000);
		screenShot("ItemMasterReportsPP");
		Thread.sleep(2000);

		click(driver, clearButton);

		click(driver, itemTypeDropDown);
		click(driver, fgCheckBox);

		// FG Filter
		click(driver, itemNumberDropDown);
		itemNumberDropDownSearch.sendKeys(itemNumberFG);
		WebElement itemNoforFG = driver.findElement(By.xpath("//div[normalize-space()='" + itemNumberFG + "']"));
		click(driver, itemNoforFG);

		click(driver, itemLevelFiltterButton);
		Thread.sleep(2000);
		screenShot("ItemMasterReportsFG");
		Thread.sleep(2000);

		return new HomePage();
	}

}
