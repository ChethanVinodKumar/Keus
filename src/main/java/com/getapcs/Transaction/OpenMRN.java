package com.getapcs.Transaction;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.getapcs.base.Testbase1;
import com.getapcs.pages.HomePage;

public class OpenMRN extends Testbase1 {

	// Delivery Order

	@FindBy(xpath = "(//button[normalize-space()='Issue Material'])[1]")
	WebElement issueMaterial;

	@FindBy(xpath = "(//button[normalize-space()='Locations'])[1]")
	WebElement locationButton;

	@FindBy(xpath = "(//input[@type='text'])[4]")
	WebElement wareHouse;

	@FindBy(xpath = "(//span[normalize-space()='HYD-BH-RD5'])[1]")
	WebElement wareHouseSelect;

	@FindBy(xpath = "(//input[@type='text'])[5]")
	WebElement location;

	@FindBy(xpath = "(//span[normalize-space()='room no1'])[1]")
	WebElement locationSelect;

	@FindBy(xpath = "(//input[@placeholder='Enter quantity'])[1]")
	WebElement quantity;

	@FindBy(xpath = "(//button[normalize-space()='Add'])[1]")
	WebElement add;

	@FindBy(xpath = "(//button[normalize-space()='Save'])[2]")
	WebElement save;

	@FindBy(xpath = "(//button[normalize-space()='Save'])[1]")
	WebElement saveButton;

	public OpenMRN() {

		PageFactory.initElements(driver, this);
	}

//*************Material Request Create Page******************

	public HomePage OpenMRNIssueMRN(String ReturnQty) throws InterruptedException {
		// TODO Auto-generated method stub

		click(driver, issueMaterial);

		click(driver, locationButton);

		click(driver, wareHouse);

		isSelected(driver, wareHouse, "wareHouse");

		click(driver, wareHouseSelect);

		click(driver, location);

		isSelected(driver, location, "location");

		click(driver, locationSelect);

		click(driver, quantity);

		quantity.sendKeys(ReturnQty);

		click(driver, add);

		click(driver, save);

		click(driver, saveButton);

		return new HomePage();
	}
}
