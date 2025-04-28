package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AccountRegistrationPage;
import pageObjects.HomePage;
import testBase.BaseClass;

public class TC001_AccountRegistrationTest extends BaseClass {
	
	
	@Test(groups = {"Regression","Master"})
    public void verify_account_registration()  
    {
		logger.info("**********Starting of AccountRegistration Test Case**************");
		try
		{
		HomePage hp = new HomePage(driver);
		hp.clickMyAccount();
		logger.info("Clicked on My Account");
		hp.clickRegister();
		logger.info("Clicked on Register");
		
		AccountRegistrationPage regpage = new AccountRegistrationPage(driver);
		
		logger.info("Providing customer details...");
		regpage.setUserFirstName(randomeString().toUpperCase());
		regpage.setUserLastName(randomeString().toUpperCase());
		regpage.setEmail(randomeString() +"@gmail.com");
		regpage.setTelephone(randomeNumber());
		
		String pwd = randomeAlphaNumber();
		
		regpage.setPassword(pwd);
		regpage.setConfirmPassword(pwd);
		regpage.chkPrivacyPolicy();
		regpage.clickButton();
		
		String msg = regpage.getConfirmMessage();
		Assert.assertEquals(msg, "Your Account Has Been Created!");
		logger.info("**********Finished AccountRegistration Test Case**************");
		
		}
		catch(Exception e)
		{
			logger.error("Test Failed");
			Assert.fail();
		}
		
		
    }
	
	
	
}
