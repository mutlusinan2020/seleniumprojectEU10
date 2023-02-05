package com.cydeo.practice;

import com.cydeo.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Practice_testNG {

    WebDriver driver;

    @BeforeMethod
    public void setupBrowser(){

        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


    }

    //TC #5: Selecting state from State dropdown and verifying result
    //1. Open Chrome browser
    //2. Go to http://practice.cybertekschool.com/dropdown
    //3. Select Illinois
    //4. Select Virginia
    //5. Select California
    //6. Verify final selected option is California.
    //Use all Select options. (visible text, value, index)

    @Test
    public void testNG() throws InterruptedException {

        driver.get("http://practice.cybertekschool.com/dropdown");
        Select stateDropdownMenu = new Select(driver.findElement(By.xpath("//select[@id='state']")));
        stateDropdownMenu.selectByVisibleText("Illinois");

        Thread.sleep(2000);

        stateDropdownMenu.selectByValue("VA");
        Thread.sleep(2000);

        stateDropdownMenu.selectByIndex(5);

        Thread.sleep(2000);

        String actualSelectedText = stateDropdownMenu.getFirstSelectedOption().getText();
        String expectedSelectedText = "California";

        Assert.assertEquals(actualSelectedText,expectedSelectedText);




    }
    
    @AfterMethod
    public void tearDown(){

        driver.quit();
    }
            
            
    
    
}
