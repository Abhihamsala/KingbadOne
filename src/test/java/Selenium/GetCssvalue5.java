package Selenium;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.FluentWait;

import org.openqa.selenium.support.ui.ExpectedConditions;

import utilities.WebSiteUtility;

public class GetCssvalue5 {

	public static void main(String[] args) throws Exception
	{
		// TODO Auto-generated method stub
		WebSiteUtility ws = new WebSiteUtility();
		System.setProperty("webdriver.chrome.logfile","target\\Testlognov44.txt");
		WebDriver Abhi=ws.openBrowser("Chrome");
		FluentWait<WebDriver> wait=ws.defexpwait(Abhi, 30, 1000);
		ws.launSite(Abhi,"https://www.google.co.in");
	    //locate element
		WebElement e=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@jsname='RNNXgb']")));
		
		//get details before focus
		String x1=e.getCssValue("box-shadow");
		System.out.println(x1);
		//get focus
		Actions act = new Actions(Abhi);
		act.moveToElement(e).perform();
		Thread.sleep(10000);
		//get details after focus
		String y1=e.getCssValue("box-shadow");
		System.out.println(y1);
		
		if(!y1.contains("none"))
		{
			System.out.println("Test Passed because of shading");
		}
		else
		{
			System.out.println("Test failed because changes after shading");
		}
}

}
