package com.getapcs.Engineering;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.getapcs.base.Testbase1;
import com.getapcs.home.login.HomePage;

public class Item_Master_Create_Page_FG extends Testbase1 {

	@FindBy(xpath = "//div[@class='title_sub_div_1 mt-1']")
	WebElement headingText;

	@FindBy(xpath = "//input[@placeholder='Enter Item Number']")
	WebElement itemNumber;

	@FindBy(xpath = "//textarea[@placeholder='Enter Item Description']")
	WebElement descriptionField1;

	@FindBy(xpath = "(//span[@class='slider round'])[1]")
	WebElement activeStatus;

	@FindBy(xpath = "(//span[@class='slider round'])[2]")
	WebElement obsoluteToggleButton;

	@FindBy(xpath = "//input[@id='uploadFile']")
	WebElement uploadPhoto;

	// General Description
//	@FindBy(xpath = "(//a[normalize-space()='General Description'])[1]")
//	WebElement generalDescriptionTab;

	@FindBy(xpath = "(//input[@type='text'])[2]")
	WebElement typeDropDown;
	@FindBy(xpath = "//span[normalize-space()='FG']")
	WebElement typeDropDownSelectData;
	@FindBy(xpath = "(//span[normalize-space()='PurchasePart'])[1]")
	WebElement typeDropDownSelectData1;

	@FindBy(xpath = "(//input[@type='text'])[4]")
	WebElement commodity;
	@FindBy(xpath = "//span[normalize-space()='LED DRIVERS']")
	WebElement commodityDropDownSelectData;

	@FindBy(xpath = "(//input[@type='text'])[6]")
	WebElement materialGroupDropDown;
	@FindBy(xpath = "/html/body/app-root/div/div/div/div/div/app-create-item-master/div[2]/div/div/div/form/div/div[2]/div/div/div[3]/div[1]/ng-select/ng-dropdown-panel/div/div[2]/div[1]/span")
	WebElement materialGroupDropDownSelectData;

	@FindBy(xpath = "(//input[@type='text'])[7]")
	WebElement purchaseGroupDropDown;
	@FindBy(xpath = "/html/body/app-root/div/div/div/div/div/app-create-item-master/div[2]/div/div/div/form/div/div[2]/div/div/div[4]/div[1]/ng-select/ng-dropdown-panel/div/div[2]/div")
	WebElement purchaseGroupDropDownSelectData;

	@FindBy(xpath = "(//input[@type='text'])[8]")
	WebElement departmentDropDown;
	@FindBy(xpath = "/html/body/app-root/div/div/div/div/div/app-create-item-master/div[2]/div/div/div/form/div/div[2]/div/div/div[5]/div/ng-select/ng-dropdown-panel/div/div[2]/div[1]/span")
	WebElement departmentDropDownSelectData;
	//
	@FindBy(xpath = "(//input[@type='text'])[3]")
	WebElement uOMDropDown;
	@FindBy(xpath = "/html/body/app-root/div/div/div/div/div/app-create-item-master/div[2]/div/div/div/form/div/div[2]/div/div/div[1]/div[2]/ng-select/ng-dropdown-panel/div/div[2]/div[1]")
	WebElement uomDropDownSelectData;

	@FindBy(xpath = "(//input[@type='text'])[5]")
	WebElement hSNDropDown;
	@FindBy(xpath = "//span[normalize-space()='1002']")
	WebElement hSNDropDownSelectData;

	@FindBy(xpath = "(//span[@class='slider round'])[3]")
	WebElement prRequiredToggleButton;

	@FindBy(xpath = "(//span[@class='slider round'])[4]")
	WebElement openGRINToggleButton;

	@FindBy(xpath = "(//input[@placeholder='DD-MM-YYYY'])[1]")
	WebElement validFromDatePicker;

	@FindBy(xpath = "//input[@placeholder='Enter Valid To']")
	WebElement validToDatePicker;

