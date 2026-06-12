package kurma.tests;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;

import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class chatgptlogin01 {

	public static void main(String[] args) throws IOException {


		       WebDriver driver = new ChromeDriver();
			// driver.get("https://rahulshettyacademy.com");
		        driver.get("https://chatgpt.com/");
		        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		        driver.manage().window().maximize();
				System.out.println(driver.getTitle());
				System.out.println(driver.getCurrentUrl());
				WebElement loginBtn = wait.until(
		                ExpectedConditions.elementToBeClickable(
		                        By.xpath("//button[.//span[normalize-space()='Log in']]")));			
		        loginBtn.click();
		        
		        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
		        WebElement email = wait1.until(
		            ExpectedConditions.visibilityOfElementLocated(By.id("email"))
		        );
		        email.sendKeys("kurmauma24@gmail.com");
		         System.out.println(email.getAttribute("value"));
		         driver.findElement(By.xpath("//button[@type='submit']")).click();
		        
                File folder = new File("screenshots");
                folder.mkdirs();
                File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		        File dest = new File("screenshots/login_page1.png");
		        FileUtils.copyFile(src, dest);
		        System.out.println("Screenshot saved successfully.");
				driver.quit();

	

		
		

	}

}
