package Selenium;

import java.util.regex.Pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.FluentWait;
import static org.openqa.selenium.support.ui.ExpectedConditions.*;
import org.openqa.selenium.support.ui.ExpectedCondition;

import Pageclass.CacheLookupPage;
import Pageclass.LoginPage;
import utilities.WebSiteUtility;

public class SendClear {

	public static void main(String[] args) throws Exception
	{
		// TODO Auto-generated method stub
		WebSiteUtility ws = new WebSiteUtility();
		System.setProperty("webdriver.chrome.logfile","target\\Testlog5.txt");
		WebDriver Abhi=ws.openBrowser("Chrome");
		FluentWait<WebDriver> wait=ws.defexpwait(Abhi, 30, 1000);
		ws.launSite(Abhi,"https://www.gmail.com");
		//fill an element
		wait.until(visibilityOfElementLocated(By.name("identifier"))).sendKeys("magnitiatit");
		//clear data in an element
		wait.until(visibilityOfElementLocated(By.name("identifier"))).clear();
	}

}
