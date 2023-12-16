package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.PredefinedActions;

public class LoginPage extends PredefinedActions{
	
	WebDriver driver;
	
	public void login(String userName, String password) {
		enterUserName(userName);
		 enterPassword(password);
		 clickOnLogin();
	}
	
	public void enterUserName(String userName) {
		driver.findElement(By.id("txtUsername")).sendKeys(userName);
	}
	
	public void enterPassword(String password) {
		driver.findElement(By.id("txtPassword")).sendKeys(password);
	}
	
	public void clickOnLogin() {
		driver.findElement(By.xpath("//button")).click();
	}
	
	public boolean isUsernameErrorMsgDisplayed() {
		WebElement usernameErrorMsg = driver.findElement(By.cssSelector("#txtUsername-error"));		
		return usernameErrorMsg.isDisplayed();		
	}
	
	public boolean isPasswordErrorMsgDisplayed() {
		WebElement passwordErrorMsg = driver.findElement(By.cssSelector("#txtPassword-error"));		
		return passwordErrorMsg.isDisplayed();		
	}
	
	public boolean isLogoDisplayed() {
		return driver.findElement(By.cssSelector("div.organization-logo.shadow > img")).isDisplayed();		
	}
	
	public String getPageTitle() {
		return driver.getTitle();
	}
	
	
	
	



}
