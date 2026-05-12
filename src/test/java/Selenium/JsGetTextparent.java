package Selenium;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.JavascriptException;

import org.openqa.selenium.support.ui.ExpectedConditions;


import utilities.WebSiteUtility;

public class JsGetTextparent {

	public static void main(String[] args) throws Exception
	{
		// TODO Auto-generated method stub
		WebSiteUtility ws = new WebSiteUtility();
		System.setProperty("webdriver.chrome.logfile","target\\TestlogDec40.txt");
		WebDriver Abhi=ws.openBrowser("Chrome");
		FluentWait<WebDriver> wait=ws.defexpwait(Abhi, 30, 1000);
		ws.launSite(Abhi,"https://www.worldometers.info/world-population/");
		 JavascriptExecutor js = (JavascriptExecutor) Abhi;
		Thread.sleep(10000);
		//locate parent element
		WebElement parent= Abhi.findElement(By.xpath("(//span[@rel='current_population'])"));
		System.out.println("*****************************************************************************************************************");
	    //1.Get text of parent element along with text of all child dynamic element  using get Text
		String x=parent.getText();
		System.out.println(x);

		System.out.println("*****************************************************************************************************************");
		//2 locate parent,but get text of specific dynamic child element 8 th child using javascripts.
	
		String y=(String) js.executeScript("return(arguments[0].childNodes[7].textContent);",parent);
		System.out.println(y);	
		System.out.println("*****************************************************************************************************************");
		//3. Get all dynamic child elements text one after other using javascripts
		for(int i=0;i<8;i++)
		{
		String z=(String) js.executeScript("return(arguments[0].childNodes["+i+"].textContent);",parent);
		System.out.println(z);
		System.out.println("*****************************************************************************************************************");
		}
		}
	
	}		
			
		
		



