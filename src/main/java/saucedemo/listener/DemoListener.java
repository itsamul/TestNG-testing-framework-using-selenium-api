package saucedemo.listener;

import java.io.File;

import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;
import saucedemo.base.BaseTest;

public class DemoListener implements ITestListener {
	
	public void onTestStart(ITestResult result) {
		Reporter.log("Execution of '" + result.getMethod().getMethodName() + "' has Started.");
	}
	
	public void onTestSuccess(ITestResult result) {
		Reporter.log("Execution of '" + result.getMethod().getMethodName() + "' has passed.");
	}
	
	public void onTestFailure(ITestResult result) {
		Reporter.log("Execution of '" + result.getMethod().getMethodName() + "' has failed.");
		String sreenshotName = null;
		try {
			TakesScreenshot screenshot = (TakesScreenshot)BaseTest.driver;
			File src = screenshot.getScreenshotAs(OutputType.FILE);
			sreenshotName = "Screenshot_" + result.getName() + System.currentTimeMillis() + ".png";
			File dest = new File("./Screenshots/" + sreenshotName);
			FileHandler.copy(src, dest);
		} catch (WebDriverException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		Reporter.log("Screenshot captured : " + sreenshotName);
	}

	public void onTestSkipped(ITestResult result) {
		Reporter.log("Execution of '" + result.getMethod().getMethodName() + "' has been skipped.");
	}

	public void onStart(ITestContext context) {}

	public void onFinish(ITestContext context) {}

}