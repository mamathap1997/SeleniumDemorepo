package com.qa.tests;

//Importing required classes
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import com.qa.util.Constant;

public class LoginPageTest extends TestBase{
	LoginPage loginpage;
	HomePage homepage;
	
	//Before initialization call super class constructor i.e TestBase constructor 
	public LoginPageTest() {
		super();
	}
	
	//Call initialization()
	@BeforeMethod
	public void setUp() {
		initialization();
		driver.get(Constant.URL);
		loginpage=new LoginPage();
	}
	
	//verify the title of the login page
	@Test(priority = 1)
	public void loginPageTitleTest() {
		String title=loginpage.validateLoginPageTitle();
		Assert.assertEquals(title,Constant.LOGINPGTITLE);
	}
	
	//Login to the OLAY website by entering the valid username, password
	@Test(priority = 2)
	public void loginTest() {
		homepage=loginpage.login(Constant.USERNAME, Constant.PASSWORD);
	}
	
	//closes all the windows that were opened
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	

}
