package com.keus.getapcs.testcases;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.getapcs.Engineering.EnggBOM_ReleaseBOM;
import com.getapcs.Engineering.EnggBom_ReleaseBom_Table_Page;
import com.getapcs.Engineering.Engg_BOM_Create_Page;
import com.getapcs.Engineering.Engg_BOM_Edit_Page;
import com.getapcs.Engineering.Engg_Bom_Table_Page;
import com.getapcs.Engineering.Item_Master_Create_Page_FG;
import com.getapcs.Engineering.Item_Master_Create_Page_PP;
import com.getapcs.Engineering.Item_Master_Edit_Page;
import com.getapcs.Engineering.Item_Master_Table_Page;
import com.getapcs.Sales.ItemPriceList_CreatePage;
import com.getapcs.Sales.ItemPriceList_EditPage;
import com.getapcs.Sales.ItemPriceList_TablePage;
import com.getapcs.Sales.QuoteCreatePage;
import com.getapcs.Sales.QuoteEditPage;
import com.getapcs.Sales.Quote_TablePage;
import com.getapcs.Sales.RFQ_CreatePage;
import com.getapcs.Sales.RFQ_EditPage;
import com.getapcs.Sales.RFQ_ReleaseCS;
import com.getapcs.Sales.RFQ_TablePage;
import com.getapcs.SecondaryMaster.Price_List;
import com.getapcs.Transaction.Binning;
import com.getapcs.Transaction.DeliveryOrder;
import com.getapcs.Transaction.Grin;
import com.getapcs.Transaction.IQCConfirmation;
import com.getapcs.Transaction.MaterialIssue;
import com.getapcs.Transaction.OQC;
import com.getapcs.Transaction.OQCBinning;
import com.getapcs.Transaction.PRApproval1;
import com.getapcs.Transaction.PRApproval2;
import com.getapcs.Transaction.Purchase_Order;
import com.getapcs.Transaction.Purchase_Requisation;
import com.getapcs.Transaction.SalesOrder;
import com.getapcs.Transaction.ShopOrder;
import com.getapcs.Transaction.ShopOrderConfirmation;
import com.getapcs.Transaction.VerifyInvoiceCreate;
import com.getapcs.TransactionEdit.Purchase_Order_Edit;
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
import com.getapcs.home.login.HomePage;
import com.getapcs.home.login.LoginPage;

public class TEST_Create_Edit_Table extends Testbase1 {

	public final static String priceList = "TEST PriceList 75";
	public final static String fg = "FG-75";
	public final static String pp = "PP-75";

	LoginPage loginPage;
	HomePage homePage;

	// Create Page
	Item_Master_Create_Page_FG itemMasterCreatePage;
	Item_Master_Create_Page_PP itemMasterCreatePage1;
	Engg_BOM_Create_Page enggBomCreatePage;
	Price_List Price_List;
	EnggBOM_ReleaseBOM releaseBom;
	ItemPriceList_CreatePage priceList_CreatePage;
	RFQ_CreatePage rfq_CreatePage;
	RFQ_ReleaseCS rfq_ReleaseCS;
	QuoteCreatePage quoteCreatePage;
	SalesOrder SalesOrder;
	MaterialIssue MaterialIssue;
	Purchase_Requisation Purchase_Requisation;
	PRApproval1 PRApproval1;
	PRApproval2 PRApproval2;
	Purchase_Order Purchase_Order;
	Grin Grin;
	IQCConfirmation IQCConfirmation;
	Binning Binning;
	ShopOrderConfirmation ShopOrderConfirmation;
	OQC OQC;
	OQCBinning OQCBinning;
	DeliveryOrder DeliveryOrder;
	VerifyInvoiceCreate VerifyInvoiceCreate;

	// Edit Page
	Item_Master_Edit_Page itemMasterEditPage;
	Engg_BOM_Edit_Page enggBomEditPage;
	ItemPriceList_EditPage PriceList_EditPage;
	RFQ_EditPage rfq_EditPage;
	QuoteEditPage quoteEditPage;
	VerifySalesOrderEditPage salesOrderEdit;
	VerifyPR_EditPage VerifyPR_EditPage;
	Purchase_Order_Edit Purchase_Order_Edit;
	ShopOrder ShopOrder;

