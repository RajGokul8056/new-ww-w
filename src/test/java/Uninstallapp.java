import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Uninstallapp {
	@Test
	public void uninstallapp() throws MalformedURLException
	{
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME,"ANDROID");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION,"11");
		dc.setCapability(MobileCapabilityType.UDID,"emulator-5554");
		dc.setCapability("appPackage","io.appium.android.apis");
		dc.setCapability("appActivity",".ApiDemos");
		
		
		URL ur=new URL("http://localhost:4723/wd/hub");
		AndroidDriver driver=new AndroidDriver(ur,dc);
		
		driver.removeApp("io.appium.android.apis");
		boolean value=driver.isAppInstalled("io.appium.android.apis");
		System.out.println(value);
	}

}



