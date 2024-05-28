package com.maisha.maliha.Web_Automation_Practice_Browserhandling;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class EdgeBrowserInSelenium {
	protected static String url = "https://www.daraz.com.bd/";
	WebDriver driver;

	@BeforeSuite
	public void startEdgeBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new EdgeDriver();
	}
	
	@Test
	public void openUrl() {
		driver.get(url);
	}
	
	@AfterSuite
	public void closeEdgeBrowser() {
		driver.quit();
	}

}
