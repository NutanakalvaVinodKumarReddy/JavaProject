import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.rxcorp.java.learning.Reusables.ExtentReportsClass;
import com.rxcorp.java.learning.Reusables.LoginFun;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

/*
https://www.toolsqa.com/testng/testng-dataproviders/
 */
public class TestNGWithExtentReportAndDataProvider {
    static WebDriver driver;
    static ExtentReports extent;
    static ExtentTest test;
    static LoginFun obj;
    static ExtentReportsClass clsObj;

    @BeforeSuite
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("http://a.testaddressbook.com/sign_in");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
        obj = new LoginFun();
        clsObj = new ExtentReportsClass();
        extent = clsObj.reportMethod(extent);
    }

    @DataProvider(name = "loginTest1")
    public Object[][] dpMethod() {
        return new Object[][]{{"abc@gmail.com", "abc"}, {"", "abc"}, {"abc@gmail.com", ""}, {"", ""}};

    }

    @Test(dataProvider = "loginTest")
    public void loginPageTestCases(String userName, String password) {
        test = clsObj.logInfo(test, extent, "info", "Invalid Login Test1", "InValid login test for free website", "Fetched Error message");
        String errText = obj.logincreds(driver, userName, password, "//div[contains(text(),'Bad email or password.')]");
        Assert.assertEquals(errText, "Bad email or password.");
        if (errText == "Bad email or password.") {
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
