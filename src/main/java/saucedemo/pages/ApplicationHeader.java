package saucedemo.pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

public class ApplicationHeader {
	WebDriver driver;
	WebDriverWait wait;

	public ApplicationHeader(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "react-burger-menu-btn")
	private WebElement button_menu;

	@FindBy(id = "logout_sidebar_link")
	private WebElement button_logout;
	
	public LoginPage logout() {
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(button_menu)).click();
		Reporter.log("Clicked on the Menu button.");
		wait.until(ExpectedConditions.elementToBeClickable(button_logout)).click();
		Reporter.log("Clicked on the logout button.");
		return new LoginPage(driver);
	}
}
