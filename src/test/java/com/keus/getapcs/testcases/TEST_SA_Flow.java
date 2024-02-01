package com.keus.getapcs.testcases;

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
import com.getapcs.InventryReports.SAFlow.InventryReportAfterBinning;
import com.getapcs.InventryReports.SAFlow.InventryReportAfterGrin;
import com.getapcs.InventryReports.SAFlow.InventryReportAfterIQCConfirmation;
import com.getapcs.InventryReports.SAFlow.InventryReportAfterMaterialIssueFG;
import com.getapcs.InventryReports.SAFlow.InventryReportAfterMaterialIssueSA1;
import com.getapcs.InventryReports.SAFlow.InventryReportAfterMaterialIssueSA2;
import com.getapcs.InventryReports.SAFlow.InventryReportAfterOQCBinningFG;
import com.getapcs.InventryReports.SAFlow.InventryReportAfterOQCBinningSA1;
import com.getapcs.InventryReports.SAFlow.InventryReportAfterOQCBinningSA2;
import com.getapcs.InventryReports.SAFlow.InventryReportAfterOQCFG;
import com.getapcs.InventryReports.SAFlow.InventryReportAfterOQCSA1;
import com.getapcs.InventryReports.SAFlow.InventryReportAfterOQCSA2;
import com.getapcs.InventryReports.SAFlow.InventryReportBeforGrin;
import com.getapcs.Keus.TransactionSAFlow.Binning;
import com.getapcs.Keus.TransactionSAFlow.Binning_SA_FG;
import com.getapcs.Keus.TransactionSAFlow.Grin_Create;
import com.getapcs.Keus.TransactionSAFlow.IQCConfirmation;
import com.getapcs.Keus.TransactionSAFlow.MaterialIssueFG;
import com.getapcs.Keus.TransactionSAFlow.MaterialIssueSA1;
import com.getapcs.Keus.TransactionSAFlow.MaterialIssueSA2;
import com.getapcs.Keus.TransactionSAFlow.OQCBinningFG;
import com.getapcs.Keus.TransactionSAFlow.OQCBinningSA1;
import com.getapcs.Keus.TransactionSAFlow.OQCBinningSA2;
import com.getapcs.Keus.TransactionSAFlow.OQCFG;
import com.getapcs.Keus.TransactionSAFlow.OQCSA1;
import com.getapcs.Keus.TransactionSAFlow.OQCSA2;
import com.getapcs.Keus.TransactionSAFlow.Purchase_Requisation_FG;
import com.getapcs.Keus.TransactionSAFlow.Purchase_Requisation_SA1;
import com.getapcs.Keus.TransactionSAFlow.Purchase_Requisation_SA2;
import com.getapcs.Keus.TransactionSAFlow.ShopOrderConfirmationFG;
import com.getapcs.Keus.TransactionSAFlow.ShopOrderConfirmationSA1;
import com.getapcs.Keus.TransactionSAFlow.ShopOrderConfirmationSA2;
import com.getapcs.Sales.ItemPriceList_CreatePage;
import com.getapcs.Sales.QuoteCreatePage;
import com.getapcs.Sales.RFQ_CreatePage;
import com.getapcs.Sales.RFQ_ReleaseCS;
import com.getapcs.SecondaryMaster.Price_List;
import com.getapcs.Transaction.MaterialIssue;
import com.getapcs.Transaction.PRApproval1;
import com.getapcs.Transaction.PRApproval2;
import com.getapcs.Transaction.Purchase_Order;
import com.getapcs.Transaction.Purchase_Order_FG;
import com.getapcs.Transaction.Purchase_Order_SA1;
import com.getapcs.Transaction.Purchase_Order_SA2;
import com.getapcs.Transaction.Purchase_Requisation;
import com.getapcs.Transaction.SalesOrder;
import com.getapcs.Transaction.ShopOrder;
import com.getapcs.Transaction.ShopOrder_For_FG;
import com.getapcs.Transaction.ShopOrder_For_SA;
import com.getapcs.Transaction.ShopOrder_For_SA2;
import com.getapcs.base.Testbase1;
import com.getapcs.home.login.HomePage;
import com.getapcs.home.login.LoginPage;

public class TEST_SA_Flow extends Testbase1 {

	public final static String priceList = "TEST PriceList 0151";
	public final static String fgNo = "0151";
	public final static String fg = "FG-" + fgNo;
	public final static String pp1 = "PP-0151";
	public final static String pp2 = "PP-0152";
	public final static String pp3 = "PP-0153";
	public final static String pp4 = "PP-0154";
	public final static String pp5 = "PP-0155";
	public final static String pp6 = "PP-0156";
	public final static String sa1 = "SA-0151";
	public final static String sa2 = "SA-0152";

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
	ShopOrder_For_SA2 ShopOrderSA2;
	ShopOrder_For_FG ShopOrderFG;
	MaterialIssue MaterialIssue;
	Purchase_Requisation Purchase_Requisation;

