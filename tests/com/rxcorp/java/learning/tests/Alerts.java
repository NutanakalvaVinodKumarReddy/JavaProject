package com.rxcorp.java.learning.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;


public class Alerts {
    WebDriver driver;

    @BeforeSuite
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.guru99.com/test/delete_customer.php");
    }

    @Test
    public void dropDownTest() {
        try {
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@name=\"cusid\"]")).sendKeys("1001");
            driver.findElement(By.xpath("//*[@name=\"submit\"]")).submit();
            //Alerts
            Alert alert = driver.switchTo().alert();
            System.out.println(alert.getText());
            alert.accept();
            alert.accept();
            Thread.sleep(5000);

        }
        catch (Exception e){

        }
    }

    @AfterSuite
    public void tearDown(){
        driver.quit();
    }
}
