package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class YahooTitleVerification {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.yahoo.com.");

        String expectedTitle = "Yahoo | Mail, Weather, Search,, Politics, News, Finance, Sports & Videos";

        String actualTitle = driver.getTitle();

        if (expectedTitle.equals(actualTitle)){
            System.out.println("VERIFICATION PASSED");
        }else {
            System.out.println("VERIFICATION FAILED");
        }

        driver.quit();
    }
}
