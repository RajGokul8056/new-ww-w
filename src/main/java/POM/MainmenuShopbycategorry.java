package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainmenuShopbycategorry {
	
	@FindBy(xpath = "(//android.widget.ImageView[@content-desc=\"bigbasket Image\"])[5]")
	private WebElement snacksandbrandfoodbtn;
	@FindBy(xpath = "(//android.widget.TextView[@text='Chocolates & Candies'])")
	private WebElement chocolatesandcandies;
	
	
/**
 * // this constructer --> class mame and constructer name should same method name should be diff
 * @param driver
 */
public MainmenuShopbycategorry(WebDriver driver) 
{
	PageFactory.initElements(driver,this);
	
	
}
/**
 * this method is used to loginto application
 * @param username
 * @param password
 * @throws InterruptedException 
 */
	public void snacksandbrandfoodbtn() 
	{
		snacksandbrandfoodbtn.click();	
	}
	
	public void chocolatesandcandies() 
	{
		chocolatesandcandies.click();	


	}
	
	


}
