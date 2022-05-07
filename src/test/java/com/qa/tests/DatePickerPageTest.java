package com.qa.tests;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import com.qa.base.TestBase;
import com.qa.pages.DatePickerPage;
import com.qa.pages.LoginPage;
import com.qa.util.Constant;

public class DatePickerPageTest extends TestBase{
	DatePickerPage datepickPage;
	
	public DatePickerPageTest() {
		super();
	}	
	
	//Call initialization()
	@BeforeMethod
	public void setUp() {
		initialization();
		driver.get(Constant.DATEPICKERURL);
		datepickPage = new DatePickerPage();
	}
	
	@Test(priority = 1)
	public void dob(){
		datepickPage.SelectDate();
		datepickPage.month().selectByVisibleText(Constant.SEL_MONTH);
		datepickPage.year().selectByVisibleText(Constant.SEL_YEAR);
		String date=Constant.SEL_DATE;
		datepickPage.birthDate();
	}
	
	//closes all the windows that were opened
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
