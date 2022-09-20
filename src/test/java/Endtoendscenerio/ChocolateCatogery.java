package Endtoendscenerio;



import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;
import org.tyss.genericUtility.BaseClass;

import POM.Bigbaskethmepage;
import POM.Chocolateandcandies;
import POM.Loginsignuppage;
import POM.MainmenuShopbycategorry;
import POM.Welcomepage;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class ChocolateCatogery extends BaseClass{
	
	@Test
	public void chocolateCatogery() throws MalformedURLException {
		
		driver.launchApp();

		Welcomepage Welcomepagee=new Welcomepage(driver);
		Welcomepagee.welcomepagebtn();
		Bigbaskethmepage Bigbaskethmepageee=new Bigbaskethmepage(driver);
		Bigbaskethmepageee.threepbtn();
		
		Loginsignuppage Loginsignuppageee=new Loginsignuppage(driver);
		Loginsignuppageee.shopbycategory();
		
		MainmenuShopbycategorry MainmenuShopbycategorry=new MainmenuShopbycategorry(driver);
		MainmenuShopbycategorry.snacksandbrandfoodbtn();
		MainmenuShopbycategorry.chocolatesandcandies();
		
		Chocolateandcandies Chocolateandcandie=new Chocolateandcandies(driver);
		Chocolateandcandie.chocolatesimgbtn();
		
	//android.widget.TextView 
		List<WebElement> chocolate = driver.findElements(By.xpath("//android.widget.TextView[@resource-id='com.bigbasket.mobileapp:id/txtProductDesc']"));
	   // List<WebElement> chocolate = driver.findElements(By.xpath("//android.widget.TextView[@resource-id='com.bigbasket.mobileapp:id/txtProductDesc']"));
	    List<WebElement> price = driver.findElements(By.xpath("//android.widget.TextView[@text='com.bigbasket.mobileapp:id/txtSalePrice']"));
		for(int i=0;i<price.size();i++)
		{
			String[] chocolateprice = splitString(price.get(i).getText(),"₹");
			double newprice = Double.parseDouble(chocolateprice[1]);
			if(newprice>=100) {
				System.out.println(chocolate.get(i).getText()+" ===> "+newprice);
				//System.out.println(newprice);
			}
			  driver.swipe(517, 1582, 517, 844, 500);
		}
		
		
	}
	public String[] splitString(String value ,String strategy) {
		return value.split(strategy);
	}
	
//	public static void scrollToElement(AndroidDriver driver,String an,String av) {
//		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView("+an+"(\""+av+"\"))").click();
//	}

}
