package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;

@Test(groups = {"Sanity","Master"})
public class TC002_LoginTest extends BaseClass{
	
	public void verify_login() 
	{
	logger.info("**********Starting of Login Test **************");
		
	try 
	{
		//HomePage
	HomePage hp= new HomePage(driver);
	hp.clickMyAccount();
	hp.clickLogin();
	
	//LoginPage
	LoginPage lp= new LoginPage(driver);
	lp.sendEmailText(p.getProperty("Email"));
	lp.sendPassword(p.getProperty("Password"));
	lp.clickButton();
	
	//MyAccountPage
	MyAccountPage macc= new MyAccountPage(driver);
	boolean targetPage = macc.isMyAccountPageExists();
	Assert.assertEquals(targetPage, true);
	
	logger.info("**********End of Login Test**************");
		}
		catch(Exception E)
		{
			Assert.fail();
		}
	
	
	}
	

}
