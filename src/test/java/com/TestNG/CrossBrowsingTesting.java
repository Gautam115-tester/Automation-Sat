package com.TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowsingTesting {
WebDriver w;
	@Test
	@Parameters("browser")  // parameters "browser" will find value in  xml and name 
//	attribute value match with "browser" as a value then it will capture value attribute value 
//	and pass to the String parameter in the method.
	public void GoogleSearch(String browser) throws Exception {
		switch (browser) {
		case "firefox":
			w = new FirefoxDriver();
			break;
		case "chrome":
			w = new ChromeDriver();
			break;
		default:
			break;
		}
		w.get("https://www.google.com/");
		w.findElement(By.id("APjFqb")).sendKeys("Job");
		Thread.sleep(2000);
		w.quit();
	}
}
