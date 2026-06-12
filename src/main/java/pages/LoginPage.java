package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    // Locators
    By userId = By.xpath("//input[@name='txtUserID']");
    By txtPassword = By.xpath("//input[@name='txtPwd']");
    By btnLogin = By.xpath("//input[@type='submit']");
    By goButton = By.xpath("//input[@value='Go']");
    By loginerror = By.xpath("//span[@id='LabelError']");
   
    
    // Actions
    public void enterUsername(String username) {
        driver.findElement(userId).sendKeys(username);
    }

    public void enterPassword(String password) {
        driver.findElement(txtPassword).sendKeys(password);
    }

    public void clickLogin() {
        driver.findElement(btnLogin).click();
 
    }
    public void clickGo() {
        driver.findElement(goButton).click();
    }
    
    public String getLoginErrorMessage() {
        return driver.findElement(loginerror).getText();
    }
    
    public boolean isGoButtonDisplayed() {
        return driver.findElements(By.xpath("//input[@value='Go']")).size() > 0;
    }

	public void logout() {

		
	}
}