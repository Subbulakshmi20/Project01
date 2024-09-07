package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends BasePage {
	
	//login step 4
	public MyAccountPage(WebDriver driver)
	{
		super(driver);
	}

	
	@FindBy (xpath="//h2[text()='My Account']") WebElement txtheading;
	
	//ddlogin 2
	
	@FindBy (xpath="//div[@class='list-group']//a[text()='Logout']") WebElement txtlogout;
	
	
	public boolean  isMyAccountPageExists()
	{
		try
			{
				return(txtheading.isDisplayed());
			}
			catch(Exception e)
			{
				return false;
			}
		}
	
	 public void clickLogout()
	 {
		 txtlogout.click();
	 }
	}

