package com.LaunchBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class LaunchBrowser {
	 WebDriver driver;
	    @Test
	    public void LaunchBrowseer() {
	        System.setProperty("webdriver.gecko.driver", "./Resources/geckodriver");
	        driver = new FirefoxDriver();
	        driver.get("https://www.google.com");
	        try {
	            Thread.sleep(3000);
	        } catch (Exception e) {
	            e.printStackTrace();
	            
	        }
	    }
}