	Purchase_Requisation_SA2 Purchase_Requisation_SA2;
	Purchase_Requisation_SA1 Purchase_Requisation_SA1;
	Purchase_Requisation_FG Purchase_Requisation_FG;
	PRApproval1 PRApproval1;
	PRApproval2 PRApproval2;
	Purchase_Order_SA2 Purchase_Order_SA2;
	Purchase_Order_SA1 Purchase_Order_SA1;
	Purchase_Order_FG Purchase_Order_FG;
	Purchase_Order Purchase_Order;
	Grin_Create Grin_Create;
	IQCConfirmation IQCConfirmation;
	Binning Binning;
	Binning_SA_FG Binning_SA_FG;
	MaterialIssueSA1 MaterialIssueSA1;
	MaterialIssueSA2 MaterialIssueSA2;
	MaterialIssueFG MaterialIssueFG;
	ShopOrderConfirmationSA2 ShopOrderConfirmationSA2;
	ShopOrderConfirmationSA1 ShopOrderConfirmationSA1;
	ShopOrderConfirmationFG ShopOrderConfirmationFG;
	OQCSA2 OQCSA2;
	OQCBinningSA2 OQCBinningSA2;
	OQCSA1 OQCSA1;
	OQCBinningSA1 OQCBinningSA1;
	OQCFG OQCFG;
	OQCBinningFG OQCBinningFG;

	InventryReportBeforGrin InventryReportBeforGrin;
	InventryReportAfterGrin InventryReportAfterGrin;
	InventryReportAfterIQCConfirmation InventryReportAfterIQCConfirmation;
	InventryReportAfterBinning InventryReportAfterBinning;
	InventryReportAfterMaterialIssueSA2 InventryReportAfterMaterialIssueSA2;
	InventryReportAfterMaterialIssueSA1 InventryReportAfterMaterialIssueSA1;
	InventryReportAfterMaterialIssueFG InventryReportAfterMaterialIssueFG;
	InventryReportAfterOQCSA2 InventryReportAfterOQCSA2;
	InventryReportAfterOQCSA1 InventryReportAfterOQCSA1;
	InventryReportAfterOQCFG InventryReportAfterOQCFG;
	InventryReportAfterOQCBinningSA2 InventryReportAfterOQCBinningSA2;
	InventryReportAfterOQCBinningSA1 InventryReportAfterOQCBinningSA1;
	InventryReportAfterOQCBinningFG InventryReportAfterOQCBinningFG;

	public TEST_SA_Flow() {
		super();
	}

