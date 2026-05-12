package Selenium;



import java.io.File;
import java.util.List;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.FluentWait;





import org.openqa.selenium.support.ui.ExpectedConditions;


import utilities.WebSiteUtility;

public class AdvxpathpBowler {



	public static void main(String[] args) throws Exception
	{
		// TODO Auto-generated method stub
		WebSiteUtility ws = new WebSiteUtility();
		System.setProperty("webdriver.chrome.logfile","target\\TestlogJan14.txt");
		WebDriver Abhi=ws.openBrowser("Chrome");
		FluentWait<WebDriver> wait=ws.defexpwait(Abhi, 30, 1000);
		ws.launSite(Abhi,"https://www.espncricinfo.com/series/england-in-india-2023-24-1389386/"+"india-vs-england-2nd-test-1389400/full-scorecard");
		Thread.sleep(10000);
		//locate an target element on the page.
		//step1: locate scorecard table in page source
		List<WebElement> scorecards=wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(
															By.xpath("//th[text()='BOWLING']/ancestor::table/tbody")));
		
	//th[text()='BOWLING']/ancestor::table/tbody/tr[not(@class='ds-hidden')]/td[not(contains(@class='ds-hidden'))]
		System.out.println("***************************************************************");
		
		//Got to each scorecard table
		int count =1;
		for (WebElement scorecard:scorecards)
		{
					System.out.println("ScoreCard :"+count);
					System.out.println("--------------------------------------------------------");
					
					//Step2: locate all blowers rows in scorecard table
						List<WebElement> blowers=scorecard.findElements(By.xpath("child::tr[not(@class='ds-hidden')]"));	
							
						//Goto each blowers
		for (WebElement blower:blowers)
		{
						List<WebElement> details=blower.findElements(By.xpath("child::td[not(contains(@class='ds-hidden'))]"));	
			
							// get all details
			for (WebElement detail:details)
			{
			String x=detail.getText();
			System.out.print(" "+x+" ");
				}
			System.out.println();//new line
			
		  }
		System.out.println("--------------------------------------------------------");
		count++;
		} 
		
		
		ws.closeSite(Abhi);
	}	
		
	//th[text()='BOWLING']/ancestor::table/tbody/tr[not(@class='ds-hidden')]/td[not(contains(@class='ds-hidden'))]
	}		
			
		
		

