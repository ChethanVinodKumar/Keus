package com.getapcs.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.getapcs.Engineering.EnggBom_ReleaseBom_Table_Page;
import com.getapcs.Engineering.Engg_BOM_Edit_Page;
import com.getapcs.Engineering.Engg_Bom_Table_Page;
import com.getapcs.Engineering.Item_Master_Edit_Page;
import com.getapcs.Engineering.Item_Master_Table_Page;
import com.getapcs.Sales.ItemPriceList_EditPage;
import com.getapcs.Sales.ItemPriceList_TablePage;
import com.getapcs.Sales.QuoteEditPage;
import com.getapcs.Sales.Quote_TablePage;
import com.getapcs.Sales.RFQ_EditPage;
import com.getapcs.Sales.RFQ_TablePage;
import com.getapcs.TransactionEdit.Purchase_Order_Edit;
import com.getapcs.TransactionEdit.ShopOrder;
import com.getapcs.TransactionEdit.VerifyPR_EditPage;
import com.getapcs.TransactionEdit.VerifySalesOrderEditPage;
import com.getapcs.TransactionTable.Binning_TablePage;
import com.getapcs.TransactionTable.DeliveryOrder_TablePage;
import com.getapcs.TransactionTable.Grin_TablePage;
import com.getapcs.TransactionTable.IQC_Confirmation_TablePage;
import com.getapcs.TransactionTable.Invoice_TablePage;
import com.getapcs.TransactionTable.Material_Issue_TablePage;
import com.getapcs.TransactionTable.OQC_Binning_TablePage;
import com.getapcs.TransactionTable.OQC_TablePage;
import com.getapcs.TransactionTable.PurchaseOrder_TablePage;
import com.getapcs.TransactionTable.PurchaseRequisationTablePage;
import com.getapcs.TransactionTable.SalesOrder_TablePage;
import com.getapcs.TransactionTable.ShopOrder_Confirmation_TablePage;
import com.getapcs.TransactionTable.ShopOrder_TablePage;
import com.getapcs.base.Testbase1;
import com.getapcs.pages.HomePage;
import com.getapcs.pages.LoginPage;

public class TEST_Edit_Table extends Testbase1 {
	LoginPage loginPage;
	HomePage homePage;

	Item_Master_Edit_Page itemMasterEditPage;
	Engg_BOM_Edit_Page enggBomEditPage;
	ItemPriceList_EditPage PriceList_EditPage;
	RFQ_EditPage rfq_EditPage;
	QuoteEditPage quoteEditPage;

	VerifySalesOrderEditPage salesOrderEdit;
	VerifyPR_EditPage VerifyPR_EditPage;
	Purchase_Order_Edit Purchase_Order_Edit;
	ShopOrder ShopOrder;

	Item_Master_Table_Page Item_Master_Table_Page;
	Engg_Bom_Table_Page Engg_Bom_Table_Page;
	EnggBom_ReleaseBom_Table_Page EnggBom_ReleaseBom_Table_Page;
	ItemPriceList_TablePage ItemPriceList_TablePage;
	RFQ_TablePage RFQ_TablePage;
	Quote_TablePage Quote_TablePage;
	SalesOrder_TablePage SalesOrder_TablePage;
	ShopOrder_TablePage ShopOrder_TablePage;
	Material_Issue_TablePage Material_Issue_TablePage;
	PurchaseRequisationTablePage PurchaseRequisationTablePage;
	PurchaseOrder_TablePage PurchaseOrder_TablePage;
	Grin_TablePage Grin_TablePage;
	IQC_Confirmation_TablePage IQC_Confirmation_TablePage;
	Binning_TablePage Binning_TablePage;
	OQC_TablePage OQC_TablePage;
	OQC_Binning_TablePage OQC_Binning_TablePage;
	DeliveryOrder_TablePage DeliveryOrder_TablePage;
	Invoice_TablePage Invoice_TablePage;
	ShopOrder_Confirmation_TablePage ShopOrder_Confirmation_TablePage;

	public TEST_Edit_Table() {
		super();
	}

