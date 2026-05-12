package Selenium;



import java.util.List;

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

public class JsGetTextstar {

	public static void main(String[] args) throws Exception
	{
		// TODO Auto-generated method stub
		WebSiteUtility ws = new WebSiteUtility();
		System.setProperty("webdriver.chrome.logfile","target\\TestlogDec40.txt");
		WebDriver Abhi=ws.openBrowser("Chrome");
		FluentWait<WebDriver> wait=ws.defexpwait(Abhi, 30, 1000);
		ws.launSite(Abhi,"https://semantic-ui.com/modules/dropdown.html");
		 JavascriptExecutor js = (JavascriptExecutor) Abhi;
		Thread.sleep(5000);
		//locate parent element
		WebElement e= Abhi.findElement(By.xpath("(//div[@class='ui ignored info message'])[1]"));
		System.out.println("*****************************************************************************************************************");
		
	    //1.Get text of parent element including text of all child element using get Text
		String x=e.getText();
		System.out.println(x);
		System.out.println("***************************************1**************************************************************************");
		
		//2 Get text of parent element excluding text of all child elements using get Text
		List<WebElement> childs=e.findElements(By.xpath("descendant::*"));
	
		String y=e.getText();
		for (WebElement child:childs)
		{
			y=y.replaceFirst(child.getText(),"");
		}
		System.out.println(y);	
		System.out.println("******************************************2***********************************************************************");
		
		//3. Get text of specific child element using getText().
		String z=childs.get(0).getText();
		System.out.println(z);	
		System.out.println("*********************************************3********************************************************************");
		
	    //4.Get all child elements text one after other using GetText	
		for (WebElement child:childs)
		{
			System.out.println(child.getText());	
		
		}
		
		System.out.println("*********************************************3********************************************************************");
		 //5.Get text in specific line of element 1st line using javascripts
		String w=(String) js.executeScript("return(arguments[0].childNodes[0].textContent);",e);
		System.out.println(w);
	}
}

	
			
			
		
		



