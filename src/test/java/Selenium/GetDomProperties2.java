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

public class GetDomProperties2 {

	public static void main(String[] args) throws Exception
	{
		// TODO Auto-generated method stub
		WebSiteUtility ws = new WebSiteUtility();
		System.setProperty("webdriver.chrome.logfile","target\\Testlognov23.txt");
		WebDriver Abhi=ws.openBrowser("Chrome");
		FluentWait<WebDriver> wait=ws.defexpwait(Abhi, 30, 1000);
		ws.launSite(Abhi,"https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_button_test");
		wait.until(frameToBeAvailableAndSwitchToIt("iframeResult"));
		
		//get html attribute value from element by developer
		String x=wait.until(visibilityOfElementLocated(By.xpath("//*[@type='button']"))).getAccessibleName();
		System.out.println(x);
		String y=wait.until(visibilityOfElementLocated(By.xpath("//*[@type='button']"))).getAriaRole();
		System.out.println(y);
		String z=wait.until(visibilityOfElementLocated(By.xpath("//*[@type='button']"))).getTagName();
		System.out.println(z);
		String l=wait.until(visibilityOfElementLocated(By.xpath("//*[@type='button']"))).getDomAttribute("maxlength");
		System.out.println(l);
		//clear data in an element
		String w=wait.until(visibilityOfElementLocated(By.xpath("//*[@type='button']"))).getDomProperty("disabled");
		System.out.println(w);
	}

}
