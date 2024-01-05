package com.keus.getapcs.testcases;

import java.awt.AWTException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.getapcs.Engineering.EnggBOM_ReleaseBOM;
import com.getapcs.Engineering.EnggBOM_ReleaseBOM_FG;
import com.getapcs.Engineering.EnggBOM_ReleaseBOM_SA1;
import com.getapcs.Engineering.EnggBOM_ReleaseBOM_SA2;
import com.getapcs.Engineering.Engg_BOM_Create_Page;
import com.getapcs.Engineering.Engg_BOM_Create_Page_FOR_FG;
import com.getapcs.Engineering.Engg_BOM_Create_Page_FOR_SA_1;
import com.getapcs.Engineering.Engg_BOM_Create_Page_FOR_SA_2;
import com.getapcs.Engineering.Item_Master_Create_Page;
import com.getapcs.Engineering.Item_Master_Create_Page1;
import com.getapcs.Engineering.Item_Master_Create_Page_SA;
import com.getapcs.Sales.ItemPriceList_CreatePage;
import com.getapcs.Sales.QuoteCreatePage;
import com.getapcs.Sales.RFQ_CreatePage;
import com.getapcs.Sales.RFQ_ReleaseCS;
import com.getapcs.SecondaryMaster.Price_List;
import com.getapcs.Transaction.MaterialIssue;
import com.getapcs.Transaction.Purchase_Requisation;
import com.getapcs.Transaction.SalesOrder;
import com.getapcs.Transaction.ShopOrder;
import com.getapcs.Transaction.ShopOrder_For_SA;
import com.getapcs.base.Testbase1;
import com.getapcs.home.login.HomePage;
import com.getapcs.home.login.LoginPage;

public class TEST_SA_Flow extends Testbase1 {

	public final static String priceList = "TEST PriceList 1";
	public final static String fg = "FG-88";
	public final static String pp1 = "PP-94";
	public final static String pp2 = "PP-95";
	public final static String pp3 = "PP-96";
	public final static String pp4 = "PP-97";
	public final static String pp5 = "PP-98";
	public final static String pp6 = "PP-99";
	public final static String sa1 = "SA-11";
	public final static String sa2 = "SA-12";

	LoginPage loginPage;
	HomePage homePage;

	Item_Master_Create_Page itemMasterCreatePageFG;
	Item_Master_Create_Page1 itemMasterCreatePagePP;
	Item_Master_Create_Page_SA itemMasterCreatePageSA;
	Engg_BOM_Create_Page enggBomCreatePage;
	Engg_BOM_Create_Page_FOR_SA_2 enggBomCreatePageForSA2;
	Engg_BOM_Create_Page_FOR_SA_1 enggBomCreatePageForSA1;
	Engg_BOM_Create_Page_FOR_FG enggBomCreatePageForFG;
//	BOM_Create_FG_SA enggBomCreatewithSAPage;
	Price_List Price_List;
	EnggBOM_ReleaseBOM releaseBom;
	EnggBOM_ReleaseBOM_SA2 releaseBomSA2;
	EnggBOM_ReleaseBOM_SA1 releaseBomSA1;
	EnggBOM_ReleaseBOM_FG releaseBomFG;
	ItemPriceList_CreatePage priceList_CreatePage;
	RFQ_CreatePage rfq_CreatePage;
	RFQ_ReleaseCS rfq_ReleaseCS;
//	RFQ_ReleaseEngg RFQ_ReleaseEngg;
//	VerifySourcing sourcing;
//	VerifyLPCostingCreate lpCosting;
//	VerifyLPCostingRelease lpCostingRelease;
	QuoteCreatePage quoteCreatePage;
	SalesOrder SalesOrder;
	ShopOrder ShopOrder;
	ShopOrder_For_SA ShopOrderSA;
	MaterialIssue MaterialIssue;
	Purchase_Requisation Purchase_Requisation;
//	PRApproval1 PRApproval1;
//	PRApproval2 PRApproval2;
//	Purchase_Order Purchase_Order;
//	openGrin openGrin;
//	Grin Grin;
//	IQCConfirmation IQCConfirmation;
//	Binning Binning;
//	ShopOrderConfirmation ShopOrderConfirmation;
//	InventryReportAfterSOC InventryReportAfterSOC;
//	OQC OQC;
//	OQCBinning OQCBinning;
//	InventryReportAfterOQCBinning InventryReportAfterOQCBinning;
//	DeliveryOrder DeliveryOrder;
//	InventryReportAfterDO InventryReportAfterDO;
//	ReturnDO ReturnDO;
//	MaterialRequest MaterialRequest;
//	Material_ReturnNote Material_ReturnNote;
//
//	InventryReportBeforeOpenGrin InventryReportBeforeOpenGrin;
//	InventryReportAfterOpenGrin InventryReportAfterOpenGrin;
//	InventryReportAfterGrin InventryReportAfterGrin;
//	InventryReportAfterIQCConfirmation InventryReportAfterIQCConfirmation;
//	InventryReportAfterBinning InventryReportAfterBinning;
//
//	Item_Master_Edit_Page itemMasterEditPage;
//	Engg_BOM_Edit_Page enggBomEditPage;
//	ItemPriceList_EditPage PriceList_EditPage;
//	RFQ_EditPage rfq_EditPage;
//	QuoteEditPage quoteEditPage;
//
//	VerifySalesOrderEditPage salesOrderEdit;
//	VerifyPR_EditPage VerifyPR_EditPage;
//	Purchase_Order_Edit Purchase_Order_Edit;
//	ShopOrder ShopOrder;
//	VerifyInvoiceCreate VerifyInvoiceCreate;

