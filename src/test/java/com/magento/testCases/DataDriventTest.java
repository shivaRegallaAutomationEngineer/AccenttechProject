package com.magento.testCases;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.magento.base.BaseClass;
import com.magento.pages.LoginPageElements;
import com.magento.utils.ExcelUtility;

public class DataDriventTest extends BaseClass {
	@Test(dataProvider="InvalidLoginData")
	public void invalidCredentails(String UserName,String Password,String ErrorMessage) {
		setUp();
		LoginPageElements loginPage=new LoginPageElements();
		loginPage.userName.sendKeys(UserName);
		loginPage.password.sendKeys(Password);
		loginPage.loginButton.click();
	    String actualErrorMessage=loginPage.errorMessage.getText();
	     Assert.assertEquals(ErrorMessage, actualErrorMessage,"error message is not matching");
		tearDown();
	}
	
	@DataProvider(name="InvalidLoginData")
	public Object[][] getData(){
		return ExcelUtility.excelIntoArray("C:\\Users\\Shiva Regalla\\OneDrive\\Desktop\\Book1.xlsx", "Sheet2");
	}
}
