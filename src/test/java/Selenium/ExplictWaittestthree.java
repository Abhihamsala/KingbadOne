package Selenium;

import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import static org.openqa.selenium.support.ui.ExpectedConditions.*;
import org.openqa.selenium.support.ui.FluentWait;

import utilities.WebSiteUtility;

public class ExplictWaittestthree  


{

	public static void main(String[] args)  throws Exception 
	
	{
		WebSiteUtility ws = new WebSiteUtility();
		WebDriver Abhi =ws.openBrowser("chrome");
		FluentWait<WebDriver> w=ws.defexpwait(Abhi, 20, 1000);
		ws.launSite(Abhi, "https://www.gmail.com");
		//waiting
		ExpectedCondition<Boolean> ec1=titleIs("Gmail");
		ExpectedCondition<Boolean> ec2=urlContains("https");
		w.until(and(ec1,ec2));
		
		//do login
		w.until(visibilityOfElementLocated(By.name("identifier"))).sendKeys("magnitiait");
		w.until(elementToBeClickable(By.xpath("//*[text()='Next']/parent::*"))).click();
		w.until(visibilityOfElementLocated(By.name("Paased"))).sendKeys("44@magnitia");
		w.until(elementToBeClickable(By.xpath("//*[text()='Next']/parent::*"))).click();
		
		ws.closeSite(Abhi);
		
	}

}
