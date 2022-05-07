package com.qa.pages;

//Importing required classes
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.qa.base.TestBase;
import com.qa.util.Constant;
import com.qa.util.testUtil;

public class LoginPage extends TestBase{
	
	//Page Factory
	//Locating a username based on id
	@FindBy(id="login_email")
	WebElement username;
	
	//Locating a password based on name
	@FindBy(name="login_pass")
	WebElement password;
	
	//Locating a login button based on xpath
	@FindBy(xpath="//input[@type='button']")
	WebElement loginBtn;
	
	/*Initialize page object
	 *driver points to username, password, loginbth and this refers to current class object*/
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	//Actions to validate loginpage title
	public String validateLoginPageTitle() {
		return driver.getTitle();
	}
	
	//Enter a valid username, password and click on login button
	public HomePage login(String un,String pwd)  {
		username.sendKeys(un);
		password.sendKeys(pwd);
		loginBtn.click();	
		//testUtil.wait.until(ExpectedConditions.elementToBeClickable(loginBtn));
		return new HomePage();
	}	
	
}
