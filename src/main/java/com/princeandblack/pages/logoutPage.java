package com.princeandblack.pages;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebElement;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class logoutPage extends ProjectSpecificMethods {

	public logoutPage verifyLoginPage() {
		String logout = (locateElement(Locators.XPATH,
				"//div[@id='block-reo-page-title']/h1")).getText();
		assertEquals(logout, "nanda.kumar@reodigital.com");

		reportStep("Login Page verigy", "pass");
		return this;
	}

}
