import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
/*
To Run test cases with Parameters we need to create a .xml file and we need to define the values for the parameters
 */

public class TestNGWithParameters {
    static WebDriver driver;

    @BeforeSuite
    public void setUp() {
        WebDriverManager.safaridriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.youtube.com/");
    }

    @Parameters("varaible1")
    @Test
    public void youTubeTitleTest(String titleName) {
        String title = driver.getTitle();
        Assert.assertEquals(titleName, title);
    }

    @Test
    @Parameters("varaible2")
    public void youTubeTitleTest1(String titleName) {
        String title = driver.getTitle();
        Assert.assertEquals(titleName, title);
    }

    @AfterSuite
    public void tearDown() {
        driver.close();
        driver.quit();
    }
}
