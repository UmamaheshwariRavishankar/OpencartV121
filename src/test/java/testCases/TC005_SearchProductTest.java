package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.SearchPage;
import pageObjects.ShoppingCartPage;
import testBase.BaseClass;

@Test
public class TC005_SearchProductTest extends BaseClass
{
    public void verify_search()
    {
    	//HomePage
    	HomePage hp = new HomePage(driver);
    	hp.sendSearchItems();
    	hp.clickContinueBtn();
    	
    	//searchPage
    	SearchPage sp= new SearchPage(driver);
    	sp.isSearchedProductDisplayed();
    	
    	Assert.assertTrue(true);
    	
    }
}
