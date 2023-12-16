package testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.PredefinedActions;
import pages.LoginPage;

public class LoginTest {
	
	@Test
	public void testCase1() {
		System.out.println("STEP: Launch chrome browser and hit url.");
		
		PredefinedActions.start("https://syadav-trials711.orangehrmlive.com/");
		
		System.out.println("STEP: Enter Login Credentials.");
		
		LoginPage loginPage  = new LoginPage();
		loginPage.login("admin", "PyVDa@41nT");
		
		System.out.println("VERIFY: Home Page is loaded");
		String expectedTitle = "Employee Management";
		String actualTitle = loginPage.getPageTitle();
		
		Assert.assertEquals(actualTitle, expectedTitle, "Expected title was '"+expectedTitle+"' but actual title was '"+actualTitle+"'");
		
		PredefinedActions.closeBrowser();
		
	}

}
