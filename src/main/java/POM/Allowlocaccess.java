package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Allowlocaccess {

	@FindBy(id = "com.android.permissioncontroller:id/permission_allow_one_time_button")
	private WebElement allowacess;
	
/**
 * // this constructer --> class mame and constructer name should same method name should be diff
 * @param driver
 */
public Allowlocaccess(WebDriver driver) 
{
	PageFactory.initElements(driver,this);
	
	
}
/**
 * this method is used to loginto application
 * @param username
 * @param password
 * @throws InterruptedException 
 */
	public void allowacess() 
	{
		allowacess.click();
		

	}
}
