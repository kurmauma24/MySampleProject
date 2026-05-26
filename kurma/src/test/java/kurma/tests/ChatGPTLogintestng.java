package kurma.tests;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import kurma.base.BaseTest;
import kurma.pages.ChatGptLoginPage;
import kurma.utilities.ScreenshotUtil;

public class ChatGPTLogintestng extends BaseTest {

	@BeforeClass

    public void start() {

        setup();
    }

    @Test(priority = 1)
    
    public void loginTest() throws IOException {

    	ChatGptLoginPage loginPage = new ChatGptLoginPage(driver);
        loginPage.clickLogin();
        loginPage.enterEmail("kurmauma24@gmail.com");
        loginPage.clickSubmit();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
        ScreenshotUtil.captureScreenshot(driver);
    }
    
   @Test(priority = 2)
    
    public void enterQuestionTextField() throws IOException
    {    
    	ChatGptLoginPage loginpage = new ChatGptLoginPage(driver);
    	loginpage.enterQuestion("What is quit");
    	 ScreenshotUtil.captureScreenshot(driver);
    	
    }
  /*  @AfterClass
    public void close() {
    	
        tearDown();
    } */
}
