package GeneralStore;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Generalstorenavigate {
	
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
		driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("gokul");
		driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@text='ADD TO CART']")).click();
		//driver.findElement(By.xpath("//android.widget.TextView[@text='ADD TO CART']")).click();
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.TextView[2]")).click();
		driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();
		String Expectedprice = driver.findElement(By.id("com.androidsample.generalstore:id/totalAmountLbl")).getText();
		String ActualPrice="$ 280.97";
		System.out.println(Expectedprice);
		System.out.println(ActualPrice);
		SoftAssert soft = new SoftAssert();
		soft.assertEquals(ActualPrice, Expectedprice);
		soft.assertAll();
		driver.findElement(By.id("com.androidsample.generalstore:id/btnProceed")).click();

}
}