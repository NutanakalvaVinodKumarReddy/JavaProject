package com.rxcorp.java.learning.Reusables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginFun {

    public String logincreds(WebDriver driver,String userName, String passwrod, String webelemnt) {
        driver.findElement(By.id("session_email")).sendKeys(userName);
        driver.findElement(By.id("session_password")).sendKeys(passwrod);
        driver.findElement(By.name("commit")).click();
        String msg = driver.findElement(By.xpath(webelemnt)).getText();
        return  msg;
    }

}
