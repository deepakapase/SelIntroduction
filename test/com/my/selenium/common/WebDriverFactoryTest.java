package com.my.selenium.common;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WebDriverFactoryTest {
	@Test
	public void chromeDriverTest() {
		WebDriver driver = WebDriverFactory.getDriver(DriverType.CHROME);
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		Assert.assertEquals("Google", driver.getTitle());

	}

	@Test
	public void ieDriverTest() {
		WebDriver driver = WebDriverFactory.getDriver(DriverType.IE);
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		Assert.assertEquals("Google", driver.getTitle());
	}

	@Test
	public void fireFoxDriverTest() {
		WebDriver driver = WebDriverFactory.getDriver(DriverType.FIREFOX);
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		Assert.assertEquals("Google", driver.getTitle());
	}
}
