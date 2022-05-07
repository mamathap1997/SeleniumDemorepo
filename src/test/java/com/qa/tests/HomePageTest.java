package com.qa.tests;

//Importing required classes
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import com.qa.util.Constant;
import com.qa.util.testUtil;

public class HomePageTest extends TestBase{
	LoginPage loginpage;
	HomePage homepage;
	
	//Before initialization call super class constructor i.e TestBase constructor 
	public HomePageTest() {
		super();
	}
	
	/*Call initialization()
	 *Login to the OLAY website by entering the valid username, password*/ 
	@BeforeMethod
	public void setUp() throws InterruptedException {
		initialization();
		driver.get(Constant.URL);
		loginpage=new LoginPage();
		homepage=loginpage.login(Constant.USERNAME, Constant.PASSWORD);
		Thread.sleep(8000); 
	}
		
	//verify the correct username  
	@Test(priority = 1)
	public void verifyUserNameTest() {
		Assert.assertTrue(homepage.verifyCorrectUsername());
	}
	
	/*click on justarrived items-sort them based on newest
	 *click on bestsellers and sort them based on Ascending order
	 *click on giftsets and sort them based on descending order
	*/
	@Test(priority = 2)
	public void featuredItemsSubMenu() {
		homepage.clickOnShopLink();
		homepage.featuredItemsList();
		homepage.justArrived();
		homepage.sorting().selectByVisibleText(Constant.JUSTARRIVED);
		homepage.bestSellers();
		homepage.sorting().selectByVisibleText(Constant.BESTSELLER);
		homepage.GiftSetsKits();
		homepage.sorting().selectByVisibleText(Constant.GIFTSET);
	}
	
	//check offers available on Olay products
	@Test(priority = 3)
	public void OlayOffers() {
		homepage.clickOnShopLink();
		homepage.offersSubMenu();
	}
	
	//closes all the windows that were opened
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	

}
