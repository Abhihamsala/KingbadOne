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

public class JSGetCssvalue {

	public static void main(String[] args) throws Exception
	{
		// TODO Auto-generated method stub
		WebSiteUtility ws = new WebSiteUtility();
		System.setProperty("webdriver.chrome.logfile","target\\Testlognov40.txt");
		WebDriver Abhi=ws.openBrowser("Chrome");
		FluentWait<WebDriver> wait=ws.defexpwait(Abhi, 30, 1000);
		ws.launSite(Abhi,"https://www.gmail.com");
	    //locate element
		WebElement e=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Forgot email?']")));
	    JavascriptExecutor js = (JavascriptExecutor) Abhi;
		//get details before focus
		String x1=e.getCssValue("color");
		System.out.println(x1);
		String x2=e.getCssValue("background-color");
		System.out.println(x2);
		//Move focus to forgot email button via tabs
		Abhi.findElement(By.id("identifierId")).sendKeys(Keys.TAB);
		Thread.sleep(5000);
		
		//after focus
		String y1=e.getCssValue("color");
		System.out.println(y1);
		String y2=e.getCssValue("background-color");
		System.out.println(y2);
		//Border is coming as pseudo -element
		String y3=(String) js.executeScript(				
				"var ps =window.getComputedStyle(arguments[0],'::after');" +
				"var s=ps.getPropertyValue('color');" +
				"return(s);",e);
	}		
			
		
		
}


