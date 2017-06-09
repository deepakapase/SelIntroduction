package com.my.selenium.common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class WebDriverFactory {

	public static WebDriver getDriver(DriverType drivertype) {
		WebDriver driver = null;

		switch (drivertype) {
		case CHROME:
			// Chromedriver
			System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
			driver = new ChromeDriver();
			break;
		case FIREFOX:
			// Firefox driver
			System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
			driver = new FirefoxDriver();

			break;
		case IE:
			// IEdriver
			System.setProperty("webdriver.ie.driver", "drivers/IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			break;
		}

		return driver;
	}
}
