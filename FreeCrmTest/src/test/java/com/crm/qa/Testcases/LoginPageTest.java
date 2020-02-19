package com.crm.qa.Testcases;


import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.LoginPage;

public class LoginPageTest extends TestBase {
LoginPage loginPage;
	public LoginPageTest() {
		super();
	}
	
		
	@BeforeMethod
	public void setUp() {
		
		initialization();
		loginPage  = new LoginPage();	

	}
	
	@Test
	public void validateLoginPageTitle() {
	String title=loginPage.validateLoginPageTitle();
		Assert.assertEquals(title,"Cogmento CRM");
	}
	
	@Test
	public void login() {
		loginPage.login("studentuser2020@gmail.com", "nevergiveup2020");
	}
	
	
	/*@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	*/
	
}
