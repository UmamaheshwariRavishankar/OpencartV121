package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingCartPage extends BasePage
{
	public ShoppingCartPage(WebDriver driver)
	{
		super (driver);
	}
	
	@FindBy (xpath = "//body[1]/div[2]/div[2]/div[1]/form[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/a[1]")
    WebElement search_Item;
	
	public boolean isAddedItemDispalyed()
	{
		return(search_Item.isDisplayed());
	}
}
