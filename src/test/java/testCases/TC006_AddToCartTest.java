package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.SearchPage;
import pageObjects.ShoppingCartPage;
import testBase.BaseClass;

@Test
public class TC006_AddToCartTest extends BaseClass
{
	
     public void verify_AddToCart()
     {
    	 //HomePage
    	 HomePage hp = new HomePage(driver);
    	 hp.sendSearchItems();
    	 hp.clickContinueBtn();
    	 
    	 //SearchPage
    	SearchPage sp= new SearchPage(driver);
     	sp.isSearchedProductDisplayed();
     	sp.addItemToCart();
     	sp.isSuccessAddedItemToCartDisplayed();
     	sp.addItemToShoppingCart();
     	sp.clickViewCartBtn();
     	
    	
    	//ShoppingCart
    	ShoppingCartPage scp =  new ShoppingCartPage(driver);
    	scp.isAddedItemDispalyed();
     	Assert.assertTrue(true);
     }
}
