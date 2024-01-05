package com.getapcs.Engineering;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.getapcs.base.Testbase1;
import com.getapcs.home.login.HomePage;

public class Engg_BOM_Create_Page_FOR_SA_2 extends Testbase1 {

	@FindBy(xpath = "(//input[@autocorrect='off'])[1]")
	WebElement itemNumberForItem;

	@FindBy(xpath = "//label[contains(text(), 'Item Description')]/following-sibling::textarea")
	WebElement itemDescriptionElement;

	@FindBy(xpath = "//label[normalize-space(text())='Item Type']/following-sibling::div/input[@formcontrolname='itemType']")
	WebElement itemTypeElement;

	@FindBy(xpath = "(//span[@class='slider round'])[1]")
	WebElement activeStatusToggleButton;

	@FindBy(xpath = "//input[@formcontrolname='itemNoDesc']")
	WebElement itemNumberForChildItem;
	@FindBy(xpath = "//span[normalize-space()='88844455-Test Description']")
	WebElement itemNumberForChildItemDataSeelect;

	@FindBy(xpath = "//input[@placeholder='Enter Quantity']")
	WebElement quantityField;

	@FindBy(xpath = "//input[@placeholder='Enter Scrap Allowance']")
	WebElement scarpAllowanceField;

	@FindBy(xpath = "//textarea[@placeholder='Enter Remarks']")
	WebElement remarkField;

	@FindBy(xpath = "//label[normalize-space(text())='Item Type']/following-sibling::div/input[@formcontrolname='childItemType']")
	WebElement childItemTypeElement;

	@FindBy(xpath = "//label[normalize-space(text())='UOM']/following-sibling::div/input[@formcontrolname='uom']")
	WebElement uOMElement;

	@FindBy(xpath = "//label[normalize-space(text())='Version']/following-sibling::div/input[@formcontrolname='version']")
	WebElement versionElement;

	@FindBy(xpath = "(//span[@class='slider round'])[2]")
	WebElement childItemToggleButton;

	@FindBy(xpath = "//button[normalize-space()='Add']")
	WebElement addChildItemButton;

	// Alternates Tab
	@FindBy(linkText = "Alternates")
	WebElement alternatesTab;

	@FindBy(xpath = "//input[@formcontrolname='alterItemNoDesc']")
	WebElement alternateItemDropDown;

	@FindBy(xpath = "(//span[@class='mat-option-text'])[1]")
	WebElement alternateItemDropDownDataSeelect;
	@FindBy(xpath = "(//span[@class='mat-option-text'])[2]")
	WebElement alternateItemDropDownDataSeelect1;

	@FindBy(xpath = "//label[normalize-space(text())='UOM']/following-sibling::div/input[@formcontrolname='alterUom']")
	WebElement alternateUOMElement;

	@FindBy(xpath = "//input[@placeholder='Enter Version']")
	WebElement versionField;

	@FindBy(xpath = "(//input[@type='text'])[5]")
	WebElement customerNameField;

	@FindBy(xpath = "(//div[normalize-space()='Srikanth Reddy'])[1]")
	WebElement customerNameFieldDataSelect;

	@FindBy(xpath = "//input[@placeholder='Enter Quantity']")
	WebElement quantityPerFeild;

	@FindBy(xpath = "//input[@placeholder='Enter Probability of Usage']")
	WebElement probabilityofUsageField;

	@FindBy(xpath = "(//input[@type='text'])[6]")
	WebElement alternateitemNumberDropDown;
	@FindBy(xpath = "//span[normalize-space()='76543456']")
	WebElement alternateitemNumberDropDownDataSeelect;

	@FindBy(xpath = "//textarea[@placeholder='Enter Remarks']")
	WebElement alternateRemarkField;

	@FindBy(xpath = "(//span[@class='slider round'])[2]")
	WebElement alternateActiveToggleButton;

	@FindBy(xpath = "//button[normalize-space()='Add']")
	WebElement alternateAddButton;

