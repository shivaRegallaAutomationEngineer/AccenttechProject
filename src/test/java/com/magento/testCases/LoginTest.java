package com.magento.testCases;


import org.testng.annotations.Test;

import com.magento.base.BaseClass;

import com.magento.pages.LoginPageElements;

public class LoginTest extends BaseClass {
	
	
	@Test
	public void validLogin() {
	
		LoginPageElements loginPage=new LoginPageElements();
		loginPage.userName.sendKeys("Admin");
		loginPage.password.sendKeys("admin123");
		loginPage.loginButton.click();
		//DashboardPageElements dashboardPage=new DashboardPageElements();
	//	Assert.assertTrue(dashboardPage.dashboard.isDisplayed(),"Login is not happened successfully");
		
	}
	
//	@Test
//	public void invalidUserName() {
//		setUp();
//		LoginPageElements loginPage=new LoginPageElements();
//		loginPage.userName.sendKeys("InvalidUsername");
//		loginPage.password.sendKeys("admin123");
//		loginPage.loginButton.click();
//	     String expectedErrorMessage="Invalid credentials";
//	     String actualErrorMessage=loginPage.errorMessage.getText();
//	     Assert.assertEquals(expectedErrorMessage, actualErrorMessage,"error message is not matching");
//		tearDown();
//	}
//	
//	@Test
//	public void invalidPassword() {
//		setUp();
//		LoginPageElements loginPage=new LoginPageElements();
//		loginPage.userName.sendKeys("Admin");
//		loginPage.password.sendKeys("invalidPassword");
//		loginPage.loginButton.click();
//	     String expectedErrorMessage="Invalid credentials";
//	     String actualErrorMessage=loginPage.errorMessage.getText();
//	     Assert.assertEquals(expectedErrorMessage, actualErrorMessage,"error message is not matching");
//		tearDown();
//	}
//
//	
//	@Test
//	public void invalidCerenditals() {
//		setUp();
//		LoginPageElements loginPage=new LoginPageElements();
//		loginPage.userName.sendKeys("InvalidUsername");
//		loginPage.password.sendKeys("invalidPassword");
//		loginPage.loginButton.click();
//	     String expectedErrorMessage="Invalid credentials";
//	     String actualErrorMessage=loginPage.errorMessage.getText();
//	     Assert.assertEquals(expectedErrorMessage, actualErrorMessage,"error message is not matching");
//		tearDown();
//	}
}
