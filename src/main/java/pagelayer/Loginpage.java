package pagelayer;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.google.errorprone.annotations.Var;

public class Loginpage 
{
    
	public WebDriver driver;
	public JavascriptExecutor js;
	
	@FindBy(xpath="//input[@id='ap_email']")
	public WebElement username;
	
	@FindBy(xpath="//input[contains(@id, 'ap_password')]")
	public WebElement password;
	
	@FindBy(id="signInSubmit")
	public WebElement sigin;
	
	@FindBy(id="auth-fpp-link-bottom")
	public WebElement forgotpassword;
	
	@FindBy(id="continue")
	WebElement continue_link;
	
	
public Loginpage(WebDriver driver) 
{
	this.driver=driver;
	PageFactory.initElements(driver,this);
}
	
	public String username(String un)
	{
		username.sendKeys(un);
		
		return un;
	}
	
	public void continue_link()
	{
		continue_link.click();
	}
	
	public String password(String pwd)
	{
		username.sendKeys(pwd);
		
		return pwd;
	}
	
	public void signin()
	{
		sigin.click();
	}
	
	public void forgotpassword()
	{
		forgotpassword.click();
	}
	
	public void signin_first()
	{
		js=(JavascriptExecutor)driver;
		js.executeScript("document.getElementById('nav-link-accountList-nav-line-1').click()");
	}
	public void password()
	{
	js=(JavascriptExecutor)driver;
		js.executeScript("document.getElementById('ap_password').value='9100707016'");
		
	}
	
	/*public void personalaccount()
	{
		js=(JavascriptExecutor)driver;
		js.executeScript("document.getElementsByClassName("a-spacing-double-large a-spacing-top-medium a-link-normal")")[0].click();
		
		
	}*/
}
