package saucedemo.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import saucedemo.base.BaseTest;
import saucedemo.pages.LoginPage;
import saucedemo.pages.ProductDetailsPage;
import saucedemo.pages.ProductListPage;

public class ProductListPageTest extends BaseTest {
	LoginPage loginPage;
	ProductListPage productListPage;
	ProductDetailsPage productDetailsPage;
	
	@Test(priority = 1 , groups = {"Smoke", "Regression"})
	public void testToVerifyPageHeader() {
		loginPage = new LoginPage(driver);
		productListPage = loginPage.login("standard_user", "secret_sauce");
		Assert.assertEquals(productListPage.getPageHeader(), "Products");
	}
	
	@Test(priority = 2, groups = {"Regression"})
	public void testToVerifyFooterNote() {
		loginPage = new LoginPage(driver);
		productListPage = loginPage.login("standard_user", "secret_sauce");
		Assert.assertEquals(productListPage.getFooterNote(), "© 2023 Sauce Labs. All Rights Reserved. "
				+ "Terms of Service | Privacy Policy");
	}
	
	@Test(priority = 3 , groups = {"Regression"})
	public void testToVerifyProductDetailsPageIsDisplayed() {
		loginPage = new LoginPage(driver);
		productListPage = loginPage.login("standard_user", "secret_sauce");
		productDetailsPage = productListPage.clickOnProduct("Sauce Labs Backpack");
		Assert.assertEquals(productDetailsPage.getPageHeader(), "Back to products");
	}
}