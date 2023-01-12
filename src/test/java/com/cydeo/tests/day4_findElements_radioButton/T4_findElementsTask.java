package com.cydeo.tests.day4_findElements_radioButton;

import com.cydeo.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class T4_findElementsTask {

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //2- Go to: https://practice.cydeo.com/abtest
        driver.get("https://practice.cydeo.com/abtest");

        List<WebElement> allLinks = driver.findElements(By.tagName("a"));

        System.out.println(allLinks.size());    //HOW MANY LINKS ON THE PAGE??? ""size" method

        for (WebElement each : allLinks) {
            System.out.println(each.getText());
            System.out.println(each.getAttribute("href"));

        }
        System.out.println("allLinks = " + allLinks);

        driver.close();


    }
}