	// Table Page
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

	public TEST_Create_Edit_Table() {
		super();
	}

	@BeforeTest
	public void setUp() throws Throwable {
		initialization();
		loginPage = new LoginPage();
		homePage = loginPage.login("admin@mail.com", "user@123");

		// Create Page
		itemMasterCreatePage = new Item_Master_Create_Page_FG();
		itemMasterCreatePage1 = new Item_Master_Create_Page_PP();
		itemMasterEditPage = new Item_Master_Edit_Page();
		enggBomCreatePage = new Engg_BOM_Create_Page();
		enggBomEditPage = new Engg_BOM_Edit_Page();
		releaseBom = new EnggBOM_ReleaseBOM();
		priceList_CreatePage = new ItemPriceList_CreatePage();
		rfq_CreatePage = new RFQ_CreatePage();
		rfq_ReleaseCS = new RFQ_ReleaseCS();
		quoteCreatePage = new QuoteCreatePage();
		SalesOrder = new SalesOrder();
		ShopOrder = new ShopOrder();
		MaterialIssue = new MaterialIssue();
		Purchase_Order = new Purchase_Order();
		Purchase_Requisation = new Purchase_Requisation();
		PRApproval1 = new PRApproval1();
		PRApproval2 = new PRApproval2();
		Grin = new Grin();
		IQCConfirmation = new IQCConfirmation();
		Binning = new Binning();
		ShopOrderConfirmation = new ShopOrderConfirmation();
		OQC = new OQC();
		OQCBinning = new OQCBinning();
		DeliveryOrder = new DeliveryOrder();
		Price_List = new Price_List();

		// Edit Page
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
		VerifyInvoiceCreate = new VerifyInvoiceCreate();

		// Table
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

	@Test(priority = 1)
	public void verifyPrice_ListCreate() throws AWTException, InterruptedException {
		Thread.sleep(4000);
		Price_List.Price_ListCreate(priceList, "TEST Description", "TEST Remarks");

		Thread.sleep(4000);
		driver.navigate().to("https://demo_keus.getapcs.com/dashboard");
	}

	@Test(priority = 3)
	public void verifyItemMasterCreate() throws Throwable {

		homePage.clickOnItemMasterCreate();
		itemMasterCreatePage.itemMasterCreate(fg, "Test Description", "76543456", "Test Manufacturer or CustomerName",
				"DR-N-5676", "REV-43", "T-DOC-RET-21", "10", "30", "300", "323", "TEST-FootPrint", "TEST ProcessStep",
				"TEST descriptinRouting", "9", "10", "100", "5", "10", "Test Reorder", "TEST 2Bin", "TEST LeadTime",
				"TEST expiryDays", "TEST Inspection Int Days", "TEST specialInstructions", "TEST instructions", "10",
				"TEST BatchSize", "565");
		Thread.sleep(4000);
		driver.navigate().to("https://demo_keus.getapcs.com/dashboard");

		homePage.clickOnItemMasterCreate();
		itemMasterCreatePage1.itemMasterCreate(pp, "Test Description", "76543456", "Test Manufacturer or CustomerName",
				"DR-N-5676", "REV-43", "T-DOC-RET-21", "10", "30", "300", "323", "TEST-FootPrint", "TEST ProcessStep",
				"TEST descriptinRouting", "9", "10", "100", "5", "10", "Test Reorder", "TEST 2Bin", "TEST LeadTime",
				"TEST expiryDays", "TEST Inspection Int Days", "TEST specialInstructions", "TEST instructions", "10",
				"TEST BatchSize", "565");
		Thread.sleep(4000);
		driver.navigate().to("https://demo_keus.getapcs.com/dashboard");
	}

	@Test(priority = 4)
	public void verifyItemMasterTable() throws Throwable {

		homePage.clickOnItemMasterTable();
		Item_Master_Table_Page.itemMasterTable();
		Thread.sleep(4000);
		driver.navigate().to("https://demo_keus.getapcs.com/dashboard");
	}

	@Test(priority = 5)
	public void verifyBomCreate() throws Throwable {

		homePage.clickOnBomCreatePage();
		enggBomCreatePage.bomCreate("1", // Quantity
				"50", // scarpAllowance
				"TestRemark", // Remark
				"1", // Version
				"10", // quantityPer
				"100", // probability
				"TEST Alternate Remark", // alternateRemark
				"1", // quantityNRE
				"20");// cost
		Thread.sleep(4000);
		driver.navigate().to("https://demo_keus.getapcs.com/dashboard");
	}

	@Test(priority = 6)
	public void verifyEnggBomTable() throws Throwable {

		homePage.clickOnBomTablePage();
		Engg_Bom_Table_Page.EnggBOMTable();
		Thread.sleep(4000);
		driver.navigate().to("https://demo_keus.getapcs.com/dashboard");
	}

	@Test(priority = 7)
	public void verifyReleaseBom() throws Throwable {
		homePage.clickOnReleaseBomPage();
		releaseBom.releaseBom("Test Remark");// Remark
		Thread.sleep(4000);
		driver.navigate().to("https://demo_keus.getapcs.com/dashboard");
	}

	@Test(priority = 8)
	public void verifyEnggBomReleaseBomTable() throws Throwable {

		homePage.clickOnReleaseBomPage();
		EnggBom_ReleaseBom_Table_Page.EnggBOMReleaseBomTable();
		Thread.sleep(4000);
		driver.navigate().to("https://demo_keus.getapcs.com/dashboard");
	}

	@Test(priority = 9)
	public void verifySalesItemPriceListCreate() throws AWTException, InterruptedException {

		// Purchase Order Create Page
		homePage.clickonTransactionPriceListCreate();
		priceList_CreatePage.ItemPriceListCreate("50", "200", "50", "100", "200", "40");

		Thread.sleep(4000);
		driver.navigate().to("https://demo_keus.getapcs.com/dashboard");
	}

	@Test(priority = 10)
	public void verifyItemPriceListTable() throws Throwable {

		homePage.clickonSalesItemPriceListModifyorView();
		ItemPriceList_TablePage.ItemPriceListTable();
		Thread.sleep(4000);
		driver.navigate().to("https://demo_keus.getapcs.com/dashboard");
	}

	@Test(priority = 11)
	public void verifySalesRFQCreate() throws Throwable {

		// Purchase Order Create Page

		rfq_CreatePage.RFQCreate("TEST Rfq Number", "10", "TEST Note");

		Thread.sleep(4000);
		driver.navigate().to("https://demo_keus.getapcs.com/dashboard");
	}

	@Test(priority = 12)
	public void verifySalesRFQCS() throws Throwable {

		// Purchase Order Create Page
		homePage.clickonSalesRfqModifyorView();
		Thread.sleep(4000);
		rfq_ReleaseCS.RFQCs();

		Thread.sleep(4000);
		driver.navigate().to("https://demo_keus.getapcs.com/dashboard");
	}

	@Test(priority = 13)
	public void verifyRfqTable() throws Throwable {

		homePage.clickonSalesRfqModifyorView();
		RFQ_TablePage.RFQ_Table();
		Thread.sleep(4000);
		driver.navigate().to("https://demo_keus.getapcs.com/dashboard");
	}

	@Test(priority = 14)
	public void verifyQuoteCreate() throws Throwable {

		// Purchase Order Create Page

		quoteCreatePage.QuoteCreate("TEST Quote Ref", "10", "10", "5", "7", "7", "7", "7", "10", "10", "100", "9", "9",
				"8", "8", "100", "7", "7", "6", "7", "TEST Special Terms");

		Thread.sleep(4000);
		driver.navigate().to("https://demo_keus.getapcs.com/dashboard");
	}

	@Test(priority = 15)
	public void verifyQuoteTable() throws Throwable {

		homePage.clickonSalesQuoteModifyorView();
		Quote_TablePage.Quote_Table();
		Thread.sleep(4000);
		driver.navigate().to("https://demo_keus.getapcs.com/dashboard");
	}

	@Test(priority = 16)
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

	@Test(priority = 17)
	public void verifySalesOrderTable() throws Throwable {

		homePage.clickOnSalesOrderTable();
		SalesOrder_TablePage.SalesOrderTable();
		Thread.sleep(4000);
		driver.navigate().to("https://demo_keus.getapcs.com/dashboard");
	}

	@Test(priority = 18)
	public void verifyShopOrderCreate() throws Throwable {

		homePage.clickOnTransactionShopOrderCreate();
		ShopOrder.ShopOrderCreate();
		Thread.sleep(4000);
		driver.navigate().to("https://demo_keus.getapcs.com/dashboard");
	}

	@Test(priority = 19)
	public void verifyShopOrderTable() throws Throwable {

		homePage.clickOnTransactionShopOrder();
		ShopOrder_TablePage.ShopOrderTable();
		Thread.sleep(4000);
		driver.navigate().to("https://demo_keus.getapcs.com/dashboard");
	}

	@Test(priority = 20)
	public void verifyMaterialIssue() throws Throwable {

		homePage.clickOnTransactionMaterialIssue();
		MaterialIssue.MaterialIssuePage();
		Thread.sleep(4000);
		driver.navigate().to("https://demo_keus.getapcs.com/dashboard");
	}

	@Test(priority = 21)
	public void verifyMaterialIssueTable() throws Throwable {

		homePage.clickOnTransactionMaterialIssue();
		Material_Issue_TablePage.Material_Issue_Table();
		Thread.sleep(4000);
		driver.navigate().to("https://demo_keus.getapcs.com/dashboard");
	}

	@Test(priority = 22)
	public void verifyPRcreate() throws Throwable {
		homePage.clickOnPRCreatePage();
		Purchase_Requisation.prCreatePage();
		Thread.sleep(4000);
		driver.navigate().to("https://demo_keus.getapcs.com/dashboard");
	}

	@Test(priority = 23)
	public void verifyPR_Approval1() throws Throwable {
		homePage.clickOnPOApproval1();
		PRApproval1.prApproval1Page();
		Thread.sleep(4000);
		driver.navigate().to("https://demo_keus.getapcs.com/dashboard");
	}

	@Test(priority = 24)
	public void verifyPR_Approval2() throws Throwable {
		homePage.clickOnPRApproval2();
		PRApproval2.prApproval2Page();
		Thread.sleep(4000);
		driver.navigate().to("https://demo_keus.getapcs.com/dashboard");
	}

	@Test(priority = 25)
	public void verifyPRTable() throws Throwable {

		homePage.clickOnPRTablePage();
		PurchaseRequisationTablePage.PurchaseRequisationTable();
		Thread.sleep(4000);
		driver.navigate().to("https://demo_keus.getapcs.com/dashboard");
	}

	@Test(priority = 26)
	public void verifyPurchaseOrderCreate() throws Throwable {

		// Purchase Order Create Page
		homePage.clickontransactionPOcreate();
		Purchase_Order.purchaseOrderCreatePage("10", "1000", "TEST Special Instructions", "8", "8", "8", "8", "100",
				"Test Special Terms", "Test IncoTerms");
		Thread.sleep(4000);
		driver.navigate().to("https://demo_keus.getapcs.com/dashboard");
	}

	@Test(priority = 27)
	public void verifyPurchaseOrderApproval1() throws AWTException, InterruptedException {
		// Purchase Order POApproval 1

		homePage.clickontransactionPOModelAndView();

		System.out.println("Before Approval");
		WebElement table = driver.findElement(By.xpath("(//table[@class='table table-striped'])[1]"));

		// Extract the data from the first row of the table
		WebElement firstRow = table.findElement(By.xpath("//tbody/tr[1]")); // Use tr[2] to skip the header row
		String projectNumber = firstRow.findElement(By.xpath(".//td[2]")).getText(); // 2nd column for project number
		String approvalStatus = firstRow.findElement(By.xpath(".//td[6]")).getText(); // 6th column for approval status

		// Output the extracted data
		System.out.println("Project Number: " + projectNumber);
		System.out.println("Approval Status: " + approvalStatus);
		Thread.sleep(4000);
		driver.navigate().to("https://demo_keus.getapcs.com/dashboard");

		homePage.clickontransactionPOApproval1();
		Purchase_Order.purchaseOrderApproval1();

		System.out.println("After Approval");
		WebElement table1 = driver.findElement(By.xpath("(//table[@class='table table-striped'])[1]"));

		// Extract the data from the first row of the table
		WebElement firstRow1 = table1.findElement(By.xpath("//tbody/tr[1]")); // Use tr[2] to skip the header row
		String projectNumber1 = firstRow1.findElement(By.xpath(".//td[2]")).getText(); // 2nd column for project number
		String approvalStatus1 = firstRow1.findElement(By.xpath(".//td[6]")).getText(); // 6th column for approval
																						// status

		Thread.sleep(4000);

		// Output the extracted data
		System.out.println("Project Number: " + projectNumber1);
		System.out.println("Approval Status: " + approvalStatus1);

		Thread.sleep(4000);
		driver.navigate().to("https://demo_keus.getapcs.com/dashboard");
	}

	@Test(priority = 28)
	public void verifyPurchaseOrderApproval2() throws AWTException, InterruptedException {
//		//Purchase Order POApproval 2

		homePage.clickontransactionPOModelAndView();

		System.out.println("Before Approval");
		WebElement table2 = driver.findElement(By.xpath("(//table[@class='table table-striped'])[1]"));

		// Extract the data from the first row of the table
		WebElement firstRow2 = table2.findElement(By.xpath("//tbody/tr[1]")); // Use tr[2] to skip the header row
		String projectNumber2 = firstRow2.findElement(By.xpath(".//td[2]")).getText(); // 2nd column for project number
		String approvalStatus2 = firstRow2.findElement(By.xpath(".//td[7]")).getText(); // 6th column for approval
																						// status

		// Output the extracted data
		System.out.println("Project Number: " + projectNumber2);
		System.out.println("Approval Status: " + approvalStatus2);
		Thread.sleep(4000);
		driver.navigate().to("https://demo_keus.getapcs.com/dashboard");

		homePage.clickontransactionPOApproval2();
		Purchase_Order.purchaseOrderApproval2();

		System.out.println("After Approval");
		WebElement table3 = driver.findElement(By.xpath("(//table[@class='table table-striped'])[1]"));

		// Extract the data from the first row of the table
		WebElement firstRow3 = table3.findElement(By.xpath("//tbody/tr[1]")); // Use tr[2] to skip the header row
		String projectNumber3 = firstRow3.findElement(By.xpath(".//td[2]")).getText(); // 2nd column for project number
		String approvalStatus3 = firstRow3.findElement(By.xpath(".//td[7]")).getText(); // 6th column for approval
																						// status
		Thread.sleep(4000);
		// Output the extracted data

		System.out.println("Project Number: " + projectNumber3);
		System.out.println("Approval Status: " + approvalStatus3);

		Thread.sleep(4000);
		driver.navigate().to("https://demo_keus.getapcs.com/dashboard");
	}

	@Test(priority = 29)
	public void verifyPOTable() throws Throwable {

		homePage.clickonPOTable();
		PurchaseOrder_TablePage.PurchaseOrder_Table();
		Thread.sleep(4000);
		driver.navigate().to("https://demo_keus.getapcs.com/dashboard");
	}

	@Test(priority = 30)
	public void verifyGRINCreate() throws Throwable {
		homePage.clickOnGRINCreate();
		Grin.grinCreatePage("TEST-IN-1122", // invoiceNo
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

	@Test(priority = 31)
	public void verifyGRINTable() throws Throwable {

		homePage.clickOnGRINTable();
		Grin_TablePage.Grin_Table();
		Thread.sleep(4000);
		driver.navigate().to("https://demo_keus.getapcs.com/dashboard");
	}

	@Test(priority = 32)
	public void verifyIQCCreate() throws Throwable {
		homePage.clickOnIQCConfirmationCreate();
		IQCConfirmation.iqcConfirmationCreatePage();

		Thread.sleep(4000);
		driver.navigate().to("https://demo_keus.getapcs.com/dashboard");
	}

	@Test(priority = 33)
	public void verifyIQCConfirmationTable() throws Throwable {

		homePage.clickOnIQCConfirmationTable();
		IQC_Confirmation_TablePage.IQC_Confirmation_Table();
		Thread.sleep(4000);
		driver.navigate().to("https://demo_keus.getapcs.com/dashboard");
	}

	@Test(priority = 34)
	public void verifyBinningCreate() throws Throwable {
		homePage.clickOnBinningCreate();
		Binning.BinningCreatePage();

		Thread.sleep(4000);
		driver.navigate().to("https://demo_keus.getapcs.com/dashboard");
	}

	@Test(priority = 35)
	public void verifyBinningTable() throws Throwable {

		homePage.clickOnBinningTable();
		Binning_TablePage.BinningTable();
		Thread.sleep(4000);
		driver.navigate().to("https://demo_keus.getapcs.com/dashboard");
	}

	@Test(priority = 36)
	public void verifyMaterialIssueAfterPRPO() throws Throwable {

		homePage.clickOnTransactionMaterialIssue();
		MaterialIssue.MaterialIssuePage();
		Thread.sleep(4000);
		driver.navigate().to("https://demo_keus.getapcs.com/dashboard");
	}

	@Test(priority = 37)
	public void verifyShopOrderConfirmation() throws Throwable {

		homePage.clickOnShopOrderConfirmationCreate();
		ShopOrderConfirmation.ShopOrderConfirmationCreate();
		Thread.sleep(4000);
		driver.navigate().to("https://demo_keus.getapcs.com/dashboard");
	}

	@Test(priority = 38)
	public void verifySOCTable() throws Throwable {

		homePage.clickOnShopOrderConfirmationTable();
		ShopOrder_Confirmation_TablePage.ShopOrder_Confirmation_Table();
		Thread.sleep(4000);
		driver.navigate().to("https://demo_keus.getapcs.com/dashboard");
	}

	@Test(priority = 39)
	public void verifyOQC() throws Throwable {

		homePage.clickOnOQCCreate();
		OQC.OQCCreate();
		Thread.sleep(4000);
		driver.navigate().to("https://demo_keus.getapcs.com/dashboard");
	}

	@Test(priority = 40)
	public void verifyOQCTable() throws Throwable {

		homePage.clickOnOQCTable();
		OQC_TablePage.OQC_Table();
		Thread.sleep(4000);
		driver.navigate().to("https://demo_keus.getapcs.com/dashboard");
	}

	@Test(priority = 41)
	public void verifyOQCBinning() throws Throwable {

		homePage.clickOnOQCBinningCreate();
		OQCBinning.OQCBinningCreate();
		Thread.sleep(4000);
		driver.navigate().to("https://demo_keus.getapcs.com/dashboard");
	}

	@Test(priority = 42)
	public void verifyOQCBiningTable() throws Throwable {

		homePage.clickOnOQCBinningTable();
		OQC_Binning_TablePage.OQC_Binning_Table();
		Thread.sleep(4000);
		driver.navigate().to("https://demo_keus.getapcs.com/dashboard");
	}

	@Test(priority = 43)
	public void verifyDOCreate() throws Throwable {

		homePage.clickOnDOCreate();
		DeliveryOrder.DeliveryOrderCreate();
		Thread.sleep(4000);
		driver.navigate().to("https://demo_keus.getapcs.com/dashboard");
	}

	@Test(priority = 44)
	public void verifyDOTable() throws Throwable {

		homePage.clickOnDOTable();
		DeliveryOrder_TablePage.DeliveryOrder_Table();
		Thread.sleep(4000);
		driver.navigate().to("https://demo_keus.getapcs.com/dashboard");
	}

	@Test(priority = 45)
	public void verifyInvoiceCreate() throws Throwable {
		homePage.clickOnInvoiceCreate();
		VerifyInvoiceCreate.invoiceCreate("TEST Remark");

		Thread.sleep(4000);

		driver.navigate().to("https://demo_keus.getapcs.com/dashboard");
	}

	@Test(priority = 46)
	public void verifyInvoiceTable() throws Throwable {

		homePage.clickOnInvoiceTable();
		Invoice_TablePage.Invoice_Table();
		Thread.sleep(4000);
		driver.navigate().to("https://demo_keus.getapcs.com/dashboard");
	}

	@EditPages
	@Test(priority = 47)
	public void verifyItemMasterEdit() throws Throwable {

		homePage.clickOnItemMasterEdit();

		itemMasterEditPage.itemMasterEdit("Test Description");
		Thread.sleep(4000);
		driver.navigate().to("https://demo_keus.getapcs.com/dashboard");
	}

	@Test(priority = 48)
	public void verifyBomEdit() throws Throwable {
		homePage.clickOnBomEditPage();
		enggBomEditPage.enggBomEdit("40", // Quantity
				"50", // scarpAllowance
				"TestRemark1", // Remark
				"1", // Version
				"20", // quantityPer
				"100", // probability
				"TEST Alternate Remark1", // alternateRemark
				"40", // quantityNRE
				"20");
		Thread.sleep(4000);
		driver.navigate().to("https://demo_keus.getapcs.com/dashboard");

	}

	@Test(priority = 49)
	public void verifySalesItemPriceListEdit() throws AWTException, InterruptedException {

		PriceList_EditPage.ItemPriceListEdit("110", "220", "51", "120", "100", "90");

		Thread.sleep(4000);
		driver.navigate().to("https://demo_keus.getapcs.com/dashboard");
	}

	@Test(priority = 50)
	public void verifySalesRFQEdit() throws Throwable {

		rfq_EditPage.RFQEdit("TEST Rfq Number111", "TEST Remarks", "TEST Reason For Modification", "10",
				"TEST Note111");

		Thread.sleep(4000);
		driver.navigate().to("https://demo_keus.getapcs.com/dashboard");
	}

	@Test(priority = 51)
	public void verifyQuoteEdit() throws Throwable {

		quoteEditPage.QuoteEdit("TEST Quote Ref1", "10", "10", "10", "8", "8", "8", "8", "10", "10", "10", "10", "10",
				"9", "9", "100", "9", "8", "7", "7", "TEST Special Terms1");

		Thread.sleep(4000);
		driver.navigate().to("https://demo_keus.getapcs.com/dashboard");
	}

	@Test(priority = 52)
	public void verifySalesOrderEdit() throws Throwable {
		homePage.clickOnSalesOrderEdit();
		salesOrderEdit.salesOrderEdit("PO-8778");// PO Number
		Thread.sleep(4000);
		driver.navigate().to("https://demo_keus.getapcs.com/dashboard");
	}

	@Test(priority = 53)
	public void verifyShopOrderEdit() throws Throwable {

		// Purchase Order Create Page

		homePage.clickOnTransactionShopOrderEdit();
		ShopOrder.ShopOrderEdit();
		Thread.sleep(4000);
		driver.navigate().to("https://demo_keus.getapcs.com/dashboard");
	}

	@Test(priority = 54)
	public void verifyPR_Edit() throws Throwable {
		homePage.clickOnPREditPage();
		VerifyPR_EditPage.verifyPR_Edit("TEST Pupose1");
		Thread.sleep(4000);
		driver.navigate().to("https://demo_keus.getapcs.com/dashboard");
	}

	@Test(priority = 55)
	public void verifyPoEdit() throws Throwable {
		homePage.clickonPOEdit();
		Purchase_Order_Edit.purchaseOrderEditPage("123RefNo");
		Thread.sleep(4000);
		driver.navigate().to("https://demo_keus.getapcs.com/dashboard");
	}
}
