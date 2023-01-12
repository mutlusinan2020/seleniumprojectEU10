package com.cydeo.tests.day3_cssSelector_xpath;

import com.cydeo.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T4 {
    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("https://login1.nextbasecrm.com/");

        WebElement resetButton = driver.findElement(By.cssSelector("a[href='/?forgot_password=yes']"));
        String resetPasswordButton = resetButton.getText();

        System.out.println("resetPasswordButton = " + resetPasswordButton);
        String expectedResetButtonButton = "Reset Your Password";

        if (resetPasswordButton.equals(expectedResetButtonButton)){
            System.out.println("PASSED!!");
        }else {
            System.out.println("FAILED!!");
        }

        driver.close();


    }
}
