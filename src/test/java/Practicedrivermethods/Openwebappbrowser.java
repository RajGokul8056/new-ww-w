package Practicedrivermethods;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Openwebappbrowser {
	
@Test
	
	public void openwebappbrowser() throws MalformedURLException, InterruptedException {
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION,"11");
		dc.setCapability(MobileCapabilityType.UDID,"Y97DWCIBVOE68HS4");
		dc.setCapability(MobileCapabilityType.BROWSER_NAME,"Chrome");
		URL ur=new URL("http://localhost:4723/wd/hub");
		AndroidDriver driver=new AndroidDriver(ur,dc);
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys("gokul");
		driver.findElement(By.xpath("//input[@name=\"pass\"]")).sendKeys("gokul");
		

}
}