	// Alternative Tab
	@FindBy(xpath = "/html/body/app-root/div/div/div/div/div/app-create-item-master/div[2]/div/div/div/form/div/div[2]/ul/li[2]/a")
	WebElement alternativeTab;

	@FindBy(xpath = "//input[@placeholder='Enter Alternate Part No']")
	WebElement alternatePartNoField;

	@FindBy(xpath = "//input[@id='manufacturer']")
	WebElement sourceManufacturerRadioButton;

	@FindBy(xpath = "//input[@id='customer']")
	WebElement sourceCustomerRadioButton;

	@FindBy(xpath = "//input[@placeholder='Enter Munufacturer/Customer']")
	WebElement manufacturerorCustomerField;

	@FindBy(xpath = "(//span[@class='slider round'])[3]")
	WebElement defaultToggleButton;

	@FindBy(xpath = "//button[normalize-space()='Add']")
	WebElement addAlternative;

	// Engineering Tab
	@FindBy(xpath = "/html/body/app-root/div/div/div/div/div/app-create-item-master/div[2]/div/div/div/form/div/div[2]/ul/li[3]/a")
	WebElement engineeringTab;

	@FindBy(xpath = "//input[@placeholder='Enter Drawing No']")
	WebElement drawingNoField;

	@FindBy(xpath = "//input[@placeholder='Enter Rev No']")
	WebElement revNoField;

	@FindBy(xpath = "//input[@placeholder='Enter Doc Ret']")
	WebElement docRetField;

	@FindBy(xpath = "//input[@placeholder='Enter Remarks To Vendor']")
	WebElement remarksToVender;

	@FindBy(xpath = "/html/body/app-root/div/div/div/div/div/app-create-item-master/div[2]/div/div/div/form/div/div[2]/div/div/div[3]/div[1]/label[2]/span")
	WebElement cocToggleButton;

	@FindBy(xpath = "/html/body/app-root/div/div/div/div/div/app-create-item-master/div[2]/div/div/div/form/div/div[2]/div/div/div[3]/div[2]/label[2]/span")
	WebElement rOHSToggleButton;

	@FindBy(xpath = "/html/body/app-root/div/div/div/div/div/app-create-item-master/div[2]/div/div/div/form/div/div[2]/div/div/div[4]/div[1]/label[2]/span")
	WebElement selfLifeToggleButton;

	@FindBy(xpath = "/html/body/app-root/div/div/div/div/div/app-create-item-master/div[2]/div/div/div/form/div/div[2]/div/div/div[4]/div[2]/label[2]/span")
	WebElement rEACHToggleButton;

	// Dimensions Tab
	@FindBy(xpath = "/html/body/app-root/div/div/div/div/div/app-create-item-master/div[2]/div/div/div/form/div/div[2]/ul/li[4]/a")
	WebElement dimensionsTab;

	@FindBy(xpath = "(//input[@placeholder='Please Upload files.'])[1]")
	WebElement filesUpload;
	@FindBy(xpath = "(//button[normalize-space()='Save Files'])[1]")
	WebElement saveFile;
	@FindBy(xpath = "(//button[normalize-space()='View Files'])[1]")
	WebElement viewFile;
	@FindBy(xpath = "(//button[normalize-space()='Close'])[1]")
	WebElement closeButton;

	@FindBy(xpath = "//input[@placeholder='Enter Net Weight']")
	WebElement netWeightField;

	@FindBy(xpath = "//input[@placeholder='Enter Gross Weight']")
	WebElement grossWeightField;

	@FindBy(xpath = "//input[@placeholder='Enter Volume']")
	WebElement volumeField;

	@FindBy(xpath = "//input[@placeholder='Enter Size']")
	WebElement sizeField;

	@FindBy(xpath = "//input[@placeholder='Enter Foot Print']")
	WebElement footPrintField;

