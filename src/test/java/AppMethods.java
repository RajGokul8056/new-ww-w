import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class AppMethods 
{
	
	@Test
	
	public void appMethods() throws MalformedURLException {
		
		
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION,"11");
		dc.setCapability(MobileCapabilityType.UDID,"Y97DWCIBVOE68HS4");
		dc.setCapability("appPackage","com.androidsample.generalstore");
		dc.setCapability("appActivity",".SplashActivity");
		URL ur=new URL("http://localhost:4723/wd/hub");
		AndroidDriver driver=new AndroidDriver(ur,dc);
		
		//Activates the given app if it installed ,but not running or if it is running in thebackground
		//driver.activate("COM.androidsample .generalstore");
		
		//terminate the particular application if it is running 
		//driver.terminateapp("io.appium.android.apis");
		
		//queries the state of an application
		// not installed ,not running,running in the bsckground suspended
		//running in the background ,running in foreground
		//Application be=driver.queryAppstate("com.androidsample.general");
		//syso(be);
		
		//driver.installApp("apk path")
		
		
		
		//resets the currently running app together with the session
		driver.resetApp();
		driver.closeApp();
		driver.launchApp();
		
		//checks if an is installed on the device 
		boolean ban=driver.isAppInstalled("io.appium.android.apis");
		System.out.println(ban);
	}
	

}
