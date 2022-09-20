package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Uselocationpage {
	

	@FindBy(id = "com.bigbasket.mobileapp:id/floatingActionButtonActionLocation")
	private WebElement floatingbtn;
	@FindBy(id = "com.bigbasket.mobileapp:id/btnUseThisLocation")
	private WebElement UseThisLocationbtn;
	
/**
 * // this constructer --> class mame and constructer name should same method name should be diff
 * @param driver
 */
public Uselocationpage(WebDriver driver) 
{
	PageFactory.initElements(driver,this);
	
	
}
/**
 * this method is used to loginto application
 * @param username
 * @param password
 * @throws InterruptedException 
 */
	public void floatingbtn() 
	{
		floatingbtn.click();
		UseThisLocationbtn.click();
		

	}

}
