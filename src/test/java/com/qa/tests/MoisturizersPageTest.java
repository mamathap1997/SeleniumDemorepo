package com.qa.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import com.qa.pages.MoisturizersPage;
import com.qa.util.Constant;

public class MoisturizersPageTest extends TestBase{
	LoginPage loginpage;
	HomePage homepage;
	MoisturizersPage moisturizerspage;
	
	//Before initialization call super class constructor i.e TestBase constructor 
	public MoisturizersPageTest() {
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
		moisturizerspage=new MoisturizersPage();
	}

	//shop the moisturizer and add it to bag
	@Test(priority=1)
	public void verifyAddtoBagLinkTest(){
		moisturizerspage.clickOnShopLink();
		moisturizerspage.clickOnCategoriesLink();
		moisturizerspage.clickOnMoisturizersLink();
		moisturizerspage.clickOnAddtoBagLink();
		moisturizerspage.clickOnBagLink(); 
		String txt=moisturizerspage.verifyAddToBagSuccess();
		Assert.assertEquals(txt,Constant.MOISTURIZERS_BAG);
	}
	
	//closes all the windows that were opened
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	

}
