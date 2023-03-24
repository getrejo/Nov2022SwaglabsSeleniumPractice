package com.practice.swaglabs.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	private WebDriver driver;
	
	private By userName = By.id("user-name");
	private By password = By.id("password");
	private By loginBtn = By.id("login-button");
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public String getLoginPageTitle() {
			String title=driver.getTitle();
			System.out.println("Login Page title: " + title);
			return title;
	}
	public String getLoginPageURL() {
		String url=driver.getCurrentUrl();
		System.out.println("Login Page url: " + url);
		return url;
	}
	public boolean isLoginButtonExist() {
		return driver.findElement(loginBtn).isDisplayed();
	}
	public void doLogin(String un, String pwd) {
		driver.findElement(userName).sendKeys(un);
		driver.findElement(password).sendKeys(pwd);
		driver.findElement(loginBtn).click();
	}
	
}
