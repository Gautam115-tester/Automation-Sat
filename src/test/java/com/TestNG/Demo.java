package com.TestNG;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
public class Demo {
/*= new ChromeDriver()*/ ;
	@Test (priority = 1 /*, invocationCount = 3 , enabled = false*/)
	public void GoogleSearch() throws Exception {
		WebDriver w =new ChromeDriver();
		w.get("https://www.google.com/");
		Thread.sleep(5000);
		w.quit();
	}
	@Test(priority = 2)
	public void Facebook() throws Exception {
		ChromeOptions option = new ChromeOptions().
setBinary("C:\\Users\\Lab-03-Demo\\AppData\\Local\\BraveSoftware\\Brave-Browser\\Application\\brave.exe");
		WebDriver w  =new ChromeDriver(option);
//		WebDriver w = new FirefoxDriver();
		w.get("https://www.facebook.com/");
		Thread.sleep(5000);
		w.quit();
	}
	
	
}
