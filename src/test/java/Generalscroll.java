import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
 
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import POM.LoginGeneral;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Generalscroll {
	@Test
	
	public void generalscroll() throws MalformedURLException, InterruptedException {
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION,"11");
		dc.setCapability(MobileCapabilityType.UDID,"Y97DWCIBVOE68HS4");
		dc.setCapability("appPackage","com.androidsample.generalstore");
		dc.setCapability("appActivity",".SplashActivity");
		URL ur=new URL("http://localhost:4723/wd/hub");
		AndroidDriver driver=new AndroidDriver(ur,dc);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		LoginGeneral logoin=new LoginGeneral(driver);
		logoin.nametxtfieldtype();
		
		
		driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("gokul");
		driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
		driver.findElement(By.id("com.androidsample.generalstore:id/spinnerCountry")).click();
		scrolltilltoElement(driver,"text","India");
		
		
}
	//public static void scrolltilltoElement(AndroidDriver driver,String an,String av) 
	//{
	//	driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView("+an+"(\""+av+"\"))").click();;
	//}

	private void scrolltilltoElement(AndroidDriver driver, String string, String string2) {
		// TODO Auto-generated method stub
		
	}
}