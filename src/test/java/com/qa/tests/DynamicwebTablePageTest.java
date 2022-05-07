package com.qa.tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.DatePickerPage;
import com.qa.pages.DynamicwebTablePage;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import com.qa.util.Constant;

public class DynamicwebTablePageTest extends TestBase{
	DynamicwebTablePage dynamicwebTable;
	
	public DynamicwebTablePageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		driver.get(Constant.URL3);
		dynamicwebTable = new DynamicwebTablePage();
	}
	
	@Test(priority = 1)
	public void DynamicWebTable(){
		dynamicwebTable.Row();
		dynamicwebTable.col();
	}
	
	//closes all the windows that were opened
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
