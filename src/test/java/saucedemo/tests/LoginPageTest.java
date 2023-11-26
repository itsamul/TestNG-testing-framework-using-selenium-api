package saucedemo.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import saucedemo.base.BaseTest;
import saucedemo.pages.LoginPage;
import saucedemo.pages.ProductListPage;

public class LoginPageTest extends BaseTest {
	LoginPage loginPage;
	ProductListPage productListPage;
	
	@Test (priority = 1, description="Test to login with valid credentials", groups = {"Smoke", "Regression"})
	public void testLoginWithValidCredentials() {
		loginPage = new LoginPage(driver);
		productListPage = loginPage.login("standard_user", "secret_sauce");
		Assert.assertEquals(productListPage.getPageHeader(), "Products");
	}

	@Test (priority = 2, description="Test to login with invalid credentials", groups = {"Smoke", "Regression"})
	public void testLoginWithInvalidCredentials() {
		loginPage = new LoginPage(driver);
		loginPage.login("standard_userx", "secret_saucex");
		Assert.assertEquals(loginPage.getErrorMessage(), "Epic sadface: Username and password do not match any user in this service");
	}
	
	@Test (priority = 3, description="Test to login with locked credentials", groups = {"Regression"})
	public void testLoginWithLockedCredentials() {
		loginPage = new LoginPage(driver);
		loginPage.login("locked_out_user", "secret_sauce");
		Assert.assertEquals(loginPage.getErrorMessage(), "Epic sadface: Sorry, this user has been locked out.");
	}
	
	@Test (priority = 4, description="Test to login with blank credentials", enabled = false, groups = {"Regression"})
	public void testLoginWithBlankCredentials() {
		loginPage = new LoginPage(driver);
		loginPage.login("", "");
		Assert.assertEquals(loginPage.getErrorMessage(), "Epic sadface: Username is required");
	}
}