	@FindBy(xpath = "/html/body/app-root/div/div/div/div/div/app-create-item-master/div[2]/div/div/div/form/div/div[2]/div/div/div[1]/div[2]/ng-select/div/span[2]")
	WebElement uOMDropdown1;
	@FindBy(xpath = "/html/body/app-root/div/div/div/div/div/app-create-item-master/div[2]/div/div/div/form/div/div[2]/div/div/div[1]/div[2]/ng-select/ng-dropdown-panel/div/div[2]/div[1]")
	WebElement uOMDropdown1SelectData;

	@FindBy(xpath = "/html/body/app-root/div/div/div/div/div/app-create-item-master/div[2]/div/div/div/form/div/div[2]/div/div/div[2]/div[2]/ng-select/div/span[2]")
	WebElement uOMDropdown2;
	@FindBy(xpath = "/html/body/app-root/div/div/div/div/div/app-create-item-master/div[2]/div/div/div/form/div/div[2]/div/div/div[2]/div[2]/ng-select/ng-dropdown-panel/div/div[2]/div[1]")
	WebElement uOMDropdown2SelectData;

	@FindBy(xpath = "/html/body/app-root/div/div/div/div/div/app-create-item-master/div[2]/div/div/div/form/div/div[2]/div/div/div[3]/div[2]/ng-select/div/span[2]")
	WebElement uOMDropdown3;
	@FindBy(xpath = "/html/body/app-root/div/div/div/div/div/app-create-item-master/div[2]/div/div/div/form/div/div[2]/div/div/div[3]/div[2]/ng-select/ng-dropdown-panel/div/div[2]/div[1]")
	WebElement uOMDropdown3SelectData;

	// Routing Tab
	@FindBy(xpath = "/html/body/app-root/div/div/div/div/div/app-create-item-master/div[2]/div/div/div/form/div/div[2]/ul/li[5]/a")
	WebElement routingTab;

	@FindBy(xpath = "//input[@placeholder='Enter Process Step']")
	WebElement processStepField;

	@FindBy(xpath = "//input[@aria-autocomplete='list']")
	WebElement processDropDown;

	@FindBy(xpath = "//div[normalize-space()='TEST Process1']")
	WebElement processDropDownSelectData;

	@FindBy(xpath = "//textarea[@placeholder='Enter Description']")
	WebElement descriptionField;

	@FindBy(xpath = "//input[@placeholder='Enter Machine Hrs']")
	WebElement machineHoursField;

	@FindBy(xpath = "//input[@placeholder='Enter Labor Hrs']")
	WebElement labourHoursField;

	@FindBy(xpath = "(//span[@class='slider round'])[3]")
	WebElement activeToggleButtoninRouting;

	@FindBy(xpath = "//button[normalize-space()='Add']")
	WebElement addRoutingButton;

	// Approved Vender List Tab
	@FindBy(xpath = "/html/body/app-root/div/div/div/div/div/app-create-item-master/div[2]/div/div/div/form/div/div[2]/ul/li[6]/a")
	WebElement approvedVenderListTab;

	@FindBy(xpath = "/html/body/app-root/div/div/div/div/div/app-create-item-master/div[2]/div/div/div/form/div/div[2]/div/div/div[1]/div/ng-select/div/span[2]")
	WebElement vendorCodeDropDown;
	@FindBy(xpath = "//span[normalize-space()='VD-4']")
	WebElement vendorCodeDropDownDataSelect;

	@FindBy(xpath = "/html/body/app-root/div/div/div/div/div/app-create-item-master/div[2]/div/div/div/form/div/div[2]/div/div/div[2]/div/ng-select/div/span[2]")
	WebElement venderNameDropDown;
	@FindBy(xpath = "//span[normalize-space()='MULTECH PCB TECHNOLOGIES CO LTD']")
	WebElement venderNameDropDownDataSelect;

	@FindBy(xpath = "//input[@placeholder='Enter Share of Business']")
	WebElement shareOFBusinessField;

	@FindBy(xpath = "//button[normalize-space()='Add']")
	WebElement addApprovedVenderList;

