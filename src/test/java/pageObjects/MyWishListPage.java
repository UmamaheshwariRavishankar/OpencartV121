package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyWishListPage extends BasePage
{
   public MyWishListPage (WebDriver driver)
   {
	   super(driver);
   }
   
   @FindBy (xpath = "//a[normalize-space()='iPhone']") WebElement product_Display;
   
   public boolean isWishListProductDisplayed()
   {
	   try {
	   return(product_Display.isDisplayed());
	   }
	   catch(Exception e)
	   {
		   return (false);
	   }
   }
}
