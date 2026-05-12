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

public class Advxpathsample2 {



	public static void main(String[] args) throws Exception
	{
		// TODO Auto-generated method stub
		WebSiteUtility ws = new WebSiteUtility();
		System.setProperty("webdriver.chrome.logfile","target\\TestlogJan5.txt");
		WebDriver Abhi=ws.openBrowser("Chrome");
		FluentWait<WebDriver> wait=ws.defexpwait(Abhi, 30, 1000);
		ws.launSite(Abhi,"https://www.espncricinfo.com/series/west-indies-in-australia-2023-24-1375837/australia-vs-west-indies-2nd-t20i-1375851/full-scorecard");
		Thread.sleep(3000);
		//Way 1: locate an target element on the page directly 
		//Testcase1: get 1st batsman run in 1 st scorecard
		String x=wait.until(ExpectedConditions.visibilityOfElementLocated(
														                  By.xpath("(//table[contains(@class,'scorecard-table')])[1]/tbody/tr[1]/td[3]/strong"))).getText();
		System.out.println(x);

		//Testcase2 : get 1st batsman name in 1 st scorecard
		String y=wait.until(ExpectedConditions.visibilityOfElementLocated(
																          By.xpath("(//table[contains(@class,'scorecard-table')])[1]/tbody/tr[1]/td[1]"))).getText();
		System.out.println(y);
		
		//Testcase3 : get two not out batsman name in 1 st scorecard
		List<WebElement> players=wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(
			                            	 By.xpath("(//table[contains(@class,'scorecard-table')])[1]/tbody//td[contains(text(),'not out ')]/preceding-sibling::td")));
		for (WebElement player:players)
		{
		System.out.println(player.getText());
		
		}
		//Testcase4 : get rohit  batsman name in 1 st scorecard
		try
		{
				String w=wait.until(ExpectedConditions.visibilityOfElementLocated(
																		By.xpath("(//table[contains(@class,'scorecard-table')])[1]/tbody//a[contains(@title,'Rohit')]/following::td[2]"))).getText();
				System.out.println(w);
		} 
		catch(Exception ex)
		{
			System.out.println("Given Player not praticipated in that Match");
		}
		Thread.sleep(10000);
		//ws.closeSite(Abhi);
	}
}
		
	
		
			
		
		

