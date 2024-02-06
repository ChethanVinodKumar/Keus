package com.getapcs.Transaction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.getapcs.base.Testbase1;
import com.getapcs.home.login.HomePage;

public class MaterialRequest extends Testbase1 {

	// Delivery Order

	@FindBy(xpath = "(//input[@type='text'])[1]")
	WebElement projectNumber;

	@FindBy(xpath = "(//input[@type='text'])[2]")
	WebElement salesOrderNum;

	@FindBy(xpath = "(//input[@role='combobox'])[1]")
	WebElement partNumber;

	@FindBy(xpath = "(//input[@type='number'])[1]")
	WebElement requiredQty;

	@FindBy(xpath = "//table[@formarrayname='ItemData']/tbody/tr[1]/td[2]//input[@type='text']")
	WebElement partType;

	@FindBy(xpath = "//table[@formarrayname='ItemData']/tbody/tr[1]/td[3]//input[@type='text']")
	WebElement stock;

	@FindBy(xpath = "(//button[normalize-space()='Save'])[1]")
	WebElement saveButton;

	@FindBy(xpath = "(//i[@title='Click to Material Request Issue'])[1]")
	WebElement issueButton;

	@FindBy(xpath = "(//i[@title='Add Location'])[1]")
	WebElement locationAdd;

	@FindBy(xpath = "(//input[@type='text'])[4]")
	WebElement warehouse;

	@FindBy(xpath = "(//input[@type='text'])[5]")
	WebElement location;

	@FindBy(xpath = "(//span[normalize-space()='HYD-BH-RD5'])[1]")
	WebElement warehouseSelect;

	@FindBy(xpath = "(//span[normalize-space()='room no1'])[1]")
	WebElement locationSelect;

	@FindBy(xpath = "(//input[@type='text'])[4]")
	WebElement warehouse1;

	@FindBy(xpath = "(//span[normalize-space()='HYD-BH-RD3'])[1]")
	WebElement warehouseSelect1;

	@FindBy(xpath = "(//input[@type='text'])[5]")
	WebElement location1;

	@FindBy(xpath = "(//span[normalize-space()='HYD-BHRD3-Room1'])[1]")
	WebElement locationSelect1;

	@FindBy(xpath = "(//input[@placeholder='Enter Quantity'])[1]")
	WebElement issueQty;

	@FindBy(xpath = "(//button[normalize-space()='Add'])[1]")
	WebElement add;

	@FindBy(xpath = "(//button[normalize-space()='Save'])[2]")
	WebElement save;

	public MaterialRequest() {

		PageFactory.initElements(driver, this);
	}

//*************Material Request Create Page******************

	public HomePage MRCreate(String RequiredQuantity, String IssueQuantity) throws InterruptedException {
		// TODO Auto-generated method stub

//Sales Order Number

		driver.navigate().to("https://demo_keus.getapcs.com/transaction/shop-order/table");

		String tableXpath = "//table[@class='table table-striped']";

		String salesOrderNumber = driver.findElement(By.xpath(tableXpath + "/tbody/tr[1]/td[2]")).getText();

		String elementXpath = "(//span[normalize-space()='Item-FG-11-TEST'])[1]";

		String updatedXpath = elementXpath.replace("Item-FG-11-TEST", salesOrderNumber);

		System.out.println(updatedXpath);

//Project Number

		driver.navigate().to("https://demo_keus.getapcs.com/transaction/sales-order/table");

		String tableXpath1 = "//table[@class='table table-striped']";

		String projectNumber1 = driver.findElement(By.xpath(tableXpath1 + "/tbody/tr[1]/td[4]")).getText();

		String elementXpath1 = "(//span[normalize-space()='Item-FG-11-TEST'])[1]";

		String updatedXpath1 = elementXpath1.replace("Item-FG-11-TEST", projectNumber1);

		System.out.println(updatedXpath1);

//Part Type

		driver.navigate().to("https://demo_keus.getapcs.com/engineering/item-master/table");

		String tableXpath2 = "//table[@class='table table-striped']";

		String partNumber1 = driver.findElement(By.xpath(tableXpath2 + "/tbody/tr[1]/td[2]")).getText();

		String elementXpath2 = "(//span[normalize-space()='Item-FG-11-TEST'])[1]";

		String updatedXpath2 = elementXpath2.replace("Item-FG-11-TEST", partNumber1 + "-Test Description");

		System.out.println(updatedXpath2);

		driver.navigate().to("https://demo_keus.getapcs.com/transaction/create-material-request");

//Project Number

		click(driver, projectNumber);

		isSelected(driver, projectNumber, "projectNumber");

		WebElement salesOrderNumSelect = driver.findElement(By.xpath(updatedXpath1));

		click(driver, salesOrderNumSelect);
		Thread.sleep(2000);

//sales Order Number

		click(driver, salesOrderNum);

		isSelected(driver, salesOrderNum, "shopOrderNum");

		WebElement salesOrderNumSelect1 = driver.findElement(By.xpath(updatedXpath));

		click(driver, salesOrderNumSelect1);
		Thread.sleep(2000);

//Part Number

		click(driver, partNumber);

		isSelected(driver, partNumber, "partNumber");

		WebElement partNumberSelect = driver.findElement(By.xpath(updatedXpath2));

		click(driver, partNumberSelect);
		Thread.sleep(2000);

//Part Type

		dataPrintFromInputtag(driver, partType, "partType");

//Stock

//		dataPrintFromInputtag(driver, stock, "stock");

		String availableQuantityText = (String) js.executeScript("return arguments[0].value;", stock);
		System.out.println("stock" + " : " + availableQuantityText + "\n");

//Required Qty

		click(driver, requiredQty);

		isSelected(driver, requiredQty, "requiredQty");
		requiredQty.clear();

		// Convert the quantityText to an integer
		double availableQuantityValue = Double.parseDouble(availableQuantityText);

		// Perform your calculations
		double availableQuantityValue1 = availableQuantityValue / 2;

		System.out.println(availableQuantityValue1);

		// Convert quantityValue to a String
		String availableQuantity = String.valueOf(availableQuantityValue1);

		Thread.sleep(2000);

		requiredQty.sendKeys(availableQuantity);

		click(driver, saveButton);

//Issue Button

		click(driver, issueButton);

		click(driver, locationAdd);

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

			// Issue Quantity

			double acceptedQtyValue1 = availableQuantityValue1 / 2;

			String acceptedQtyValue2 = String.valueOf(acceptedQtyValue1);

			click(driver, issueQty);

			issueQty.sendKeys(acceptedQtyValue2);

			// add

			click(driver, add);

		}

		click(driver, save);

		click(driver, saveButton);

		return new HomePage();
	}
}
