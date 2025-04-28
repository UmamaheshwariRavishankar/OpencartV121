package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
	
    //constructors
	public LoginPage(WebDriver driver) 
	{
		super(driver);
	}
	
	//locators
	@FindBy(xpath = "//input[@id='input-email']") WebElement txt_Email;
	@FindBy(xpath = "//input[@id='input-password']") WebElement txt_pwd;
	@FindBy(xpath = "//input[@value='Login']") WebElement btn_continue;
	
	
	//action methods
	public void sendEmailText(String email)
	{
		txt_Email.sendKeys(email);
	}
	public void sendPassword(String pwd)
	{
		txt_pwd.sendKeys(pwd);
	}
	public void clickButton()
	{
		btn_continue.click();
	}
	
}