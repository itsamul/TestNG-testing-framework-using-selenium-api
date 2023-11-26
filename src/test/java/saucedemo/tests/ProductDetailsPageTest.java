package saucedemo.tests;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import saucedemo.base.BaseTest;
import saucedemo.dataprovider.DataProvidersDemo;
import saucedemo.pages.LoginPage;
import saucedemo.pages.ProductDetailsPage;
import saucedemo.pages.ProductListPage;
public class ProductDetailsPageTest extends BaseTest {
	LoginPage loginPage;
	ProductListPage productListPage;
	ProductDetailsPage productDetailsPage;

	@Test(priority = 1, description="Test to verify product name on product details page", groups = {"Smoke", "Regression"}, dataProvider = "productName", dataProviderClass = DataProvidersDemo.class)
	public void testToVerifyProductNameOnProductDetailsPage(String productName) {
		loginPage = new LoginPage(driver);
		productListPage = loginPage.login("standard_user", "secret_sauce");
		productDetailsPage = productListPage.clickOnProduct(productName);
		Assert.assertEquals(productDetailsPage.getProductName(), productName);
	}
	
	@Test(priority = 2, description="Test to verify product description on product details page", groups = {"Regression"}, dataProvider = "productDescription", dataProviderClass = DataProvidersDemo.class)
	public void testToVerifyProductDescriptionOnProductDetailsPage(String productName, String productDescription) {
		loginPage = new LoginPage(driver);
		productListPage = loginPage.login("standard_user", "secret_sauce");
		productDetailsPage = productListPage.clickOnProduct(productName);
		Assert.assertEquals(productDetailsPage.getProductDescription(), productDescription);
	}
	
	@Test(priority = 3, description="Test to verify product price on product details page", groups = {"Regression"}, dataProvider = "productPrice", dataProviderClass = DataProvidersDemo.class)
	public void testToVerifyProductPriceOnProductDetailsPage(String productName, String productPrice) {
		loginPage = new LoginPage(driver);
		productListPage = loginPage.login("standard_user", "secret_sauce");
		productDetailsPage = productListPage.clickOnProduct(productName);
		Assert.assertEquals(productDetailsPage.getProductPrice(), productPrice);
	}
	
	@Test(priority = 4, description="Test to verify product list page is displayed when clicked on Back to products link on product details page", groups = {"Regression"})
	public void testToVerifyProductListPageIsDisplayedonClickingBackToProductsLink() {
		SoftAssert softAssert = new SoftAssert();
		loginPage = new LoginPage(driver);
		productListPage = loginPage.login("standard_user", "secret_sauce");
		softAssert.assertEquals(productListPage.getPageHeader(), "Products");
		productDetailsPage = productListPage.clickOnProduct("Sauce Labs Backpack");
		softAssert.assertEquals(productDetailsPage.getPageHeader(), "Back to products");
		productListPage = productDetailsPage.clickOnBackToProducts();
		softAssert.assertEquals(productListPage.getPageHeader(), "Products");
		softAssert.assertAll();
	}
}

//	This test is written to fail to test hard assert method

//	@Test(priority = 5, description="Test to verify product list page is displayed when clicked on Back to products link on product details page using hard assert", groups = {"Regression"})
//	public void testToVerifyProductListPageIsDisplayedonClickingBackToProductsLink_UsingHardAssert() {
//		loginPage = new LoginPage(driver);
//		productListPage = loginPage.login("standard_user", "secret_sauce");
//		Assert.assertEquals(productListPage.getPageHeader(), "Products.");
//		productDetailsPage = productListPage.clickOnProduct("Sauce Labs Backpack");
//		Assert.assertEquals(productDetailsPage.getPageHeader(), "Back to products.");
//		productListPage = productDetailsPage.clickOnBackToProducts();
//		Assert.assertEquals(productListPage.getPageHeader(), "Products");
//	}

//This test is written to fail to test soft assert method

//	@Test(priority = 6, description="Test to verify product list page is displayed when clicked on Back to products link on product details page using soft assert", groups = {"Regression"})
//	public void testToVerifyProductListPageIsDisplayedonClickingBackToProductsLink_UsingSoftAssert() {
//		SoftAssert softAssert = new SoftAssert();
//		loginPage = new LoginPage(driver);
//		productListPage = loginPage.login("standard_user", "secret_sauce");
//		softAssert.assertEquals(productListPage.getPageHeader(), "Products.");
//		productDetailsPage = productListPage.clickOnProduct("Sauce Labs Backpack");
//		softAssert.assertEquals(productDetailsPage.getPageHeader(), "Back to products.");
//		productListPage = productDetailsPage.clickOnBackToProducts();
//		softAssert.assertEquals(productListPage.getPageHeader(), "Products");
//		softAssert.assertAll();
//	}

//}
