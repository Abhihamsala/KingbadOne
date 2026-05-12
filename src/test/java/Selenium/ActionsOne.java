package Selenium;



import java.io.File;
import java.time.Duration;
import java.util.List;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.FluentWait;





import org.openqa.selenium.support.ui.ExpectedConditions;


import utilities.WebSiteUtility;

public class ActionsOne {



	public static void main(String[] args) throws Exception
	{
		// TODO Auto-generated method stub
		WebSiteUtility ws = new WebSiteUtility();
		System.setProperty("webdriver.chrome.logfile","target\\TestlogFeb3.txt");
		WebDriver Abhi=ws.openBrowser("Chrome");
		FluentWait<WebDriver> wait=ws.defexpwait(Abhi, 30, 1000);
		ws.launSite(Abhi,"https://www.flipkart.com/");
		Thread.sleep(5000);
		//locate an target element on the page.
		//step1: locate scorecard table in page source
		WebElement e=wait.until(ExpectedConditions.visibilityOfElementLocated(
															By.xpath("//span[text()='Fashion']")));
		
		Actions act = new Actions(Abhi);
		act.moveToElement(e).pause(Duration.ofSeconds(5)).contextClick().perform();

	}	
		
	
	}		
			
		
		

