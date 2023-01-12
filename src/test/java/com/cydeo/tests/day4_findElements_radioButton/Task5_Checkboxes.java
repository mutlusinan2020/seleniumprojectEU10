package com.cydeo.tests.day4_findElements_radioButton;

import com.cydeo.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class Task5_Checkboxes {

    public static void main(String[] args) {
        //Practice: Checkboxes
        //1. Go to http://practice.cydeo.com/checkboxes
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com/checkboxes");

        //We have to locate checkboxes

        WebElement checkbox1 = driver.findElement(By.xpath(""));
        WebElement checkbox2 = driver.findElement(By.xpath(""));


    }
}
