package com.princeandblack.pages;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class HomePage extends ProjectSpecificMethods {

	public HomePage verifyHomePage() {
		verifyDisplayed(locateElement(Locators.XPATH,
				"//h2[@id='block-reo-account-menu-menu']/following-sibling::ul/li/a[contains(text(),'Log in')]"));

		reportStep("Homepage is loaded", "pass");
		return this;
	}

}
