package com.asserts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
public class assrtdemo {
    
    SoftAssert soft = new SoftAssert();
    WebDriver driver;
    @Test
    public void Launch() {
        System.setProperty("webdriver.gecko.driver", "./Resources/geckodriver");
        driver = new FirefoxDriver();
        try {
            Thread.sleep(3000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Test(dependsOnMethods = { "Launch" })
    public void Facebook() {
        driver.get("https://www.facebook.com");
        soft.assertEquals("FB Title", driver.getTitle());    
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
   /* @Test(dependsOnMethods = { "Facebook" })
    public void Login() {
        driver.findElement(By.id("email")).sendKeys("ravi10thstudent@gmail.com");
        driver.findElement(By.id("pass")).sendKeys()*/
        
        
        
        
        
        
        
        