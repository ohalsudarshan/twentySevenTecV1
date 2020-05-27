package twentySevenTec.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver ldriver;
	
	public LoginPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(id="Email")
	@CacheLookup
	WebElement txtusername;
	
	@FindBy(name="Password")
	@CacheLookup
	WebElement txtpassword;
	
	@FindBy(id="login_submit")
	@CacheLookup
	WebElement btnLogin;
	
	public void setUsername(String email)
	{
		txtusername.sendKeys(email);	
	}

	public void setPassword(String pwd)
	{
		txtpassword.sendKeys(pwd);	
	}

	public void clksubmitbtn()
	{
		btnLogin.click();
	}
	
}
