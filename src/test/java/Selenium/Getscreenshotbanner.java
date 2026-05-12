package Selenium;



import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.JavascriptException;

import org.openqa.selenium.support.ui.ExpectedConditions;


import utilities.WebSiteUtility;

public class Getscreenshotbanner {

	private static File src1;

	public static void main(String[] args) throws Exception
	{
		// TODO Auto-generated method stub
		WebSiteUtility ws = new WebSiteUtility();
		System.setProperty("webdriver.chrome.logfile","target\\TestlogDec40.txt");
		WebDriver Abhi=ws.openBrowser("Chrome");
		FluentWait<WebDriver> wait=ws.defexpwait(Abhi, 30, 1000);
		ws.launSite(Abhi,"https://www.magnitia.com");
		
		Thread.sleep(6000);
		//locate parent element
		WebElement e= Abhi.findElement(By.xpath("(//img[@alt='magnitia header'])"));
		System.out.println("*****************************************************************************************************************");
	    //1.Get screenshot of element covered by banner
		File dest1= new File("target\\coveredelementpic.png");
		File src1= e.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src1, dest1);
		
		//close banner
		Abhi.findElement(By.className("close")).click();
		Thread.sleep(6000);
		
		 //2.Get screenshot of element uncovered by banner
		File dest2= new File("target\\notcoveredelementpic.png");
		File src2= e.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src2, dest2);
		
		}
	
	}		
			
		
		



