package com.getapcs.Keus.Reports;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.getapcs.base.Testbase1;
import com.getapcs.home.login.HomePage;

public class ShopOrder_Reports extends Testbase1 {

	// Material Issue

	@FindBy(xpath = "(//input[@placeholder='DD-MM-YYYY'])[1]")
	WebElement fromDate;

	@FindBy(xpath = "(//input[@placeholder='DD-MM-YYYY'])[2]")
	WebElement toDate;

	@FindBy(xpath = "(//button[normalize-space()='Filter'])[1]")
	WebElement dateFilter;

	@FindBy(xpath = "(//button[normalize-space()='Clear'])[1]")
	WebElement clear;

	@FindBy(xpath = "(//span[contains(text(),'FG Shop Order Number')])[1]")
	WebElement fgShopOrderNum;

	@FindBy(xpath = "(//span[contains(text(),'Total SO Release Qty')])[1]")
	WebElement soReleaseQty;

	@FindBy(xpath = "(//input[@placeholder='Search'])[2]")
	WebElement SearchfgShopOrderNum;

	@FindBy(xpath = "(//input[@placeholder='Search'])[3]")
	WebElement SearchsoReleaseQty;

	@FindBy(xpath = "(//i[@class='mdi mdi-filter edit-icon'])[1]")
	WebElement itemFilter;

	public ShopOrder_Reports() {

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

		driver.navigate().to("https://demo_keus.getapcs.com/transaction/shop-order/table");

		paginate(driver, 1, 4, true);

		paginate(driver, 1, 4, false);
		Thread.sleep(2000);

		// PR Number

		String tableXpath = "//table[@class='table table-striped']";

		String shopOrderNum = driver.findElement(By.xpath(tableXpath + "/tbody/tr[1]/td[2]")).getText();

		String elementXpath = "(//div[normalize-space()='271223SO-000434'])[1]";

		String updatedXpath = elementXpath.replace("271223SO-000434", shopOrderNum);

		System.out.println(updatedXpath);

		String releaseQty = driver.findElement(By.xpath(tableXpath + "/tbody/tr[1]/td[2]")).getText();

		String elementXpath1 = "(//div[normalize-space()='271223SO-000434'])[1]";

		String updatedXpath1 = elementXpath1.replace("271223SO-000434", releaseQty);

		System.out.println(updatedXpath1);

		driver.navigate().to("https://demo_keus.getapcs.com/reports/shop-order-report");

		// FG ShopOrder Number

		click(driver, fgShopOrderNum);

		click(driver, SearchfgShopOrderNum);

		SearchfgShopOrderNum.sendKeys(shopOrderNum);

		WebElement FGShopOrderNumber = driver.findElement(By.xpath(updatedXpath));

		click(driver, FGShopOrderNumber);

		click(driver, itemFilter);
		click(driver, clear);

		// Total Release Qty

		click(driver, soReleaseQty);

		click(driver, SearchsoReleaseQty);

		SearchsoReleaseQty.sendKeys(releaseQty);

		WebElement soReleaseQuantity = driver.findElement(By.xpath(updatedXpath1));

		click(driver, soReleaseQuantity);

		click(driver, itemFilter);
		click(driver, clear);

		// FG ShopOrder Number

		click(driver, fgShopOrderNum);

		click(driver, SearchfgShopOrderNum);

		SearchfgShopOrderNum.sendKeys(shopOrderNum);

		WebElement FGShopOrderNumber1 = driver.findElement(By.xpath(updatedXpath));

		click(driver, FGShopOrderNumber1);

		click(driver, itemFilter);

		// Total Release Qty

		click(driver, soReleaseQty);

		click(driver, SearchsoReleaseQty);

		SearchsoReleaseQty.sendKeys(releaseQty);

		WebElement soReleaseQuantity1 = driver.findElement(By.xpath(updatedXpath1));

		click(driver, soReleaseQuantity1);

		click(driver, itemFilter);

		click(driver, clear);

		return new HomePage();

	}

}
