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

public class WaitUntilStaleness  


{

	public static void main(String[] args)  throws Exception 
	
	{
		WebSiteUtility ws = new WebSiteUtility();
		WebDriver Abhi =ws.openBrowser("chrome");
		Abhi.manage().window().maximize();
		
		ws.launSite(Abhi, "https://www.gmail.com");
		FluentWait<WebDriver> w=ws.defexpwait(Abhi, 20, 1000);
		//locate and operate an element
		WebElement e=w.until(visibilityOfElementLocated(By.name("identifier")));
		e.sendKeys("magnitiait");
		//goto next page (new dom/page source)
		w.until(elementToBeClickable(By.xpath("//span[text()='Next']/parent::button"))).click();
		
		w.until(visibilityOfElementLocated(By.xpath("//a[@aria-label='Try again']")));
		//back to previous page
		Abhi.navigate().back();
		//verify that element is staled or not due to DOM changes
		if(w.until(stalenessOf(e)))
		{
		//relocate element if that element is staled
			e=w.until(refreshed(visibilityOfElementLocated(By.name("identifier"))));
		}
		}
		
	//	ws.closeSite(Abhi);
		
	}


