package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegistrationPage extends BasePage {
	
	public AccountRegistrationPage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//input[@id='input-firstname']") WebElement txt_UserFirstName;
	@FindBy(xpath="//input[@id='input-lastname']") WebElement txt_UserLastName;
	@FindBy(xpath="//input[@id='input-email']") WebElement txt_Email;
	@FindBy(xpath="//input[@id='input-telephone']") WebElement txt_Telephone;
	@FindBy(xpath="//input[@id='input-password']") WebElement txt_Password;
	@FindBy(xpath="//input[@id='input-confirm']") WebElement txt_Password1;
	
	@FindBy(xpath="//input[@name='agree']") WebElement chk_PrivacyPolicy;
	@FindBy(xpath="//input[@value='Continue']") WebElement btn_Continue;
	
	@FindBy(xpath="//h1[normalize-space()='Your Account Has Been Created!']") WebElement confirm_message;
	
	public void setUserFirstName(String fname)
	{
		txt_UserFirstName.sendKeys(fname);
	}
	public void setUserLastName(String lname)
	{
		txt_UserLastName.sendKeys(lname);
	}
	public void setEmail(String email)
	{
		txt_Email.sendKeys(email);
	}
	public void setTelephone(String tel)
	{
		txt_Telephone.sendKeys(tel);
	}
	public void setPassword(String pwd)
	{
		txt_Password.sendKeys(pwd);
	}
	public void setConfirmPassword(String pwd)
	{
		txt_Password1.sendKeys(pwd);
	}
	
	
	public void chkPrivacyPolicy()
	{
		chk_PrivacyPolicy.click();
	}
	public void clickButton()
	{
		btn_Continue.click();
	}
	
	
	
	public String getConfirmMessage()
	{
		try
		{
		return(confirm_message.getText());
		}
		catch(Exception e)
		{
		return(e.getMessage());
		}
	}
	
	
	
	
	
	

}
