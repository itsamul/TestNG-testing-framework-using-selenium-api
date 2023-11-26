package saucedemo.dataprovider;

import org.testng.annotations.DataProvider;

public class DataProvidersDemo {

	@DataProvider(name = "productName")
	public Object[][] getProductName() {
		return new Object[][] { { "Sauce Labs Backpack" } };
	}

	@DataProvider(name = "productDescription")
	public Object[][] getProductDescription() {
		return new Object[][] { { "Sauce Labs Backpack",
		"carry.allTheThings() with the sleek, streamlined Sly Pack that melds uncompromising "
		+ "style with unequaled laptop and tablet protection." } };
	}

	@DataProvider(name = "productPrice")
	public Object[][] getProductPrice() {
		return new Object[][] { { "Sauce Labs Backpack", "29.99" } };
	}

}