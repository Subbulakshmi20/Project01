package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;
import utilities.DataProviders;


	
	/*Data valid --login success --test pass -- logout
	 * Data valid--login failed -- test failed 
	 * 
	 * Data is invalid --login success --test fail --logout
	 * 
	 * Data is invalid -- login failed --test pass*/
	

//ddtest 4
public class TC03_LoginDDT extends BaseClass{
	@Test(dataProvider="LoginData",dataProviderClass=DataProviders.class,groups="Datadriven")//getting data from different class
	public void verify_loginDDT(String email,String pwd,String exp)
	{
	
		logger.info("*** Staring TC03_LoginDDT ****");
		
		try
		{
	HomePage hp=new HomePage(driver);
	hp.setAccount();
	hp.setLogin();
	
	//loginpage
	LoginPage lp=new LoginPage(driver);
	lp.setemail(email);
	lp.setpassword(pwd);
	lp.setlogin();
	
	//MyAccountPage
	MyAccountPage mcc=new MyAccountPage(driver);
	boolean targetpage=mcc.isMyAccountPageExists();
	
	/*Data valid --login success --test pass -- logout
	 * Data valid--login failed -- test failed 
	 * 
	 * Data is invalid --login success --test fail --logout
	 * 
	 * Data is invalid -- login failed --test pass*/
	
	if(exp.equalsIgnoreCase("valid"))
	{
		if(targetpage==true)
		{
			mcc.clickLogout();
			Assert.assertTrue(true);
			
		}
		else
		{
			Assert.assertTrue(false);
		}
	}
	if(exp.equalsIgnoreCase("invalid"))
	{
		if(targetpage==true)
		{
			mcc.clickLogout();
			Assert.assertTrue(true);
			
		}
		else
		{
			Assert.assertFalse(false);
    }
    }
		}catch(Exception e)
	{
		Assert.fail();
	}
	
	logger.info("*** Finish TC03_LoginDDT ****");
	}
}
