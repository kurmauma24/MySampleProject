package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import utilities.ConfigReader;

import java.time.Duration;


public class BaseTest {

    public WebDriver driver;
    public ConfigReader cr;

    @BeforeMethod    //@BeforeMethod should only open browser and read config. Inside the test case,
    public void setup() throws Exception {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); 
      
        cr = new ConfigReader();
        
    }
   
    @AfterMethod
    public void tearDown() {

        driver.quit();
    }
}