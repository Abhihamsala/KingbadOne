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

public class AdvxpathThree {



	public static void main(String[] args) throws Exception
	{
		// TODO Auto-generated method stub
		WebSiteUtility ws = new WebSiteUtility();
		System.setProperty("webdriver.chrome.logfile","target\\TestlogJan5.txt");
		WebDriver Abhi=ws.openBrowser("Chrome");
		FluentWait<WebDriver> wait=ws.defexpwait(Abhi, 30, 1000);
		ws.launSite(Abhi,"https://www.espncricinfo.com/series/england-in-india-2023-24-1389386/"+"india-vs-england-2nd-test-1389400/full-scorecard");
		Thread.sleep(5000);
		//locate an target element on the page.
		//step1: locate scorecard table in page source
		WebElement scorecard=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//table[contains(@class,'ci-scorecard-table')])[1]/tbody")));
		
		//Step2: locate players rows in scorecard table
		List<WebElement> players=scorecard.findElements(By.xpath("child::tr/descendant::a"));	
		for (WebElement player:players)
		{
			String name=player.getText();
			String run=player.findElement(By.xpath("following::td[2]")).getText();
			String ball=player.findElement(By.xpath("following::td[3]")).getText();
			String sr=player.findElement(By.xpath("following::td[7]")).getText();
			System.out.println(name+"   "+run +"    "+run+"    "+ sr);
		}
		}
	
	}		
			
		
		

