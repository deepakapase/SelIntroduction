package com.my.selenium.common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class WebDriverFactory {

	public static WebDriver getDriver(String driverName) throws Exception {
		WebDriver driver = null;
		if (driverName == null) {
			throw new Exception("Driver name missing");
		}

		switch (driverName) {
		case "ch":
			// Chromedriver
			System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("http://www.google.com");
			driver.manage().window().maximize();
			break;
		case "fd":
			// Firefox driver
			System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
			driver = new FirefoxDriver();
			driver.get("http://www.google.com");
			break;
		case "ie":
			// IEdriver
			System.setProperty("webdriver.ie.driver", "drivers/IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			driver.get("http://www.google.com");
			break;
		}

		return driver;
	}
}