	public TEST_SA_Flow() {
		super();
	}

	@BeforeTest
	public void setUp() throws Throwable {
		initialization();
		loginPage = new LoginPage();
		homePage = loginPage.login("admin@mail.com", "user@123");
		itemMasterCreatePageFG = new Item_Master_Create_Page();
		itemMasterCreatePagePP = new Item_Master_Create_Page1();
		itemMasterCreatePageSA = new Item_Master_Create_Page_SA();
//		itemMasterEditPage = new Item_Master_Edit_Page();
		enggBomCreatePage = new Engg_BOM_Create_Page();
		enggBomCreatePageForSA2 = new Engg_BOM_Create_Page_FOR_SA_2();
		enggBomCreatePageForSA1 = new Engg_BOM_Create_Page_FOR_SA_1();
		enggBomCreatePageForFG = new Engg_BOM_Create_Page_FOR_FG();
//		enggBomCreatewithSAPage = new BOM_Create_FG_SA();
//		enggBomEditPage = new Engg_BOM_Edit_Page();
		releaseBom = new EnggBOM_ReleaseBOM();
		releaseBomSA2 = new EnggBOM_ReleaseBOM_SA2();
		releaseBomSA1 = new EnggBOM_ReleaseBOM_SA1();
		releaseBomFG = new EnggBOM_ReleaseBOM_FG();
		priceList_CreatePage = new ItemPriceList_CreatePage();
		rfq_CreatePage = new RFQ_CreatePage();
//		sourcing = new VerifySourcing();
//		lpCosting = new VerifyLPCostingCreate();
//		lpCostingRelease = new VerifyLPCostingRelease();
		rfq_ReleaseCS = new RFQ_ReleaseCS();
//		quoteCreatePage = new QuoteCreatePage();
//		SalesOrder = new SalesOrder();
//		ShopOrder = new ShopOrder();
//		MaterialIssue = new MaterialIssue();
//		rfq_ReleaseCS = new RFQ_ReleaseCS();
//		RFQ_ReleaseEngg = new RFQ_ReleaseEngg();
		quoteCreatePage = new QuoteCreatePage();
		SalesOrder = new SalesOrder();
		ShopOrder = new ShopOrder();
		ShopOrderSA = new ShopOrder_For_SA();
		MaterialIssue = new MaterialIssue();
//		Purchase_Order = new Purchase_Order();
		Purchase_Requisation = new Purchase_Requisation();
//		PRApproval1 = new PRApproval1();
//		PRApproval2 = new PRApproval2();
//		openGrin = new openGrin();
//		Grin = new Grin();
//		IQCConfirmation = new IQCConfirmation();
//		Binning = new Binning();
//		ShopOrderConfirmation = new ShopOrderConfirmation();
//		InventryReportAfterSOC = new InventryReportAfterSOC();
//		OQC = new OQC();
//		OQCBinning = new OQCBinning();
//		InventryReportAfterOQCBinning = new InventryReportAfterOQCBinning();
//		DeliveryOrder = new DeliveryOrder();
//		InventryReportAfterDO = new InventryReportAfterDO();
//		ReturnDO = new ReturnDO();
//		Price_List = new Price_List();
//		MaterialRequest = new MaterialRequest();
//		Material_ReturnNote = new Material_ReturnNote();
//
//		InventryReportBeforeOpenGrin = new InventryReportBeforeOpenGrin();
//		InventryReportAfterOpenGrin = new InventryReportAfterOpenGrin();
//		InventryReportAfterGrin = new InventryReportAfterGrin();
//		InventryReportAfterIQCConfirmation = new InventryReportAfterIQCConfirmation();
//		InventryReportAfterBinning = new InventryReportAfterBinning();
//
//		itemMasterEditPage = new Item_Master_Edit_Page();
//		enggBomEditPage = new Engg_BOM_Edit_Page();
//		PriceList_EditPage = new ItemPriceList_EditPage();
//		quoteEditPage = new QuoteEditPage();
//		rfq_EditPage = new RFQ_EditPage();
//		quoteEditPage = new QuoteEditPage();
//		salesOrderEdit = new VerifySalesOrderEditPage();
//		VerifyPR_EditPage = new VerifyPR_EditPage();
//		Purchase_Order_Edit = new Purchase_Order_Edit();
//		ShopOrder = new ShopOrder();
//		VerifyInvoiceCreate = new VerifyInvoiceCreate();
	}

//	@Test(priority = 1)
//	public void verifyPrice_ListCreate() throws AWTException, InterruptedException {
//		Thread.sleep(4000);
//		Price_List.Price_ListCreate(priceList, "TEST Description", "TEST Remarks");
//
//		Thread.sleep(4000);
//		driver.navigate().to("https://demo_keus.getapcs.com/dashboard");
//	}

