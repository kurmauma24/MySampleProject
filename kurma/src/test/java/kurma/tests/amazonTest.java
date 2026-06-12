package kurma.tests;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import kurma.base.Amazon;
import kurma.pages.AmazonPage;
import kurma.utilities.ScreenshotUtil;


public class amazonTest extends Amazon{ //inheritance

	@BeforeClass
	public void start()
	{
		amazonsetup();	
	}
	
    @Test(priority = 1)
	public void productEnterField() throws IOException
	
	{
		AmazonPage searchingProduct = new AmazonPage(driver);
		searchingProduct.searchProduct("iphone");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
        ScreenshotUtil.captureScreenshot(driver);
	}
	
@Test(priority = 2)
	public void searchProduct() throws IOException
	{
		
		AmazonPage clickSearch = new AmazonPage(driver);
		clickSearch.clickSearchIcon();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		System.out.println("Second Commit");
        ScreenshotUtil.captureScreenshot(driver);
	}

@AfterClass
	
public void close() {
	
    tearDown();
} 
	
	
}
