package com.getapcs.testcases;

import java.awt.AWTException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.getapcs.Sales.ItemPriceList_CreatePage;
import com.getapcs.Sales.ItemPriceList_EditPage;
import com.getapcs.Sales.QuoteCreatePage;
import com.getapcs.Sales.QuoteEditPage;
import com.getapcs.Sales.RFQ_CreatePage;
import com.getapcs.Sales.RFQ_EditPage;
import com.getapcs.Sales.RFQ_ReleaseCS;
import com.getapcs.base.Testbase1;
import com.getapcs.home.login.HomePage;
import com.getapcs.home.login.LoginPage;

public class SalesModule extends Testbase1 {
	LoginPage loginPage;
	HomePage homePage;
	ItemPriceList_CreatePage priceList_CreatePage;
	ItemPriceList_EditPage priceList_EditPage;

	RFQ_CreatePage rfq_CreatePage;
	RFQ_EditPage rfq_EditPage;
	RFQ_ReleaseCS rfq_ReleaseCS;

	QuoteCreatePage quoteCreatePage;
	QuoteEditPage quoteEditPage;

//	QuoteTablePage quoteTablePage;
	public SalesModule() {
		super();
	}

	@BeforeTest
	public void setUp() throws InterruptedException, AWTException {
		initialization();
		priceList_CreatePage = new ItemPriceList_CreatePage();
		priceList_EditPage = new ItemPriceList_EditPage();

		rfq_CreatePage = new RFQ_CreatePage();
		rfq_EditPage = new RFQ_EditPage();
		rfq_ReleaseCS = new RFQ_ReleaseCS();

		quoteCreatePage = new QuoteCreatePage();
		quoteEditPage = new QuoteEditPage();
//		quoteTablePage = new QuoteTablePage();
		loginPage = new LoginPage();
		homePage = loginPage.login("gopal@mail.com", "gopal321");

	}

	@Test(priority = 1)
	public void verifySalesItemPriceListCreate() throws AWTException, InterruptedException {

		// Purchase Order Create Page
		homePage.clickonTransactionPriceListCreate();
		priceList_CreatePage.ItemPriceListCreate("50", "200", "50", "100", "200", "40");

		Thread.sleep(4000);
		driver.navigate().to("https://demo_keus.getapcs.com/dashboard");
	}

	@Test(priority = 2)
	public void verifySalesItemPriceListEdit() throws AWTException, InterruptedException {

		// Purchase Order Create Page

		priceList_EditPage.ItemPriceListEdit("110", "220", "51", "120", "100", "90");

		Thread.sleep(4000);
		driver.navigate().to("https://demo_keus.getapcs.com/dashboard");
	}

	@Test(priority = 3)
	public void verifySalesRFQCreate() throws Throwable {

		// Purchase Order Create Page

		rfq_CreatePage.RFQCreate("TEST Rfq Number", "10", "TEST Note");

		Thread.sleep(4000);
		driver.navigate().to("https://demo_keus.getapcs.com/dashboard");
	}

	@Test(priority = 4)
	public void verifySalesRFQEdit() throws Throwable {

		// Purchase Order Create Page

		rfq_EditPage.RFQEdit("TEST Rfq Number111", "TEST Remarks", "TEST Reason For Modification", "10",
				"TEST Note111");

		Thread.sleep(4000);
		driver.navigate().to("https://demo_keus.getapcs.com/dashboard");
	}

	@Test(priority = 5)
	public void verifySalesRFQCS() throws Throwable {

		// Purchase Order Create Page
		homePage.clickonSalesRfqModifyorView();
		Thread.sleep(2000);
		rfq_ReleaseCS.RFQCs();

		Thread.sleep(4000);
		// driver.navigate().to("https://demo_keus.getapcs.com/dashboard");
	}

	@Test(priority = 11)
	public void verifyQuoteCreate() throws Throwable {

		// Purchase Order Create Page

		quoteCreatePage.QuoteCreate("TEST Quote Ref", "100", "10", "100", "7", "7", "7", "7", "10", "10", "100", "9",
				"9", "8", "8", "100", "7", "7", "6", "7", "TEST Special Terms");

		Thread.sleep(4000);
		driver.navigate().to("https://demo_keus.getapcs.com/dashboard");
	}

	@Test(priority = 12)
	public void verifyQuoteEdit() throws Throwable {

		// Purchase Order Create Page

		quoteEditPage.QuoteEdit("TEST Quote Ref1", "100", "10", "50", "8", "8", "8", "8", "10", "10", "100", "10", "10",
				"9", "9", "100", "9", "8", "7", "7", "TEST Special Terms1");

		Thread.sleep(4000);
		driver.navigate().to("https://demo-tras.getapcs.com/dashboard");
	}

	@AfterTest
	public void tearDown() {
		// driver.quit();
	}
}
