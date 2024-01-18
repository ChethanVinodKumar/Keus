package com.getapcs.Keus.TransactionSAFlow;

import java.util.List;

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

		String workOrderNumberxpath = "//label[text()='Work Order Number']/..//label[@class='field2']";

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

		String workOrderReleasedQtyxpath = "//label[text()='Work Order Released Qty']/..//label[@class='field2']";

		String workOrderReleasedQty = driver.findElement(By.xpath(workOrderReleasedQtyxpath)).getText();

		System.out.println("Work Order Released Qty is : " + workOrderReleasedQty);
		Thread.sleep(2000);

		WebElement table = driver.findElement(By.xpath("//table[@formarrayname='ItemData']"));

		// Fetch values from each cell in the table
		List<WebElement> rows = table.findElements(By.xpath(".//tbody/tr"));
		for (WebElement row : rows) {
			List<WebElement> cells = row.findElements(By.xpath(".//td"));

			String slNo = cells.get(1).getText();
			String partNo = cells.get(2).findElement(By.xpath(".//div")).getText();
			String description = cells.get(3).findElement(By.xpath(".//div")).getText();
			String partType = cells.get(4).findElement(By.xpath(".//div")).getText();
			String uom = cells.get(5).findElement(By.xpath(".//div")).getText();
			String requiredQuantity = cells.get(6).findElement(By.xpath(".//div")).getText();
			String availableQuantity = cells.get(7).findElement(By.xpath(".//div")).getText();
			String alreadyIssuedQty = cells.get(8).findElement(By.xpath(".//div")).getText();
			String balanceQty = cells.get(9).findElement(By.xpath(".//div")).getText();

			// Action button
			WebElement actionButton = cells.get(10).findElement(By.xpath(".//button"));
			String actionButtonText = actionButton.getText();
			// If you want to perform an action on the button, you can do so here

			// Print or use the retrieved values
			System.out.println("Sl No: " + slNo);
			System.out.println("Part No: " + partNo);
			System.out.println("Description: " + description);
			System.out.println("Part Type: " + partType);
			System.out.println("UOM: " + uom);
			System.out.println("Required Quantity: " + requiredQuantity);
			System.out.println("Available Quantity: " + availableQuantity);
			System.out.println("Already Issued Qty: " + alreadyIssuedQty);
			System.out.println("Balance Qty: " + balanceQty);
			System.out.println("Action Button Text: " + actionButtonText);
		}

		js.executeScript("arguments[0].click();", issueCheckBox);
		js.executeScript("arguments[0].click();", issueButton);

		return new HomePage();
	}

}
