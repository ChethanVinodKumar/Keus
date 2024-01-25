package com.getapcs.InventryReports.SAFlow;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.getapcs.base.Testbase1;
import com.getapcs.home.login.HomePage;

public class InventryReportAfterOQCFG extends Testbase1 {

	// Material Issue

	@FindBy(xpath = "(//span[@class='dropdown-multiselect__caret'])[1]")
	WebElement partType;

	@FindBy(xpath = "(//span[@class='dropdown-btn'])[2]")
	WebElement projectNumber;

	@FindBy(xpath = "(//input[@placeholder='Search'])[2]")
	WebElement searchPartType;

	@FindBy(xpath = "(//input[@placeholder='Search'])[3]")
	WebElement searchprojectNumber;

	@FindBy(xpath = "(//button[normalize-space()='Filter'])[1]")
	WebElement filter;

	@FindBy(xpath = "(//i[@class='mdi mdi-eye edit-icon'])[1]")
	WebElement viewButton;

	@FindBy(xpath = "(//i[@class='mdi mdi-eye edit-icon'])[2]")
	WebElement viewButton1;

	@FindBy(xpath = "(//button[normalize-space()='Issue Material'])[3]")
	WebElement issueMaterial3;

	@FindBy(xpath = "(//button[normalize-space()='Issue Material'])[2]")
	WebElement issueMaterial2;

	@FindBy(xpath = "(//button[normalize-space()='Issue Material'])[1]")
	WebElement issueMaterial1;

	@FindBy(xpath = "(//a[normalize-space()='Items'])[1]")
	WebElement itemsTab;

	@FindBy(xpath = "(//i[@title='Add Project'])[1]")
	WebElement addProject;

	public InventryReportAfterOQCFG() {

		PageFactory.initElements(driver, this);

	}

	// *************Inventry Report Page******************//