	@Test(priority = 2)
	public void verifyItemMasterCreateforSA() throws Throwable {

		homePage.clickOnItemMasterCreate();
		itemMasterCreatePageFG.itemMasterCreate(fg, "Test Description", "76543456", "Test Manufacturer or CustomerName",
				"DR-N-5676", "REV-43", "T-DOC-RET-21", "10", "30", "300", "323", "TEST-FootPrint", "TEST ProcessStep",
				"TEST descriptinRouting", "9", "10", "100", "5", "10", "Test Reorder", "TEST 2Bin", "TEST LeadTime",
				"TEST expiryDays", "TEST Inspection Int Days", "TEST specialInstructions", "TEST instructions", "10",
				"TEST BatchSize", "565");
		Thread.sleep(2000);
		driver.navigate().to("https://demo_keus.getapcs.com/dashboard");

		homePage.clickOnItemMasterCreate();
		itemMasterCreatePageSA.itemMasterCreate(sa1, "Test Description", "76543456",
				"Test Manufacturer or CustomerName", "DR-N-5676", "REV-43", "T-DOC-RET-21", "10", "30", "300", "323",
				"TEST-FootPrint", "TEST ProcessStep", "TEST descriptinRouting", "9", "10", "100", "5", "10",
				"Test Reorder", "TEST 2Bin", "TEST LeadTime", "TEST expiryDays", "TEST Inspection Int Days",
				"TEST specialInstructions", "TEST instructions", "10", "TEST BatchSize", "565");
		Thread.sleep(2000);
		driver.navigate().to("https://demo_keus.getapcs.com/dashboard");

		homePage.clickOnItemMasterCreate();
		itemMasterCreatePageSA.itemMasterCreate(sa2, "Test Description", "76543456",
				"Test Manufacturer or CustomerName", "DR-N-5676", "REV-43", "T-DOC-RET-21", "10", "30", "300", "323",
				"TEST-FootPrint", "TEST ProcessStep", "TEST descriptinRouting", "9", "10", "100", "5", "10",
				"Test Reorder", "TEST 2Bin", "TEST LeadTime", "TEST expiryDays", "TEST Inspection Int Days",
				"TEST specialInstructions", "TEST instructions", "10", "TEST BatchSize", "565");
		Thread.sleep(2000);
		driver.navigate().to("https://demo_keus.getapcs.com/dashboard");

		homePage.clickOnItemMasterCreate();
		itemMasterCreatePagePP.itemMasterCreate(pp1, "Test Description", "76543456",
				"Test Manufacturer or CustomerName", "DR-N-5676", "REV-43", "T-DOC-RET-21", "10", "30", "300", "323",
				"TEST-FootPrint", "TEST ProcessStep", "TEST descriptinRouting", "9", "10", "100", "5", "10",
				"Test Reorder", "TEST 2Bin", "TEST LeadTime", "TEST expiryDays", "TEST Inspection Int Days",
				"TEST specialInstructions", "TEST instructions", "10", "TEST BatchSize", "565");
		Thread.sleep(4000);
		driver.navigate().to("https://demo_keus.getapcs.com/dashboard");

		homePage.clickOnItemMasterCreate();
		itemMasterCreatePagePP.itemMasterCreate(pp2, "Test Description", "76543456",
				"Test Manufacturer or CustomerName", "DR-N-5676", "REV-43", "T-DOC-RET-21", "10", "30", "300", "323",
				"TEST-FootPrint", "TEST ProcessStep", "TEST descriptinRouting", "9", "10", "100", "5", "10",
				"Test Reorder", "TEST 2Bin", "TEST LeadTime", "TEST expiryDays", "TEST Inspection Int Days",
				"TEST specialInstructions", "TEST instructions", "10", "TEST BatchSize", "565");
		Thread.sleep(2000);
		driver.navigate().to("https://demo_keus.getapcs.com/dashboard");

		homePage.clickOnItemMasterCreate();
		itemMasterCreatePagePP.itemMasterCreate(pp3, "Test Description", "76543456",
				"Test Manufacturer or CustomerName", "DR-N-5676", "REV-43", "T-DOC-RET-21", "10", "30", "300", "323",
				"TEST-FootPrint", "TEST ProcessStep", "TEST descriptinRouting", "9", "10", "100", "5", "10",
				"Test Reorder", "TEST 2Bin", "TEST LeadTime", "TEST expiryDays", "TEST Inspection Int Days",
				"TEST specialInstructions", "TEST instructions", "10", "TEST BatchSize", "565");
		Thread.sleep(2000);
		driver.navigate().to("https://demo_keus.getapcs.com/dashboard");

		homePage.clickOnItemMasterCreate();
		itemMasterCreatePagePP.itemMasterCreate(pp4, "Test Description", "76543456",
				"Test Manufacturer or CustomerName", "DR-N-5676", "REV-43", "T-DOC-RET-21", "10", "30", "300", "323",
				"TEST-FootPrint", "TEST ProcessStep", "TEST descriptinRouting", "9", "10", "100", "5", "10",
				"Test Reorder", "TEST 2Bin", "TEST LeadTime", "TEST expiryDays", "TEST Inspection Int Days",
				"TEST specialInstructions", "TEST instructions", "10", "TEST BatchSize", "565");
		Thread.sleep(2000);
		driver.navigate().to("https://demo_keus.getapcs.com/dashboard");

		homePage.clickOnItemMasterCreate();
		itemMasterCreatePagePP.itemMasterCreate(pp5, "Test Description", "76543456",
				"Test Manufacturer or CustomerName", "DR-N-5676", "REV-43", "T-DOC-RET-21", "10", "30", "300", "323",
				"TEST-FootPrint", "TEST ProcessStep", "TEST descriptinRouting", "9", "10", "100", "5", "10",
				"Test Reorder", "TEST 2Bin", "TEST LeadTime", "TEST expiryDays", "TEST Inspection Int Days",
				"TEST specialInstructions", "TEST instructions", "10", "TEST BatchSize", "565");
		Thread.sleep(2000);
		driver.navigate().to("https://demo_keus.getapcs.com/dashboard");

		homePage.clickOnItemMasterCreate();
		itemMasterCreatePagePP.itemMasterCreate(pp6, "Test Description", "76543456",
				"Test Manufacturer or CustomerName", "DR-N-5676", "REV-43", "T-DOC-RET-21", "10", "30", "300", "323",
				"TEST-FootPrint", "TEST ProcessStep", "TEST descriptinRouting", "9", "10", "100", "5", "10",
				"Test Reorder", "TEST 2Bin", "TEST LeadTime", "TEST expiryDays", "TEST Inspection Int Days",
				"TEST specialInstructions", "TEST instructions", "10", "TEST BatchSize", "565");
		Thread.sleep(2000);
		driver.navigate().to("https://demo_keus.getapcs.com/dashboard");

	}

