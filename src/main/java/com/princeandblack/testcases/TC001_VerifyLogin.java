package com.princeandblack.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.framework.testng.api.base.ProjectSpecificMethods;
import com.princeandblack.pages.HomePage;
import com.princeandblack.pages.LoginPage;
import com.princeandblack.pages.logoutPage;

public class TC001_VerifyLogin extends ProjectSpecificMethods {

	@BeforeTest
	public void setValues() {
		testcaseName = "VerifyLogin";
		testDescription = "Verify Login functionality with positive data";
		authors = "Nanda";
		category = "Smoke";
		excelFileName = "Login";
	}
	
	@Test(dataProvider = "fetchData" )
	public void runLogin(String username, String password) {
		HomePage home = new HomePage();
		LoginPage login = new LoginPage();
		logoutPage logout = new logoutPage();
		login.homePageLoginclick();
		login.enterUsername(username);
		login.enterPassword(password);
		login.clickLogin();
		logout.verifyLoginPage();
	}

}
