import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.util.List;

public class DropDown {
    WebDriver driver;

    @BeforeSuite
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.guru99.com/test/newtours/register.php");
    }

    @Test
    public void dropDownTest() {
        try {
            driver.findElement(By.name("firstName")).sendKeys("Vinod");
            Thread.sleep(1000);
            driver.findElement(By.name("lastName")).sendKeys("Reddy");
            Thread.sleep(1000);
            driver.findElement(By.name("phone")).sendKeys("9999999999");
            Thread.sleep(1000);
            driver.findElement(By.id("userName")).sendKeys("vinodkumar@gmail.com");
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@name=\"address1\"]")).sendKeys("1-6, Valasapalli");
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@name=\"city\"]")).sendKeys("Madanapalle");
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@name=\"state\"]")).sendKeys("AndhraPradesh");
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@name=\"postalCode\"]")).sendKeys("AndhraPradesh");

            //To Handle DropDown
            Select selectCntry = new Select(driver.findElement(By.name("country")));
            selectCntry.selectByValue("ALGERIA");
            Thread.sleep(1000);
            selectCntry.selectByValue("GABON");
            Thread.sleep(3000);

            List<WebElement> values = selectCntry.getOptions();
            int dropListSize = values.size();
            for(int i = 0; i<= dropListSize;i++){
                System.out.println(values.get(i).getText());
            }

        } catch (Exception e) {

        }
    }

    @AfterSuite
    public void tearDown(){
        driver.quit();
        driver.close();
    }
}
