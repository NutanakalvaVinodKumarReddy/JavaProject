package com.rxcorp.java.learning.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class WebBrowserLanuch {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\D Drive\\Vinod\\JavaTesting\\JavaProject\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

    }

}
