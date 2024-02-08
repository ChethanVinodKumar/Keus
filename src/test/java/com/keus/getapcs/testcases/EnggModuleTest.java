package com.keus.getapcs.testcases;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.getapcs.Engineering.EnggBOM_ReleaseBOM;
import com.getapcs.Engineering.Engg_BOM_Create_Page;
import com.getapcs.Engineering.Engg_BOM_Edit_Page;
import com.getapcs.Engineering.Item_Master_Create_Page_FG;
import com.getapcs.Engineering.Item_Master_Edit_Page;
import com.getapcs.base.Testbase1;
import com.getapcs.home.login.HomePage;
import com.getapcs.home.login.LoginPage;

public class EnggModuleTest extends Testbase1 {

	LoginPage loginPage;
	HomePage homePage;
	Item_Master_Create_Page_FG itemMasterCreatePage;
	Item_Master_Edit_Page itemMasterEditPage;
	Engg_BOM_Create_Page enggBomCreatePage;

	Engg_BOM_Edit_Page enggBomEditPage;
	EnggBOM_ReleaseBOM releaseBom;

	public EnggModuleTest() {
		super();
	}

	@BeforeTest
	public void setUp() throws Throwable {
		initialization();
		loginPage = new LoginPage();
		homePage = loginPage.login("gopal@mail.com", "gopal321");
		itemMasterCreatePage = new Item_Master_Create_Page_FG();
		itemMasterEditPage = new Item_Master_Edit_Page();
		enggBomCreatePage = new Engg_BOM_Create_Page();
		enggBomEditPage = new Engg_BOM_Edit_Page();
		releaseBom = new EnggBOM_ReleaseBOM();
	}

	@Test(priority = 1)
	public void verifyItemMasterCreate() throws Throwable {
		homePage.clickOnItemMasterCreate();
		itemMasterCreatePage.itemMasterCreate("FG-1", "Test Description", "76543456",
				"Test Manufacturer or CustomerName", "DR-N-5676", "REV-43", "T-DOC-RET-21", "10", "30", "300", "323",
				"TEST-FootPrint", "TEST ProcessStep", "TEST descriptinRouting", "9", "10", "100", "5", "10",
				"Test Reorder", "TEST 2Bin", "TEST LeadTime", "TEST expiryDays", "TEST Inspection Int Days",
				"TEST specialInstructions", "TEST instructions", "10", "TEST BatchSize",

				"565");
		Thread.sleep(4000);
		driver.navigate().to("https://demo_keus.getapcs.com/dashboard");
	}

//	  @Test(priority = 2)
//	  public void verifyItemMasterEdit() throws Throwable {
//		  
//		  homePage.clickOnItemMasterEdit();
//		  
//		  itemMasterEditPage.itemMasterEdit("Test Description",
//					"66334321",
//					"Test Manufacturer or CustomerName",
//					"DR-N-5676",
//					"REV-43",
//					"T-DOC-RET-21",
//					"10",
//					"30",
//					"300",
//					"323",
//					"TEST-FootPrint",
//					"TEST ProcessStep",
//					"TEST descriptinRouting",
//					"9",
//					"10",
//					"100",
//					"5",
//					"10",
//					"Test Reorder",
//					"TEST 2Bin",
//					"TEST LeadTime",
//					"TEST expiryDays",
//					"TEST Inspection Int Days",
//					"TEST specialInstructions",
//					"TEST Instructions1",
//					"10",
//					"TEST BatchSize",
//					"565");
//		    Thread.sleep(4000);
//			driver.navigate().to("https://demo_keus.getapcs.com/dashboard");
//	  }

	@Test(priority = 3)
	public void verifyBomCreate() throws Throwable {

		homePage.clickOnBomCreatePage();
		enggBomCreatePage.bomCreate("40", // Quantity
				"50", // scarpAllowance
				"TestRemark", // Remark
				"1", // Version
				"20", // quantityPer
				"100", // probability
				"TEST Alternate Remark", // alternateRemark
				"40", // quantityNRE
				"20");// cost
		Thread.sleep(4000);
		driver.navigate().to("https://demo_keus.getapcs.com/dashboard");

	}

//	  @Test(priority = 4)
//	  public void verifyBomEdit() throws Throwable {
//		  homePage.clickOnBomEditPage();
//		  enggBomEditPage.enggBomEdit("88844455",//ChildItem
//				  "40",//Quantity
//				  "50",//scarpAllowance
//				 "TestRemark1",//Remark
//				 "1",//Version
//				 "20",//quantityPer
//				 "100",//probability
//				 "TEST Alternate Remark1",//alternateRemark
//				 "40",//quantityNRE
//				 "20");
//		   Thread.sleep(4000);
//					driver.navigate().to("https://demo_keus.getapcs.com/dashboard");
//				  
//	  }

	@Test(priority = 5)
	public void verifyReleaseBom() throws Throwable {
		homePage.clickOnReleaseBomPage();
		releaseBom.releaseBom("Test Remark");// Remark
	}

	@AfterTest
	public void tearDown() {
		driver.manage().window().minimize();
		driver.quit();
	}

}
