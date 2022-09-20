package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginsignuppage {

	@FindBy(id = "com.bigbasket.mobileapp:id/txtCityName")
	private WebElement addressedit;
	@FindBy(xpath = "(//android.widget.ImageView[@content-desc=\"bigbasket Image\"])[1]")
	private WebElement shopbycategory;
	
/**
 * // this constructer --> class mame and constructer name should same method name should be diff
 * @param driver
 */
public Loginsignuppage(WebDriver driver) 
{
	PageFactory.initElements(driver,this);
	
	
}
/**
 * this method is used to loginto application
 * @param username
 * @param password
 * @throws InterruptedException 
 */
	public void addressedit() 
	{
		addressedit.click();	

	}
	
	public void shopbycategory() 
	{
		shopbycategory.click();	

	}

}
