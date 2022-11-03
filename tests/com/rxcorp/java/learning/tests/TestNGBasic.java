package com.rxcorp.java.learning.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGBasic {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.youtube.com/");
        driver.manage().window().maximize();
    }

    @Test
    public void verifyPageTitleTest(){
        String title = driver.getTitle();
        System.out.println("Page Title " + title);
        Assert.assertEquals(title,"Maven Repository");
    }


    @AfterMethod
    public void tearDown(){
        driver.close();
        driver.quit();
    }
}
