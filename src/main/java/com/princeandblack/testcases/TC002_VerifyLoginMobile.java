package com.princeandblack.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.framework.testng.api.base.ProjectSpecificMethodsMob;
import com.princeandblack.pages.MobilePage;


public class TC002_VerifyLoginMobile extends ProjectSpecificMethodsMob {
		
	@BeforeTest
	public void setValues() {
		testcaseName = "VerifyLoginMobile";
		testDescription = "Verify Login functionality with positive data_Mobile";
		authors = "Nanda";
		category = "Smoke";
		excelFileName = "Login_Mobile";
	}

	// @Test(dataProvider = "fetchData")
	@Test
	public void runLogin1() throws Exception {
		MobilePage mob = new MobilePage();
		mob.clickMenu();
	//	mob.LoginClick();
	//	mob.enterUsername();
	//	mob.enterPassword();
	}
}