	// Planning Tab
	@FindBy(xpath = "/html/body/app-root/div/div/div/div/div/app-create-item-master/div[2]/div/div/div/form/div/div[2]/ul/li[7]/a")
	WebElement planningTab;

	@FindBy(xpath = "//input[@placeholder='Enter MIN']")
	WebElement minField;

	@FindBy(xpath = "//input[@placeholder='Enter MAX']")
	WebElement maxField;

	@FindBy(xpath = "//input[@placeholder='Enter Re-Order']")
	WebElement reOrderField;

	@FindBy(xpath = "//input[@placeholder='Enter 2 Bin']")
	WebElement twoBinField;

	@FindBy(xpath = "//input[@placeholder='Enter Lead Time']")
	WebElement leadTimeField;

	@FindBy(xpath = "//div[@class='form-group gd_field_1']//span[@class='slider round']")
	WebElement kanbanToggleButton;

	// Warehouse Tab
	@FindBy(xpath = "/html/body/app-root/div/div/div/div/div/app-create-item-master/div[2]/div/div/div/form/div/div[2]/ul/li[8]/a")
	WebElement wareHouseTab;

	@FindBy(xpath = "//input[@aria-autocomplete='list']")
	WebElement wareHouseDropDown;

	@FindBy(xpath = "/html/body/app-root/div/div/div/div/div/app-create-item-master/div[2]/div/div/div/form/div/div[2]/div/div/div[1]/div/div[1]/ng-select/ng-dropdown-panel/div/div[2]/div[1]")
	WebElement wareHouseDropDownDataSelect;

	@FindBy(xpath = "(//span[@class='slider round'])[3]")
	WebElement activeToggleButtoninWarehouse;

	@FindBy(xpath = "/html/body/app-root/div/div/div/div/div/app-create-item-master/div[2]/div/div/div/form/div/div[2]/div/div/div[2]/div/button")
	WebElement addWarehouseButton;

	@FindBy(xpath = "(//span[@class='slider round'])[4]")
	WebElement eSDToggleButtoninWarehouse;

	@FindBy(xpath = "(//span[@class='slider round'])[6]")
	WebElement cycleCountToggleButtoninWarehouse;

	@FindBy(xpath = "(//span[@class='slider round'])[8]")
	WebElement hazardousMaterialToggleButtoninWarehouse;

	@FindBy(xpath = "(//span)[61]")
	WebElement fIFOToggleButtoninWarehouse;

	@FindBy(xpath = "(//span[@class='slider round'])[7]")
	WebElement lIFOToggleButtoninWarehouse;

	@FindBy(xpath = "//input[@placeholder='Enter Expiry (Days)']")
	WebElement expiryDaysField;

	@FindBy(xpath = "//input[@placeholder='Enter Inspection Int (Days)']")
	WebElement inspectionIntDaysField;

	@FindBy(xpath = "//textarea[@placeholder='Enter Special Instructions']")
	WebElement specialInstructionsField;

	// Shipping Tab
	@FindBy(xpath = "/html/body/app-root/div/div/div/div/div/app-create-item-master/div[2]/div/div/div/form/div/div[2]/ul/li[9]/a")
	WebElement shippingTab;

	@FindBy(xpath = "//textarea[@placeholder='Enter Instructions']")
	WebElement instructionsField;

	// Quality Tab
	@FindBy(xpath = "/html/body/app-root/div/div/div/div/div/app-create-item-master/div[2]/div/div/div/form/div/div[2]/ul/li[10]/a")
	WebElement qualityTab;

	@FindBy(xpath = "(//span[@class='slider round'])[3]")
	WebElement iqcToggleButton;

	@FindBy(xpath = "//input[@placeholder='Enter GR Processing (Days)']")
	WebElement grProcessingDaysField;

	@FindBy(xpath = "//input[@placeholder='Enter Batch Size']")
	WebElement batchSizeField;

