package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Chocolateandcandies {
	@FindBy(xpath = "(//android.widget.ImageView[@content-desc=\"Product Image\"])[1]")
	private WebElement chocolateimg;
	
	
	
/**
 * // this constructer --> class mame and constructer name should same method name should be diff
 * @param driver
 */
public Chocolateandcandies(WebDriver driver) 
{
	PageFactory.initElements(driver,this);
	
	
}
/**
 * this method is used to loginto application
 * @param username
 * @param password
 * @throws InterruptedException 
 */
	
	
	public void chocolatesimgbtn() 
	{
		chocolateimg.click();	


	}
	
	



}
