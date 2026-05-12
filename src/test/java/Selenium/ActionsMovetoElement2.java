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
import org.openqa.selenium.interactions.WheelInput;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.FluentWait;





import org.openqa.selenium.support.ui.ExpectedConditions;


import utilities.WebSiteUtility;

public class ActionsMovetoElement2 {



	public static void main(String[] args) throws Exception
	{
		// TODO Auto-generated method stub
		WebSiteUtility ws = new WebSiteUtility();
		System.setProperty("webdriver.chrome.logfile","target\\TestlogFeb8.txt");
		WebDriver Abhi=ws.openBrowser("Chrome");
		FluentWait<WebDriver> wait=ws.defexpwait(Abhi, 30, 1000);
		ws.launSite(Abhi,
					"https://stackoverflow.com/questions/38653910/actions-click-script-selenium");
		Thread.sleep(5000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(
																By.xpath("(//pre[contains(@class,'lang-java')])[1]")));
       //page down
		Actions a = new Actions(Abhi);
		a.sendKeys(Keys.END).perform();
		Thread.sleep(5000);
		a.sendKeys(Keys.HOME).perform();
		Thread.sleep(5000);
		//locate an target element on the page.
		//step1: locate scorecard table in page source
		WebElement iframe=Abhi.findElement(By.xpath("//iframe[contains(@id,'sb')]"));
		WheelInput.ScrollOrigin so=WheelInput.ScrollOrigin.fromElement(iframe);
		new Actions(Abhi).scrollFromOrigin(so, 0, -300).perform();
		
	}	
		
	
	}		
			
		
		

