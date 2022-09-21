package com.rxcorp.java.learning.selenium;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExtentReportsClass {
    public static void main(String[] args) {
        ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("C:\\D Drive\\Vinod\\JavaTesting\\JavaProject\\reports\\QA_Report.html");
        // create ExtentReports and attach reporter(s)
        ExtentReports extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
        ExtentTest test = extent.createTest("MyFirstTest", "First Extent Report Test");
        // log(Status, details)
        test.log(Status.INFO, "This step shows usage of log(status, details)");
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.youtube.com/");
        test.log(Status.INFO,"YouTube WebPage launched");
        String title = driver.getTitle();
        test.pass("WebPage Title fetched");
        extent.flush();

    }

}