	@BeforeTest
	public void setUp() throws Throwable {
		initialization();
		loginPage = new LoginPage();
		homePage = loginPage.login("admin@mail.com", "user@123");
		Price_List = new Price_List();
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
		ShopOrderSA2 = new ShopOrder_For_SA2();
		ShopOrderFG = new ShopOrder_For_FG();
		MaterialIssue = new MaterialIssue();
		Purchase_Order = new Purchase_Order();
		Purchase_Requisation = new Purchase_Requisation();

		Purchase_Requisation_SA2 = new Purchase_Requisation_SA2();
		Purchase_Requisation_SA1 = new Purchase_Requisation_SA1();
		Purchase_Requisation_FG = new Purchase_Requisation_FG();
		PRApproval1 = new PRApproval1();
		PRApproval2 = new PRApproval2();
		Purchase_Order_SA2 = new Purchase_Order_SA2();
		Purchase_Order_SA1 = new Purchase_Order_SA1();
		Purchase_Order_FG = new Purchase_Order_FG();
		Grin_Create = new Grin_Create();
		IQCConfirmation = new IQCConfirmation();
		Binning = new Binning();
		Binning_SA_FG = new Binning_SA_FG();
		MaterialIssueSA1 = new MaterialIssueSA1();
		MaterialIssueSA2 = new MaterialIssueSA2();
		MaterialIssueFG = new MaterialIssueFG();
		ShopOrderConfirmationSA2 = new ShopOrderConfirmationSA2();
		ShopOrderConfirmationSA1 = new ShopOrderConfirmationSA1();
		ShopOrderConfirmationFG = new ShopOrderConfirmationFG();
		OQCSA2 = new OQCSA2();
		OQCBinningSA2 = new OQCBinningSA2();
		OQCSA1 = new OQCSA1();
		OQCBinningSA1 = new OQCBinningSA1();
		OQCFG = new OQCFG();
		OQCBinningFG = new OQCBinningFG();

		InventryReportBeforGrin = new InventryReportBeforGrin();
		InventryReportAfterGrin = new InventryReportAfterGrin();
		InventryReportAfterIQCConfirmation = new InventryReportAfterIQCConfirmation();
		InventryReportAfterBinning = new InventryReportAfterBinning();
		InventryReportAfterMaterialIssueSA2 = new InventryReportAfterMaterialIssueSA2();
		InventryReportAfterMaterialIssueSA1 = new InventryReportAfterMaterialIssueSA1();
		InventryReportAfterMaterialIssueFG = new InventryReportAfterMaterialIssueFG();
		InventryReportAfterOQCSA2 = new InventryReportAfterOQCSA2();
		InventryReportAfterOQCSA1 = new InventryReportAfterOQCSA1();
		InventryReportAfterOQCFG = new InventryReportAfterOQCFG();
		InventryReportAfterOQCBinningSA2 = new InventryReportAfterOQCBinningSA2();
		InventryReportAfterOQCBinningSA1 = new InventryReportAfterOQCBinningSA1();
		InventryReportAfterOQCBinningFG = new InventryReportAfterOQCBinningFG();

	}

//	@Test(priority = 1)
//	public void verifyPrice_ListCreate() throws AWTException, InterruptedException {
//		Thread.sleep(4000);
//		Price_List.Price_ListCreate(priceList, "TEST Description", "TEST Remarks");
//
//		Thread.sleep(4000);
//		driver.navigate().to("https://demo_keus.getapcs.com/dashboard");
//	}
//
//	@Test(priority = 2)
//	public void verifyItemMasterCreateforSA() throws Throwable {
//
//		homePage.clickOnItemMasterCreate();
//		itemMasterCreatePageFG.itemMasterCreate(fg, "Test Description", "76543456", "Test Manufacturer or CustomerName",
//				"DR-N-5676", "REV-43", "T-DOC-RET-21", "10", "30", "300", "323", "TEST-FootPrint", "TEST ProcessStep",
//				"TEST descriptinRouting", "9", "10", "100", "5", "10", "Test Reorder", "TEST 2Bin", "TEST LeadTime",
//				"TEST expiryDays", "TEST Inspection Int Days", "TEST specialInstructions", "TEST instructions", "10",
//				"TEST BatchSize", "565");
//		Thread.sleep(2000);
//		driver.navigate().to("https://demo_keus.getapcs.com/dashboard");
//
//		homePage.clickOnItemMasterCreate();
//		itemMasterCreatePageSA.itemMasterCreate(sa1, "Test Description", "76543456",
//				"Test Manufacturer or CustomerName", "DR-N-5676", "REV-43", "T-DOC-RET-21", "10", "30", "300", "323",
//				"TEST-FootPrint", "TEST ProcessStep", "TEST descriptinRouting", "9", "10", "100", "5", "10",
//				"Test Reorder", "TEST 2Bin", "TEST LeadTime", "TEST expiryDays", "TEST Inspection Int Days",
//				"TEST specialInstructions", "TEST instructions", "10", "TEST BatchSize", "565");
//		Thread.sleep(2000);
//		driver.navigate().to("https://demo_keus.getapcs.com/dashboard");
//
//		homePage.clickOnItemMasterCreate();
//		itemMasterCreatePageSA.itemMasterCreate(sa2, "Test Description", "76543456",
//				"Test Manufacturer or CustomerName", "DR-N-5676", "REV-43", "T-DOC-RET-21", "10", "30", "300", "323",
//				"TEST-FootPrint", "TEST ProcessStep", "TEST descriptinRouting", "9", "10", "100", "5", "10",
//				"Test Reorder", "TEST 2Bin", "TEST LeadTime", "TEST expiryDays", "TEST Inspection Int Days",
//				"TEST specialInstructions", "TEST instructions", "10", "TEST BatchSize", "565");
//		Thread.sleep(2000);
//		driver.navigate().to("https://demo_keus.getapcs.com/dashboard");
//
//		homePage.clickOnItemMasterCreate();
//		itemMasterCreatePagePP.itemMasterCreate(pp1, "Test Description", "76543456",
//				"Test Manufacturer or CustomerName", "DR-N-5676", "REV-43", "T-DOC-RET-21", "10", "30", "300", "323",
//				"TEST-FootPrint", "TEST ProcessStep", "TEST descriptinRouting", "9", "10", "100", "5", "10",
//				"Test Reorder", "TEST 2Bin", "TEST LeadTime", "TEST expiryDays", "TEST Inspection Int Days",
//				"TEST specialInstructions", "TEST instructions", "10", "TEST BatchSize", "565");
//		Thread.sleep(2000);
//		driver.navigate().to("https://demo_keus.getapcs.com/dashboard");
//
//		homePage.clickOnItemMasterCreate();
//		itemMasterCreatePagePP.itemMasterCreate(pp2, "Test Description", "76543456",
//				"Test Manufacturer or CustomerName", "DR-N-5676", "REV-43", "T-DOC-RET-21", "10", "30", "300", "323",
//				"TEST-FootPrint", "TEST ProcessStep", "TEST descriptinRouting", "9", "10", "100", "5", "10",
//				"Test Reorder", "TEST 2Bin", "TEST LeadTime", "TEST expiryDays", "TEST Inspection Int Days",
//				"TEST specialInstructions", "TEST instructions", "10", "TEST BatchSize", "565");
//		Thread.sleep(2000);
//		driver.navigate().to("https://demo_keus.getapcs.com/dashboard");
//
//		homePage.clickOnItemMasterCreate();
//		itemMasterCreatePagePP.itemMasterCreate(pp3, "Test Description", "76543456",
//				"Test Manufacturer or CustomerName", "DR-N-5676", "REV-43", "T-DOC-RET-21", "10", "30", "300", "323",
//				"TEST-FootPrint", "TEST ProcessStep", "TEST descriptinRouting", "9", "10", "100", "5", "10",
//				"Test Reorder", "TEST 2Bin", "TEST LeadTime", "TEST expiryDays", "TEST Inspection Int Days",
//				"TEST specialInstructions", "TEST instructions", "10", "TEST BatchSize", "565");
//		Thread.sleep(2000);
//		driver.navigate().to("https://demo_keus.getapcs.com/dashboard");
//
//		homePage.clickOnItemMasterCreate();
//		itemMasterCreatePagePP.itemMasterCreate(pp4, "Test Description", "76543456",
//				"Test Manufacturer or CustomerName", "DR-N-5676", "REV-43", "T-DOC-RET-21", "10", "30", "300", "323",
//				"TEST-FootPrint", "TEST ProcessStep", "TEST descriptinRouting", "9", "10", "100", "5", "10",
//				"Test Reorder", "TEST 2Bin", "TEST LeadTime", "TEST expiryDays", "TEST Inspection Int Days",
//				"TEST specialInstructions", "TEST instructions", "10", "TEST BatchSize", "565");
//		Thread.sleep(2000);
//		driver.navigate().to("https://demo_keus.getapcs.com/dashboard");
//
//		homePage.clickOnItemMasterCreate();
//		itemMasterCreatePagePP.itemMasterCreate(pp5, "Test Description", "76543456",
//				"Test Manufacturer or CustomerName", "DR-N-5676", "REV-43", "T-DOC-RET-21", "10", "30", "300", "323",
//				"TEST-FootPrint", "TEST ProcessStep", "TEST descriptinRouting", "9", "10", "100", "5", "10",
//				"Test Reorder", "TEST 2Bin", "TEST LeadTime", "TEST expiryDays", "TEST Inspection Int Days",
//				"TEST specialInstructions", "TEST instructions", "10", "TEST BatchSize", "565");
//		Thread.sleep(2000);
//		driver.navigate().to("https://demo_keus.getapcs.com/dashboard");
//
//		homePage.clickOnItemMasterCreate();
//		itemMasterCreatePagePP.itemMasterCreate(pp6, "Test Description", "76543456",
//				"Test Manufacturer or CustomerName", "DR-N-5676", "REV-43", "T-DOC-RET-21", "10", "30", "300", "323",
//				"TEST-FootPrint", "TEST ProcessStep", "TEST descriptinRouting", "9", "10", "100", "5", "10",
//				"Test Reorder", "TEST 2Bin", "TEST LeadTime", "TEST expiryDays", "TEST Inspection Int Days",
//				"TEST specialInstructions", "TEST instructions", "10", "TEST BatchSize", "565");
//		Thread.sleep(2000);
//		driver.navigate().to("https://demo_keus.getapcs.com/dashboard");
//
//	}
//
//	@Test(priority = 3)
//	public void verifyBomCreateforSA2() throws Throwable {
//
//		homePage.clickOnBomCreatePage();
//		enggBomCreatePageForSA2.bomCreate("10", // Quantity
//				"10", // scarpAllowance
//				"TestRemark", // Remark
//				"1", // Version
//				"10", // quantityPer
//				"100", // probability
//				"TEST Alternate Remark", // alternateRemark
//				"1", // quantityNRE
//				"20");// cost
//		Thread.sleep(3000);
//		driver.navigate().to("https://demo_keus.getapcs.com/dashboard");
//
//		homePage.clickOnBomCreatePage();
//		enggBomCreatePageForSA1.bomCreate("10", // Quantity
//				"10", // scarpAllowance
//				"TestRemark", // Remark
//				"1", // Version
//				"10", // quantityPer
//				"100", // probability
//				"TEST Alternate Remark", // alternateRemark
//				"1", // quantityNRE
//				"20");// cost
//		Thread.sleep(3000);
//		driver.navigate().to("https://demo_keus.getapcs.com/dashboard");
//
//		homePage.clickOnBomCreatePage();
//		enggBomCreatePageForFG.bomCreate("10", // Quantity
//				"10", // scarpAllowance
//				"TestRemark", // Remark
//				"1", // Version
//				"10", // quantityPer
//				"100", // probability
//				"TEST Alternate Remark", // alternateRemark
//				"1", // quantityNRE
//				"20");// cost
//		Thread.sleep(3000);
//		driver.navigate().to("https://demo_keus.getapcs.com/dashboard");
//
//	}
//
//	@Test(priority = 4)
//	public void verifyReleaseBom() throws Throwable {
//		homePage.clickOnReleaseBomPage();
//		releaseBomSA2.releaseBom("Test Remark");// Remark
//		Thread.sleep(4000);
//		driver.navigate().to("https://demo_keus.getapcs.com/dashboard");
//
//		homePage.clickOnReleaseBomPage();
//		releaseBomSA1.releaseBom("Test Remark");// Remark
//		Thread.sleep(4000);
//		driver.navigate().to("https://demo_keus.getapcs.com/dashboard");
//
//		homePage.clickOnReleaseBomPage();
//		releaseBomFG.releaseBom("Test Remark");// Remark
//		Thread.sleep(4000);
//		driver.navigate().to("https://demo_keus.getapcs.com/dashboard");
//	}
//
//	@Test(priority = 5)
//	public void verifySalesItemPriceListCreate() throws AWTException, InterruptedException {
//
//		// Purchase Order Create Page
//		homePage.clickonTransactionPriceListCreate();
//		priceList_CreatePage.ItemPriceListCreate("10", "10", "10", "10", "10", "10");
//
//		Thread.sleep(4000);
//		driver.navigate().to("https://demo_keus.getapcs.com/dashboard");
//	}
//
//	@Test(priority = 6)
//	public void verifySalesRFQCreate() throws Throwable {
//
//		// Purchase Order Create Page
//
//		rfq_CreatePage.RFQCreate("TEST Rfq Number", "10", "TEST Note");
//
//		Thread.sleep(4000);
//		driver.navigate().to("https://demo_keus.getapcs.com/dashboard");
//	}
//
//	@Test(priority = 7)
//	public void verifySalesRFQCS() throws Throwable {
//
//		// Purchase Order Create Page
//		homePage.clickonSalesRfqModifyorView();
//		Thread.sleep(4000);
//		rfq_ReleaseCS.RFQCs();
//
//		Thread.sleep(4000);
//		driver.navigate().to("https://demo_keus.getapcs.com/dashboard");
//	}
//
//	@Test(priority = 8)
//	public void verifyQuoteCreate() throws Throwable {
//
//		// Purchase Order Create Page
//
//		quoteCreatePage.QuoteCreate("TEST Quote Ref", "10", "10", "5", "7", "7", "7", "7", "10", "10", "10", "9", "9",
//				"8", "8", "10", "7", "7", "6", "7", "TEST Special Terms");
//
//		Thread.sleep(4000);
//		driver.navigate().to("https://demo_keus.getapcs.com/dashboard");
//	}
//
//	@Test(priority = 9)
//	public void verifySalesOrderCreate() throws Throwable {
//		homePage.clickOnSalesOrderCreate();
//		SalesOrder.salesOrderCreate("20", // generalDiscount
//				"20", // orderQty
//				"10", // discount1
//				"9", // sgst1
//				"9", // cgst1
//				"9", // igst1
//				"9", // utgst1
//				"10", // quantity1
//				"Test Remark", // remark1
//				"50", // orderqty2
//				"20", // discount2
//				"9", // sgst2
//				"9", // cgst2
//				"9", // igst2
//				"9", // utgst2
//				"15", // quantity2
//				"Test Remark2", // remark2
//				"50", // orderQty3
//				"10", // discount3
//				"9", // sgst3
//				"9", // cgst3
//				"9", // igst3
//				"9", // utgst3
//				"25", // quantity3
//				"Test Remark3", // remark3
//				"30", // orderQty4
//				"10", // discount4
//				"8", // sgst4
//				"8", // cgst4
//				"8", // igst4
//				"8", // utgst4
//				"15", // quantity4
//				"Test Remark4", // remark4
//				"PO-" + fgNo, // poNumber
//				"TEST Remark", // billingandShippingRemark
//				"20", // totalAddidtional Charges
//				"8", // sgst
//				"8", // cgst
//				"8", // igst
//				"8", // utgst
//				"20");// specialDiscoun
//		Thread.sleep(4000);
//		driver.navigate().to("https://demo_keus.getapcs.com/dashboard");
//	}
//
//	@Test(priority = 10)
//	public void verifyShopOrderCreate() throws Throwable {
//
//		homePage.clickOnTransactionShopOrderCreate();
//		ShopOrderSA.ShopOrderCreate();
//		Thread.sleep(4000);
//		driver.navigate().to("https://demo_keus.getapcs.com/dashboard");
//
//		homePage.clickOnTransactionShopOrderCreate();
//		ShopOrderSA2.ShopOrderCreate();
//		Thread.sleep(4000);
//		driver.navigate().to("https://demo_keus.getapcs.com/dashboard");
//
//		homePage.clickOnTransactionShopOrderCreate();
//		ShopOrderFG.ShopOrderCreate();
//		Thread.sleep(4000);
//		driver.navigate().to("https://demo_keus.getapcs.com/dashboard");
//	}

