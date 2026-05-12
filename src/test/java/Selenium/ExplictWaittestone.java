package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import utilities.WebSiteUtility;

public class ExplictWaittestone  


{

	public static void main(String[] args)  throws Exception 
	
	{
		WebSiteUtility ws = new WebSiteUtility();
		WebDriver Abhi =ws.openBrowser("chrome");
		FluentWait<WebDriver> w=ws.defexpwait(Abhi, 20, 1000);
		ws.launSite(Abhi, "https://facebook.com");
		//do login
		w.until(ExpectedConditions.visibilityOfElementLocated(By.name("email"))).sendKeys("abdulkalam");
		w.until(ExpectedConditions.visibilityOfElementLocated(By.name("pass"))).sendKeys("abdulkalam");
		w.until(ExpectedConditions.elementToBeClickable(By.name("login"))).click();
		try
		{
		w.until(ExpectedConditions.textToBe(By.name("tryanotherway"),"Try another way"));
		System.out.println("Test passed");
		}
	
		
		catch(TimeoutException e)
		{
			System.out.println("Test failed");
		}
		//close site
		ws.closeSite(Abhi);
		
	}

}
