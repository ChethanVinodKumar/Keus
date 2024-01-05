package com.keus.getapcs.testcases;

import java.awt.AWTException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.getapcs.base.Testbase1;
import com.getapcs.home.login.HomePage;
import com.getapcs.home.login.LoginPage;


public class HomePageTest extends Testbase1
{
	LoginPage loginPage;
	HomePage homePage;

	public HomePageTest()
	{
		super();
	}
	@BeforeMethod
	public void setUp() throws InterruptedException, AWTException
	{
		initialization();
	
		loginPage = new LoginPage();
		homePage = loginPage.login("gopal@mail.com","gopal321");
	}
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
}
