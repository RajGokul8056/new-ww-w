package Davemorris;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class installapp {
	@Test
	
	public void installapp() throws MalformedURLException
	{
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION,"11");
		dc.setCapability(MobileCapabilityType.UDID,"Y97DWCIBVOE68HS4");
		dc.setCapability("appPackage","com.androidsample.generalstore");
		dc.setCapability("appActivity",".SplashActivity");
		//dc.setCapability(MobileCapabilityType.APP,"‪‪C:\\Users\\rajgokul.r\\Downloads\\General-Store.apk");
		URL ur=new URL("http://localhost:4723/wd/hub");
		AndroidDriver driver=new AndroidDriver(ur,dc);
		driver.installApp("‪C:\\Users\\rajgokul.r\\Downloads\\General-Store.apk");
			//	driver.launchApp();
		//boolean value=driver.isAppInstalled("com.androidsample.generalstore");
		//System.out.println(value);
	}
}
