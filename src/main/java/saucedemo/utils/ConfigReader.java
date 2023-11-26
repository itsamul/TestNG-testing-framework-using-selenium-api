package saucedemo.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.Reporter;

public class ConfigReader {

	public static String getPropertyValue(String key) {
		Properties property = new Properties();
		try {
			FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\resources\\properties\\config.properties");
			property.load(fis);
			Reporter.log("config.properties file loaded.");
		} catch (FileNotFoundException e) {
			Reporter.log("config.properties file not found.");
		} catch (IOException e) {
			Reporter.log("Unable to open config.properties file.");
		}

		Reporter.log("Value of the key " + key + " is " + property.getProperty(key));
		return property.getProperty(key);
	}
}
