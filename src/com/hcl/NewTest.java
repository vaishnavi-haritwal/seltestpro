package com.hcl;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.util.*;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
      
 
public class NewTest 
{        
    WebDriver driver;

    @Test (priority=1)
    public void openBrowser() {   
    	///Map<String, Object> prefs = new HashMap<String, Object>();

    	//prefs.put("intl.accept_languages", "zh-HK");
    	//ChromeOptions chromeOptions = new ChromeOptions();
    	//chromeOptions.setExperimentalOption("prefs", prefs);
        System.setProperty("webdriver.chrome.driver", "C:\\Chrome_driver\\chromedriver.exe"); 
        System.out.println("Hello Google...");

        System.out.println("Priority  - 1");
        System.out.println("Hello  ");
        // default mode
        driver = new ChromeDriver();
 
        // headless mode
        //ChromeOptions options = new ChromeOptions();
        //options.addArguments("--headless", "--disable-gpu", "--window-size=1920,1200","--ignore-certificate-errors");
        //driver = new ChromeDriver(options);

        driver.get("http://www.google.com");         
        //driver.manage().window().maximize();
    }        

    @Test (priority=2)        
    public void launchGoogle() {

        System.out.println("Priority - 2");

        driver.get("http://www.google.com");                        
    }        
 
    @Test (priority=3)        
    public void peformSeachAndClick1stLink() {
 
        System.out.println("Priority - 3");

        WebElement element = driver.findElement(By.xpath(".//*[@title='Search']"));
        element.sendKeys("Facebook");
        element.submit();

    }        
 
    // Method 4: Verify Google search page title.            
    @Test (priority=4)        
    public void FaceBookPageTitleVerification() throws Exception {
 
        System.out.println("Priority - 4");

        Assert.assertEquals(driver.getTitle().contains("Facebook - Google Search"), true);
        driver.close();
    }        
}
