package com.Logger;

import java.time.Duration;

import org.apache.logging.log4j.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SauceDemo {

	public static void main(String[] args) {

		Logger log = LogManager.getLogger();
		
		WebDriver w = new ChromeDriver();
		w.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		log.info("Chrome browser has been launch");
		w.get("https://www.saucedemo.com/");
		log.info("user has open saucedemo site.");
		w.findElement(By.id("user-name")).sendKeys("locked_out_user");
		log.info("In username field 'locked_out_user' has been enter.");
		w.findElement(By.id("password")).sendKeys("secret_sauce");
		log.info("In password field 'secret_sauce' has been enter.");
		w.findElement(By.id("login-button")).click();
		log.info("user click on login button.");
		
		try {
			w.findElement(By.id("react-burger-menu-btn")).click();
			log.info("Click on menu button.");
			w.findElement(By.linkText("Logout")).click();
			log.info("click on logout button.");
		} catch (Exception e) {
			log.error("user unable to login.");
		}
		
		
		


	}

}
