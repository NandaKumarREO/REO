package com.princeandblack.pages;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;
import com.framework.testng.api.base.ProjectSpecificMethodsMob;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class MobilePage extends ProjectSpecificMethodsMob {
	
	
	public MobilePage clickMenu() throws InterruptedException {
		System.out.print("Before Test Mobile");
		Thread.sleep(5000);
		System.out.println("Before Test Mobile 1");
		
		try {
			//JavascriptExecutor executor = (JavascriptExecutor) driver;
		//	executor.executeScript("arguments[0].click()", 
				click(locateElement(Locators.XPATH,("//section[@class='position-relative bg-dark py-2 opacify-links text-white region region-top-bar']/div[1]/div/a[2]/span")));	
			System.out.println("After Test Mobile 3");
	     }catch (Exception e) {
			System.out.println(e);
		}
		
/*		JavascriptExecutor executor = (JavascriptExecutor) driver;
		clickUsingJs(locateElement(Locators.XPATH, "//section[@class='position-relative bg-dark py-2 opacify-links text-white region region-top-bar']/div[1]/div/a[2]"));
		executor.executeScript("arguments[0].click()", locateElement(Locators.XPATH, "//section[@class='position-relative bg-dark py-2 opacify-links text-white region region-top-bar']/div[1]/div/a[2]"));
/*       JavascriptExecutor executor = (JavascriptExecutor) driver;
        
        driver.get("https://www.princeandblack.com");
        executor.executeScript("arguments[0].click()", driver.findElement(By.cssSelector("section[role=\"navigation\"] .navigation-toggle")));
        System.out.print("Before Test Mobile 3");
*/
/*		click(locateElement(Locators.XPATH,
				"//section[@role='navigation']//a[@class='navigation-toggle me-auto cursor-pointer']"));
		reportStep("Home Page Menu link click", "pass");  
*/
/*		JavascriptExecutor executor = (JavascriptExecutor) driver;
		Thread.sleep(2000);
		executor.executeScript("arguments[0].click()", driver.findElement(By.xpath("//section[@role='navigation']//a[@class='navigation-toggle me-auto cursor-pointer']")));
	//	clickUsingJs(locateElement(Locators.XPATH, "//section[@role='navigation']//a[@class='navigation-toggle me-auto cursor-pointer']"));
		
	//	clickUsingJs(locateElement(Locators.XPATH, "//section[@class='position-relative bg-dark py-2 opacify-links text-white region region-top-bar']/div[1]/div/a[2]/span"));
	
	//	clickUsingJs(locateElement(Locators.CSS, ".navigation-toggle span"));
		Thread.sleep(2000);
/*		JavascriptExe("//section[@class='position-relative bg-dark py-2 opacify-links text-white region region-top-bar']/div[1]/div/a[2]");
		reportStep("Home Page Menu link click", "pass");
		JavascriptExe("//nav[@id='block-useraccountmenu']//ul/li/a");
		reportStep("Login button Click", "pass");
		*/
		return this;
	}
	
	public MobilePage LoginClick() {
		clickUsingJs(locateElement(Locators.XPATH, "//nav[@id='block-useraccountmenu']//ul/li/a[1]"));
		return this;
	}
	
	public MobilePage enterUsername() {
		// step1: locate the elemen
		
		WebElement eleUsername = locateElement(Locators.NAME, "name");
		eleUsername.sendKeys("nanda.kumar@reodigital.com");
		// step2: interact with the weblement
		//clearAndType(eleUsername, uName);

		reportStep(" username is entered successfully", "pass");

		return this;
	}

	public MobilePage enterPassword() {

		// step1: locate the element
		WebElement elePassword = locateElement(Locators.ID, "edit-pass");
		elePassword.sendKeys("Testing@123!");
		// step2: interact with the weblement
		//clearAndType(elePassword, passWord);

		reportStep(" password is entered successfully", "pass");

		return this;

	}
	
	
}
