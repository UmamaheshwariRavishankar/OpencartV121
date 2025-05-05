package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends BasePage
{
	public SearchPage (WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath = "//a[normalize-space()='iPhone']") WebElement search_txt;
	
	@FindBy(xpath = "//div[@class='product-layout product-grid col-lg-3 col-md-3 col-sm-6 col-xs-12']//button[1]")
	WebElement btn_AddToCart;
	
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']") WebElement success_Msg;
	
	@FindBy(xpath = "//button[@class='btn btn-inverse btn-block btn-lg dropdown-toggle']")
	WebElement btn_AddToShoppingCart;
	
	@FindBy(xpath = "//strong[normalize-space()='View Cart']") WebElement view_Cart;
	
	@FindBy(xpath = "//button[@type='button']//i[@class='fa fa-heart']") WebElement btn_WishList;
	
	@FindBy(xpath = "//a[@id='wishlist-total']//i[@class='fa fa-heart']") WebElement my_WishList;
	
	public boolean isSearchedProductDisplayed()
	{
		try
		{
		return(search_txt.isDisplayed());
		}
		catch(Exception e)
		{
			return(false);
		}
	}
	
	public void addItemToCart()
	{
		btn_AddToCart.click();
	}
	
	public boolean isSuccessAddedItemToCartDisplayed()
	{
		return(success_Msg.isDisplayed());
	}
	
	public void addItemToShoppingCart()
	{
		btn_AddToShoppingCart.click();
	}
	public void clickViewCartBtn()
	{
		view_Cart.click();
	}
	
	public void clickWishListBtn()
	{
		btn_WishList.click();
	}
    
	public void clickMyWishList()
	{
		my_WishList.click();
	}
}
