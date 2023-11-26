package saucedemo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class ProductListPage {
	WebDriver driver;

	public ProductListPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[@class='title']")
	private WebElement label_page_header; 

	@FindBy(xpath = "//div[@class='footer_copy']")
	private WebElement label_footer_note; 

	public String getPageHeader() {
		Reporter.log("Page header displayed is " + label_page_header.getText());
		return label_page_header.getText();	// Products
	}

	public String getFooterNote() {
		Reporter.log("Footer note displayed is " + label_footer_note.getText());
		return label_footer_note.getText();	// © 2023 Sauce Labs. All Rights Reserved. Terms of Service | Privacy Policy
	}

	public ProductDetailsPage clickOnProduct(String productName) {
		Reporter.log("Clicked on the product " + productName);
		driver.findElement(By.xpath("//div[@class='inventory_item_name ' and text()='" + productName + "']")).click();
		return new ProductDetailsPage(driver);
	}
}
