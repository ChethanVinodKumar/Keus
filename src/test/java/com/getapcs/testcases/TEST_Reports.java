package com.getapcs.testcases;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.getapcs.Keus.Reports.IQC_ConfirmationReports;
import com.getapcs.Keus.Reports.ItemMaster_Reports;
import com.getapcs.Keus.Reports.PO_Reports;
import com.getapcs.Keus.Reports.PurchaseRequisition_Reports;
import com.getapcs.Keus.Reports.SalesOrder_Reports;
import com.getapcs.base.Testbase1;
import com.getapcs.home.login.HomePage;
import com.getapcs.home.login.LoginPage;

public class TEST_Reports extends Testbase1 {

	LoginPage loginPage;
	HomePage homePage;
	SalesOrder_Reports SalesOrder_Reports;
	PurchaseRequisition_Reports PurchaseRequisition_Reports;
	ItemMaster_Reports itemMasterReports;
	PO_Reports poReports;
	IQC_ConfirmationReports iqcConfirmationReports;

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
		itemMasterReports = new ItemMaster_Reports();
		poReports = new PO_Reports();
		iqcConfirmationReports = new IQC_ConfirmationReports();

	}

//	@Test(priority = 1)
//	public void verifyItemMasterReport() throws Throwable {
//		homePage.clickOnItemMasterReports();
//		itemMasterReports.itemMasterReport();
//		Thread.sleep(3000);
//		driver.navigate().to("https://demo_keus.getapcs.com/dashboard");
//	}

//	@Test(priority = 2)
//	public void verifySalesOrderReports() throws Exception {
//		homePage.clickOnSalesOrderReport();
//		SalesOrder_Reports.SalesOrder_ReportsPage();
//		Thread.sleep(4000);
//		driver.navigate().to("https://demo_keus.getapcs.com/dashboard");
//	}
//
//	@Test(priority = 3)
//	public void verifyPurchaseReqisitionReports() throws Exception {
//		homePage.clickOnPurchaseReqisitionReport();
//		PurchaseRequisition_Reports.PurchaseRequisition_ReportsPage();
//		Thread.sleep(4000);
//		driver.navigate().to("https://demo_keus.getapcs.com/dashboard");
//	}

//	@Test(priority = 4)
//	public void verifyPurchaseOrderReports() throws Throwable {
//		homePage.clickOnPurchaseOrderReport();
//		poReports.poReportPage();
//		Thread.sleep(4000);
//		driver.navigate().to("https://demo_keus.getapcs.com/dashboard");
//	}

	@Test(priority = 6)
	public void verifyIQCConfirmationReports() throws Throwable {
		homePage.clickOnIQC_ConfirmationReport();
		iqcConfirmationReports.iqcConfirmationPage();
		Thread.sleep(2000);
		driver.navigate().to("https://demo_keus.getapcs.com/dashboard");
	}

	@AfterTest
	void afterTest() {
		driver.manage().window().minimize();
		driver.quit();
	}

}
