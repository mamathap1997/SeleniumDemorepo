package com.qa.pages;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DynamicwebTablePage extends TestBase {
	
	Logger log=Logger.getLogger(DynamicwebTablePage.class);
  
	public void Row() {
	  
	List<WebElement> rows = driver.findElements(By.xpath("//div[@id='Deri']/table/tbody/tr/td/table/tbody/tr"));
	int rowCount=rows.size();
	//System.out.println("Total number of rows are : "+ rowCount);
	log.info("Total number of rows are : "+ rowCount);
	log.info("********************************Contract********************************");
	
	String beforeXpath="//*[@id='Deri']/table/tbody/tr/td/table/tbody/tr[";
	String afterXpath="]/td[1]";
	
	for(int i=3;i<rowCount;i++) {
		String actualXpath=beforeXpath+i+afterXpath;
		WebElement element= driver.findElement(By.xpath(actualXpath));
		String contractName=element.getText();
		log.info(contractName);
	}
	
	log.info("**********************************LTP***********************************");
	//*[@id="Deri"]/table/tbody/tr/td/table/tbody/tr[3]/td[2]
	
	String afterXpathLTP="]/td[2]";
	
	for(int i=3;i<rowCount;i++) {
		String actualXpath=beforeXpath+i+afterXpathLTP;
		WebElement element= driver.findElement(By.xpath(actualXpath));
		log.info(element.getText());	
	}
	
	log.info("********************************Strike Price********************************");
	
	//*[@id="Deri"]/table/tbody/tr/td/table/tbody/tr[2]/td[3]
	
	String afterXpathStrikePrice="]/td[3]";
	
	for(int i=3;i<rowCount;i++) {
		String actualXpath=beforeXpath+i+afterXpathStrikePrice;
		WebElement element= driver.findElement(By.xpath(actualXpath));
		log.info(element.getText());	
	}
	
	log.info("********************************Best Bid Qty********************************");
	
	//*[@id="Deri"]/table/tbody/tr/td/table/tbody/tr[2]/td[4]
	
	String afterXpathBestBidQty="]/td[4]";
	
	for(int i=3;i<rowCount;i++) {
		String actualXpath=beforeXpath+i+afterXpathBestBidQty;
		WebElement element= driver.findElement(By.xpath(actualXpath));
		log.info(element.getText());	
	}
	
	log.info("********************************Best Bid Price********************************");
	
	//*[@id="Deri"]/table/tbody/tr/td/table/tbody/tr[2]/td[5]
	
	String afterXpathBestBidPrice="]/td[5]";
	
	for(int i=3;i<rowCount;i++) {
		String actualXpath=beforeXpath+i+afterXpathBestBidPrice;
		WebElement element= driver.findElement(By.xpath(actualXpath));
		log.info(element.getText());	
	}
	
	log.info("********************************Best Ask Price********************************");
	
	//*[@id="Deri"]/table/tbody/tr/td/table/tbody/tr[2]/td[6]
	
	String afterXpathBestAskPrice="]/td[6]";
	
	for(int i=3;i<rowCount;i++) {
		String actualXpath=beforeXpath+i+afterXpathBestAskPrice;
		WebElement element= driver.findElement(By.xpath(actualXpath));
		log.info(element.getText());	
	}
	
	log.info("********************************Best Ask Qty********************************");
	
	//*[@id="Deri"]/table/tbody/tr/td/table/tbody/tr[2]/td[7]
	
	String afterXpathBestAskQty="]/td[7]";
	
	for(int i=3;i<rowCount;i++) {
		String actualXpath=beforeXpath+i+afterXpathBestAskQty;
		WebElement element= driver.findElement(By.xpath(actualXpath));
		log.info(element.getText());	
	}
	
	log.info("********************************Spread********************************");
	
	//*[@id="Deri"]/table/tbody/tr/td/table/tbody/tr[2]/td[8]
	
	String afterXpathSpread="]/td[8]";
	
	for(int i=3;i<rowCount;i++) {
		String actualXpath=beforeXpath+i+afterXpathSpread;
		WebElement element= driver.findElement(By.xpath(actualXpath));
		log.info(element.getText());	
	}
	
	log.info("********************************Volume (Contracts)********************************");
	
	//*[@id="Deri"]/table/tbody/tr/td/table/tbody/tr[2]/td[9]
	
	String afterXpathVolumeContracts="]/td[9]";
	
	for(int i=3;i<rowCount;i++) {
		String actualXpath=beforeXpath+i+afterXpathVolumeContracts;
		WebElement element= driver.findElement(By.xpath(actualXpath));
		log.info(element.getText());	
	}
	
	log.info("********************************Traded Value (? Cr.)********************************");
	
	//*[@id="Deri"]/table/tbody/tr/td/table/tbody/tr[2]/td[10]
	
	String afterXpathTreadedValue="]/td[10]";
	
	for(int i=3;i<rowCount;i++) {
		String actualXpath=beforeXpath+i+afterXpathTreadedValue;
		WebElement element= driver.findElement(By.xpath(actualXpath));
		log.info(element.getText());	
	}
	
	log.info("********************************Mkt OI*********************************");
	
	//*[@id="Deri"]/table/tbody/tr/td/table/tbody/tr[2]/td[11]
	
	String afterXpathMktOI="]/td[11]";
	
	for(int i=3;i<rowCount;i++) {
		String actualXpath=beforeXpath+i+afterXpathMktOI;
		WebElement element= driver.findElement(By.xpath(actualXpath));
		log.info(element.getText());	
	}
	
	log.info("********************************No.of Trades********************************");
	
	//*[@id="Deri"]/table/tbody/tr/td/table/tbody/tr[2]/td[12]
	
	String afterXpathNoOfTraders="]/td[12]";
	
	for(int i=3;i<rowCount;i++) {
		String actualXpath=beforeXpath+i+afterXpathNoOfTraders;
		WebElement element= driver.findElement(By.xpath(actualXpath));
		log.info(element.getText());	
	}
}
  
  public void col() {
	  
	  log.info("****************************************************************");
		//columns
		//*[@id="Deri"]/table/tbody/tr/td/table/tbody/tr[2]/td[1]
		//*[@id="Deri"]/table/tbody/tr/td/table/tbody/tr[2]/td[2]

		String colBeforeXpath="//*[@id='Deri']/table/tbody/tr/td/table/tbody/tr[2]/td[";
		String colAfterXpath="]";
		List<WebElement> cols= driver.findElements(By.xpath("//*[@id='Deri']/table/tbody/tr/td/table/tbody/tr[2]/td"));	
		int colcount=cols.size();
		log.info("Total number of columns are : "+ colcount);
		//System.out.println("columns values are : ");
		for(int i=1;i<=colcount;i++) {
			WebElement element = driver.findElement(By.xpath(colBeforeXpath+i+colAfterXpath));
			String colText=element.getText();
			log.info(colText);
		}
  
  
  }
}
