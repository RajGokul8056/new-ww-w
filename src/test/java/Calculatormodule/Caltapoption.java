package Calculatormodule;

import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.SingleTapAction;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Caltapoption {
	AndroidDriver driver;
	@Test

	public void caltapoption() throws MalformedURLException {
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION,"11");
		dc.setCapability(MobileCapabilityType.UDID,"Y97DWCIBVOE68HS4");
		dc.setCapability("appPackage","com.miui.calculator");
		dc.setCapability("appActivity",".cal.CalculatorActivity");
		URL ur=new URL("http://localhost:4723/wd/hub");
		AndroidDriver driver=new AndroidDriver(ur,dc);
		WebElement five = driver.findElement(By.id("com.miui.calculator:id/btn_5_s"));
		driver.tap(1, five, 500);
		tapaction(1, five,500);

		WebElement button = driver.findElement(By.id("android:id/button1"));
		driver.tap(1, five,500);
		tapaction(1, button,500);
		WebElement plus = driver.findElement(By.id("com.miui.calculator:id/btn_plus_s"));
		driver.tap(1, plus, 500);
		tapaction(1, plus,500);

		WebElement two = driver.findElement(By.id("com.miui.calculator:id/btn_2_s"));
		driver.tap(1, two, 500);
		tapaction(1, two,500);

		WebElement equal = driver.findElement(By.id("com.miui.calculator:id/btn_equal_s"));
		driver.tap(1, equal, 500);
		tapaction(1, equal,500);

		driver.findElement(By.id("com.miui.calculator:id/expression"));
		driver.tap(1, equal, 500);
		tapaction(1, equal,500);
	}
	public void tapaction(int fingers,WebElement element ,int duration) {
		driver.tap(fingers, element, duration);
	}

	public void tapaction(int fingers,int x,int y ,int duration) {
		driver.tap(fingers, x, y, duration);
	}
}
