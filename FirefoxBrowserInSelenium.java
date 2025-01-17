package com.maisha.maliha.Web_Automation_Practice_Browserhandling;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FirefoxBrowserInSelenium {
	protected static String url = "https://www.daraz.com.bd/";
	WebDriver driver;

	@BeforeSuite
	public void startFirefoxBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new FirefoxDriver();
	}
	
	@Test
	public void openUrl() {
		driver.get(url);
	}
	
	@AfterSuite
	public void closeFirefoxBrowser() {
		driver.quit();
	}

}
