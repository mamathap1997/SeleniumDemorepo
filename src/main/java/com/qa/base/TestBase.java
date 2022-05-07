package com.qa.base;

//Importing required classes
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.util.Constant;
import com.qa.util.testUtil;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {

	public static WebDriver driver;
	public static Properties prop;
	
	/*Read property file and 
	 * perform testing on chrome or firefox browser */
	public TestBase(){
		try {
			prop=new Properties();
			FileInputStream ip=new FileInputStream("src\\main\\java\\com\\qa\\config\\config.properties");
			prop.load(ip);		
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
	}
	
	/*Launch chrome/firefox browser */
	public static void initialization() {
		String browsername=Constant.BROWSERNAME;
		if(browsername.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		else if(browsername.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		
		//maximize window size of browser
		driver.manage().window().maximize();
		
		//wait for a page to load
		//driver.manage().timeouts().pageLoadTimeout(testUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		
		//implicitly wait before executing the next line 
		driver.manage().timeouts().implicitlyWait(testUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		
		//URL of the login website that is tested
		//driver.get(Constant.URL);
		
		
	}
		
}
