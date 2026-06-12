package kurma.base;

import java.time.Duration;
import  org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public WebDriver driver;
	public void amazonsetup()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/");
		
	}


    public void tearDown() { // teardown() This method is used to close the browser after test execution.

        if (driver != null) {
            driver.quit();
        }
    }
} 
/* Method tearDown() is called
It checks: “Is driver created?”
If yes → close the browser completely
If no → do nothing
 * 
 */
