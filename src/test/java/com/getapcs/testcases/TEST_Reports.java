package com.getapcs.testcases;

import java.time.Duration;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.getapcs.Keus.Reports.ItemMaster_Reports;
import com.getapcs.Keus.Reports.SalesOrder_Reports;
import com.getapcs.base.Testbase1;
import com.getapcs.home.login.HomePage;
import com.getapcs.home.login.LoginPage;

public class TEST_Reports extends Testbase1 {

	LoginPage loginPage;
	HomePage homePage;
	SalesOrder_Reports SalesOrder_Reports;
	ItemMaster_Reports itemMasterReports;

	public TEST_Reports() {
		super();
	}

	@BeforeTest
	public void setUp() throws Throwable {
		initialization();
		loginPage = new LoginPage();
		homePage = loginPage.login("admin@mail.com", "user@123");

		SalesOrder_Reports = new SalesOrder_Reports();
		itemMasterReports = new ItemMaster_Reports();

	}

	@Test(priority = 1)
	public void verifyItemMasterReport() throws Throwable {
		homePage.clickOnItemMasterReports();
		itemMasterReports.itemMasterReport();

		Thread.sleep(Duration.ofSeconds(4));
		driver.navigate().to("https://demo_keus.getapcs.com/dashboard");
	}

	@Test(priority = 2)
	public void verifyPrice_ListCreate() throws Exception {
		homePage.clickOnSalesOrderReport();
		SalesOrder_Reports.SalesOrder_ReportsPage();
		driver.navigate().to("https://demo_keus.getapcs.com/dashboard");
	}

	@AfterTest
	void afterTest() {
		driver.manage().window().minimize();
		driver.quit();
	}

}