	// NRE \ Consumable Tab
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-create-engg-bom[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/ul[1]/li[3]/a[1]")
	WebElement nreOrConsumableTab;

	@FindBy(xpath = "(//input[@role='combobox'])[1]")
	WebElement itemNumberDropDowninNRE;
	@FindBy(xpath = "(//span[@class='mat-option-text'])[1]")
	WebElement itemNumberDropDowninNREDataSelect;
	@FindBy(xpath = "(//span[@class='mat-option-text'])[2]")
	WebElement itemNumberDropDowninNREDataSelect1;

	@FindBy(xpath = "//input[@placeholder='Enter Quantity']")
	WebElement quantityFieldInNRE;

	@FindBy(xpath = "//input[@placeholder='Enter Cost']")
	WebElement costFieldInNRE;

	@FindBy(xpath = "//button[normalize-space()='Add']")
	WebElement addButtonInNRE;

	@FindBy(xpath = "//input[@placeholder='Upload Items']")
	WebElement fileUploadInBomCreate;

	@FindBy(xpath = "//button[normalize-space()='Close']")
	WebElement fileCloseButton;

	@FindBy(xpath = "//button[text()='Save']")
	WebElement saveButton;

	@FindBy(xpath = "(//button[normalize-space()='Close'])[1]")
	WebElement closeButton;

	public Engg_BOM_Create_Page_FOR_SA_2() {
		PageFactory.initElements(driver, this);
	}

	public HomePage bomCreate(String quantity, String scarpAllowance, String remark, String version, String quantityPer,
			String probability, String alternateRemark, String quantityNRE, String cost) throws Throwable {

		driver.navigate().to("https://demo_keus.getapcs.com/engineering/item-master/table");

		String tableXpath = "//table[@class='table table-striped']";

		// Get the first PR number text from table
		String ItemNumber = driver.findElement(By.xpath(tableXpath + "/tbody/tr[7]/td[2]")).getText();

		// Store the element with hard coded PR number
		String elementXpath = "(//span[normalize-space()='Item-FG-11-TEST'])[1]";

		String updatedXpathSA2 = elementXpath.replace("Item-FG-11-TEST", ItemNumber);

		System.out.println(updatedXpathSA2);

		// *******************//

		// Get the first PR number text from table
		String ItemNum = driver.findElement(By.xpath(tableXpath + "/tbody/tr[5]/td[2]")).getText();

		// Store the element with hard coded PR number
		String elementXpath1 = "(//span[normalize-space()='Item-FG-11-TEST'])[1]";

		String updatedXpathPP5 = elementXpath1.replace("Item-FG-11-TEST", ItemNum + "-Test Description");

		System.out.println(updatedXpathPP5);

		// Get the first PR number text from table
		String ItemNum1 = driver.findElement(By.xpath(tableXpath + "/tbody/tr[6]/td[2]")).getText();

		// Store the element with hard coded PR number
		String elementXpath2 = "(//span[normalize-space()='Item-FG-11-TEST'])[1]";

		String updatedXpathPP6 = elementXpath2.replace("Item-FG-11-TEST", ItemNum1 + "-Test Description");

		System.out.println(updatedXpathPP6);

		driver.navigate().to("https://demo_keus.getapcs.com/engineering/engg-bom/create");

		// Item Number
		Thread.sleep(5000);
		js.executeScript("arguments[0].scrollIntoView(true);", itemNumberForItem);
		Thread.sleep(5000);
		click(driver, itemNumberForItem);
		isSelected(driver, itemNumberForItem, "itemNumberForItem");

		WebElement itemNumberDropDownDataSelect = driver.findElement(By.xpath(updatedXpathSA2));
		click(driver, itemNumberDropDownDataSelect);

		dataPrint(driver, itemDescriptionElement, "itemDescriptionElement");

		dataPrintFromInputtag(driver, itemTypeElement, "itemTypeElement");

//       activeStatusToggleButton.click();
//       activeStatusToggleButton.click();

		// ############## Child Item Tab ################

		js.executeScript("arguments[0].scrollIntoView(true);", itemNumberForChildItem);
		Thread.sleep(4000);
		click(driver, itemNumberForChildItem);
		isSelected(driver, itemNumberForChildItem, "itemNumberForChildItem");
		itemNumberForChildItem.sendKeys(ItemNum);

		WebElement itemNumberForChildItemDataSelect1 = driver.findElement(By.xpath(updatedXpathPP5));
		click(driver, itemNumberForChildItemDataSelect1);

		click(driver, quantityField);
		isSelected(driver, quantityField, "quantityField");
		quantityField.sendKeys(quantity);

		click(driver, scarpAllowanceField);
		isSelected(driver, scarpAllowanceField, "scarpAllowanceField");
		scarpAllowanceField.sendKeys(scarpAllowance);

		click(driver, remarkField);
		isSelected(driver, remarkField, "remarkField");
		remarkField.sendKeys(remark);

		dataPrintFromInputtag(driver, childItemTypeElement, "childItemTypeElement");

		dataPrintFromInputtag(driver, uOMElement, "uOMElement");

		dataPrintFromInputtag(driver, versionElement, "versionElement");

		click(driver, childItemToggleButton);
		click(driver, childItemToggleButton);

		click(driver, addChildItemButton);

		// ####################### Child 2ndItem ###################

		click(driver, itemNumberForChildItem);
		isSelected(driver, itemNumberForChildItem, "itemNumberForChildItem");
		itemNumberForChildItem.sendKeys(ItemNum1);

		WebElement itemNumberForChildItemDataSelect2 = driver.findElement(By.xpath(updatedXpathPP6));
		click(driver, itemNumberForChildItemDataSelect2);

		click(driver, quantityField);
		isSelected(driver, quantityField, "quantityField");
		quantityField.sendKeys(quantity);

		click(driver, scarpAllowanceField);
		isSelected(driver, scarpAllowanceField, "scarpAllowanceField");
		scarpAllowanceField.sendKeys(scarpAllowance);

		click(driver, remarkField);
		isSelected(driver, remarkField, "remarkField");
		remarkField.sendKeys(remark);

		dataPrintFromInputtag(driver, childItemTypeElement, "childItemTypeElement");

		dataPrintFromInputtag(driver, uOMElement, "uOMElement");

		dataPrintFromInputtag(driver, versionElement, "versionElement");

		click(driver, childItemToggleButton);
		click(driver, childItemToggleButton);

		click(driver, addChildItemButton);

		// ############# Alternates Tab ###################

		click(driver, alternatesTab);

		click(driver, alternateItemDropDown);
		isSelected(driver, alternateItemDropDown, "alternateItemDropDown");
		Thread.sleep(1000);
		click(driver, alternateItemDropDownDataSeelect);

		dataPrintFromInputtag(driver, alternateUOMElement, "alternateUOMElement");

		click(driver, versionField);
		isSelected(driver, versionField, "versionField");
		versionField.sendKeys(version);

		click(driver, customerNameField);
		isSelected(driver, customerNameField, "customerNameField");
		click(driver, customerNameFieldDataSelect);

		click(driver, alternateitemNumberDropDown);
		isSelected(driver, alternateitemNumberDropDown, "alternateitemNumberDropDown");
		click(driver, alternateitemNumberDropDownDataSeelect);

		click(driver, quantityPerFeild);
		isSelected(driver, quantityPerFeild, "quantityPerFeild");
		quantityPerFeild.sendKeys(quantityPer);

		click(driver, probabilityofUsageField);
		isSelected(driver, probabilityofUsageField, "probabilityofUsageField");
		probabilityofUsageField.sendKeys(probability);

		click(driver, alternateRemarkField);
		isSelected(driver, alternateRemarkField, "alternateRemarkField");
		alternateRemarkField.sendKeys(alternateRemark);

		click(driver, alternateActiveToggleButton);
		click(driver, alternateActiveToggleButton);

		click(driver, alternateAddButton);

		// ######## 2nd Item #########

		click(driver, alternateItemDropDown);
		isSelected(driver, alternateItemDropDown, "alternateItemDropDown");
		Thread.sleep(1000);
		click(driver, alternateItemDropDownDataSeelect1);

		dataPrintFromInputtag(driver, alternateUOMElement, "alternateUOMElement");

		click(driver, versionField);
		isSelected(driver, versionField, "versionField");
		versionField.sendKeys(version);

		click(driver, customerNameField);
		isSelected(driver, customerNameField, "customerNameField");
		click(driver, customerNameFieldDataSelect);

		click(driver, alternateitemNumberDropDown);
		isSelected(driver, alternateitemNumberDropDown, "alternateitemNumberDropDown");
		click(driver, alternateitemNumberDropDownDataSeelect);

		click(driver, quantityPerFeild);
		isSelected(driver, quantityPerFeild, "quantityPerFeild");
		quantityPerFeild.sendKeys(quantityPer);

		click(driver, probabilityofUsageField);
		isSelected(driver, probabilityofUsageField, "probabilityofUsageField");
		probabilityofUsageField.sendKeys(probability);

		click(driver, alternateRemarkField);
		isSelected(driver, alternateRemarkField, "alternateRemarkField");
		alternateRemarkField.sendKeys(alternateRemark);

		click(driver, alternateActiveToggleButton);
		click(driver, alternateActiveToggleButton);

		click(driver, alternateAddButton);

		uploadFile(driver, fileUploadInBomCreate, 1);
		click(driver, closeButton);

		// ########### NRE / Consumable #########

		click(driver, nreOrConsumableTab);

		click(driver, itemNumberDropDowninNRE);
		isSelected(driver, itemNumberDropDowninNRE, "itemNumberDropDowninNRE");
		click(driver, itemNumberDropDowninNREDataSelect);

		click(driver, quantityFieldInNRE);
		isSelected(driver, quantityFieldInNRE, "quantityFieldInNRE");
		quantityFieldInNRE.sendKeys(quantityNRE);

		click(driver, costFieldInNRE);
		isSelected(driver, costFieldInNRE, "costFieldInNRE");
		costFieldInNRE.sendKeys(cost);

		click(driver, addButtonInNRE);

		click(driver, itemNumberDropDowninNRE);
		isSelected(driver, itemNumberDropDowninNRE, "itemNumberDropDowninNRE");
		click(driver, itemNumberDropDowninNREDataSelect1);

		click(driver, quantityFieldInNRE);
		isSelected(driver, quantityFieldInNRE, "quantityFieldInNRE");
		quantityFieldInNRE.sendKeys(quantityNRE);

		click(driver, costFieldInNRE);
		isSelected(driver, costFieldInNRE, "costFieldInNRE");
		costFieldInNRE.sendKeys(cost);

		click(driver, addButtonInNRE);

		System.out.println(driver.getCurrentUrl());
		Thread.sleep(1000);

		saveButton.click();

		Thread.sleep(3000);
		System.out.println(driver.getCurrentUrl());

//				assertNotEquals(beforeSaveButton, afterSaveButton, "URLs are the same");
		return new HomePage();
	}

}
