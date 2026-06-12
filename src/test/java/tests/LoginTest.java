package tests;

import java.io.IOException;

import org.testng.annotations.Test;
import base.BaseTest;
import pages.LoginPage;
import utilities.ScreenshotUtils;

import org.testng.Assert;
import pages.CarrerPortalLoginPage;
import pages.CandidateDetails;

public class LoginTest extends BaseTest {

	@Test
	public void verifyLogin() throws IOException {

		LoginPage lp = new LoginPage(driver);
		CarrerPortalLoginPage cp = new CarrerPortalLoginPage(driver);
		CandidateDetails cd = new CandidateDetails(driver);

		// First flow - Career Portal
		driver.get(cr.getProperty("carrerportalurl"));
		// cp.clickLogin();
//		cp.emailEnter();
//		cp.enterPassword();
		// cp.clickLoginButton();
		cp.enterJob();
		cp.clickSearchIcon();
		cp.clickJobTitle();
		cp.clickApply();
		cd.enterEmailId("test@gmail.com");
		ScreenshotUtils.captureScreenshot(driver, "Step01_EnterEmail");
		cd.enterPassword();
		ScreenshotUtils.captureScreenshot(driver, "Step02_EnterPassword");
		cd.reEnterPassword();
		ScreenshotUtils.captureScreenshot(driver, "Step03_Reenterpassword");
		cd.clickParticulars();
		cd.enterName();
		ScreenshotUtils.captureScreenshot(driver, "Step04_entername");
		cd.selectEmploymentPass();
		ScreenshotUtils.captureScreenshot(driver, "Step05_EmploymentPass");
		cd.enterNRIC();
		ScreenshotUtils.captureScreenshot(driver, "Step06_enterNRIC");
		cd.enterAddress();
		ScreenshotUtils.captureScreenshot(driver, "Step07_enterAddress");
		cd.enterPostal();
		ScreenshotUtils.captureScreenshot(driver, "Step08_enterPostal");
		cd.enterMobile();
		ScreenshotUtils.captureScreenshot(driver, "Step09_enterMobile");
		cd.enterGmail();
		ScreenshotUtils.captureScreenshot(driver, "Step10_enterGmail");
		cd.clickcarrerinterest();
		ScreenshotUtils.captureScreenshot(driver, "Step11_carrerinterest");
		cd.enterexpectedsalary();
		ScreenshotUtils.captureScreenshot(driver, "Step12_enterexpectedsalary");
		cd.enternoticeperiod();
		ScreenshotUtils.captureScreenshot(driver, "Step13_enternoticeperiod");
		cd.enterImportantQuestions();
		ScreenshotUtils.captureScreenshot(driver, "Step14_enterImportantQuestions");
		cd.selectEmploymentType();
		ScreenshotUtils.captureScreenshot(driver, "Step15_selectEmploymentType");
		cd.selectOpportunity();
		ScreenshotUtils.captureScreenshot(driver, "Step16_selectOpportunity");
		cd.selectPreferredRegion();
		ScreenshotUtils.captureScreenshot(driver, "Step17_selectPreferredRegion");
		cd.selectReferredpcf();
		ScreenshotUtils.captureScreenshot(driver, "Step18_selectPreferredRegion");

		/*
		 * cp.clickMenu(); cp.clickLogout();
		 */
		System.out.println("Current URL after logout: " + driver.getCurrentUrl());
		System.out.println("Career Portal Logout Successful");

		// Second flow - Test URL
		/*
		 * driver.navigate().to(cr.getProperty("testurl"));
		 * System.out.println("Current URL after navigation:" + driver.getCurrentUrl());
		 * lp.enterUsername("00000032"); lp.enterPassword("12345"); lp.clickLogin(); if
		 * (lp.isGoButtonDisplayed()) {
		 * 
		 * lp.clickGo(); System.out.println("Login Successful");
		 * System.out.println("Go button clicked successfully");
		 * Assert.assertTrue(driver.getCurrentUrl().contains("Dashboard")); } else {
		 * String errorMsg = lp.getLoginErrorMessage();
		 * System.out.println("Error Message: " + errorMsg);
		 * Assert.assertEquals(errorMsg, "Login Error. UserID or Password is invalid.");
		 * }
		 */

	}

}