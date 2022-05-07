package com.qa.util;

import java.io.FileInputStream;

import com.qa.base.TestBase;

public class Constant extends TestBase{

	public static String URL=prop.getProperty("url");
	public static String BROWSERNAME=prop.getProperty("browser");
	public static String USERNAME=prop.getProperty("username");
	public static String PASSWORD=prop.getProperty("password");
	public static String LOGINPGTITLE=prop.getProperty("loginpgtitle");
	
	public static String MOISTURIZERS_BAG=prop.getProperty("moisturizerstitle");
	                         
	public static String JUSTARRIVED=prop.getProperty("justArriveSort");
	public static String BESTSELLER=prop.getProperty("bestsellerSort");
	public static String GIFTSET=prop.getProperty("giftSetSort");
	
	public static String SIGNOUT=prop.getProperty("signouttxt");
	
	
	public static String DATEPICKERURL=prop.getProperty("datepickerUrl2");
	
	public static String SEL_MONTH=prop.getProperty("selectmonth");
	public static String SEL_YEAR=prop.getProperty("selectyear");
	public static String SEL_DATE=prop.getProperty("selectdate");
	
	public static String URL3=prop.getProperty("bseIndiaUrl3");
}