	@Test(priority = 11)
	public void verifyPRcreate$Approvals_1_2() throws Throwable {
		homePage.clickOnPRCreatePage();
		Purchase_Requisation_SA2.prCreatePage();
		Thread.sleep(2000);
		driver.navigate().to("https://demo_keus.getapcs.com/dashboard");

		homePage.clickOnPOApproval1();
		PRApproval1.prApproval1Page();
		Thread.sleep(4000);
		driver.navigate().to("https://demo_keus.getapcs.com/dashboard");

		homePage.clickOnPRApproval2();
		PRApproval2.prApproval2Page();
		Thread.sleep(4000);
		driver.navigate().to("https://demo_keus.getapcs.com/dashboard");

		// ##############################################################################

		homePage.clickOnPRCreatePage();
		Purchase_Requisation_SA1.prCreatePage();
		Thread.sleep(2000);
		driver.navigate().to("https://demo_keus.getapcs.com/dashboard");

		homePage.clickOnPOApproval1();
		PRApproval1.prApproval1Page();
		Thread.sleep(4000);
		driver.navigate().to("https://demo_keus.getapcs.com/dashboard");

		homePage.clickOnPRApproval2();
		PRApproval2.prApproval2Page();
		Thread.sleep(4000);
		driver.navigate().to("https://demo_keus.getapcs.com/dashboard");

		// ############################################################################

		homePage.clickOnPRCreatePage();
		Purchase_Requisation_FG.prCreatePage();
		Thread.sleep(2000);
		driver.navigate().to("https://demo_keus.getapcs.com/dashboard");

		homePage.clickOnPOApproval1();
		PRApproval1.prApproval1Page();
		Thread.sleep(4000);
		driver.navigate().to("https://demo_keus.getapcs.com/dashboard");

		homePage.clickOnPRApproval2();
		PRApproval2.prApproval2Page();
		Thread.sleep(4000);
		driver.navigate().to("https://demo_keus.getapcs.com/dashboard");

	}

