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

public class WaitUntilAlertFrame  


{

	public static void main(String[] args)  throws Exception 
	
	{
		WebSiteUtility ws = new WebSiteUtility();
		WebDriver Abhi =ws.openBrowser("chrome");
		Abhi.manage().window().maximize();
		
		ws.launSite(Abhi, "https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
		FluentWait<WebDriver> w=ws.defexpwait(Abhi, 20, 1000);
		//waiting for home page
		w.until(titleIs("W3Schools Tryit Editor"));
		//switch to frame and click on "tryit" button
		w.until(frameToBeAvailableAndSwitchToIt("iframeResult"));
		w.until(visibilityOfElementLocated(By.tagName("button"))).click();
		//Switch to alert and close
		String Al=w.until(alertIsPresent()).getText();
		System.out.println(Al);
		w.until(alertIsPresent()).dismiss();
	//	ws.closeSite(Abhi);
		
	}

}
