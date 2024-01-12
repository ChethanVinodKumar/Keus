package com.getapcs.TransactionTable;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.getapcs.base.Testbase1;
import com.getapcs.home.login.HomePage;

public class Open_Delivery_Order_table_Page extends Testbase1 {
	@FindBy(xpath = "(//select)[1]")
	WebElement pageSize;

	@FindBy(xpath = "//input[@id='example-search-input']")
	WebElement searchTextField;

	@FindBy(xpath = "(//i[@class='mdi mdi-magnify search_icon'])[1]")
	WebElement searchButton;

	@FindBy(xpath = "(//span[normalize-space()='»»'])[1]")
	WebElement paginationLast;

	@FindBy(xpath = "(//span[normalize-space()='««'])[1]")
	WebElement paginationFirst;

	@FindBy(xpath = "//button[normalize-space()='Save']")
	WebElement saveButton;

	@FindBy(xpath = "(//table[@class='table table-striped'])[1]")
	WebElement table;

	@FindBy(xpath = "//table[@class='table table-striped']/tbody/tr[1]/td[2]")
	WebElement searchData;

	public Open_Delivery_Order_table_Page() {
		PageFactory.initElements(driver, this);
	}

	public HomePage ODO_Table() throws Exception {

		// Verifying that do we have proper Text heading.
		WebElement HeadingText = driver.findElement(By.xpath("(//div[@class='title_sub_div_1'])[1]"));
		String actualText = HeadingText.getText();
		String ExpectedText = "Purchase Order";
		assertEquals(actualText, ExpectedText);

//Page Size

		click(driver, pageSize);

		Thread.sleep(3000);
		Select select1 = new Select(pageSize);
		select1.selectByValue("50");

		Thread.sleep(3000);
		select1.selectByValue("100");

		Thread.sleep(3000);
		select1.selectByValue("500");

		Thread.sleep(3000);
		select1.selectByValue("10");

		Thread.sleep(3000);

//Search Text Field

		click(driver, searchTextField);

		isSelected(driver, searchTextField, "searchTextField");

		String searchDataText = searchData.getText();
		System.out.println(searchDataText);

		searchTextField.sendKeys(searchDataText);

		click(driver, searchButton);

		Thread.sleep(5000);

		driver.navigate().refresh();

// Pagination

		click(driver, paginationLast);

		Thread.sleep(2000);

		click(driver, paginationFirst);

		// Usage
		paginate(driver, 1, 9, true); // forward
		paginate(driver, 1, 9, false); // backward

		return new HomePage();

	}

}
