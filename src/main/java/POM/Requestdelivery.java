package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Requestdelivery {
	



@FindBy(id = "com.bigbasket.mobileapp:id/btnRequestForDelivery")
private WebElement reqst;


/**
* // this constructer --> class mame and constructer name should same method name should be diff
* @param driver
*/
public Requestdelivery(WebDriver driver) 
{
PageFactory.initElements(driver,this);


}
/**
* this method is used to loginto application
* @param username
* @param password
* @throws InterruptedException 
*/
public void Requestdelivy() 
{
	reqst.click();
	
	
}

}
