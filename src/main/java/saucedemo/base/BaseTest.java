package saucedemo.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import saucedemo.utils.ConfigReader;

public class BaseTest {
	public static WebDriver driver;

	@BeforeMethod(alwaysRun = true)
	@Parameters({ "browser" })
	public void setup(String browser) {
		String url = ConfigReader.getPropertyValue("url");
		if (browser.equalsIgnoreCase("Chrome")) {
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("Firefox")) {
			driver = new FirefoxDriver();
		} else if (browser.equalsIgnoreCase("Edge")) {
			driver = new EdgeDriver();
		}
		Reporter.log(browser +" browser launched.");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get(url);
		Reporter.log("Navigated to url "+ url);

	}

	@AfterMethod(alwaysRun = true)
	public void tearDown() {
		driver.quit();
	}
}
