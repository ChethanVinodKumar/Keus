package com.getapcs.Keus.TransactionSAFlow;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.getapcs.base.Testbase1;
import com.getapcs.home.login.HomePage;

public class OQCSA2 extends Testbase1 {

	// Shop Order

	@FindBy(xpath = "(//input[@id='4'])[1]")
	WebElement saRadioButton;

	@FindBy(xpath = "(//textarea[@role='combobox'])[1]")
	WebElement saItemNumber;

	@FindBy(xpath = "(//input[@aria-autocomplete='list'])[1]")
	WebElement shopOrderNum;

	@FindBy(xpath = "//label[normalize-space(text())='Shop Order Qty']/following-sibling::input[@formcontrolname='shopOrderQty']")
	WebElement shopOrderQtyElement;

	@FindBy(xpath = "//label[text()='Pending Qty ']/..//input[@class='form-control field2 ng-untouched ng-pristine ng-valid']")
	WebElement pendingQty;

	@FindBy(xpath = "//label[text()='Rejected Qty ']/..//input[@class='form-control field2 ng-untouched ng-pristine ng-valid']")
	WebElement rejectedQty;

	@FindBy(xpath = "(//input[@placeholder='Accepted Qty'])[1]")
	WebElement acceptedQty;

	@FindBy(xpath = "//button[normalize-space()='Save']")
	WebElement saveButton;

	public OQCSA2() {

		PageFactory.initElements(driver, this);
	}

//*************OQC Create Page******************

	public HomePage OQCCreate() throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("//*************OQC Create Page******************");

		// SA Item Number

		driver.navigate().to("https://demo_keus.getapcs.com/transaction/material-issue/table");

		String tableXpath = "(//table[@class='table table-striped'])[1]";

		String saItemNumber1 = driver.findElement(By.xpath(tableXpath + "/tbody/tr[3]/td[3]")).getText();

		String elementXpath = "(//span[normalize-space()='Item-FG-11-TEST'])[1]";

		String updatedXpath = elementXpath.replace("Item-FG-11-TEST", saItemNumber1 + "-Test Description");

		System.out.println(updatedXpath);

		// Shop Order Num

		String salesOrderNum = driver.findElement(By.xpath(tableXpath + "/tbody/tr[3]/td[2]")).getText();

		String elementXpath2 = "(//span[normalize-space()='Item-FG-11-TEST'])[1]";

		String updatedXpath1 = elementXpath2.replace("Item-FG-11-TEST", salesOrderNum);

		System.out.println(updatedXpath1);

		driver.navigate().to("https://demo_keus.getapcs.com/transaction/create-fg-oqc");

//SA Radio Button

		js.executeScript("arguments[0].click();", saRadioButton);

//FG Item Number

		click(driver, saItemNumber);
		saItemNumber.sendKeys(Keys.BACK_SPACE);
		isSelected(driver, saItemNumber, "fgItemNumber");

		WebElement fgItemNumberSelect = driver.findElement(By.xpath(updatedXpath));

		click(driver, fgItemNumberSelect);

//Shop Order Number

		click(driver, shopOrderNum);

		isSelected(driver, shopOrderNum, "shopOrderNum");

		WebElement shopOrderNumSelect = driver.findElement(By.xpath(updatedXpath1));

		click(driver, shopOrderNumSelect);

//Shop Order  Qty

		dataPrintFromInputtag(driver, shopOrderQtyElement, "shopOrderQtyElement");

//pending Qty

		dataPrintFromInputtag(driver, pendingQty, "pendingQty");

		String pendingQty1 = (String) js.executeScript("return arguments[0].value;", pendingQty);
		System.out.println("\n" + "pendingQty : " + pendingQty1 + "\n");

//Accepted Qty

		click(driver, acceptedQty);

		isSelected(driver, acceptedQty, "acceptedQty");

		acceptedQty.sendKeys(pendingQty1);

//rejectedQty

		dataPrintFromInputtag(driver, rejectedQty, "rejectedQty");

//Save Button

		click(driver, saveButton);

		return new HomePage();
	}

}
