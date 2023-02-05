package com.cydeo.tests.day7_webTables_utilities_javafaker;

import com.cydeo.Utilities.WebDriverFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class T1WindowHandling {

    public WebDriver driver;

    @BeforeMethod
    public void setup() {

        driver = WebDriverFactory.getDriver("Chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }


    @Test

    public void window_handling_test() {

        driver.get("https://www.amazon.com");

        //3. Copy-paste the lines from below into your class
        ((JavascriptExecutor) driver).executeScript("window.open('https://google.com','_blank');");
        ((JavascriptExecutor) driver).executeScript("window.open('https://etsy.com','_blank');");
        ((JavascriptExecutor) driver).executeScript("window.open('https://facebook.com','_blank');");

        Set<String> AllWindowHandles = driver.getWindowHandles();
        for (String each : AllWindowHandles) {

            driver.switchTo().window(each);
            System.out.println("current URl:" + driver.getCurrentUrl());

            if (driver.getCurrentUrl().contains("etsy")) {
                break;
            }
        }


            String actualTitle = driver.getTitle();
            String expectedTitle = "Etsy";
            Assert.assertTrue(actualTitle.contains(expectedTitle));
            driver.quit();


    }
}






