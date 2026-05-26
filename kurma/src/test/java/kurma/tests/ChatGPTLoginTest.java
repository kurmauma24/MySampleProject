package kurma.tests;

import java.io.IOException;
import kurma.base.BaseTest;
import kurma.pages.ChatGptLoginPage;
import kurma.utilities.ScreenshotUtil;

public class ChatGPTLoginTest extends BaseTest {

    public static void main(String[] args) throws IOException {

        ChatGPTLoginTest test = new ChatGPTLoginTest();

        test.setup(); 

        System.out.println(test.driver.getTitle());

        System.out.println(test.driver.getCurrentUrl());

        ChatGptLoginPage loginPage =
                new ChatGptLoginPage(test.driver);

        loginPage.clickLogin();

        loginPage.enterEmail("kurmauma24@gmail.com");

        loginPage.clickSubmit();

        ScreenshotUtil.captureScreenshot(
                test.driver);

        test.tearDown();
    }
}
