package com.getapcs.Transaction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.getapcs.base.Testbase1;
import com.getapcs.home.login.HomePage;

public class ODO_FG extends Testbase1 {

	static double remainingQty;

	// Open Delivery Order

	@FindBy(xpath = "(//input[@type='text'])[2]")
	WebElement customerName;

	@FindBy(xpath = "(//span[normalize-space()='0003 - Test comName'])[1]")
	WebElement customerNameSelect;

	@FindBy(xpath = "(//input[@placeholder='Responsible Person'])[1]")
	WebElement responsiblePerson;

	@FindBy(xpath = "(//textarea[@formcontrolname='description'])[1]")
	WebElement descriptionField;

	@FindBy(xpath = "(//select[@formcontrolname='doType'])[1]")
	WebElement doTypeDropdown;

	@FindBy(xpath = "//label[text()='Sales order Rev no']/..//input[@formcontrolname='salesOrderRevNo']")
	WebElement salesOrderRevNo;

	@FindBy(xpath = "(//input[@type='text'])[5]")
	WebElement issuedTo;

	@FindBy(xpath = "(//span[normalize-space()='AVision Systems Pvt Ltd .'])[1]")
	WebElement issuedToSelect;

	@FindBy(xpath = "(//input[@type='text'])[6]")
	WebElement resonForIssuingStockDropdown;

	@FindBy(xpath = "(//span[normalize-space()='TEST IssuingStock1'])[1]")
	WebElement resonForIssuingStockSelect;

	@FindBy(xpath = "(//input[@placeholder='Reason for Issuing Stock'])[1]")
	WebElement resonForIssuingStock;

	@FindBy(xpath = "(//textarea[@role='combobox'])[1]")
	WebElement itemNumber;

	@FindBy(xpath = "(//input[@type='text'])[10]")
	WebElement unitPrice;

	@FindBy(xpath = "(//input[@type='text'])[12]")
	WebElement dispatchQty;

	@FindBy(xpath = "(//input[@type='text'])[13]")
	WebElement projectNumberDropdown;

	@FindBy(xpath = "(//button[normalize-space()='Binning'])[1]")
	WebElement binningButton;

	@FindBy(xpath = "(//input[@type='text'])[14]")
	WebElement warehouse;

	@FindBy(xpath = "(//input[@type='text'])[15]")
	WebElement location;

	@FindBy(xpath = "(//span[normalize-space()='HYD-BH-RD5'])[1]")
	WebElement warehouseSelect;

	@FindBy(xpath = "(//span[normalize-space()='room no1'])[1]")
	WebElement locationSelect;

	@FindBy(xpath = "(//input[@type='text'])[14]")
	WebElement warehouse1;

	@FindBy(xpath = "(//span[normalize-space()='HYD-BH-RD3'])[1]")
	WebElement warehouseSelect1;

	@FindBy(xpath = "(//input[@type='text'])[15]")
	WebElement location1;

	@FindBy(xpath = "(//span[normalize-space()='HYD-BHRD3-Room1'])[1]")
	WebElement locationSelect1;

	@FindBy(xpath = "(//input[@formcontrolname='availableQty'])[1]")
	WebElement auailableQty;

	@FindBy(xpath = "(//input[@formcontrolname='qty'])[1]")
	WebElement quantity;

	@FindBy(xpath = "(//input[@placeholder='Enter quantity'])[1]")
	WebElement availableQty;

	@FindBy(xpath = "(//button[normalize-space()='Add'])[1]")
	WebElement add;

	@FindBy(xpath = "(//button[@type='submit'][normalize-space()='Save'])[1]")
	WebElement save;

	@FindBy(xpath = "/html/body/app-root/div/div/div/div/div/app-open-delivery-order-form/div[2]/div/div/div/form/div/div[5]/div/div/div[1]/table/tbody/tr/td[10]/div/textarea")
	WebElement remarks;

	@FindBy(xpath = "(//button[normalize-space()='Save'])[1]")
	WebElement saveButton;

	@FindBy(xpath = "(//table[@formarrayname='ItemData']/tbody/tr[1]/td[6]/..//input[@type='text'])[5]")
	WebElement availableStock;

	public ODO_FG() {

		PageFactory.initElements(driver, this);
	}

//*************Delivery Order Create Page******************

