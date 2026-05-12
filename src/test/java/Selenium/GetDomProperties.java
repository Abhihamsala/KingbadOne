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

public class GetDomProperties {

	public static void main(String[] args) throws Exception
	{
		// TODO Auto-generated method stub
		WebSiteUtility ws = new WebSiteUtility();
		System.setProperty("webdriver.chrome.logfile","target\\Testlognov23.txt");
		WebDriver Abhi=ws.openBrowser("Chrome");
		FluentWait<WebDriver> wait=ws.defexpwait(Abhi, 30, 1000);
		ws.launSite(Abhi,"https://www.google.com");
		//get html attribute value from element by developer
		String x=wait.until(visibilityOfElementLocated(By.name("q"))).getAttribute("maxlength");
		System.out.println(x);
		String y=wait.until(visibilityOfElementLocated(By.name("q"))).getDomAttribute("maxlength");
		System.out.println(y);
		//clear data in an element
		String z=wait.until(visibilityOfElementLocated(By.name("q"))).getDomProperty("disabled");
		System.out.println(z);
		String w=wait.until(visibilityOfElementLocated(By.name("q"))).getTagName();
		System.out.println(w);
		String j=wait.until(visibilityOfElementLocated(By.name("q"))).getAriaRole();
		System.out.println(j);
	}

}
