

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.WebElement;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;

public class MobileDriverUtility {
	AndroidDriver<WebElement> driver;
	AppiumDriverLocalService service;

	public void tabAction(int finger,WebElement element,int durationInMiliSec) {
		driver.tap(finger, element, durationInMiliSec);
	}
	public void tabAction(int finger,int x,int y,int durationInMiliSec) {
		driver.tap(finger,x,y, durationInMiliSec);
	}

	public void startServerWithDefaultPort() {
		service=AppiumDriverLocalService.buildDefaultService();
		service.start();
	}

	public void startServer(String port) {
		service=AppiumDriverLocalService.buildService(new AppiumServiceBuilder()
				.withArgument(GeneralServerFlag.SESSION_OVERRIDE)
				.usingPort(4723)
				.withLogFile(new File("./logs/logs.txt")));
		service.start();
	}

	public void stopServer() {
		service.stop();
	}

	public void hideKeyboard() {
		driver.hideKeyboard();
	}

	public void lanchApp() {
		driver.launchApp();
	}
	public void closeApp() {
		driver.closeApp();
	}
	public void installApp(String apkPath) {
		driver.installApp(apkPath);
	}
	public void uninstallApp(String appBundleId) {
		driver.removeApp(appBundleId);
	}
	public void senKeyEventToDevice(int key) {
		driver.pressKeyCode(key);
	}
	public void resetApp() {
		driver.resetApp();
	}
	public void dragAndDropAction(MobileElement src,MobileElement dest) {
		TouchAction action=new TouchAction(driver);
		action.longPress(src).waitAction().moveTo(dest).release().perform();
	}
	public String getToastMessage(String attributeName ) {
		return driver.findElement(By.xpath("//android.widget.Toast[1]")).getAttribute("attributeName");
	}
	public void runAppInBackground(int seconds) {
		driver.runAppInBackground(seconds);
	}
	public void zoomAction(WebElement img) {
		driver.zoom(img);
	}
	public void pinchAction(WebElement img) {
		driver.pinch(img);
	}
	public void swipeAction(int startX,int startY,int endX,int endY,int duration) {
		driver.swipe(startX,startY,endX,endY,duration);
	}
	public void scrollTillElement(String attributeName,String attributeValue) {
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView("+attributeName+"(\""+attributeValue+"\"))");
	}
	public void getOrientation(String startegy) {
		if(startegy.equalsIgnoreCase("landscape")){
			driver.rotate(ScreenOrientation.LANDSCAPE);
		}
		if(startegy.equalsIgnoreCase("potrait"))
			driver.rotate(ScreenOrientation.PORTRAIT);
	}
	public void openNotification() {
		driver.openNotifications();
	}
	public void switchApp(String appPackage,String appActivity) {
	driver.startActivity(appPackage,appActivity);
	}
	public void implicitlyWait(long longTime) {
		driver.manage().timeouts().implicitlyWait(longTime, TimeUnit.SECONDS);
	}
	
}
