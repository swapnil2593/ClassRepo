package com.acttime.proj.actitime;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserSelection
{
	public WebDriver driver;
	public WebDriver getDriver(String browserName)
	{
		if (browserName == "chrome")
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if (browserName == "firefox")
		{
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		else 
		{
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
		}
		
		return driver;
	}

}
