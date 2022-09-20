import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;

public class Tostartserver {
	@Test
	
public  void tostartserver() throws MalformedURLException {
	
	AppiumDriverLocalService server=AppiumDriverLocalService.buildDefaultService();
	server.start();// to start the server 
	
	
	DesiredCapabilities dc=new DesiredCapabilities();
	//common dc (android or ios )
	dc.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
	dc.setCapability(MobileCapabilityType.PLATFORM_VERSION,"11");
	dc.setCapability(MobileCapabilityType.UDID,"Y97DWCIBVOE68HS4");
	
	dc.setCapability("noReset",true);// NORESET used to 
	
	//Dc for ANDROID
	dc.setCapability("appPackage","com.androidsample.generalstore");
	dc.setCapability("appActivity",".SplashActivity");
	
	//Appium server port number
	URL ur=new URL("http://localhost:4723/wd/hub");// to connect the server we are using url 
	AndroidDriver driver=new AndroidDriver(ur,dc);// giving dc to execute with server connection
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.close();
	Thread.sleep(200);
	server.close();
}
				
}