	@Test(priority = 12)
	public void verifyPOCreate() throws Throwable {

		homePage.clickontransactionPOcreate();
		Purchase_Order_SA2.purchaseOrderCreatePage("10", "50", "1000", "1000", "1000", "TEST Special Instructions", "8",
				"8", "8", "8", "100", "Test Special Terms", "Test IncoTerms");
		Thread.sleep(4000);
		driver.navigate().to("https://demo_keus.getapcs.com/dashboard");

		// Approval 1

		homePage.clickontransactionPOApproval1();
		Purchase_Order.purchaseOrderApproval1();
		driver.navigate().to("https://demo_keus.getapcs.com/dashboard");

		// Approval 2

		homePage.clickontransactionPOApproval2();
		Purchase_Order.purchaseOrderApproval2();
		driver.navigate().to("https://demo_keus.getapcs.com/dashboard");

		homePage.clickontransactionPOcreate();
		Purchase_Order_SA1.purchaseOrderCreatePage("10", "50", "1000", "1000", "1000", "TEST Special Instructions", "8",
				"8", "8", "8", "100", "Test Special Terms", "Test IncoTerms");
		Thread.sleep(4000);
		driver.navigate().to("https://demo_keus.getapcs.com/dashboard");

		// Approval 1

		homePage.clickontransactionPOApproval1();
		Purchase_Order.purchaseOrderApproval1();
		driver.navigate().to("https://demo_keus.getapcs.com/dashboard");

		// Approval 2

		homePage.clickontransactionPOApproval2();
		Purchase_Order.purchaseOrderApproval2();
		driver.navigate().to("https://demo_keus.getapcs.com/dashboard");

		homePage.clickontransactionPOcreate();
		Purchase_Order_FG.purchaseOrderCreatePage("10", "50", "1000", "1000", "1000", "TEST Special Instructions", "8",
				"8", "8", "8", "100", "Test Special Terms", "Test IncoTerms");
		Thread.sleep(4000);
		driver.navigate().to("https://demo_keus.getapcs.com/dashboard");

		// Approval 1

		homePage.clickontransactionPOApproval1();
		Purchase_Order.purchaseOrderApproval1();
		driver.navigate().to("https://demo_keus.getapcs.com/dashboard");

		// Approval 2

		homePage.clickontransactionPOApproval2();
		Purchase_Order.purchaseOrderApproval2();
		driver.navigate().to("https://demo_keus.getapcs.com/dashboard");

	}

