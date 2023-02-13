package com.cydeo.tests.day7_webTables_utilities_javafaker;

import com.cydeo.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class WebTablePractice {

    public WebDriver driver;

    @Test
    public void WebTablesPractice(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/tables");
        WebElement table1 = driver.findElement(By.xpath("//table[@id='table1']"));
        System.out.println(table1.getText());

        driver.close();




    }

}
