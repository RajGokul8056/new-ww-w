import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.remote.MobileCapabilityType;

public class KeyActions {

	@Test

	public void generalstorenavigate() throws MalformedURLException, InterruptedException {
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION,"11");
		dc.setCapability(MobileCapabilityType.UDID,"Y97DWCIBVOE68HS4");
		dc.setCapability("appPackage","com.androidsample.generalstore");
		dc.setCapability("appActivity",".SplashActivity");
		URL ur=new URL("http://localhost:4723/wd/hub");
		AndroidDriver driver=new AndroidDriver(ur,dc);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		System.out.println(AndroidKeyCode.KEYCODE_VOLUME_UP);
		Thread.sleep(200);
		System.out.println(AndroidKeyCode.KEYCODE_VOLUME_DOWN);
		Thread.sleep(200);
		System.out.println(AndroidKeyCode.BACK);
		Thread.sleep(200);
		System.out.println(AndroidKeyCode.ENTER);
		driver.pressKeyCode(AndroidKeyCode.KEYCODE_CAMERA);
		Thread.sleep(200);
		driver.pressKeyCode(AndroidKeyCode.BACK);
		Thread.sleep(200);
		driver.pressKeyCode(AndroidKeyCode.KEYCODE_VOLUME_UP);
		Thread.sleep(200);
		driver.pressKeyCode(AndroidKeyCode.KEYCODE_VOLUME_DOWN);
		Thread.sleep(200);
		driver.openNotifications();
		driver.pressKeyCode(AndroidKeyCode.KEYCODE_BRIGHTNESS_UP);
		Thread.sleep(200);
		driver.pressKeyCode(AndroidKeyCode.KEYCODE_BRIGHTNESS_DOWN);
		driver.pressKeyCode(AndroidKeyCode.BACK);
		Thread.sleep(200);
		driver.closeApp();

	}
}