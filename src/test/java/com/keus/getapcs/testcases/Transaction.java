package com.keus.getapcs.testcases;

import java.awt.AWTException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.getapcs.PrimaryMaster.CompanyMaster;
import com.getapcs.PrimaryMaster.CustomerMaster;
import com.getapcs.PrimaryMaster.VenderMaster;
import com.getapcs.PrimaryMaster.VenderMasterEdit;
import com.getapcs.base.Testbase1;
import com.getapcs.home.login.HomePage;
import com.getapcs.home.login.LoginPage;
import com.getapcs.Transaction.*;

public class Transaction extends Testbase1 {
	LoginPage loginPage;
	HomePage homePage;
	ShopOrder ShopOrder;
	MaterialIssue MaterialIssue;

	public Transaction()
	{
		super();
	}
	
	
	
	@BeforeTest
	public void setUp() throws InterruptedException, AWTException
	{
		initialization();
		loginPage = new LoginPage();
		
		ShopOrder = new ShopOrder();
		MaterialIssue = new MaterialIssue();

		homePage = loginPage.login("gopal@mail.com","gopal321");	

	}
	

//	
//  @Test(priority = 1)
//  public void verifyShopOrderCreate() throws Throwable {
//  	
//  //Purchase Order Create Page
//     
//		homePage.clickOnTransactionShopOrderCreate();
//		ShopOrder.ShopOrderCreate();
//		Thread.sleep(4000);
//		driver.navigate().to("https://demo_keus.getapcs.com/dashboard");
//  }
//  @Test(priority = 2)
//  public void verifyShopOrderEdit() throws Throwable {
//	  	
//  //Purchase Order Create Page
//     
//		homePage.clickOnTransactionShopOrderEdit();
//	//	ShopOrder.ShopOrderEdit();
//		Thread.sleep(4000);
//		driver.navigate().to("https://demo_keus.getapcs.com/dashboard");
//   }
//  @Test(priority = 3)
//  public void verifyShopOrderView() throws Throwable {
//	  	
//  //Purchase Order Create Page
//     
//		homePage.clickOnTransactionShopOrderView();
//		ShopOrder.ShopOrderView();
//		Thread.sleep(4000);
//		driver.navigate().to("https://demo_keus.getapcs.com/dashboard");
//   }
//  @Test(priority = 4)
//  public void verifyShopOrderTable() throws Throwable {
//	  	
//  //Purchase Order Create Page
//     
//		homePage.clickOnTransactionShopOrder();
//		ShopOrder.ShopOrderTable();
//		Thread.sleep(4000);
//		driver.navigate().to("https://demo_keus.getapcs.com/dashboard");
//   }
	
//Material Issue
	
//	  @Test(priority = 11)
//	  public void verifyMaterialIssue() throws Throwable {
//	  	
//	  //Purchase Order Create Page
//	     
//			homePage.clickOnTransactionMaterialIssue();
//			MaterialIssue.MaterialIssuePage();
//			Thread.sleep(4000);
//			driver.navigate().to("https://demo_keus.getapcs.com/dashboard");
//	  }
	
	  @Test(priority = 11)
	  public void verifyMaterialIssueTable() throws Throwable {
	  	
	  //Purchase Order Create Page
	     
			homePage.clickOnTransactionMaterialIssue();
			MaterialIssue.MaterialIssueTablePage();
			Thread.sleep(4000);
			driver.navigate().to("https://demo_keus.getapcs.com/dashboard");
	  }
	
    public void tearDown()
    {
   	driver.quit();
    }
}

