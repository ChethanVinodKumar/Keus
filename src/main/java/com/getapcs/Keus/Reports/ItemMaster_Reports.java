package com.getapcs.Keus.Reports;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.getapcs.base.Testbase1;
import com.getapcs.pages.HomePage;

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

	@FindBy(xpath = "//ng-multiselect-dropdown[@formcontrolname='itemType']")
	WebElement itemTypeDropDown;

	@FindBy(xpath = "(//input[@type='checkbox' and @aria-label='PurchasePart'])[1]")
	WebElement purchasePartCheckBox;

	@FindBy(xpath = "(//input[@type='checkbox' and @aria-label='FG'])[1]")
	WebElement fgCheckBox;

	@FindBy(xpath = "(//input[@type='checkbox' and @aria-label='SA'])[1]")
	WebElement saCheckBox;

	@FindBy(xpath = "//ng-multiselect-dropdown[@formcontrolname='itemNumber']")
	WebElement itemNumberDropDown;

	@FindBy(xpath = "//ng-multiselect-dropdown[@formcontrolname='commodityType']")
	WebElement commodityTypeDropDown;

	@FindBy(xpath = "//ng-multiselect-dropdown[@formcontrolname='materialTypeName']")
	WebElement materialTypeNameDropDown;

	@FindBy(xpath = "//ng-multiselect-dropdown[@formcontrolname='purchaseGroupName']")
	WebElement purchaseGroupNameDropDown;

	@FindBy(xpath = "//ng-multiselect-dropdown[@formcontrolname='departmentName']")
	WebElement departmentNameDropDown;

	@FindBy(xpath = "(//button[normalize-space()='Return DO'])[1]")
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

//		datePicker(driver, fromDatePicker);
//
//		for (int i = 1; i <= 2; i++) {
//			datePicker(driver, toDatePicker);
//		}

//		click(driver, dateFiltterButton);

//		click(driver, clearButton);

		click(driver, itemTypeDropDown);
		isSelected(driver, itemTypeDropDown, "itemTypeDropDown");
		click(driver, purchasePartCheckBox);
//		click(driver, fgCheckBox);
//		click(driver, saCheckBox);

		click(driver, itemNumberDropDown);
		isSelected(driver, itemNumberDropDown, "itemNumberDropDown");

		click(driver, itemLevelFiltterButton);

		return new HomePage();
	}

}
