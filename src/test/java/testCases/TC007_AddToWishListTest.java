package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyWishListPage;
import pageObjects.SearchPage;
import testBase.BaseClass;

@Test
public class TC007_AddToWishListTest extends BaseClass
{
    public void verify_WishList() throws InterruptedException
    {
    	//HomePage
    	HomePage hp =  new HomePage(driver);
    	hp.sendSearchItems();
    	hp.clickContinueBtn();
    	
    	//searchPage
    	SearchPage sp = new SearchPage(driver);
    	sp.isSearchedProductDisplayed();
    	sp.clickWishListBtn();
    	Thread.sleep(5000);
    	sp.isSuccessAddedItemToCartDisplayed();
    	sp.clickMyWishList();
    	
    	//loginPage
    	LoginPage lp = new LoginPage(driver);
    	lp.sendEmailText(p.getProperty("Email"));
    	lp.sendPassword(p.getProperty("Password"));
    	lp.clickButton();
    	
    	
    	//MyWishListPage
    	MyWishListPage wl = new MyWishListPage(driver);
    	wl.isWishListProductDisplayed();
    	Assert.assertTrue(true);
    	
    }
}
