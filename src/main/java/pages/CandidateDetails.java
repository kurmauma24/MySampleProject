package pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import utilities.ScreenshotUtils;

public class CandidateDetails {

	WebDriver driver;

	public CandidateDetails(WebDriver driver) {
		this.driver = driver;
	}

	public void clickAndCapture(By locator, String name) throws IOException {

		driver.findElement(locator).click();

		ScreenshotUtils.captureScreenshot(driver, name);
	}

	By candidateemail = By.id("ContentPlaceHolder1_input_0_0_0");
	By password = By.xpath("//input[@type='password']");
	By reenterpassword = By.xpath("//input[@id='ContentPlaceHolder1_extraPasswordinput_0_0_1']");
	By particulars = By.xpath("//div[contains(@class,'navButtonDiv') and contains(text(),'Particulars')]");
	By name = By.xpath("//input[@name='ctl00$ContentPlaceHolder1$input_1_0_0']");
	By employmentPassDropdown = By.id("ContentPlaceHolder1_input_1_0_2");
	By nricno = By.id("ContentPlaceHolder1_input_1_0_3");
	By address1 = By.id("ContentPlaceHolder1_input_1_0_6");
	By postalcode = By.id("ContentPlaceHolder1_input_1_0_11");
	By mobile = By.id("ContentPlaceHolder1_input_1_0_13");
	By gmail = By.id("ContentPlaceHolder1_input_1_0_14");
	By carrerinterest = By.id("navButton6");
	By expectedsalary = By.id("ContentPlaceHolder1_input_6_0_0");
	By noticeperiod = By.id("ContentPlaceHolder1_input_6_0_1");
	By importantquestions = By.id("navButton3");
	By employmenttype = By.id("ContentPlaceHolder1_input_3_0_0");
	By opportunity = By
			.xpath("//select[@name='ctl00$ContentPlaceHolder1$input_3_0_1' and contains(.,'Careers Future')]");
	By preferredRegion = By.xpath("//label[contains(text(),'Central Region')]");
	By Referredpcf = By.id("ContentPlaceHolder1_input_3_0_3");

	public void enterEmailId(String email) {
		driver.findElement(candidateemail).sendKeys(email);
	}

	public void enterPassword() {
		driver.findElement(password).sendKeys("12345678");
	}

	public void reEnterPassword() {
		driver.findElement(reenterpassword).sendKeys("12345678");
	}

	public void clickParticulars() {
		driver.findElement(particulars).click();
	}

	public void enterName() {
		driver.findElement(name).sendKeys("uma");
	}

	public void selectEmploymentPass() {
		WebElement dropdown = driver.findElement(employmentPassDropdown);
		Select select = new Select(dropdown);
		select.selectByVisibleText("Employment Pass P2");
	}

	public void enterNRIC() {
		driver.findElement(nricno).sendKeys("S8470987U");
	}

	public void enterAddress() {
		driver.findElement(address1).sendKeys("BTM 2nd Stage, Near Central Mall");
	}

	public void enterPostal() {
		driver.findElement(postalcode).sendKeys("876876");
	}

	public void enterMobile() {
		driver.findElement(mobile).sendKeys("942384728742");
	}

	public void enterGmail() {
		driver.findElement(gmail).sendKeys("hi23@gmail.com");
	}

	public void clickcarrerinterest() {
		driver.findElement(carrerinterest).click();
	}

	public void enterexpectedsalary() {
		driver.findElement(expectedsalary).click();
		driver.findElement(expectedsalary).sendKeys("200");
	}

	public void enternoticeperiod() {
		driver.findElement(noticeperiod).sendKeys("200");
	}

	public void enterImportantQuestions() {
		driver.findElement(importantquestions).click();
	}

	public void selectEmploymentType() {

		WebElement dp = driver.findElement(employmenttype);
		System.out.println("Tag Name = " + dp.getTagName());
		Select ss = new Select(dp);
		ss.selectByVisibleText("Contract Full Day");
	}

	public void selectOpportunity() {
		WebElement dp = driver.findElement(opportunity);
		Select ss1 = new Select(dp);
		ss1.selectByVisibleText("Careers Future");
	}

	public void selectPreferredRegion() {
		driver.findElement(preferredRegion).click();
	}

	public void selectReferredpcf() {
		WebElement dp = driver.findElement(Referredpcf);
		Select ss2 = new Select(dp);
		ss2.selectByVisibleText("No");
	}

}
