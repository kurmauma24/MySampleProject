package kurma.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AmazonPage {
	
	WebDriver driver;
	

	public AmazonPage(WebDriver driver) {       // Constructor

	    this.driver = driver;
	}
	
	
	By enterField = By.id("twotabsearchtextbox");
	By searchIcon = By.id("nav-search-submit-button");
	
	public void searchProduct(String product) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

		WebElement enterFielddata = wait.until(ExpectedConditions.visibilityOfElementLocated(enterField)); 
		enterFielddata.sendKeys(product);
	}
	
	public void clickSearchIcon()
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		WebElement searchIconclick =  wait.until(ExpectedConditions.elementToBeClickable(searchIcon));
		searchIconclick.click();
	}
	
}
