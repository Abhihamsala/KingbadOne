package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;

import static org.openqa.selenium.support.ui.ExpectedConditions.*;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import utilities.WebSiteUtility;

public class ExplictWaittesttwo  


{

	public static void main(String[] args)  throws Exception 
	
	{
		WebSiteUtility ws = new WebSiteUtility();
		WebDriver Abhi =ws.openBrowser("chrome");
		FluentWait<WebDriver> w=ws.defexpwait(Abhi, 20, 1000);
		ws.launSite(Abhi, "http://dev.worke.io/register");
		w.until(urlContains("https"));
		//do login
		w.until(visibilityOfElementLocated(By.id("first_name"))).sendKeys("abdul");
		w.until(visibilityOfElementLocated(By.id("last_name"))).sendKeys("kalam");
		w.until(visibilityOfElementLocated(By.id("useremail"))).sendKeys("kalam@gmail.com");
		w.until(visibilityOfElementLocated(By.id("phone_number"))).sendKeys("9175143625");
		w.until(visibilityOfElementLocated(By.id("userpassword"))).sendKeys("batch261");
		w.until(visibilityOfElementLocated(By.xpath("//input[@placeholder ='Business Name']"))).sendKeys("teaching .worke.io");
		w.until(elementToBeClickable(By.xpath("//button[text()='Register']"))).click();
}

}
