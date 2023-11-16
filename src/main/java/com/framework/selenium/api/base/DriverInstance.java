package com.framework.selenium.api.base;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverInstance  extends AbstractTestNGCucumberTests{
	private static final ThreadLocal<RemoteWebDriver> remoteWebdriver = new ThreadLocal<RemoteWebDriver>();
	private static final ThreadLocal<WebDriverWait> wait = new  ThreadLocal<WebDriverWait>();
	private WebDriver driver;
	
	public void setWait() {
		wait.set(new WebDriverWait(getDriver(), Duration.ofSeconds(10)));
	}

	public WebDriverWait getWait() {
		return wait.get();
	}

	public void setDriver(String browser, boolean headless) {		
		switch (browser) {
		case "chrome":
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--start-maximized"); 
			options.addArguments("--disable-notifications"); 
			options.addArguments("--incognito");
			remoteWebdriver.set(new ChromeDriver(options));
			break;
		case "firefox":
			remoteWebdriver.set(new FirefoxDriver());
			break;
		case "edge":
			remoteWebdriver.set(new EdgeDriver());
			break;	
		case "ie":
			remoteWebdriver.set(new InternetExplorerDriver());
		default:
			break;
		}
	}
	
	public void setDriverMob(String browser, boolean headless, String url) {		
		switch (browser) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			ChromeDriver cDriver = new ChromeDriver();
			Map<String, Object> mobileEmulation = new HashMap<>();
			mobileEmulation.put("width", 384);
			mobileEmulation.put("height", 702);
			mobileEmulation.put("devicescalefactor", 0);
			mobileEmulation.put("mobile", true);
		//	mobileEmulation.addArguments("--headless");
			cDriver.executeCdpCommand("Emulator.setdevicemetricsOvverride", mobileEmulation);
			cDriver.get(url);

	/*		
			System.setProperty("webdriver.chrome.driver", "Driver\\chromedriver.exe");
			Map<String, String> mobileEmulation = new HashMap<>();
			mobileEmulation.put("deviceName", "iPhone 13 Pro");
			ChromeOptions chromeOptions = new ChromeOptions();
			chromeOptions.setExperimentalOption("mobileEmulation", mobileEmulation);
			chromeOptions.addArguments("--headless");
			driver = new ChromeDriver(chromeOptions);
	*/
		//	WebDriver driver = new ChromeDriver(chromeOptions);
		//	remoteWebdriver.set(new ChromeDriver(chromeOptions));			
			
			break;
		case "firefox":
			remoteWebdriver.set(new FirefoxDriver());
			break;
		case "edge":
			remoteWebdriver.set(new EdgeDriver());
			break;	
		case "ie":
			remoteWebdriver.set(new InternetExplorerDriver());
		default:
			break;
		}
	}
	
	
	public RemoteWebDriver getDriver() {
		return remoteWebdriver.get();
	}
	
}
