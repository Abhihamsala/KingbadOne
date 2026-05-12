package Selenium;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;

import org.openqa.selenium.support.ui.ExpectedConditions;

import utilities.WebSiteUtility;

public class GetCssvalue {

	public static void main(String[] args) throws Exception
	{
		// TODO Auto-generated method stub
		WebSiteUtility ws = new WebSiteUtility();
		System.setProperty("webdriver.chrome.logfile","target\\Testlognov23.txt");
		WebDriver Abhi=ws.openBrowser("Chrome");
		FluentWait<WebDriver> wait=ws.defexpwait(Abhi, 30, 1000);
		ws.launSite(Abhi,"https://www.gmail.com");
	    //locate element
		WebElement e=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Forgot email?']")));
		
		//get html attribute value from element by developer
		String x=e.getAttribute("type");
		System.out.println(x);
		String y=e.getCssValue("color");
		System.out.println(y);
			}

}