	@Test(priority = 3)
	public void verifyBomCreateforSA2() throws Throwable {

		homePage.clickOnBomCreatePage();
		enggBomCreatePageForSA2.bomCreate("9", // Quantity
				"50", // scarpAllowance
				"TestRemark", // Remark
				"1", // Version
				"10", // quantityPer
				"100", // probability
				"TEST Alternate Remark", // alternateRemark
				"1", // quantityNRE
				"20");// cost
		Thread.sleep(3000);
		driver.navigate().to("https://demo_keus.getapcs.com/dashboard");

		homePage.clickOnBomCreatePage();
		enggBomCreatePageForSA1.bomCreate("8", // Quantity
				"50", // scarpAllowance
				"TestRemark", // Remark
				"1", // Version
				"10", // quantityPer
				"100", // probability
				"TEST Alternate Remark", // alternateRemark
				"1", // quantityNRE
				"20");// cost
		Thread.sleep(3000);
		driver.navigate().to("https://demo_keus.getapcs.com/dashboard");

		homePage.clickOnBomCreatePage();
		enggBomCreatePageForFG.bomCreate("7", // Quantity
				"50", // scarpAllowance
				"TestRemark", // Remark
				"1", // Version
				"10", // quantityPer
				"100", // probability
				"TEST Alternate Remark", // alternateRemark
				"1", // quantityNRE
				"20");// cost
		Thread.sleep(3000);
		driver.navigate().to("https://demo_keus.getapcs.com/dashboard");

	}

