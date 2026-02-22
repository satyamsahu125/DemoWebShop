package com.tricenties;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import object.DashboardPage;
import object.LoginPage;
import utilities.BaseClass;
@Listeners(utilities.ListnerUtility.class)
public class LoginTest extends BaseClass {

	
	
	@Test(dataProvider = "testCaseData")
	public void loginSuccess(String email , String password) {
		
		DashboardPage dp = new DashboardPage(driver);
		dp.clickLoginLink();
		
		LoginPage lp = new LoginPage(driver);
		
		lp.loginUser(email, password);
		Assert.assertTrue(!driver.getTitle().contains("Login") , "Login Failed");
		
		logOut();
	}
	
	@Test(dataProvider = "testCaseData")
	public void loginWithInvalidCred(String email , String password) {

		DashboardPage dp = new DashboardPage(driver);
		dp.clickLoginLink();
		
		LoginPage lp = new LoginPage(driver);
		
		lp.loginUser(email, password);
		
		Assert.assertTrue(driver.getTitle().contains("Login") , "Login Successed");
		logOut();
	}

	

	
	
	
}
