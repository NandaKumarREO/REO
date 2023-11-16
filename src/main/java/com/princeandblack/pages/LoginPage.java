package com.princeandblack.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class LoginPage extends ProjectSpecificMethods {

	public LoginPage enterUsername(String uName) {
		// step1: locate the elemen
		
		WebElement eleUsername = locateElement(Locators.NAME, "name");

		// step2: interact with the weblement
		clearAndType(eleUsername, uName);

		reportStep(uName + " username is entered successfully", "pass");

		return this;
	}

	public LoginPage enterPassword(String passWord) {

		// step1: locate the element
		WebElement elePassword = locateElement(Locators.ID, "edit-pass");

		// step2: interact with the weblement
		clearAndType(elePassword, passWord);

		reportStep(passWord + " password is entered successfully", "pass");

		return this;

	}

	public LoginPage homePageLoginclick() {
		click(locateElement(Locators.XPATH,
				"//h2[@id='block-reo-account-menu-menu']/following-sibling::ul/li/a[contains(text(),'Log in')]"));
		reportStep("Login link click", "pass");
		return this;
	}
	
	public LoginPage clickLogin() {
		click(locateElement(Locators.ID,"edit-submit"));
		reportStep("Login link click", "pass");
		return this;
	}
}
