package Selenium;



import java.io.File;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.FluentWait;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;
import ru.yandex.qatools.ashot.shooting.ShootingStrategy;



import org.openqa.selenium.support.ui.ExpectedConditions;


import utilities.WebSiteUtility;

public class Ashottwo {



	public static void main(String[] args) throws Exception
	{
		// TODO Auto-generated method stub
		WebSiteUtility ws = new WebSiteUtility();
		System.setProperty("webdriver.chrome.logfile","target\\TestlogDec40.txt");
		WebDriver Abhi=ws.openBrowser("Chrome");
		FluentWait<WebDriver> wait=ws.defexpwait(Abhi, 30, 1000);
		ws.launSite(Abhi,"https://semantic-ui.com/modules/dropdown.html");
		Thread.sleep(5000);
		//locate an element and take screenshot of page.
		WebElement e=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//img[contains(@src,'jenny')])[2]")));
		String filepath1=ws.captureElementScreenshotFile(e);
		System.out.println(filepath1);
		
		//take visible area screenshot of page
		String filepath2=ws.capturePageScreenshotFile(Abhi);
		System.out.println(filepath2);
		
		//take full page screenshot by scrolling using Ashot.
		String filepath3=ws.captureFullPageScreenshotFile(Abhi);
		System.out.println(filepath3);
	
		}
	
	}		
			
		
		



