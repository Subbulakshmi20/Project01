package testCases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;

public class TC02_LoginTest extends BaseClass {
	
	//login step 5
	@Test(groups={"Sanity","Master"})
	public void verify_login()
	{
		logger.info("**** staring TC02_LoginTest ****");
		
		try
		{
		//Homepage
		HomePage hp=new HomePage(driver);
		hp.setAccount();
		hp.setLogin();
		
		//loginpage
		LoginPage lp=new LoginPage(driver);
		lp.setemail(p.getProperty("email"));
		lp.setpassword(p.getProperty("password"));
		lp.setlogin();
		
		//MyAccountPage
		MyAccountPage mcc=new MyAccountPage(driver);
		boolean targetpage=mcc.isMyAccountPageExists();
		
		Assert.assertTrue(targetpage);
		}
		catch(Exception e)
		{
			Assert.fail();
		}
		logger.info("**** Finish TC02_LoginTest ****");
				
	}

}
