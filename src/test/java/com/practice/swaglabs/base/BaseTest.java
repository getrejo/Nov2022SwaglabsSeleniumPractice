package com.practice.swaglabs.base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.practice.swaglabs.factory.DriverFactory;
import com.practice.swaglabs.pages.LoginPage;

public class BaseTest {
	
	DriverFactory df;
	WebDriver driver;
	protected LoginPage loginPage;
	
	@BeforeTest
	public void setup() {
		df= new DriverFactory();
		driver=df.initDriver("chrome");
		loginPage=new LoginPage(driver);
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
