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

public class GetText {

	public static void main(String[] args) throws Exception
	{
		// TODO Auto-generated method stub
		WebSiteUtility ws = new WebSiteUtility();
		System.setProperty("webdriver.chrome.logfile","target\\Testlognov40.txt");
		WebDriver Abhi=ws.openBrowser("Chrome");
		FluentWait<WebDriver> wait=ws.defexpwait(Abhi, 30, 1000);
		ws.launSite(Abhi,"https://www.google.co.in");
		Thread.sleep(5000);
	    //1.Get text of visible element (developed with paired tag and it has some text)
		//Get corresponding text successfully
		String x= Abhi.findElement(By.xpath("//div[@id='gb']/descendant::a[1]")).getText();
		System.out.println(x);
		Thread.sleep(5000);
		
		//2.Get text of visible element (developed with paired tag but no text)
		//Get a blank value ,NO exception
		String y= Abhi.findElement(By.xpath("//div[@jsname='vdLsw']")).getText();
		System.out.println(y);		
		Thread.sleep(5000);
		
		//3.Get text of visible element (developed with unpaired tag )
		//Get a blank value ,NO exception
		Abhi.navigate().to("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_hr_test");
		Thread.sleep(5000);
		Abhi.switchTo().frame("iframeResult");
		String z=Abhi.findElement(By.xpath("//h1[text()='The Main Languages of the Web']/following-sibling::hr[1]")).getText();
		System.out.println(z);	
	}		
			
		
		
}