	@Test(priority = 4)
	public void verifyReleaseBom() throws Throwable {
		homePage.clickOnReleaseBomPage();
		releaseBomSA2.releaseBom("Test Remark");// Remark
		Thread.sleep(4000);
		driver.navigate().to("https://demo_keus.getapcs.com/dashboard");

		homePage.clickOnReleaseBomPage();
		releaseBomSA1.releaseBom("Test Remark");// Remark
		Thread.sleep(4000);
		driver.navigate().to("https://demo_keus.getapcs.com/dashboard");

		homePage.clickOnReleaseBomPage();
		releaseBomFG.releaseBom("Test Remark");// Remark
		Thread.sleep(4000);
		driver.navigate().to("https://demo_keus.getapcs.com/dashboard");
	}

	@Test(priority = 5)
	public void verifySalesItemPriceListCreate() throws AWTException, InterruptedException {

		// Purchase Order Create Page
		homePage.clickonTransactionPriceListCreate();
		priceList_CreatePage.ItemPriceListCreate("50", "200", "50", "100", "200", "40");

		Thread.sleep(4000);
		driver.navigate().to("https://demo_keus.getapcs.com/dashboard");
	}

	@Test(priority = 6)
	public void verifySalesRFQCreate() throws Throwable {

		// Purchase Order Create Page

		rfq_CreatePage.RFQCreate("TEST Rfq Number", "10", "TEST Note");

		Thread.sleep(4000);
		driver.navigate().to("https://demo_keus.getapcs.com/dashboard");
	}

	@Test(priority = 7)
	public void verifySalesRFQCS() throws Throwable {

		// Purchase Order Create Page
		homePage.clickonSalesRfqModifyorView();
		Thread.sleep(4000);
		rfq_ReleaseCS.RFQCs();

		Thread.sleep(4000);
		driver.navigate().to("https://demo_keus.getapcs.com/dashboard");
	}

	@Test(priority = 8)
	public void verifyQuoteCreate() throws Throwable {

		// Purchase Order Create Page

		quoteCreatePage.QuoteCreate("TEST Quote Ref", "10", "10", "5", "7", "7", "7", "7", "10", "10", "100", "9", "9",
				"8", "8", "100", "7", "7", "6", "7", "TEST Special Terms");

		Thread.sleep(4000);
		driver.navigate().to("https://demo_keus.getapcs.com/dashboard");
	}

	@Test(priority = 9)
	public void verifySalesOrderCreate() throws Throwable {
		homePage.clickOnSalesOrderCreate();
		SalesOrder.salesOrderCreate("20", // generalDiscount
				"20", // orderQty
				"10", // discount1
				"9", // sgst1
				"9", // cgst1
				"9", // igst1
				"9", // utgst1
				"10", // quantity1
				"Test Remark", // remark1
				"50", // orderqty2
				"20", // discount2
				"9", // sgst2
				"9", // cgst2
				"9", // igst2
				"9", // utgst2
				"15", // quantity2
				"Test Remark2", // remark2
				"50", // orderQty3
				"10", // discount3
				"9", // sgst3
				"9", // cgst3
				"9", // igst3
				"9", // utgst3
				"25", // quantity3
				"Test Remark3", // remark3
				"30", // orderQty4
				"10", // discount4
				"8", // sgst4
				"8", // cgst4
				"8", // igst4
				"8", // utgst4
				"15", // quantity4
				"Test Remark4", // remark4
				"PO57664", // poNumber
				"TEST Remark", // billingandShippingRemark
				"20", // totalAddidtional Charges
				"8", // sgst
				"8", // cgst
				"8", // igst
				"8", // utgst
				"20");// specialDiscount
		Thread.sleep(4000);
		driver.navigate().to("https://demo_keus.getapcs.com/dashboard");
	}

	@Test(priority = 10)
	public void verifyShopOrderCreate() throws Throwable {

		homePage.clickOnTransactionShopOrderCreate();
		ShopOrderSA.ShopOrderCreate();
		Thread.sleep(4000);
		driver.navigate().to("https://demo_keus.getapcs.com/dashboard");
	}

	@AfterTest
	public void afetrTest() {
		driver.manage().window().minimize();
		driver.quit();
	}

}