	public HomePage openDeliveryOrderCreate() throws InterruptedException {

		System.out.println("//*************Open Delivery Order Create Page******************");

		driver.navigate().to("https://demo_keus.getapcs.com/engineering/item-master/table");

		String tableXpath = "//table[@class='table table-striped']";

		String ItemNumber = driver.findElement(By.xpath(tableXpath + "/tbody/tr[2]/td[2]")).getText();

		String elementXpath = "(//span[normalize-space()='Item-FG-11-TEST'])[1]";

		String updatedXpath = elementXpath.replace("Item-FG-11-TEST", ItemNumber + "-Test Description");

		System.out.println(updatedXpath);

		driver.navigate().to("https://demo_keus.getapcs.com/sales/rfq/table");

		String tableXpath1 = "//table[@class='table table-striped']";

		String projectNumber1 = driver.findElement(By.xpath(tableXpath1 + "/tbody/tr[1]/td[2]")).getText();

		String elementXpath1 = "(//span[normalize-space()='Item-FG-11-TEST'])[1]";

		String updatedXpath1 = elementXpath1.replace("Item-FG-11-TEST", projectNumber1);

		System.out.println(updatedXpath1);

		driver.navigate().to("https://demo_keus.getapcs.com/transaction/open-delivery-order/create");

// Receipient Name

		click(driver, customerName);

		isSelected(driver, customerName, "customerName");

		click(driver, customerNameSelect);
		Thread.sleep(2000);

// Responsible Person

		click(driver, responsiblePerson);

		responsiblePerson.sendKeys("TEST responsible Person");

// Description Field

		click(driver, descriptionField);

		descriptionField.sendKeys("TEST description Field");

//sales Order Number

		click(driver, doTypeDropdown);

		isSelected(driver, doTypeDropdown, "doTypeDropdown");

		Select select = new Select(doTypeDropdown);
		select.selectByVisibleText("Returnable");

//Issued To Dropdown

		click(driver, issuedTo);

		isSelected(driver, issuedTo, "issuedToDropdown");

		issuedTo.sendKeys("TEST Issued");

//Issued To Dropdown

		click(driver, resonForIssuingStockDropdown);

		isSelected(driver, resonForIssuingStockDropdown, "resonForIssuingStockDropdown");

		click(driver, resonForIssuingStockSelect);

//item Number

		click(driver, itemNumber);

		isSelected(driver, itemNumber, "itemNumber");

		WebElement itemNumSelect = driver.findElement(By.xpath(updatedXpath));

		click(driver, itemNumSelect);

//Unit Price

		click(driver, unitPrice);

		unitPrice.sendKeys("100");

		Thread.sleep(2000);

//		dataPrintFromInputtag(driver, availableStock, "availableStock");

		String availableQuantityText = (String) js.executeScript("return arguments[0].value;", availableStock);
		System.out.println("availableStock" + " : " + availableQuantityText + "\n");
//Disptch Quantity

		click(driver, dispatchQty);

		// Convert the quantityText to an integer
		double availableQuantityValue = Double.parseDouble(availableQuantityText);

		// Perform your calculations
		double availableQuantityValue1 = availableQuantityValue / 2;

		System.out.println(availableQuantityValue1);

		// Convert quantityValue to a String
		String availableQuantity = String.valueOf(availableQuantityValue1);

		Thread.sleep(2000);

		dispatchQty.sendKeys(availableQuantity);

		Thread.sleep(2000);

//Project Number

		click(driver, projectNumberDropdown);

		isSelected(driver, projectNumberDropdown, "projectNumberDropdown");

		WebElement projectNumberSelect = driver.findElement(By.xpath(updatedXpath1));

		click(driver, projectNumberSelect);

//Binning

		click(driver, binningButton);

		for (int i = 1; i <= 2; i++) {

			if (i == 1) {

				// Warehouse

				click(driver, warehouse);

				isSelected(driver, warehouse, "warehouse");

				click(driver, warehouseSelect);

				// Location

				click(driver, location);

				isSelected(driver, location, "location");

				click(driver, locationSelect);
			}
			if (i == 2) {
				// Warehouse

				click(driver, warehouse1);

				isSelected(driver, warehouse1, "warehouse1");

				click(driver, warehouseSelect1);

				// Location

				click(driver, location1);

				isSelected(driver, location1, "location1");

				click(driver, locationSelect1);
			}

			double acceptedQtyValue1 = availableQuantityValue1 / 2;

			String acceptedQtyValue2 = String.valueOf(acceptedQtyValue1);

			click(driver, quantity);

			quantity.sendKeys(acceptedQtyValue2);

			click(driver, add);

		}
		click(driver, save);

		click(driver, remarks);
		remarks.sendKeys("TEST Remarks");

		click(driver, saveButton);

		return new HomePage();
	}

}
