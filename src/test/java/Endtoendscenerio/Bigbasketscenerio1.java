package Endtoendscenerio;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertEquals;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.util.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.tyss.genericUtility.BaseClass;
import org.tyss.genericUtility.ExcelUtility;
import org.tyss.genericUtility.FileUtility;
import org.tyss.genericUtility.JavaUtility;
import org.tyss.genericUtility.MobileDriverUtility;

import POM.Allowlocaccess;
import POM.Bigbaskethmepage;
import POM.Choosedeliveryaddress;
import POM.Loginsignuppage;
import POM.Uselocationpage;
import POM.Welcomepage;


public class Bigbasketscenerio1 extends BaseClass{

	private WebDriver appiumDriver;
	private AssertJUnit soft;

	@Test
	public void bigbasketscenerio1() throws InterruptedException {
		//		FileUtility fileutiliti=new FileUtility();
		//		ExcelUtility excelutiliti=new ExcelUtility();
		//		MobileDriverUtility mobileDriverutiliti=new MobileDriverUtility();
		//		JavaUtility javautility=new JavaUtility();

		driver.launchApp();


		//pom
		Welcomepage Welcomepagee=new Welcomepage(driver);
		Welcomepagee.welcomepagebtn();
		Bigbaskethmepage Bigbaskethmepageee=new Bigbaskethmepage(driver);
		Bigbaskethmepageee.threepbtn();
		Loginsignuppage Loginsigee=new Loginsignuppage(driver);
		Loginsigee.addressedit();

		Choosedeliveryaddress  Choosedeliveryaddress=new Choosedeliveryaddress(driver);
		Choosedeliveryaddress.searchtxtfield();

		Allowlocaccess  Allowlocacce=new Allowlocaccess(driver);
		Allowlocacce.allowacess();
		//		

		Uselocationpage Uselocationpagee=new Uselocationpage(driver);
		Uselocationpagee.floatingbtn();

		String actual = driver.findElement(By.id("com.bigbasket.mobileapp:id/tvDeliveryAddress")).getText();
		System.out.println(actual);

		String expected = "Banashankari 3rd Stage, Banashankari, Bangalore";

		//need to import assert testng,and string actual ,expected
		org.testng.Assert.assertEquals(actual, expected);



		//if it is equal the next line should be printed if the comparision fails the next line will not print.
		//why beacuse it is hard assert if one line get fails the next line will not execute
		System.out.println("comparsion is validate the actual and exepected is same");
		



	}

}
