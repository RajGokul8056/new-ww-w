package Practicedrivermethods;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Swipeaction {
@Test
	
	
	public void swipeaction() throws MalformedURLException {
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION,"11");
		dc.setCapability(MobileCapabilityType.UDID,"Y97DWCIBVOE68HS4");
		dc.setCapability("appPackage","com.bigbasket.mobileapp");
		dc.setCapability("appActivity",".activity.SplashActivity");
		
		URL ur=new URL("http://localhost:4723/wd/hub");
		AndroidDriver driver=new AndroidDriver(ur,dc);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.id("com.bigbasket.mobileapp:id/text_welcome_message")).click();
		driver.swipe(531, 2127, 509, 1809, 500);
		driver.findElement(By.xpath("(//android.widget.ImageView[@content-desc=\"Product Image\"])[8]")).click();
		driver.swipe(480, 2178, 498, 652, 500);
		driver.swipe(487, 2193, 513, 725, 500);
		driver.swipe(505, 2182, 406, 1018, 500);
		
		
		
		
		
	//	org.openqa.selenium.Dimension value = driver.manage().window().getSize();
	//	int height = value.getHeight();
		//int width = value.getWidth();
		//vertical
	//	driver.swipe(width/2, height, width/2, height, 500);
		//horizontal
//driver.swipe(width, height/2, width, height/2, 500);
//		
//		
//		//vertical swipe
//		driver.swipe(width/2,(int)(height*0.25), width/2, (int)(height*0.80), 1000);
//		driver.swipe((int)(width*0.1),(int)(height*0.2),(int)(width*0.1), (int)(height*0.8), 500);
//		driver.swipe((int)(width*0.5),(int)(height*0.2),(int)(width*0.5), (int)(height*0.8), 500);
//		driver.swipe((int)(width*0.9),(int)(height*0.2),(int)(width*0.9), (int)(height*0.8), 500);
//	
//		//horizontal swipe
//		driver.swipe((int)(width*0.25),height/2, (int)(width*0.80),height/2, 1000);
//		driver.swipe((int)(width*0.1),(int)(height*0.8),(int)(width*0.9), (int)(height*0.8), 500);
//		driver.swipe((int)(width*0.1),(int)(height*0.2),(int)(width*0.9), (int)(height*0.2), 500);
//		driver.swipe((int)(width*0.1),(int)(height*0.5),(int)(width*0.9), (int)(height*0.5), 500);

}}
