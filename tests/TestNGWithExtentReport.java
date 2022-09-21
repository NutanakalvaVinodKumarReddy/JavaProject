import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestNGWithExtentReport {
    static WebDriver driver;
    static ExtentReports extent;
    static ExtentTest test;

    @BeforeSuite
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("http://a.testaddressbook.com/sign_in");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
        extentReports();
    }

    public void extentReports() {
        ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("C:\\D Drive\\Vinod\\JavaTesting\\JavaProject\\reports\\QA_Report.html");
        extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
    }

    @Test
    public void loginTest1() {
        test = extent.createTest("InValid Login Test1", "InValid login test for free website");
        driver.findElement(By.id("session_email")).sendKeys("abc@gmail.com");
        driver.findElement(By.id("session_password")).sendKeys("abc");
        driver.findElement(By.name("commit")).click();
        String errText = driver.findElement(By.xpath("//div[contains(text(),'Bad email or password.')]")).getText();
        test.log(Status.INFO, "Fetched Error message");
        Assert.assertEquals(errText, "Bad email or password.");
        if (errText == "Bad email or password.") {
            test.log(Status.PASS, "Expected error message thrown to user");
        } else {
            test.log(Status.FAIL, "Invalid Expected error message thrown to user");
            test.log(Status.INFO, "Actual: " + errText);
            test.log(Status.INFO, "Expected: Bad email or password...");
        }
    }

    @Test
    public void loginTest2() {
        test = extent.createTest("InValid Login Test2", "InValid login test for free website");
        driver.findElement(By.id("session_email")).sendKeys("");
        driver.findElement(By.id("session_password")).sendKeys("abc");
        driver.findElement(By.name("commit")).click();
        String errText = driver.findElement(By.xpath("//div[contains(text(),'Bad email or password.')]")).getText();
        test.log(Status.INFO, "Fetched Error message");
        Assert.assertEquals(errText, "Bad email or password...");
        if (errText == "Bad email or password...") {
            test.log(Status.PASS, "Expected error message thrown to user");
        } else {
            test.log(Status.FAIL, "Invalid Expected error message thrown to user");
            test.log(Status.INFO, "Actual: " + errText);
            test.log(Status.INFO, "Expected: Bad email or password...");
        }
    }

    @Test
    public void loginTest3() {
        test = extent.createTest("InValid Login Test3", "InValid login test for free website");
        driver.findElement(By.id("session_email")).sendKeys("abc@gmail.com");
        driver.findElement(By.id("session_password")).sendKeys("");
        driver.findElement(By.name("commit")).click();
        String errText = driver.findElement(By.xpath("//div[contains(text(),'Bad email or password.')]")).getText();
        test.log(Status.INFO, "Fetched Error message");
        Assert.assertEquals(errText, "Bad email or password...");
        if (errText == "Bad email or password.") {
            test.log(Status.PASS, "Expected error message thrown to user");
        } else {
            test.log(Status.FAIL, "Invalid Expected error message thrown to user");
            test.log(Status.INFO, "Actual: " + errText);
            test.log(Status.INFO, "Expected: Bad email or password...");
        }
    }

    @Test
    public void loginTest4() {
        test = extent.createTest("InValid Login Test4", "InValid login test for free website");
        driver.findElement(By.id("session_email")).sendKeys("");
        driver.findElement(By.id("session_password")).sendKeys("");
        driver.findElement(By.name("commit")).click();
        String errText = driver.findElement(By.xpath("//div[contains(text(),'Bad email or password.')]")).getText();
        test.log(Status.INFO, "Fetched Error message");
        Assert.assertEquals(errText, "Bad email or password.");
        if (errText == "Bad email or password...") {
            test.log(Status.PASS, "Expected error message thrown to user");
        } else {
            test.log(Status.FAIL, "Invalid Expected error message thrown to user");
            test.log(Status.INFO, "Actual: " + errText);
            test.log(Status.INFO, "Expected: Bad email or password...");
        }
    }

    @AfterSuite
    public void tearDown() {
        driver.close();
        driver.quit();
        extent.flush();
    }
}
