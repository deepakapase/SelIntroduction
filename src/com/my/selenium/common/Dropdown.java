package com.my.selenium.common;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = WebDriverFactory.getDriver(DriverType.FIREFOX);
		driver.get("http://spicejet.com/");
		Select selectAdult = new Select(driver.findElement(
				By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListPassengerType_ADT")));
		selectAdult.selectByIndex(6);
		driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_OneWay")).click();
		driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchVieworiginStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='DEL']")).click();
		driver.findElement(By.xpath("(//a[@value='GOI'])[2]")).click();
		System.out.println(driver.findElement(By.xpath("//input[@id='ControlGroupSearchView_AvailabilitySearchInputSearchView_Defense']")).isSelected());
		driver.findElement(By.xpath("//input[@id='ControlGroupSearchView_AvailabilitySearchInputSearchView_Defense']")).click();
		System.out.println(driver.findElement(By.xpath("//input[@id='ControlGroupSearchView_AvailabilitySearchInputSearchView_Defense']")).isSelected());
		 
		
	
	}

}
