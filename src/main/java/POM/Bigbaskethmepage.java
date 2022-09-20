package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Bigbaskethmepage
{

	@FindBy(id = "com.bigbasket.mobileapp:id/iv_drawer")
	private WebElement threebtn;
	
/**
 * // this constructer --> class mame and constructer name should same method name should be diff
 * @param driver
 */
public Bigbaskethmepage(WebDriver driver) 
{
	PageFactory.initElements(driver,this);
	
	
}
/**
 * this method is used to loginto application
 * @param username
 * @param password
 * @throws InterruptedException 
 */
	public void threepbtn() 
	{
		threebtn.click();
		

	}

}
