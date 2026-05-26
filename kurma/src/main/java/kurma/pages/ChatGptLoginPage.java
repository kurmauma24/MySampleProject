package kurma.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ChatGptLoginPage {

	
	WebDriver driver;
	
	
	public ChatGptLoginPage(WebDriver driver) {

	    this.driver = driver;
	}
	

	By loginBtn = By.xpath("//button[.//span[normalize-space()='Log in']]");

	By emailField = By.id("email");

	By submitBtn = By.xpath("//button[@type='submit']");

//	By enterques = By.xpath("//*[@data-placeholder='Ask anything']");
	By enterques = By.id("prompt-textarea");
	
	//By sendData = By.xpath("//button[@id='composer-submit-button']");
	By sendData = By.id("composer-submit-button");
	
	public void clickLogin() {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

		WebElement login = wait.until(ExpectedConditions.elementToBeClickable(loginBtn));

		login.click();
	}

	public void enterEmail(String email) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

		WebElement emailBox = wait.until(ExpectedConditions.visibilityOfElementLocated(emailField));

		emailBox.sendKeys(email);

		System.out.println(emailBox.getAttribute("value"));
	}

	public void clickSubmit() {

		driver.findElement(submitBtn).click();
	}
	
	public void enterQuestion(String question) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	
		WebElement enterQues = wait.until(ExpectedConditions.visibilityOfElementLocated(enterques));
		
		enterQues.sendKeys(question);
		 System.out.println("Entered Question: " + question);		
		WebElement sendButton = wait.until(ExpectedConditions.visibilityOfElementLocated(sendData));
		sendButton.click();
	}

	
}