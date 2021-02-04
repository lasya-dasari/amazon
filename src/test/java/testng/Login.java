package testng;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import basepackage.Baseclass;
import pagelayer.Loginpage;



public class Login extends Baseclass
   
{
	
	Loginpage login;
	
	 Login() {
	 super();
	 login=new Loginpage(driver);
	 
	}
	 
	 @Test(priority=0)
	 public void intialization()
	 {
		 browser_intialization();
	 }
	
	 
	 
	 @Test(priority=1)
  public void verify_login() 
  
{
    login.signin_first();
	login.username("sandhyathumma2@gmail.com");
    login.continue_link();
    login.password();
	login.signin();
		 
  }
	 
	 public void verify_forgetpassword()
	 {
		 
	 }
	 
	/* @AfterClass
	 public void close()
	 {
		 closedriver();
	 }*/
	 
}
