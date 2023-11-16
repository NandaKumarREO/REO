package com.framework.testng.api.base;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import com.beust.jcommander.Parameter;
import com.framework.selenium.api.base.SeleniumBase;
import com.framework.utils.DataLibrary;

public class ProjectSpecificMethodsMob extends SeleniumBase {
	//public WebDriver driver;

/*	@DataProvider(name = "fetchData", indices = 0)
	public Object[][] fetchData() throws IOException {
		return DataLibrary.readExcelData(excelFileName);
	}  
*/
	@Parameters("browser")
	@BeforeMethod
	public void preCondition(String browser) {
		startAppMob(browser, false, "https://www.princeandblack.com/");
		setNode();
	}
	
	@AfterMethod
	public void postCondition() {
		close();

	}

}
