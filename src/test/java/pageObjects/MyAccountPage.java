package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends BasePage {
	
	public MyAccountPage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath = "//h2[normalize-space()='My Account']") WebElement txt_Message;
	
	@FindBy(xpath = "//a[@class='list-group-item'][normalize-space()='Logout']") WebElement logoutButton;
	
	
	
	public boolean isMyAccountPageExists()
	{
		try {
		return txt_Message.isDisplayed();
		}
		catch(Exception e)
		{
			return(false);
		}
		
	}
	
	public void clickLogoutButton()
	{
		logoutButton.click();
	}
	
	

}
