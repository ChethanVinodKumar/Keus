package com.getapcs.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.getapcs.Keus.Reports.PurchaseRequisition_Reports;
import com.getapcs.Keus.Reports.SalesOrder_Reports;
import com.getapcs.base.Testbase1;
import com.getapcs.pages.HomePage;
import com.getapcs.pages.LoginPage;

public class TEST_Reports extends Testbase1 {

	LoginPage loginPage;
	HomePage homePage;
	SalesOrder_Reports SalesOrder_Reports;
	PurchaseRequisition_Reports PurchaseRequisition_Reports;

	public TEST_Reports() {
		super();
	}

	@BeforeTest
	public void setUp() throws Throwable {
		initialization();
		loginPage = new LoginPage();
		homePage = loginPage.login("admin@mail.com", "user@123");

		SalesOrder_Reports = new SalesOrder_Reports();
		PurchaseRequisition_Reports = new PurchaseRequisition_Reports();

	}

//	@Test(priority = 1)
//	public void verifySalesOrderReports() throws Exception {
//		homePage.clickOnSalesOrderReport();
//		SalesOrder_Reports.SalesOrder_ReportsPage();
//		driver.navigate().to("https://demo_keus.getapcs.com/dashboard");
//	}

	@Test(priority = 3)
	public void verifyPurchaseReqisitionReports() throws Exception {
		homePage.clickOnPurchaseReqisitionReport();
		PurchaseRequisition_Reports.PurchaseRequisition_ReportsPage();
		Thread.sleep(4000);
		driver.navigate().to("https://demo_keus.getapcs.com/dashboard");
	}

}