	@Test(priority = 13)
	public void verifyInventryReportBeforeGrin() throws Throwable {
		homePage.clickOnInventryReportWithLocation();
		InventryReportBeforGrin.InventryReportPage();

		Thread.sleep(4000);
		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
	}

	@Test(priority = 14)
	public void verifyGRINCreate() throws Throwable {
		homePage.clickOnGRINCreate();
		Grin_Create.grinCreatePage("TEST-IN-1122", // invoiceNo
				"10", // invoiceGST
				"10", // totalInvoice
				"7687769", // mftrBatchNo
				"10", // unitPrice

				"9", // sgst
				"9", // cgst
				"9", // igst
				"9", // utgst
				"AWB-1-5657", // awbNo1
				"AWB-2-5657", // awbNo2
				"BE-557", // beNo
				"80", // beCurrencyValue
				"10", // freight
				"10", // insurance
				"10", // loadingOrUnloading
				"80", // currencyConversion
				"10", // transport
				"test charge");// otherChargesValue

		Thread.sleep(4000);
		driver.navigate().to("https://demo_keus.getapcs.com/dashboard");
	}

//	@Test(priority = 15)
//	public void verifyInventryReportAfterGrin() throws Throwable {
//		homePage.clickOnInventryReportWithLocation();
//		InventryReportAfterGrin.InventryReportPage();
//
//		Thread.sleep(4000);
//		driver.navigate().to("https://demo_keus.getapcs.com/dashboard");
//	}
//
//	@Test(priority = 16)
//	public void verifyIQCCreate() throws Throwable {
//		homePage.clickOnIQCConfirmationCreate();
//		IQCConfirmation.iqcConfirmationCreatePage();
//
//		Thread.sleep(4000);
//		driver.navigate().to("https://demo_keus.getapcs.com/dashboard");
//	}
//
//	@Test(priority = 17)
//	public void verifyInventryReportAfterIQC() throws Throwable {
//		homePage.clickOnInventryReportWithLocation();
//		InventryReportAfterIQCConfirmation.InventryReportPage();
//
//		Thread.sleep(4000);
//		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
//	}
//
//	@Test(priority = 18)
//	public void verifyBinningCreate() throws Throwable {
//		homePage.clickOnBinningCreate();
//		Binning_SA_FG.BinningCreatePage();
//
//		Thread.sleep(4000);
//		driver.navigate().to("https://demo_keus.getapcs.com/dashboard");
//	}
//
//	@Test(priority = 19)
//	public void verifyInventryReportAfterBinning() throws Throwable {
//		homePage.clickOnInventryReportWithLocation();
//		InventryReportAfterBinning.InventryReportPage();
//
//		Thread.sleep(4000);
//		driver.navigate().to("https://demo_keus.getapcs.com/dashboard");
//	}
//
//	@Test(priority = 20)
//	public void verifyMaterialIssueSA2() throws Throwable {
//
//		homePage.clickOnTransactionMaterialIssue();
//		MaterialIssueSA2.MaterialIssuePage();
//		Thread.sleep(4000);
//		driver.navigate().to("https://demo_keus.getapcs.com/dashboard");
//	}
//
//	@Test(priority = 21)
//	public void verifyInventryReportAfterMaterialIssueSA2() throws Throwable {
//		homePage.clickOnInventryReportWithLocation();
//		InventryReportAfterMaterialIssueSA2.InventryReportPage();
//
//		Thread.sleep(4000);
//		driver.navigate().to("https://demo_keus.getapcs.com/dashboard");
//	}

//	@Test(priority = 22)
//	public void verifySOCSA2() throws Throwable {
//
//		homePage.clickOnShopOrderConfirmationCreate();
//		ShopOrderConfirmationSA2.ShopOrderConfirmationCreate();
//		Thread.sleep(4000);
//		driver.navigate().to("https://demo_keus.getapcs.com/dashboard");
//	}
//
//	@Test(priority = 23)
//	public void verifyOQCSA2() throws Throwable {
//
//		homePage.clickOnOQCCreate();
//		OQCSA2.OQCCreate();// Accepted Quantity
//		Thread.sleep(4000);
//		driver.navigate().to("https://demo_keus.getapcs.com/dashboard");
//	}
//	@Test(priority = 24)
//	public void verifyInventryReportAfterOQCSA2() throws Throwable {
//		homePage.clickOnInventryReportWithLocation();
//		InventryReportAfterOQCSA2.InventryReportPage();
//
//		Thread.sleep(4000);
//		driver.navigate().to("https://demo_keus.getapcs.com/dashboard");
//	}

//
//	@Test(priority = 25)
//	public void verifyOQCBinningSA2() throws Throwable {
//
//		homePage.clickOnOQCBinningCreate();
//		OQCBinningSA2.OQCBinningCreate();// Accepted Quantity
//		Thread.sleep(4000);
//		driver.navigate().to("https://demo_keus.getapcs.com/dashboard");
//	}
//	@Test(priority = 26)
//	public void verifyInventryReportAfterOQCBinningSA2() throws Throwable {
//		homePage.clickOnInventryReportWithLocation();
//		InventryReportAfterOQCBinningSA2.InventryReportPage();
//
//		Thread.sleep(4000);
//		driver.navigate().to("https://demo_keus.getapcs.com/dashboard");
//	}

//
//	@Test(priority = 27)
//	public void verifyMaterialIssueSA1() throws Throwable {
//
//		homePage.clickOnTransactionMaterialIssue();
//		MaterialIssueSA1.MaterialIssuePage();
//		Thread.sleep(4000);
//		driver.navigate().to("https://demo_keus.getapcs.com/dashboard");
//	}
//	@Test(priority = 28)
//	public void verifyInventryReportAfterMaterialIssueSA1() throws Throwable {
//		homePage.clickOnInventryReportWithLocation();
//		InventryReportAfterMaterialIssueSA1.InventryReportPage();
//
//		Thread.sleep(4000);
//		driver.navigate().to("https://demo_keus.getapcs.com/dashboard");
//	}

//
//	@Test(priority = 29)
//	public void verifySOCSA1() throws Throwable {
//
//		homePage.clickOnShopOrderConfirmationCreate();
//		ShopOrderConfirmationSA1.ShopOrderConfirmationCreate();
//		Thread.sleep(4000);
//		driver.navigate().to("https://demo_keus.getapcs.com/dashboard");
//	}
//
//	@Test(priority = 30)
//	public void verifyOQCSA1() throws Throwable {
//
//		homePage.clickOnOQCCreate();
//		OQCSA1.OQCCreate();// Accepted Quantity
//		Thread.sleep(4000);
//		driver.navigate().to("https://demo_keus.getapcs.com/dashboard");
//	}
//
//	@Test(priority = 31)
//	public void verifyInventryReportAfterOQCSA1() throws Throwable {
//		homePage.clickOnInventryReportWithLocation();
//		InventryReportAfterOQCSA1.InventryReportPage();
//
//		Thread.sleep(4000);
//		driver.navigate().to("https://demo_keus.getapcs.com/dashboard");
//	}

//	@Test(priority = 32)
//	public void verifyOQCBinningSA1() throws Throwable {
//
//		homePage.clickOnOQCBinningCreate();
//		OQCBinningSA1.OQCBinningCreate();// Accepted Quantity
//		Thread.sleep(4000);
//		driver.navigate().to("https://demo_keus.getapcs.com/dashboard");
//	}
//	@Test(priority = 33)
//	public void verifyInventryReportAfterOQCBinningSA1() throws Throwable {
//		homePage.clickOnInventryReportWithLocation();
//		InventryReportAfterOQCBinningSA1.InventryReportPage();
//
//		Thread.sleep(4000);
//		driver.navigate().to("https://demo_keus.getapcs.com/dashboard");
//	}

//
//	@Test(priority = 34)
//	public void verifyMaterialIssueFG() throws Throwable {
//
//		homePage.clickOnTransactionMaterialIssue();
//		MaterialIssueFG.MaterialIssuePage();
//		Thread.sleep(4000);
//		driver.navigate().to("https://demo_keus.getapcs.com/dashboard");
//	}
//	@Test(priority = 35)
//	public void verifyInventryReportAfterMaterialIssueFG() throws Throwable {
//		homePage.clickOnInventryReportWithLocation();
//		InventryReportAfterMaterialIssueFG.InventryReportPage();
//
//		Thread.sleep(4000);
//		driver.navigate().to("https://demo_keus.getapcs.com/dashboard");
//	}

//
//	@Test(priority = 36)
//	public void verifySOFG() throws Throwable {
//
//		homePage.clickOnShopOrderConfirmationCreate();
//		ShopOrderConfirmationFG.ShopOrderConfirmationCreate();
//		Thread.sleep(4000);
//		driver.navigate().to("https://demo_keus.getapcs.com/dashboard");
//	}
//
//	@Test(priority = 37)
//	public void verifyOQCFG() throws Throwable {
//
//		homePage.clickOnOQCCreate();
//		OQCFG.OQCCreate();// Accepted Quantity
//		Thread.sleep(4000);
//		driver.navigate().to("https://demo_keus.getapcs.com/dashboard");
//	}
//	@Test(priority = 38)
//	public void verifyInventryReportAfterOQCFG() throws Throwable {
//		homePage.clickOnInventryReportWithLocation();
//		InventryReportAfterOQCFG.InventryReportPage();
//
//		Thread.sleep(4000);
//		driver.navigate().to("https://demo_keus.getapcs.com/dashboard");
//	}
//
//	@Test(priority = 39)
//	public void verifyOQCBinningFG() throws Throwable {
//
//		homePage.clickOnOQCBinningCreate();
//		OQCBinningFG.OQCBinningCreate();// Accepted Quantity
//		Thread.sleep(4000);
//		driver.navigate().to("https://demo_keus.getapcs.com/dashboard");
//	}

//	@Test(priority = 40)
//	public void verifyInventryReportAfterOQCBinningFG() throws Throwable {
//		homePage.clickOnInventryReportWithLocation();
//		InventryReportAfterOQCBinningFG.InventryReportPage();
//
//		Thread.sleep(4000);
//		driver.navigate().to("https://demo_keus.getapcs.com/dashboard");
//	}

	@AfterTest
	public void afetrTest() {
//		driver.manage().window().minimize();
//		driver.quit();
	}

}
