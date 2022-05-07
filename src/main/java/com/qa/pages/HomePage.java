package com.qa.pages;

//Importing required classes
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.base.TestBase;
import com.qa.util.testUtil;

public class HomePage extends TestBase {
	
	//Page Factory
	//Locating a username label based on xpath
	@FindBy(xpath="//*[contains(text(),'Hello, Mamatha P!')]")
	WebElement userNameTest;
	
	@FindBy(xpath ="//div[@id='menu1']/preceding-sibling::a[@id='snm']")
	WebElement shop;
	
	@FindBy(css="[title='featured items list']")
	WebElement featureditems;
		
	@FindBy(css="[title='Just']")
	WebElement justarrived;
	
	@FindBy(id="sort")
	WebElement sort;
	
	@FindBy(xpath="//a[@alt='Best Sellers']")
	WebElement bestsellers;
	
	@FindBy(xpath="//a[@alt='Gift Sets & Kits']")
	WebElement gifts;
	
	@FindBy(xpath="//a[@title='offers']")
	WebElement offers;
	
	//Initialize page object        
	public HomePage() {
	PageFactory.initElements(driver, this);
	}
	
	//Actions to verify a correct username
	public boolean verifyCorrectUsername() {
		return userNameTest.isDisplayed();
	}
	
	public void clickOnShopLink() {
		shop.click();	
	}
	
	public void featuredItemsList() {
		featureditems.click();
	}
	
	public void justArrived() {
		justarrived.click();
	}
	
	public Select sorting() {
		Select newest = new Select(sort);
		return newest;
	}
	
	public void bestSellers() {
		bestsellers.click();
	}
	
	public void GiftSetsKits() {
		gifts.click();
	}

	public void offersSubMenu() {
		offers.click();
	}

}

