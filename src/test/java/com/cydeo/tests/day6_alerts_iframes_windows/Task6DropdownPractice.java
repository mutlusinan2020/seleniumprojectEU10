package com.cydeo.tests.day6_alerts_iframes_windows;

import com.cydeo.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Task6DropdownPractice {

    public WebDriver driver;

    @BeforeMethod
    public void setup(){
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com/dropdown");

    }

    @Test
    public void Task6(){
        Select dropdownsYear = new Select(driver.findElement(By.xpath("//select[@id='year']")));
        Select dropdownsMonth = new Select(driver.findElement(By.xpath("//select[@id='month']")));
        Select dropdownsDay = new Select(driver.findElement(By.xpath("//select[@id='day']")));



    }


}