	@BeforeTest
	public void setUp() throws Throwable {
		initialization();
		loginPage = new LoginPage();
		homePage = loginPage.login("admin@mail.com", "user@123");
		itemMasterEditPage = new Item_Master_Edit_Page();
		enggBomEditPage = new Engg_BOM_Edit_Page();
		PriceList_EditPage = new ItemPriceList_EditPage();
		quoteEditPage = new QuoteEditPage();
		rfq_EditPage = new RFQ_EditPage();
		quoteEditPage = new QuoteEditPage();
		salesOrderEdit = new VerifySalesOrderEditPage();
		VerifyPR_EditPage = new VerifyPR_EditPage();
		Purchase_Order_Edit = new Purchase_Order_Edit();
		ShopOrder = new ShopOrder();

		Item_Master_Table_Page = new Item_Master_Table_Page();
		Engg_Bom_Table_Page = new Engg_Bom_Table_Page();
		EnggBom_ReleaseBom_Table_Page = new EnggBom_ReleaseBom_Table_Page();
		ItemPriceList_TablePage = new ItemPriceList_TablePage();
		RFQ_TablePage = new RFQ_TablePage();
		Quote_TablePage = new Quote_TablePage();
		SalesOrder_TablePage = new SalesOrder_TablePage();
		ShopOrder_TablePage = new ShopOrder_TablePage();
		Material_Issue_TablePage = new Material_Issue_TablePage();
		PurchaseRequisationTablePage = new PurchaseRequisationTablePage();
		PurchaseOrder_TablePage = new PurchaseOrder_TablePage();
		Grin_TablePage = new Grin_TablePage();
		IQC_Confirmation_TablePage = new IQC_Confirmation_TablePage();
		Binning_TablePage = new Binning_TablePage();
		ShopOrder_Confirmation_TablePage = new ShopOrder_Confirmation_TablePage();
		OQC_TablePage = new OQC_TablePage();
		OQC_Binning_TablePage = new OQC_Binning_TablePage();
		DeliveryOrder_TablePage = new DeliveryOrder_TablePage();
		Invoice_TablePage = new Invoice_TablePage();
	}

//	@Test(priority = 1)
//	public void verifyItemMasterEdit() throws Throwable {
//
//		homePage.clickOnItemMasterEdit();
//
//		itemMasterEditPage.itemMasterEdit("Test Description");
//		Thread.sleep(4000);
//		driver.navigate().to("https://demo_keus.getapcs.com/dashboard");
//	}
//
//	@Test(priority = 2)
//	public void verifyBomEdit() throws Throwable {
//		homePage.clickOnBomEditPage();
//		enggBomEditPage.enggBomEdit("40", // Quantity
//				"50", // scarpAllowance
//				"TestRemark1", // Remark
//				"1", // Version
//				"20", // quantityPer
//				"100", // probability
//				"TEST Alternate Remark1", // alternateRemark
//				"40", // quantityNRE
//				"20");
//		Thread.sleep(4000);
//		driver.navigate().to("https://demo_keus.getapcs.com/dashboard");
//
//	}
//
//	@Test(priority = 3)
//	public void verifySalesItemPriceListEdit() throws AWTException, InterruptedException {
//
//		// Purchase Order Create Page
//
//		PriceList_EditPage.ItemPriceListEdit("110", "220", "51", "120", "100", "90");
//
//		Thread.sleep(4000);
//		driver.navigate().to("https://demo_keus.getapcs.com/dashboard");
//	}
//
//	@Test(priority = 4)
//	public void verifySalesRFQEdit() throws Throwable {
//
//		// Purchase Order Create Page
//
//		rfq_EditPage.RFQEdit("TEST Rfq Number111", "TEST Remarks", "TEST Reason For Modification", "10",
//				"TEST Note111");
//
//		Thread.sleep(4000);
//		driver.navigate().to("https://demo_keus.getapcs.com/dashboard");
//	}
//
//	@Test(priority = 5)
//	public void verifyQuoteEdit() throws Throwable {
//
//		// Purchase Order Create Page
//
//		quoteEditPage.QuoteEdit("TEST Quote Ref1", "10", "10", "10", "8", "8", "8", "8", "10", "10", "10", "10", "10",
//				"9", "9", "100", "9", "8", "7", "7", "TEST Special Terms1");
//
//		Thread.sleep(4000);
//		driver.navigate().to("https://demo-tras.getapcs.com/dashboard");
//	}
//
//	@Test(priority = 6)
//	public void verifySalesOrderEdit() throws Throwable {
//		homePage.clickOnSalesOrderEdit();
//		salesOrderEdit.salesOrderEdit("PO-8778");// PO Number
//		Thread.sleep(4000);
//		driver.navigate().to("https://demo_keus.getapcs.com/dashboard");
//	}
//
//	@Test(priority = 7)
//	public void verifyPR_Edit() throws Throwable {
//		homePage.clickOnPREditPage();
//		VerifyPR_EditPage.verifyPR_Edit("TEST Pupose1");
//		Thread.sleep(4000);
//		driver.navigate().to("https://demo_keus.getapcs.com/dashboard");
//	}
//
//	@Test(priority = 8)
//	public void verifyPoEdit() throws Throwable {
//		homePage.clickonPOEdit();
//		Purchase_Order_Edit.purchaseOrderEditPage("123RefNo");
//	}
//
//	@Test(priority = 9)
//	public void verifyShopOrderEdit() throws Throwable {
//
//		// Purchase Order Create Page
//
//		homePage.clickOnTransactionShopOrderEdit();
//		ShopOrder.ShopOrderEdit();
//		Thread.sleep(4000);
//		driver.navigate().to("https://demo_keus.getapcs.com/dashboard");
//	}

//****************Table Pages******************//

