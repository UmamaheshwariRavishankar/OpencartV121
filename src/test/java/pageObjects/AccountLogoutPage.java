package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountLogoutPage extends BasePage
{
   public AccountLogoutPage(WebDriver driver)
   {
	super(driver);
   }
   
   @FindBy(xpath = "\"//h1[normalize-space()='Account Logout']\"") WebElement logout_Txt;
   
   @FindBy(xpath = "//a[normalize-space()='Continue']") WebElement bth_Continue;
   
   public boolean isMyAccountLogoutPageExists()
	{
		try
		{
		return logout_Txt.isDisplayed();
		}
		catch(Exception e)
		{
			return(false);
		}
	}
   
   public void clickContinueBtn()
   {
	   
	   bth_Continue.click();
   }


}
