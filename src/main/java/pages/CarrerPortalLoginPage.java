package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CarrerPortalLoginPage {

	WebDriver driver;

	public CarrerPortalLoginPage(WebDriver driver) {
		this.driver = driver;
	}

	By Login = By.id("loginShowButton");
	By email = By.id("UserName");
	By password = By.id("Password");
	By loginbutton = By.id("loginButton");
	By togglebutton = By.id("userAccountButton");
	By logout = By.id("toLogOut");
	By searchjob = By.id("ContentPlaceHolder1_searchBox");
	By searchicon = By.id("ContentPlaceHolder1_searchButton");
	By jobtitle = By.xpath("//div[@class='jobTitle']");
	By apply = By.xpath("//a[contains(@href,'ApplyJob.aspx') and contains(text(),'Apply')]");


	public void clickLogin() {
		driver.findElement(Login).click();
	}

	public void emailEnter() {
		 driver.findElement(email).sendKeys("Myra123@gmail.com");
	}
	
	public void enterPassword() {
		driver.findElement(password).sendKeys("Uma12345");
	}
	
	public void clickLoginButton() {
		driver.findElement(loginbutton).click();
	}
	
	public void clickMenu() {
		driver.findElement(togglebutton).click();
	}
	
	public void clickLogout() {
		 driver.findElement(logout).click();
	}
	
	public void enterJob() {
		driver.findElement(searchjob).sendKeys("Contract Assistant Teacher - Test");
	}
	
	public void clickSearchIcon() {
		driver.findElement(searchicon).click();
	}
	
	public void clickJobTitle() {
		driver.findElement(jobtitle).click();
	}
	
	public void clickApply() {
		driver.findElement(apply).click();
	}
	
	
	
}
