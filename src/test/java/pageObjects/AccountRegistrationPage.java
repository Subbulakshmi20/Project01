package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegistrationPage extends BasePage {
	
	
	
	public AccountRegistrationPage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//input[@id='input-firstname']") WebElement txt_fname;
	@FindBy(xpath="//input[@id='input-lastname']") WebElement txt_lastname;
	@FindBy(xpath="//input[@id='input-email']") WebElement txt_email;
	@FindBy(xpath="//input[@id='input-telephone']") WebElement txt_number;
	@FindBy(xpath="//input[@id='input-password']") WebElement txt_password;
	@FindBy(xpath="//input[@id='input-confirm']") WebElement txt_confirmpassword;
	@FindBy(xpath="//input[@name='agree']") WebElement txt_agree;
	@FindBy(xpath="//input[@value='Continue']") WebElement txt_continue;
	@FindBy(xpath="//h1[normalize-space()='Your Account Has Been Created!']") WebElement txt_message;
	
	
	public void setfirstname(String firstname)
	{
		txt_fname.sendKeys(firstname);
	}
	
	public void setlastname(String lastname)
	{
		txt_lastname.sendKeys(lastname);
	}
	
	public void setemail(String email)
	{
		txt_email.sendKeys(email);
	}
	
	public void setnumber(String number )
	{
		txt_number.sendKeys(number);
	}
	
	public void setpassword(String password)
	{
		txt_password.sendKeys(password);
	}
	
	public void setconfirmpassworde(String confirmpassword)
	{
		txt_confirmpassword.sendKeys(confirmpassword);
	}
	
	public void setagree()
	{
		txt_agree.click();
	}
	
	public void setcontinue()
	{
		txt_continue.click();
		
	}
	
	public String message()
	{
		try 
		{
			return(txt_message.getText());
		}
		catch(Exception e)
		{
			return(e.getMessage());
		}
		
		
		
	}
	

}
