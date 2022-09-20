package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Welcomepage {
	
	
	
	@FindBy(id = "com.bigbasket.mobileapp:id/text_welcome_message")
	private WebElement welcomebtn;
	
/**
 * // this constructer --> class mame and constructer name should same method name should be diff
 * @param driver
 */
public Welcomepage(WebDriver driver) 
{
	PageFactory.initElements(driver,this);
	
	
}
/**
 * this method is used to loginto application
 * @param username
 * @param password
 * @throws InterruptedException 
 */
	public void welcomepagebtn() 
	{
		welcomebtn.click();
		

	}
}
