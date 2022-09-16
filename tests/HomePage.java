import io.github.bonigarcia.wdm.WebDriverManager;
import io.netty.util.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.sql.Time;
import java.util.concurrent.TimeUnit;

public class HomePage {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        login("nuthanakalvavinodkumarreddy@gmail.com", "VINUvinu@123");
    }

    public void login(String userName, String password) {
        driver.findElement(By.id("email")).sendKeys(userName);
        driver.findElement(By.name("pass")).sendKeys(password);
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
        driver.findElement(By.name("login")).click();
    }

    @Test
    public void homePageTitleTest() {
        String homePageTitle = driver.getTitle();
        System.out.println(homePageTitle);
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
        Assert.assertEquals(homePageTitle, "Facebook");
    }

    @Test
    public void homePageProfileNameTest() {
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
        String profileName = driver.findElement(By.linkText("Vinodkumarreddy Reddy")).getText();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
        Assert.assertEquals(profileName, "Vinodkumarreddy Reddy");
    }

    @AfterMethod
    public void tearDown() {
        driver.close();
        driver.quit();
    }

}
