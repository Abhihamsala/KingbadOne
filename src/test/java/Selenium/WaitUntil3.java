package Selenium;

import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import static org.openqa.selenium.support.ui.ExpectedConditions.*;
import org.openqa.selenium.support.ui.FluentWait;

import utilities.WebSiteUtility;

public class WaitUntil3  


{

	public static void main(String[] args)  throws Exception 
	
	{
		WebSiteUtility ws = new WebSiteUtility();
		WebDriver Abhi =ws.openBrowser("chrome");
		Abhi.manage().window().maximize();
		
		ws.launSite(Abhi, "https://www.google.co.in");
		FluentWait<WebDriver> w=ws.defexpwait(Abhi, 20, 1000);
		
		//Define wait condition
		ExpectedCondition<WebElement> ec1=elementToBeClickable(By.name("q"));
		ExpectedCondition<WebElement> ec2=elementToBeClickable(By.linkText("Gmail"));
		w.until(or(ec1,ec2));
	//	ws.closeSite(Abhi);
		
	}

}
