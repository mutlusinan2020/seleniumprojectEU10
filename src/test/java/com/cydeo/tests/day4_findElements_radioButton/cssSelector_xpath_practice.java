package com.cydeo.tests.day4_findElements_radioButton;

import com.cydeo.Utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;

public class cssSelector_xpath_practice {

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("https://practice.cydeo.com/forgot_password");
       // WebElement homepage = driver.findElement(By.cssSelector("a[class='nav-link']");


    }
}
