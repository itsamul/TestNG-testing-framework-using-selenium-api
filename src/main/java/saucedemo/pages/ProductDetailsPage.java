package saucedemo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class ProductDetailsPage {
	WebDriver driver;

	public ProductDetailsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "back-to-products")
	private WebElement label_page_header; // Back to products
	
	@FindBy(xpath="//div[@class='inventory_details_name large_size']")
	private WebElement label_product_name;
	
	@FindBy(xpath="//div[@class='inventory_details_desc large_size']")
	private WebElement label_product_desc;

	@FindBy(xpath="//div[@class='inventory_details_price']")
	private WebElement label_product_price;

	public String getPageHeader() {
		return label_page_header.getText();	// Back to products
	}

	public String getProductName() {
		Reporter.log("Product name displayed is " + label_product_name.getText());
		return label_product_name.getText();
	}
	
	public String getProductDescription() {
		Reporter.log("Product description displayed is " + label_product_desc.getText());
		return label_product_desc.getText();
	}
	
	public String getProductPrice() {
		Reporter.log("Product price displayed is " + label_product_price.getText().replace("$", ""));
		return label_product_price.getText().replace("$", "");
	}
	
	public ProductListPage clickOnBackToProducts() {
		Reporter.log("Clicked on the Back to product link.");
		label_page_header.click();
		return new ProductListPage(driver);
	}

}