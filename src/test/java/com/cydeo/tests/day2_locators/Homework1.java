package com.cydeo.tests.day2_locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework1 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();


        driver.get("https://www.etsy.com");
        WebElement etsySearchBar = driver.findElement(By.name("search_query"));
        etsySearchBar.sendKeys("wooden spoon" + Keys.ENTER);

        String ActualTitle = driver.getTitle();
        String ExpectedTitle= "Wooden spoon - Etsy";

        if (ActualTitle.equals(ExpectedTitle)){
            System.out.println("PASSED!!");
        }else {
            System.out.println("FAILED!!");
        }

        driver.close();
    }
}
