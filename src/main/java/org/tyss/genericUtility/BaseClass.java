package org.tyss.genericUtility;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;

public class BaseClass {
	AppiumDriverLocalService service;
	public AndroidDriver  driver;
	
	@BeforeSuite
	public void database() {
		System.out.println("open database");
	}
	
	@BeforeClass
	public void startserver() {
	   service=AppiumDriverLocalService.buildDefaultService();
		service.start();
	}
	
	@BeforeMethod
	public void openApp() throws MalformedURLException {
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION,"11");
		dc.setCapability(MobileCapabilityType.UDID, "Y97DWCIBVOE68HS4");
		//dc.setCapability("noReset", true);
		//dc for android
		dc.setCapability("appPackage","com.bigbasket.mobileapp");
		dc.setCapability("appActivity",".activity.SplashActivity");
		
		//appium server port number
		URL url=new URL("http://localhost:4723/wd/hub");
		driver=new AndroidDriver(url, dc);
		
	}
	
	@AfterMethod
	public void closeApp() {
		//driver.closeApp();
	}
	
	@AfterClass
	public void stopserver() {
	  
	//	service.stop();;
	}
	
	@AfterSuite
	public void closedatabase() {
		System.out.println("close database");
	}
}