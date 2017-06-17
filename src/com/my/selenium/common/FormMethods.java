package com.my.selenium.common;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FormMethods {

	public static void main(String[] args) {
		WebDriver driver=WebDriverFactory.getDriver(DriverType.FIREFOX);
		driver.get("https://www.makemytrip.com/");
		System.out.println(driver.findElement(By.xpath("//input[@id='hp-widget__return']")).isDisplayed());
		driver.findElement(By.xpath("//*[@id='js-switch__option']/div[3]/label")).click();
		System.out.println(driver.findElement(By.xpath("//input[@id='hp-widget__return']")).isDisplayed());
		driver.findElement(By.xpath("//*[@id='hp-widget__sfrom']")).click();
		List<WebElement> deptCityList=new ArrayList<>();
		deptCityList=driver.findElements(By.xpath("//*[@id='ui-id-3']/li"));
		System.out.println(deptCityList.size());
		for(WebElement deptCityName:deptCityList){
			System.out.println(deptCityName.getText()+"____________");
			if(deptCityName.toString().equalsIgnoreCase("Doha, Qatar DOH")){
				System.out.println(deptCityName.getText()+"________________________________");
				deptCityName.click();
			}
		}
	}

}
