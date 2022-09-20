package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Choosedeliveryaddress {

	@FindBy(id = "com.bigbasket.mobileapp:id/btnChooseLocation")
	private WebElement currentlocbtn;
	@FindBy(id = "com.bigbasket.mobileapp:id/txtLocationSearchMap")
	private WebElement SearchMaptxtfield;
	
/**
 * // this constructer --> class mame and constructer name should same method name should be diff
 * @param driver
 */
public Choosedeliveryaddress(WebDriver driver) 
{
	PageFactory.initElements(driver,this);
	
	
}
/**
 * this method is used to loginto application
 * @param username
 * @param password
 * @throws InterruptedException 
 */
	public void searchtxtfield() 
	{
		//SearchMaptxtfield.sendKeys("salem");
		currentlocbtn.click();
		
	}

}
