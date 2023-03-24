package com.practice.swaglabs.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.practice.swaglabs.base.BaseTest;

public class LoginPageTest extends BaseTest{
	
	@Test
	public void loginPageTitleTest() {
		String actualTitle=loginPage.getLoginPageTitle();
		Assert.assertEquals(actualTitle, "Swag Labs");
	}
	@Test
	public void loginPageURLTest() {
		String actualURL=loginPage.getLoginPageURL();
		Assert.assertTrue(actualURL.contains("saucedemo.com"));
	}
	@Test
	public void loginBtnExistTest() {
		Assert.assertTrue(loginPage.isLoginButtonExist());
	}
	@Test
	public void loginTest() {
		loginPage.doLogin("standard_user", "secret_sauce");
	}

}
