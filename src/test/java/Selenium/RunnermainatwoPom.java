package Selenium;

import java.util.regex.Pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import static org.openqa.selenium.support.ui.ExpectedConditions.*;
import org.openqa.selenium.support.ui.ExpectedCondition;

import Pageclass.LoginPage;
import utilities.WebSiteUtility;

public class RunnermainatwoPom {

	public static void main(String[] args) throws Exception
	{
		// TODO Auto-generated method stub
		WebSiteUtility ws = new WebSiteUtility();
		System.setProperty("webdriver.chrome.logfile","target\\Testlog.txt");
		WebDriver Abhi=ws.openBrowser("Chrome");
		FluentWait<WebDriver> wait=ws.defexpwait(Abhi, 30, 1000);
		ws.launSite(Abhi,"https://github.com/login");
		//locate all elements.
		WebElement username=wait.until(visibilityOfElementLocated(By.id("login_field")));
		WebElement pass=wait.until(visibilityOfElementLocated(By.id("password")));
		WebElement sub=wait.until(visibilityOfElementLocated(By.xpath("//input[@value='Sign in']")));
		//create an object to page class
		LoginPage lp=new LoginPage(Abhi,wait);
		//Do login with Wrong details
		username.sendKeys("amod");
		pass.sendKeys("123");
		sub.click();
		Pattern P= Pattern.compile("Incorrect username or passowrd");
		wait.until(textMatches(By.xpath("//div[@role=alert']"),P));
		//Do relogin with correct details.
		if(wait.until(stalenessOf(username)))
		{
			username=wait.until(refreshed(visibilityOfElementLocated(By.id("login_field"))));
		username.clear();
		username.sendKeys("kalamgit143");
		}
		if(wait.until(stalenessOf(pass)))
		{
			pass=wait.until(refreshed(visibilityOfElementLocated(By.id("login_field"))));
			pass.clear();
			pass.sendKeys("Magnitia@263264");
		}
		if(wait.until(stalenessOf(sub)))
		{
			pass=wait.until(refreshed(elementToBeClickable(By.xpath("//input[@value='Sign in']"))));
			sub.click();
		}
		
		ws.closeSite(Abhi);
	
		}
	}


