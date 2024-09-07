package testCases;

import java.time.Duration;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pageObjects.AccountRegistrationPage;
import pageObjects.HomePage;
import testBase.BaseClass;

public class TC01_AccountRegistrationTest extends BaseClass {

		@Test(groups={"Regression","Master"})
		 public void validations()
		{
			logger.info("**** Starting TC01_AccountRegistrationTest ****");//start
			try
			{
			HomePage hp=new HomePage(driver);
			
			hp.setAccount();
			logger.info("Click on Account link");
			
			hp.setRegister();
			logger.info("Click on Register link");
			
			AccountRegistrationPage page=new AccountRegistrationPage(driver);
			
			logger.info("Click on customer details.....");
			page.setfirstname(randomeString().toUpperCase());
			page.setlastname(randomeString().toLowerCase());
			page.setemail(randomeString()+"@gmail.com");
			page.setnumber(randomeNumber());
			
			String password=randomealphanumeric();
			page.setpassword(password);
			page.setconfirmpassworde(password);
			
			
			page.setagree();
			page.setcontinue();
			
			logger.info("Click validating expected message");
			
			String confrmsg=page.message();
			Assert.assertEquals(confrmsg, "Your Account Has Been Created!");
		}
		catch(Exception e)
		{
			logger.error("Test failed...");
			logger.debug("Debug test...");
			Assert.fail();
		}
		logger.info("**** Finish TC01_AccountRegistrationTest ****");

		

		}
}
