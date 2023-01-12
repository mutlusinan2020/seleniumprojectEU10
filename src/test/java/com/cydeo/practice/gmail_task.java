package com.cydeo.practice;

import com.cydeo.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class gmail_task {
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://mail.com.tr/auth/message/type/new/user/3QogHh4VKhYep4dTL7ljughwh8bbeueh35_rMzK02magzVHYK2i-Yw,,/");

        //WebElement userNameLogin = driver.findElement(By.xpath("//*[@id='imapuser']"));
        //userNameLogin.sendKeys("mutluenglish.com.tr");
        WebElement passwordLogin = driver.findElement(By.xpath("//*[@id='pass']"));
        passwordLogin.sendKeys("19852012" + Keys.ENTER);

        WebElement sendmail = driver.findElement(By.xpath("//*[@id='composebtn']"));
        sendmail.click();



    }
}
