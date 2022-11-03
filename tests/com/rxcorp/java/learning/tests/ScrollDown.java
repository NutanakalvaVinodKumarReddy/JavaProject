package com.rxcorp.java.learning.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class ScrollDown {
    static WebDriver driver;

    static Logger logger = LogManager.getLogger(ScrollDown.class);
    @BeforeSuite
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        logger.info("Launching Webpage");
        driver.get("http://demo.guru99.com/test/guru99home/");
        driver.manage().window().maximize();

    }

    @Test
    public void testCase1(){
        try {
            Thread.sleep(1000);
            JavascriptExecutor js = (JavascriptExecutor) driver;
            logger.info("Scrolling down the page till end");

            //Scroll till end of the page
            js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
            Thread.sleep(10000);
        }
        catch (Exception e){

        }

    }

    @AfterSuite
    public void tearDown(){
        logger.info("Closing the Webdriver.");
        driver.close();
    }
}
