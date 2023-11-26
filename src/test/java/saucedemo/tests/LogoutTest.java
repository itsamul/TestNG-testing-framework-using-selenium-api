package saucedemo.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import saucedemo.base.BaseTest;
import saucedemo.pages.ApplicationHeader;
import saucedemo.pages.LoginPage;
import saucedemo.pages.ProductDetailsPage;
import saucedemo.pages.ProductListPage;

public class LogoutTest extends BaseTest {
	LoginPage loginPage;
	ProductListPage productListPage;
	ProductDetailsPage productDetailsPage;
	ApplicationHeader applicationHeader;

	@Test(priority = 1, description="Test to logout from product list page", groups = {"Smoke", "Regression"})
	public void testToLogoutFromProductListPage() {
		loginPage = new LoginPage(driver);
		productListPage = loginPage.login("standard_user", "secret_sauce");
		applicationHeader = new ApplicationHeader(driver);
		loginPage = applicationHeader.logout();
		Assert.assertTrue(loginPage.isPageDisplayed());	
	}

	@Test(priority = 2, description="Test to logout from product details page", groups = {"Smoke", "Regression"})
	public void testToLogoutFromProductDetailsPage() {
		loginPage = new LoginPage(driver);
		productListPage = loginPage.login("standard_user", "secret_sauce");
		productDetailsPage = productListPage.clickOnProduct("Sauce Labs Backpack");
		applicationHeader = new ApplicationHeader(driver);
		loginPage = applicationHeader.logout();
		Assert.assertTrue(loginPage.isPageDisplayed());
	}

}
