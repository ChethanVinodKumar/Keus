package com.getapcs.Keus.TransactionSAFlow;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.getapcs.base.Testbase1;
import com.getapcs.home.login.HomePage;

public class MaterialIssueFG extends Testbase1 {

	// Material Issue

	@FindBy(xpath = "(//button[@type='button'][normalize-space()='Issue Material'])[1]")
	WebElement issueMaterial;

	@FindBy(xpath = "(//input[@type='checkbox'])[1]")
	WebElement issueCheckBox;

	@FindBy(xpath = "(//button[normalize-space()='Issue'])[1]")
	WebElement issueButton;

	public MaterialIssueFG() {

		PageFactory.initElements(driver, this);

	}

	// *************Material Issue Page******************//

	public HomePage MaterialIssuePage() throws InterruptedException {

		js.executeScript("arguments[0].click();", issueMaterial);

		System.out.println("//************Material Issue***************//");

////Project Type
//
//		String projectTypexpath = "//label[text()='Project Type']/..//label[@class='field2']";
//		
//		String projectType = driver.findElement(By.xpath(projectTypexpath)).getText();
//		
//		System.out.println("Project Type is : "+projectType);
//		Thread.sleep(2000);  

//Item Type

		String itemTypexpath = "//label[text()='Item Type']/..//label[@class='field2']";

		String itemType = driver.findElement(By.xpath(itemTypexpath)).getText();

		System.out.println("item Type is : " + itemType);
		Thread.sleep(2000);

//Work Order Number

		String workOrderNumberxpath = "//label[text()='Shop Order Number']/..//label[@class='field2']";

		String workOrderNumber = driver.findElement(By.xpath(workOrderNumberxpath)).getText();

		System.out.println("Work Order Number is : " + workOrderNumber);
		Thread.sleep(2000);

//Item Number

		String itemNumberxpath = "//label[text()='Item Number']/..//label[@class='field2']";

		String itemNumber = driver.findElement(By.xpath(itemNumberxpath)).getText();

		System.out.println("Item Number is : " + itemNumber);
		Thread.sleep(2000);

//So Close Date

		String soCLoseDatexpath = "//label[text()='So Close Date']/..//label[@class='field2']";

		String soCLoseDate = driver.findElement(By.xpath(soCLoseDatexpath)).getText();

		System.out.println("So Close Date is : " + soCLoseDate);
		Thread.sleep(2000);

//Work Order Released Qty

		String workOrderReleasedQtyxpath = "//label[text()='Shop Order Released Qty']/..//label[@class='field2']";

		String workOrderReleasedQty = driver.findElement(By.xpath(workOrderReleasedQtyxpath)).getText();

		System.out.println("Work Order Released Qty is : " + workOrderReleasedQty);
		Thread.sleep(2000);

		js.executeScript("arguments[0].click();", issueCheckBox);
		js.executeScript("arguments[0].click();", issueButton);

		return new HomePage();
	}

}
