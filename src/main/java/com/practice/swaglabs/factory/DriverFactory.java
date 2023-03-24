package com.practice.swaglabs.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {
	
	public WebDriver driver;
	
	public WebDriver initDriver(String browserName) {
		System.out.println("Browser name is : " +browserName);
		if(browserName.trim().equalsIgnoreCase("chrome")) {
			ChromeOptions co = new  ChromeOptions();
			co.addArguments("--remote-allow-origins=*");
			driver = new ChromeDriver(co);	
		}
		else if(browserName.trim().equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		}
		else if(browserName.trim().equalsIgnoreCase("Edge")) {
				driver = new EdgeDriver();
		}
		else {
			System.out.println("Please Pass the Right Browser.." +browserName);
		}
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		return driver;
	}
	
	

}
