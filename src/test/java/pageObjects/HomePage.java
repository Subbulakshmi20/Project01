package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
	
	
	public HomePage(WebDriver driver)
	{
		super(driver);
		
	}
	
	@FindBy (xpath="//span[normalize-space()='My Account']") WebElement txt_acc;
	@FindBy (xpath="//a[normalize-space()='Register']") WebElement txt_register;
	
	@FindBy(linkText="Login") WebElement txt_login; //login step 1
	
	
	public void setAccount()
	{
		txt_acc.click();
	}
	
	public void setRegister()
	{
		txt_register.click();
	}
	
	public void setLogin()//login step 2
	{
		txt_login.click();
	}
	

}
