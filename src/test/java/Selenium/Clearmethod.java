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

public class Clearmethod {

	public static void main(String[] args) throws Exception
	{
		// TODO Auto-generated method stub
		WebSiteUtility ws = new WebSiteUtility();
		System.setProperty("webdriver.chrome.logfile","target\\Testlog7.txt");
		WebDriver Abhi=ws.openBrowser("Chrome");
		FluentWait<WebDriver> wait=ws.defexpwait(Abhi, 30, 1000);
		ws.launSite(Abhi,"https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_input_disabled");
		//fill an element
		wait.until(frameToBeAvailableAndSwitchToIt("iframeResult"));
		//clear data in an element
        Abhi.findElement(By.name("lname")).clear();
	}

}
