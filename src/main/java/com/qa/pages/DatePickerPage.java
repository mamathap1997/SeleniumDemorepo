package com.qa.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


import com.qa.base.TestBase;

public class DatePickerPage extends TestBase{
	
	//Page Factory
	@FindBy(id="datePickerMonthYearInput")
	WebElement selectDate;
	
	@FindBy(xpath="//select[@class='react-datepicker__month-select']")
	WebElement month;
	
	@FindBy(xpath="//select[@class='react-datepicker__year-select']")
	WebElement year;
	
	@FindBy(xpath="//div[@class='react-datepicker__day react-datepicker__day--029']")
	WebElement date;
	
	@FindBy(id="dateAndTimePickerInput")
	WebElement selectTime;
	
	@FindBy(xpath="//div[@class='react-datepicker__month']")
	List<WebElement> selectDateTime;
	
	/*Initialize page object
	 *driver points to username, password, loginbth and this refers to current class object*/
	public DatePickerPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void SelectDate()  {
		selectDate.click();
	}	
	
	public Select month() {
		Select selMonth= new Select(month);
		return selMonth;
	}
	
	public Select year() {
		Select selYear= new Select(year);
		return selYear;
	}
	
	public void birthDate()  {
		date.click();
	}
	
}
