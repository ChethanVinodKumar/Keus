package com.getapcs.Sales;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.getapcs.base.Testbase1;
import com.getapcs.home.login.HomePage;

public class RFQ_ReleaseCS extends Testbase1 {

	@FindBy(xpath = "(//button[@type='button'][normalize-space()='CS'])[1]")
	WebElement csButton;

	@FindBy(xpath = "(//button[text()='CS'])[1]")
	WebElement csButton1;

	@FindBy(xpath = "/html/body/app-root/div/div/div/div/div/app-rfq-item-view/div[2]/div/div/div/form/div/div[4]/div/div/div/table/thead/tr/th[1]/input")
	WebElement itemTabCheckBox;

	@FindBy(xpath = "(//input[@value='1400'])[1]")
	WebElement itemTabCheckBox1;

	@FindBy(xpath = "(//button[normalize-space()='Release'])[1]")
	WebElement releaseButtonInCSRelease;

	public RFQ_ReleaseCS() {
		PageFactory.initElements(driver, this);
	}

	public HomePage RFQCs() throws Throwable {

		System.out.println("\n" + "RFQ_ReleaseCS  Started" + "\n");

		// Verify and Release the CS
		click(driver, csButton1);

		Thread.sleep(4000);

		itemTabCheckBox.sendKeys(Keys.SPACE);
		// itemTabCheckBox1.sendKeys(Keys.SPACE);

		Thread.sleep(2000);

		click(driver, releaseButtonInCSRelease);

		System.out.println("\n" + "RFQ_ReleaseCS  Ended" + "\n");

		return new HomePage();

	}

}
