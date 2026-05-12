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

public class JsGetText2 {

	public static void main(String[] args) throws Exception
	{
		// TODO Auto-generated method stub
		WebSiteUtility ws = new WebSiteUtility();
		System.setProperty("webdriver.chrome.logfile","target\\Testlognov40.txt");
		WebDriver Abhi=ws.openBrowser("Chrome");
		FluentWait<WebDriver> wait=ws.defexpwait(Abhi, 30, 1000);
		ws.launSite(Abhi,"https://semantic-ui.com/modules/dropdown.html");
		  JavascriptExecutor js = (JavascriptExecutor) Abhi;
		Thread.sleep(5000);
	    //1.Get text of hidden element (developed with paired tag and it has some text)
		//Get a empty value,but no exception
		WebElement x= Abhi.findElement(By.xpath("(//div[text()='Gender'])[1]/following::div[3]"));
		String c=x.getText();
		System.out.println(c);
		Thread.sleep(5000);
		
		//2.Get value using javascript from hidden element
	
		String y=(String) js.executeScript("return(arguments[0].textContent);",x);
		System.out.println(y);	
	}		
			
		
		
}