	public HomePage InventryReportPage() throws InterruptedException, IOException {

//Part Type

		driver.navigate().to("https://demo_keus.getapcs.com/transaction/material-issue/table");

		String tableXpath1 = "//table[@class='table table-striped']";

		String FG = driver.findElement(By.xpath(tableXpath1 + "/tbody/tr[1]/td[3]")).getText();

		String elementXpath1 = "(//div[normalize-space()='PP-54'])[1]";

		String updatedXpath1 = elementXpath1.replace("PP-54", FG);

		System.out.println(updatedXpath1);

		String SA1 = driver.findElement(By.xpath(tableXpath1 + "/tbody/tr[2]/td[3]")).getText();

		String elementXpath2 = "(//div[normalize-space()='PP-54'])[1]";

		String updatedXpath2 = elementXpath2.replace("PP-54", SA1);

		System.out.println(updatedXpath2);

		String SA2 = driver.findElement(By.xpath(tableXpath1 + "/tbody/tr[3]/td[3]")).getText();

		String elementXpath3 = "(//div[normalize-space()='PP-54'])[1]";

		String updatedXpath3 = elementXpath3.replace("PP-54", SA2);

		System.out.println(updatedXpath3);

		click(driver, issueMaterial3);

		String tableXpath2 = "//table[@class='table mb-2 ng-untouched ng-pristine ng-valid']";

		String PP1 = driver.findElement(By.xpath(tableXpath2 + "/tbody/tr[2]/td[3]")).getText();

		String elementXpath4 = "(//div[normalize-space()='PP-54'])[1]";

		String updatedXpath4 = elementXpath4.replace("PP-54", PP1);

		System.out.println(updatedXpath4);

		String PP2 = driver.findElement(By.xpath(tableXpath2 + "/tbody/tr[1]/td[3]")).getText();

		String elementXpath5 = "(//div[normalize-space()='PP-54'])[1]";

		String updatedXpath5 = elementXpath5.replace("PP-54", PP2);

		System.out.println(updatedXpath5);

		driver.navigate().back();

		click(driver, issueMaterial2);

		String PP3 = driver.findElement(By.xpath(tableXpath2 + "/tbody/tr[3]/td[3]")).getText();

		String elementXpath6 = "(//div[normalize-space()='PP-54'])[1]";

		String updatedXpath6 = elementXpath6.replace("PP-54", PP3);

		System.out.println(updatedXpath6);

		String PP4 = driver.findElement(By.xpath(tableXpath2 + "/tbody/tr[2]/td[3]")).getText();

		String elementXpath7 = "(//div[normalize-space()='PP-54'])[1]";

		String updatedXpath7 = elementXpath7.replace("PP-54", PP4);

		System.out.println(updatedXpath7);

		driver.navigate().back();

		click(driver, issueMaterial1);

		String PP5 = driver.findElement(By.xpath(tableXpath2 + "/tbody/tr[2]/td[3]")).getText();

		String elementXpath8 = "(//div[normalize-space()='PP-54'])[1]";

		String updatedXpath8 = elementXpath8.replace("PP-54", PP5);

		System.out.println(updatedXpath8);

		String PP6 = driver.findElement(By.xpath(tableXpath2 + "/tbody/tr[3]/td[3]")).getText();

		String elementXpath9 = "(//div[normalize-space()='PP-54'])[1]";

		String updatedXpath9 = elementXpath9.replace("PP-54", PP6);

		System.out.println(updatedXpath9);

		driver.navigate().to("https://demo_keus.getapcs.com/reports/inventory-report");

//Part Type

		for (int i = 1; i <= 9; i++) {

			if (i == 1) {
				click(driver, partType);
			}

			if (i == 1) {
				js.executeScript("arguments[0].click();", searchPartType);
				searchPartType.clear();
				searchPartType.sendKeys(FG);

				WebElement partTypeSelect = driver.findElement(By.xpath(updatedXpath1));
				click(driver, partTypeSelect);
			}

			if (i == 2) {
				searchPartType.clear();
				searchPartType.sendKeys(SA1);

				WebElement partTypeSelect = driver.findElement(By.xpath(updatedXpath2));
				click(driver, partTypeSelect);
			}

			if (i == 3) {
				searchPartType.clear();
				searchPartType.sendKeys(SA2);

				WebElement partTypeSelect = driver.findElement(By.xpath(updatedXpath3));
				click(driver, partTypeSelect);
			}

			if (i == 4) {
				searchPartType.clear();
				searchPartType.sendKeys(PP1);

				WebElement partTypeSelect = driver.findElement(By.xpath(updatedXpath4));
				click(driver, partTypeSelect);
			}

			if (i == 5) {
				searchPartType.clear();
				searchPartType.sendKeys(PP2);

				WebElement partTypeSelect = driver.findElement(By.xpath(updatedXpath5));
				click(driver, partTypeSelect);
			}

			if (i == 6) {
				searchPartType.clear();
				searchPartType.sendKeys(PP3);

				WebElement partTypeSelect = driver.findElement(By.xpath(updatedXpath6));
				click(driver, partTypeSelect);
			}
			if (i == 7) {
				searchPartType.clear();
				searchPartType.sendKeys(PP4);

				WebElement partTypeSelect = driver.findElement(By.xpath(updatedXpath7));
				click(driver, partTypeSelect);
			}

			if (i == 8) {
				searchPartType.clear();
				searchPartType.sendKeys(PP5);

				WebElement partTypeSelect = driver.findElement(By.xpath(updatedXpath8));
				click(driver, partTypeSelect);
			}

			if (i == 9) {
				searchPartType.clear();
				searchPartType.sendKeys(PP6);

				WebElement partTypeSelect = driver.findElement(By.xpath(updatedXpath9));
				click(driver, partTypeSelect);
			}
		}

//Filter

		click(driver, filter);

		Thread.sleep(4000);
		screenShot("After Material Issue SA1");

		return new HomePage();
	}

}
