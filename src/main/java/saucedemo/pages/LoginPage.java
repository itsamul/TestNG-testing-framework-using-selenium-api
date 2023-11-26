package saucedemo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class LoginPage {
	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "user-name")
	private WebElement input_username;

	@FindBy(id = "password")
	private WebElement input_password;

	@FindBy(id = "login-button")
	private WebElement button_login;

	@FindBy(xpath = "//h3")
	private WebElement label_error;

	public ProductListPage login(String username, String password) {
		input_username.clear();
		Reporter.log("Username field cleared");
		input_username.sendKeys(username);
		Reporter.log(username + " entered in the username field");
		input_password.clear();
		Reporter.log("Username field cleared");
		input_password.sendKeys(password);
		Reporter.log(password + " entered in the password field");
		button_login.click();
		Reporter.log("Clicked on the login button.");
		return new ProductListPage(driver);
	}
	
	public String getErrorMessage() {
		Reporter.log("Error message displayed is " + label_error.getText());
		return label_error.getText();
	}
	
	public boolean isPageDisplayed() {
		try {
			Reporter.log("Login page displayed.");
			return button_login.isDisplayed();
		} catch (Exception e) {
			Reporter.log("Exeception occured while displaying Login page. Exception occured :"+ e);
			return false;
		}
	}
}