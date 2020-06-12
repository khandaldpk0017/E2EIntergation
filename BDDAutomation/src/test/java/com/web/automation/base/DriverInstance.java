package com.web.automation.base;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.web.automation.utilities.PropertyReader;


public class DriverInstance {
	
	static WebDriver driver = null;
	
	public static void startDriverInstance() throws IOException
	{
		if (PropertyReader.applicationConfigReader("BrowserName").equalsIgnoreCase("chrome"))
		{
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		driver= new ChromeDriver();
		}
		else if(PropertyReader.applicationConfigReader("BrowserName").equalsIgnoreCase("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "./Driver/geckodriver.exe");
			driver= new FirefoxDriver();
		}
		else
		{
			System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
			driver= new ChromeDriver();
		}
		
		driver.get(PropertyReader.applicationConfigReader("ApplicationURL"));
		driver.manage().window().maximize();

	}
	
	public static WebDriver getDriverInstance() throws IOException
	{
		if (driver!=null)
		{
			return driver;
		}
		else
		{
			DriverInstance.startDriverInstance();
			return driver;
		}
	}
	public static void setDriverInstanceToNull()
	{
		driver=null;
	}
}
