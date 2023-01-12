package com.cydeo.tests.day3_cssSelector_xpath;

import com.cydeo.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T2_getText_getAttribute {
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("https://cydeo.com/");
        WebElement loginButton = driver.findElement(By.linkText("https://login.cydeo.com"));
        loginButton.click();
    }
}
