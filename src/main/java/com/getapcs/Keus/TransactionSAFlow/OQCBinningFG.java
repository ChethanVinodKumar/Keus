package com.getapcs.Keus.TransactionSAFlow;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.getapcs.base.Testbase1;
import com.getapcs.home.login.HomePage;

public class OQCBinningFG extends Testbase1 {

	// Shop Order

	@FindBy(xpath = "(//textarea[@role='combobox'])[1]")
	WebElement fgItemNumber;

	@FindBy(xpath = "(//input[@aria-autocomplete='list'])[1]")
	WebElement shopOrderNum;

	@FindBy(xpath = "//label[text()='Accepted FG Qty']/..//input[@class='form-control field2 ng-untouched ng-pristine ng-valid']")
	WebElement acceptedQty;

	@FindBy(xpath = "(//button[normalize-space()='Binning'])[1]")
	WebElement binning;

	@FindBy(xpath = "(//input[@type='text'])[3]")
	WebElement warehouse;

	@FindBy(xpath = "(//span[normalize-space()='HYD-BH-RD5'])[1]")
	WebElement warehouseSelect;

	@FindBy(xpath = "(//input[@type='text'])[4]")
	WebElement location;

	@FindBy(xpath = "(//span[normalize-space()='room no1'])[1]")
	WebElement locationSelect;

	@FindBy(xpath = "(//input[@type='text'])[3]")
	WebElement warehouse1;

	@FindBy(xpath = "(//span[normalize-space()='HYD-BH-RD3'])[1]")
	WebElement warehouseSelect1;

	@FindBy(xpath = "(//input[@type='text'])[4]")
	WebElement location1;

	@FindBy(xpath = "(//span[normalize-space()='HYD-BHRD3-Room1'])[1]")
	WebElement locationSelect1;

	@FindBy(xpath = "(//input[@placeholder='Enter quantity'])[1]")
	WebElement quantity;

	@FindBy(xpath = "(//button[normalize-space()='Add'])[1]")
	WebElement add;

	@FindBy(xpath = "(//button[@type='submit'][normalize-space()='Save'])[1]")
	WebElement save;

	@FindBy(xpath = "//button[normalize-space()='Save']")
	WebElement saveButton;

	public OQCBinningFG() {

		PageFactory.initElements(driver, this);
	}

//*************OQC Binning Create Page******************

	public HomePage OQCBinningCreate() throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("//*************OQC Binning Create Page******************");

		driver.navigate().to("https://demo_keus.getapcs.com/transaction/material-issue/table");

		String tableXpath = "(//table[@class='table table-striped'])[1]";

		String saItemNumber1 = driver.findElement(By.xpath(tableXpath + "/tbody/tr[1]/td[3]")).getText();

		String elementXpath = "(//span[normalize-space()='Item-FG-11-TEST'])[1]";

		String updatedXpath = elementXpath.replace("Item-FG-11-TEST", saItemNumber1 + "-Test Description");

		System.out.println(updatedXpath);

		// Shop Order Num

		String salesOrderNum = driver.findElement(By.xpath(tableXpath + "/tbody/tr[1]/td[2]")).getText();

		String elementXpath2 = "(//span[normalize-space()='Item-FG-11-TEST'])[1]";

		String updatedXpath1 = elementXpath2.replace("Item-FG-11-TEST", salesOrderNum);

		System.out.println(updatedXpath1);

		driver.navigate().to("https://demo_keus.getapcs.com/transaction/create-oqc-binning");

//FG Item Number

		click(driver, fgItemNumber);
		fgItemNumber.sendKeys(Keys.BACK_SPACE);
		isSelected(driver, fgItemNumber, "fgItemNumber");

		WebElement fgItemNumberSelect = driver.findElement(By.xpath(updatedXpath));

		click(driver, fgItemNumberSelect);

//Shop Order Number

		click(driver, shopOrderNum);

		isSelected(driver, shopOrderNum, "shopOrderNum");

		WebElement shopOrderNumSelect = driver.findElement(By.xpath(updatedXpath1));

		click(driver, shopOrderNumSelect);

//accepted Qty

		dataPrintFromInputtag(driver, acceptedQty, "acceptedQty");

		String acceptedQty1 = (String) js.executeScript("return arguments[0].value;", acceptedQty);
		System.out.println("\n" + "pendingQty : " + acceptedQty1 + "\n");

		int acceptedQty2 = Integer.parseInt(acceptedQty1) / 2;

//Binning 

		click(driver, binning);

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

			click(driver, quantity);

			quantity.sendKeys(String.valueOf(acceptedQty2));

			click(driver, add);
		}
		click(driver, save);
		click(driver, saveButton);

		return new HomePage();
	}

}
