package com.cydeo.tests.day3_cssSelector_xpath;

import com.cydeo.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T1_locators_getText {

    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
       // WebDriverManager.chromedriver().setup();
        //WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://login1.nextbasecrm.com");

        WebElement username = driver.findElement(By.className("login.inp"));
        username.sendKeys("incorrect");

        WebElement userPassword= driver.findElement(By.name("USER_PASSWORD"));
    }
}
