package com.qa.util;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.base.TestBase;

public class testUtil extends TestBase{

	public static long IMPLICIT_WAIT=50;
	public static long PAGE_LOAD_TIMEOUT=40;
	
	public static WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(60));
	
	public static Actions action=new Actions(driver);
}
