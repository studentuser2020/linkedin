package com.crm.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase {

	
	@FindBy(xpath="//input[@type='text'][@name='email']")
	WebElement userid;
	
	@FindBy(xpath="//input[@type='password'][@name='password']")
	WebElement password;
	
	@FindBy(xpath="//div[text()='Login']")
	WebElement LoginButton;
	
	@FindBy(xpath="//a[text()='Forgot your password?']")
	WebElement forgotpasswordlink;
	
	public void login()
	{
		
		PageFactory.initElements(driver, this);
		
	}
	
	//Actions
	public String validateLoginPageTitle() {
		return driver.getTitle();
	}
	
	public boolean checkForgotPassword() {
		return forgotpasswordlink.isDisplayed();
	}
	
	public HomePage login(String uid, String pwd) {
		userid.sendKeys(uid);
		password.sendKeys(pwd);
		LoginButton.click();
		return new HomePage();
	}
	
	
	
}