	// Finance Tab
	@FindBy(xpath = "/html/body/app-root/div/div/div/div/div/app-create-item-master/div[2]/div/div/div/form/div/div[2]/ul/li[11]/a")
	WebElement financeTab;

	@FindBy(xpath = "(//span[@class='ng-arrow-wrapper'])[1]")
	WebElement costCenterDropDown;
	@FindBy(xpath = "(//span[normalize-space()='TEST CostCenter'])[1]")
	WebElement costCenterDropDownDataSelect;

	@FindBy(xpath = "//input[@placeholder='Enter Std Cost']")
	WebElement stdCostField;

	@FindBy(xpath = "(//input[@type='text'])[4]")
	WebElement costingMethodDropDown;
	@FindBy(xpath = "//span[normalize-space()='TEST CostingMethod']")
	WebElement costingMethodDropDownDataSelect;

	@FindBy(xpath = "//body[1]/app-root[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-create-item-master[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[1]/label[2]/span[1]")
	WebElement valuationToggleButton;

	@FindBy(xpath = "/html/body/app-root/div/div/div/div/div/app-create-item-master/div[2]/div/div/div/form/div/div[2]/div/div/div[5]/div/label[2]/span")
	WebElement depreciationToggleButton;

	@FindBy(xpath = "/html/body/app-root/div/div/div/div/div/app-create-item-master/div[2]/div/div/div/form/div/div[2]/div/div/div[6]/div/label[2]/span")
	WebElement pFOToggleButton;

	@FindBy(xpath = "(//button[normalize-space()='Save'])[1]")
	WebElement saveButton;

	public Item_Master_Create_Page_FG() {
		PageFactory.initElements(driver, this);
	}

