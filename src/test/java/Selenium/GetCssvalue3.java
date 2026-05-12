package Selenium;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.FluentWait;

import org.openqa.selenium.support.ui.ExpectedConditions;

import utilities.WebSiteUtility;

public class GetCssvalue3 {

	public static void main(String[] args) throws Exception
	{
		// TODO Auto-generated method stub
		WebSiteUtility ws = new WebSiteUtility();
		System.setProperty("webdriver.chrome.logfile","target\\Testlognov44.txt");
		WebDriver Abhi=ws.openBrowser("Chrome");
		FluentWait<WebDriver> wait=ws.defexpwait(Abhi, 30, 1000);
		ws.launSite(Abhi,"https://www.google.co.in");
	    //locate element
		WebElement e=wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Gmail")));
		
		//get details before focus
		String x=e.getCssValue("text-decoration");
		System.out.println(x);
		
		//get focus on element
		Actions act = new Actions(Abhi);
		act.moveToElement(e).perform();
		Thread.sleep(5000);
		
		//get details after focus
		String y=e.getCssValue("text-decoration");
		System.out.println(y);
		if(y.contains("underline"))
		{
			System.out.println("Test Passed");
		}
		else
		{
			System.out.println("Test failed no underline");
		}
}

}
