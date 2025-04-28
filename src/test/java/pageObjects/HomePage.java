package pageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{
	//Constructors
	
	public HomePage(WebDriver driver)
	{
		super(driver);
		
	}
	
	//Locators
	@FindBy(xpath="//span[normalize-space()='My Account']") 
	WebElement txtaccount;
	
	@FindBy(xpath="//a[normalize-space()='Register']") 
	WebElement txt_register;
	
	@FindBy(xpath="//a[normalize-space()='Login']") 
	WebElement txt_login;
	
	//Action methods
	public void clickMyAccount()
	{
		txtaccount.click();
		System.out.println("Account clicked");
	}
	public void clickRegister()
	{
		txt_register.click();
		System.out.println("Register clicked");
	}
	public void clickLogin()
	{
		txt_login.click();
	}

}
