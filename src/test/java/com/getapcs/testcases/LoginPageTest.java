package com.getapcs.testcases;

import java.awt.AWTException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.getapcs.base.Testbase1;
import com.getapcs.pages.HomePage;
import com.getapcs.pages.LoginPage;
import com.getapcs.util.TestUtil;

public class LoginPageTest extends Testbase1 
{
	LoginPage loginPage;
	HomePage homePage;
	String sheetName = "Login";
	public LoginPageTest()
	{
		super();
	}
	@BeforeTest
	public void setUp() throws AWTException
	{
		initialization();
		loginPage = new LoginPage();
	}
	
//	@Test(priority = 1)
//	
//	public void Validates()
//	{
//		  String title = loginPage.validateLoginPageTitle();
//		  Assert.assertEquals(title, "GetaPCS");
//		
//		
//		  Assert.assertTrue(loginPage.ValidateDisplayed());
//		  Assert.assertTrue(loginPage.ValidateEnabled());
//		  
//		  String usernamePlaceholder = loginPage.getUsernameFieldPlaceholder();
//	      String passwordPlaceholder = loginPage.getPasswordFieldPlaceholder();
//	
//		  Assert.assertEquals(usernamePlaceholder, "Email");
//	      Assert.assertEquals(passwordPlaceholder, "Password");
//	    
//	}
	
//	@DataProvider
//	public Object[][] getTestDataLogin()
//	{
//		Object data[][] = TestUtil.getTestData(sheetName);
//		return data;
//	}
//	(priority = 2,dataProvider = "getTestDataLogin")
	@Test
	public void loginTest(String email,String password) throws InterruptedException
	{
		//homePage = loginPage.login("admin@mail.com","admin@123");
		//homePage = loginPage.login(email,password);
	homePage = loginPage.login("gopal@mail.com","gopal321");
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.quit();
	}
	
}