	public HomePage itemMasterCreate(String itemNo, String description, String alternativeNo,
			String manufacturerorCustomerName, String drawingNo, String revNo, String docRet, String netWeight,
			String grossWeight, String volume, String size, String footPrint, String processStep,
			String descriptinRouting, String machinHrs, String labourHrs, String shareofBusiness, String min,
			String max, String reOrder, String twoBin, String leadTime, String expiryDays, String inspectionIntDays,
			String specialInstructions, String instructions, String grProcess, String batchSize, String stdCost)
			throws Throwable {

		Thread.sleep(5000);

		System.out.println("Item Master Create");

		String actualText = headingText.getText();
		String expectedText = "Item Master";
		assertEquals(actualText, expectedText);

		click(driver, itemNumber);
		itemNumber.sendKeys(itemNo);

		click(driver, descriptionField1);
		descriptionField1.sendKeys(description);

		uploadFile(driver, uploadPhoto, 0);

		System.out.println("General");

		// ###################### GeneralDescription ##############################

		click(driver, typeDropDown);
		click(driver, typeDropDownSelectData);

		click(driver, commodity);
		click(driver, commodityDropDownSelectData);

		click(driver, materialGroupDropDown);
		click(driver, materialGroupDropDownSelectData);

		click(driver, purchaseGroupDropDown);
		click(driver, purchaseGroupDropDownSelectData);

		click(driver, departmentDropDown);
		click(driver, departmentDropDownSelectData);

		click(driver, uOMDropDown);
		click(driver, uomDropDownSelectData);

		click(driver, hSNDropDown);
		hSNDropDown.sendKeys("1001");

		click(driver, prRequiredToggleButton);

		click(driver, openGRINToggleButton);

		click(driver, validFromDatePicker);
		validFromDatePicker.sendKeys(Keys.RIGHT);
		validFromDatePicker.sendKeys(Keys.ENTER);

		click(driver, validToDatePicker);
		validToDatePicker.sendKeys(Keys.RIGHT);
		validToDatePicker.sendKeys(Keys.ENTER);

		// Alternatives Tab
		click(driver, alternativeTab);

		click(driver, alternatePartNoField);
		alternatePartNoField.sendKeys(alternativeNo);

		click(driver, sourceManufacturerRadioButton);
		click(driver, sourceCustomerRadioButton);

		click(driver, manufacturerorCustomerField);
		manufacturerorCustomerField.sendKeys(manufacturerorCustomerName);

		// Verifying the Placeholder which is present in Description text field.

		click(driver, defaultToggleButton);
		click(driver, defaultToggleButton);

		// Verifying that Add button is Enabled or not

		click(driver, addAlternative);

		// Engineering
		click(driver, engineeringTab);

		// 1Verifying that drawingNo Text Field is Enabled or not

		click(driver, drawingNoField);
		drawingNoField.sendKeys(drawingNo);

		// 1Verifying that RevNo Text Field is Enabled or not

		click(driver, revNoField);
		revNoField.sendKeys(revNo);

		// Verifying the Placeholder which is present in RevNo field.

		click(driver, docRetField);
		docRetField.sendKeys(docRet);

		click(driver, remarksToVender);
		remarksToVender.sendKeys("TEST remarksToVender");

		click(driver, cocToggleButton);

		click(driver, rOHSToggleButton);

		click(driver, selfLifeToggleButton);

		click(driver, rEACHToggleButton);

		// Upload File

		uploadFile(driver, filesUpload, 1);
		click(driver, saveFile);
		click(driver, viewFile);
		click(driver, closeButton);

		// Dimensions Tab
		click(driver, dimensionsTab);

		click(driver, netWeightField);
		netWeightField.sendKeys(netWeight);

		// 1Verifying that GrossWeight Text Field

		click(driver, grossWeightField);
		grossWeightField.sendKeys(grossWeight);

		// 1Verifying that Volume Text Field

		click(driver, volumeField);
		volumeField.sendKeys(volume);

		// 1Verifying that Size Text Field

		click(driver, sizeField);
		sizeField.sendKeys(size);

		// 1Verifying that FootPrint Text Field

		click(driver, footPrintField);
		footPrintField.sendKeys(footPrint);

		click(driver, uOMDropdown1);
		click(driver, uOMDropdown1SelectData);

		click(driver, uOMDropdown2);
		click(driver, uOMDropdown2SelectData);

		click(driver, uOMDropdown3);
		click(driver, uOMDropdown3SelectData);

		// Routing
		click(driver, routingTab);

		// Process Step Text Field
		click(driver, processStepField);
		processStepField.sendKeys(processStep);

		// Process DropDown
		click(driver, processDropDown);
		click(driver, processDropDownSelectData);

		// Description Field
		click(driver, descriptionField);
		descriptionField.sendKeys(descriptinRouting);

		// Machine Hours Field
		click(driver, machineHoursField);
		machineHoursField.sendKeys(machinHrs);

		// Labour Hours
		click(driver, labourHoursField);
		labourHoursField.sendKeys(labourHrs);

		click(driver, activeToggleButtoninRouting);
		click(driver, activeToggleButtoninRouting);

		click(driver, addRoutingButton);

		// ApprovedVenderList
		click(driver, approvedVenderListTab);

		click(driver, vendorCodeDropDown);
		click(driver, vendorCodeDropDownDataSelect);

		click(driver, venderNameDropDown);
		click(driver, venderNameDropDownDataSelect);

		// Share Of Bussiness
		click(driver, shareOFBusinessField);
		shareOFBusinessField.sendKeys(shareofBusiness);

		click(driver, addApprovedVenderList);

		// Planning
		click(driver, planningTab);

		// Minimum Field
		click(driver, minField);
		minField.sendKeys(min);

		// Maximum Field
		click(driver, maxField);
		maxField.sendKeys(max);

		int MinfieldHeightSize = minField.getSize().getHeight();
		int MinfieldWidthSize = minField.getSize().getWidth();

		int MaxfieldHeightSize = maxField.getSize().getHeight();
		int MaxfieldWidthSize = maxField.getSize().getWidth();

		assertEquals(MinfieldHeightSize, MaxfieldHeightSize);
		assertEquals(MaxfieldWidthSize, MinfieldWidthSize);

		// Reorder Field
		click(driver, reOrderField);
		reOrderField.sendKeys(reOrder);

		// TwoBin Field
		click(driver, twoBinField);
		twoBinField.sendKeys(twoBin);

		int ReorderfieldHeightSize = reOrderField.getSize().getHeight();
		int ReorderfieldWidthSize = reOrderField.getSize().getWidth();

		int BinfieldHeightSize = twoBinField.getSize().getHeight();
		int BinfieldWidthSize = twoBinField.getSize().getWidth();

		assertEquals(ReorderfieldHeightSize, BinfieldHeightSize);
		assertEquals(ReorderfieldWidthSize, BinfieldWidthSize);

		// LeadTime Field
		click(driver, leadTimeField);
		leadTimeField.sendKeys(leadTime);

		click(driver, kanbanToggleButton);

		// Warehouse
		click(driver, wareHouseTab);

		click(driver, wareHouseDropDown);
		click(driver, wareHouseDropDownDataSelect);

		click(driver, activeToggleButtoninWarehouse);
		click(driver, activeToggleButtoninWarehouse);

//		addWarehouseButton.click();

		// 1Verifying that LeadTime Text Field is Enabled or not
		boolean isEnabledADDButton = addWarehouseButton.isEnabled();
		assertTrue(isEnabledADDButton);
		boolean isDisabledADDButton = !addWarehouseButton.isEnabled();
		assertFalse(isDisabledADDButton);

		// Verifying that LeadTime Field is displayed or hidden.
		boolean isDisplayedADDButton = addWarehouseButton.isDisplayed();
		assertTrue(isDisplayedADDButton);
		boolean isHiddenADDButton = !addWarehouseButton.isDisplayed();
		assertFalse(isHiddenADDButton);

		// ESD Toggle
		click(driver, eSDToggleButtoninWarehouse);

		// Cycle Count Toggle
		click(driver, cycleCountToggleButtoninWarehouse);

		// Hazardous Material Toggle
		click(driver, hazardousMaterialToggleButtoninWarehouse);

		// FIFO Toggle
		click(driver, fIFOToggleButtoninWarehouse);

		// LIFO Toggle
		click(driver, lIFOToggleButtoninWarehouse);

		// Expiry Days Field
		click(driver, expiryDaysField);
		expiryDaysField.sendKeys(expiryDays);

		// Inspection Days
		click(driver, inspectionIntDaysField);
		inspectionIntDaysField.sendKeys(inspectionIntDays);

		// Special Instructions
		click(driver, specialInstructionsField);
		specialInstructionsField.sendKeys(specialInstructions);

		// Shipping Tab
		shippingTab.click();

		// Instructions
		click(driver, instructionsField);
		instructionsField.sendKeys(instructions);

		// Quality
		click(driver, qualityTab);

		// IQCToggle
		click(driver, iqcToggleButton);

		// GR Processing Days
		click(driver, grProcessingDaysField);
		grProcessingDaysField.sendKeys(grProcess);

		// Batch Size
		click(driver, batchSizeField);
		batchSizeField.sendKeys(batchSize);

		// Costing
		click(driver, financeTab);

		// Cost center
		click(driver, costCenterDropDown);
		click(driver, costCenterDropDownDataSelect);

		// STD Cost
		click(driver, stdCostField);
		stdCostField.sendKeys(stdCost);

		// Costing Method
		click(driver, costingMethodDropDown);
		click(driver, costingMethodDropDownDataSelect);

		// valuationToggleButton
		click(driver, valuationToggleButton);

		// DepreciationToggleButton
		click(driver, depreciationToggleButton);

		// PFO Toggle Button
		click(driver, pFOToggleButton);

		click(driver, saveButton);

		System.out.println("Item Master Exit");

		Thread.sleep(3000);

		return new HomePage();
	}
}
