package basepackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.w3c.dom.Document;

public class Baseclass 
{
	public WebDriver driver;
	
	public Baseclass()
	{
		System.setProperty("WebDriver.chrome.driver", "ChromeDriver.exe");
		driver=new ChromeDriver();
	}
	
	public void browser_intialization()
	{
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
	}
	
	public void webdriverwait(WebElement element)
	{
		WebDriverWait wait=new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(element));
		
	}
	
	public void action(WebElement element)
	{
		Actions action=new Actions(driver);
		action.moveToElement(element);
	}
	
	public void closedriver()
	{
		driver.close();
	}

}