	@Test(priority = 10)
	public void verifyItemMasterTable() throws Throwable {

		homePage.clickOnItemMasterTable();
		Item_Master_Table_Page.itemMasterTable();
		Thread.sleep(4000);
		driver.navigate().to("https://demo_keus.getapcs.com/dashboard");
	}

//	@Test(priority = 11)
//	public void verifyEnggBomTable() throws Throwable {
//
//		homePage.clickOnBomTablePage();
//		Engg_Bom_Table_Page.EnggBOMTable();
//		Thread.sleep(4000);
//		driver.navigate().to("https://demo_keus.getapcs.com/dashboard");
//	}
//
//	@Test(priority = 11)
//	public void verifyEnggBomReleaseBomTable() throws Throwable {
//
//		homePage.clickOnReleaseBomPage();
//		EnggBom_ReleaseBom_Table_Page.EnggBOMReleaseBomTable();
//		Thread.sleep(4000);
//		driver.navigate().to("https://demo_keus.getapcs.com/dashboard");
//	}
//
//	@Test(priority = 12)
//	public void verifyItemPriceListTable() throws Throwable {
//
//		homePage.clickonSalesItemPriceListModifyorView();
//		ItemPriceList_TablePage.ItemPriceListTable();
//		Thread.sleep(4000);
//		driver.navigate().to("https://demo_keus.getapcs.com/dashboard");
//	}
//
//	@Test(priority = 13)
//	public void verifyRfqTable() throws Throwable {
//
//		homePage.clickonSalesRfqModifyorView();
//		RFQ_TablePage.RFQ_Table();
//		Thread.sleep(4000);
//		driver.navigate().to("https://demo_keus.getapcs.com/dashboard");
//	}
//
//	@Test(priority = 14)
//	public void verifyQuoteTable() throws Throwable {
//
//		homePage.clickonSalesQuoteModifyorView();
//		Quote_TablePage.Quote_Table();
//		Thread.sleep(4000);
//		driver.navigate().to("https://demo_keus.getapcs.com/dashboard");
//	}
//
//	@Test(priority = 15)
//	public void verifySalesOrderTable() throws Throwable {
//
//		homePage.clickOnSalesOrderTable();
//		SalesOrder_TablePage.SalesOrderTable();
//		Thread.sleep(4000);
//		driver.navigate().to("https://demo_keus.getapcs.com/dashboard");
//	}
//
//	@Test(priority = 16)
//	public void verifyShopOrderTable() throws Throwable {
//
//		homePage.clickOnTransactionShopOrder();
//		ShopOrder_TablePage.ShopOrderTable();
//		Thread.sleep(4000);
//		driver.navigate().to("https://demo_keus.getapcs.com/dashboard");
//	}
//
//	@Test(priority = 17)
//	public void verifyMaterialIssueTable() throws Throwable {
//
//		homePage.clickOnTransactionMaterialIssue();
//		Material_Issue_TablePage.Material_Issue_Table();
//		Thread.sleep(4000);
//		driver.navigate().to("https://demo_keus.getapcs.com/dashboard");
//	}
//
//	@Test(priority = 18)
//	public void verifyPRTable() throws Throwable {
//
//		homePage.clickOnPRTablePage();
//		PurchaseRequisationTablePage.PurchaseRequisationTable();
//		Thread.sleep(4000);
//		driver.navigate().to("https://demo_keus.getapcs.com/dashboard");
//	}
//
//	@Test(priority = 19)
//	public void verifyPOTable() throws Throwable {
//
//		homePage.clickonPOTable();
//		PurchaseOrder_TablePage.PurchaseOrder_Table();
//		Thread.sleep(4000);
//		driver.navigate().to("https://demo_keus.getapcs.com/dashboard");
//	}
//
//	@Test(priority = 20)
//	public void verifyGRINTable() throws Throwable {
//
//		homePage.clickOnGRINTable();
//		Grin_TablePage.Grin_Table();
//		Thread.sleep(4000);
//		driver.navigate().to("https://demo_keus.getapcs.com/dashboard");
//	}
//
//	@Test(priority = 21)
//	public void verifyIQCConfirmationTable() throws Throwable {
//
//		homePage.clickOnIQCConfirmationTable();
//		IQC_Confirmation_TablePage.IQC_Confirmation_Table();
//		Thread.sleep(4000);
//		driver.navigate().to("https://demo_keus.getapcs.com/dashboard");
//	}
//
//	@Test(priority = 22)
//	public void verifyBinningTable() throws Throwable {
//
//		homePage.clickOnBinningTable();
//		Binning_TablePage.BinningTable();
//		Thread.sleep(4000);
//		driver.navigate().to("https://demo_keus.getapcs.com/dashboard");
//	}
//
//	@Test(priority = 23)
//	public void verifySOCTable() throws Throwable {
//
//		homePage.clickOnShopOrderConfirmationTable();
//		ShopOrder_Confirmation_TablePage.ShopOrder_Confirmation_Table();
//		Thread.sleep(4000);
//		driver.navigate().to("https://demo_keus.getapcs.com/dashboard");
//	}
//
//	@Test(priority = 24)
//	public void verifyOQCTable() throws Throwable {
//
//		homePage.clickOnOQCTable();
//		OQC_TablePage.OQC_Table();
//		Thread.sleep(4000);
//		driver.navigate().to("https://demo_keus.getapcs.com/dashboard");
//	}
//
//	@Test(priority = 25)
//	public void verifyOQCBiningTable() throws Throwable {
//
//		homePage.clickOnOQCBinningTable();
//		OQC_Binning_TablePage.OQC_Binning_Table();
//		Thread.sleep(4000);
//		driver.navigate().to("https://demo_keus.getapcs.com/dashboard");
//	}
//
//	@Test(priority = 26)
//	public void verifyDOTable() throws Throwable {
//
//		homePage.clickOnDOTable();
//		DeliveryOrder_TablePage.DeliveryOrder_Table();
//		Thread.sleep(4000);
//		driver.navigate().to("https://demo_keus.getapcs.com/dashboard");
//	}
//
//	@Test(priority = 27)
//	public void verifyInvoiceTable() throws Throwable {
//
//		homePage.clickOnInvoiceTable();
//		Invoice_TablePage.Invoice_Table();
//		Thread.sleep(4000);
//		driver.navigate().to("https://demo_keus.getapcs.com/dashboard");
//	}
}
