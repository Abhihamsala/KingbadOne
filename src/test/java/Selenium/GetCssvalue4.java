package Selenium;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.FluentWait;

import org.openqa.selenium.support.ui.ExpectedConditions;


import utilities.WebSiteUtility;

public class GetCssvalue4 {

	public static void main(String[] args) throws Exception
	{
		// TODO Auto-generated method stub
		WebSiteUtility ws = new WebSiteUtility();
		System.setProperty("webdriver.chrome.logfile","target\\Testlognov44.txt");
		WebDriver Abhi=ws.openBrowser("Chrome");
		FluentWait<WebDriver> wait=ws.defexpwait(Abhi, 30, 1000);
		ws.launSite(Abhi,"https://www.gmail.com");
	    //locate element
		WebElement e=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Forgot email?']")));
		
		//get details before focus
		String x1=e.getCssValue("color");
		System.out.println(x1);
		String x2=e.getCssValue("background-color");
		System.out.println(x2);
		//right click
		Actions act = new Actions(Abhi);
		act.contextClick(e).perform();
		Thread.sleep(10000);
		
		//after right  details click
		String y1=e.getCssValue("color");
		System.out.println(y1);
		String y2=e.getCssValue("background-color");
		System.out.println(y2);
		if(!x1.equals(y1) && !x2.equals(y2))
		{
			System.out.println("Test Passed because changes after right click");
		}
		else
		{
			System.out.println("Test failed because changes after right click");
		}
}

}
