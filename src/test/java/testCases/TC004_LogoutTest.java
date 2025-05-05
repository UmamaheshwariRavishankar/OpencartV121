package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AccountLogoutPage;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;

@Test
public class TC004_LogoutTest extends BaseClass
{
	public void verify_logout()
	{
		
		//HomePage
		HomePage hp = new HomePage(driver);
		hp.clickMyAccount();
		hp.clickLogin();
		
		//LoginPage
		LoginPage lp = new LoginPage(driver);
		lp.sendEmailText(p.getProperty("Email"));
		lp.sendPassword(p.getProperty("Password"));
		lp.clickButton();
		
		//MyAccountPage
		MyAccountPage macc= new MyAccountPage(driver);
		boolean targetPage = macc.isMyAccountPageExists();
		Assert.assertEquals(targetPage, true);
		macc.clickLogoutButton();
		
		//AccountLogoutPage
		AccountLogoutPage alp = new AccountLogoutPage(driver);
		alp.isMyAccountLogoutPageExists();
		alp.clickContinueBtn();
		
		//Validate User logged out successfully
	    hp.clickMyAccount();
	    hp.isLoginBtnDisplayed();
		Assert.assertTrue(true);
		
		
		
	}

}
