package com.cydeo.tests.day8_properties_config_reader;

import com.cydeo.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T1_PizzaTable {

    WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

        @Test
      public void tableOrder(){
            driver.get("http://practice.cybertekschool.com/web-tables");
            WebElement customerName =
                    driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//td[.='Bob Martin']"));
            System.out.println("customer Name= " + customerName.getText());



            WebElement customerOrderDate =
                    driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//td[.='Bob Martin']/following-sibling::td[3]"));
            System.out.println("customer Order Date= " + customerOrderDate.getText());

        }



    }

