package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class MoisturizersPage extends TestBase{
	@FindBy(xpath ="//div[@id='menu1']/preceding-sibling::a[@id='snm']")
	WebElement shop;
	
	@FindBy(css ="[title='product category list']")
	WebElement categories;
	
	@FindBy(css ="[aria-label='Moisturizers']")
	WebElement moisturizersLink;
	
	@FindBy(xpath="//span[@title='click here to add Collagen Peptide 24 MAX  Face Moisturizer  Fragrance Free to bag']")	
	WebElement AddtoBagLink;
	
	@FindBy(xpath="//button[@class='swal2-confirm']/following-sibling::button")
	WebElement ContinueShopping;
		
	@FindBy(css="a[title='items in your cart']")
	WebElement BagLink;
		
	@FindBy(xpath="//span[@class='previewCartItem-brand']")
	WebElement AddtoBagTest;
	
	//Initialize page object
	public MoisturizersPage() {
	PageFactory.initElements(driver, this);
	}
	
	//click on shop link
	public void clickOnShopLink() {
		shop.click();	
	}
	
	//click on categories link
	public void clickOnCategoriesLink() {
		categories.click();	
	}
	
	//click on moisturizers link
	public void clickOnMoisturizersLink() {
		moisturizersLink.click();		
	}
	
	//click on AddToBag link
	public void clickOnAddtoBagLink() {
		AddtoBagLink.click();		
	}
		
	//click on continue shopping link
	public void clickOnContinueShoppingLink() {
		ContinueShopping.click();	
	}
		
	//click on bag link
	public void clickOnBagLink() {
		BagLink.click();	
	}
		
	//Actions to verify a item added to the bag
	public String verifyAddToBagSuccess() {
		return AddtoBagTest.getText();
	}

}

