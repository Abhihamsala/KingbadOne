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

public class Advxpathsample5herierchy {

//heirachly xpath

	public static void main(String[] args) throws Exception
	{
		// TODO Auto-generated method stub
		WebSiteUtility ws = new WebSiteUtility();
		System.setProperty("webdriver.chrome.logfile","target\\TestlogJan5.txt");
		WebDriver Abhi=ws.openBrowser("Chrome");
		FluentWait<WebDriver> wait=ws.defexpwait(Abhi, 30, 1000);
		
		
		//URL launch
		ws.launSite(Abhi,"https://www.espncricinfo.com/series/england-in-india-2023-24-1389386/india-vs-england-1st-test-1389399/full-scorecard");
		Thread.sleep(3000);
		
		//Way 2: locate an target element on the page Hierarchically 
		
		//Step1: locate one scorecard table in page source
		   WebElement scorecard=wait.until(ExpectedConditions.visibilityOfElementLocated(
														                  By.xpath("(//table[contains(@class,'scorecard-table')])[1]/tbody")));

		//Step2 : locate all players rows in scorecard table in page source
		   List<WebElement> batsmen=scorecard.findElements(By.xpath("(//child::tr[count(td)=8 or count(td)=9])"));
		   
		   for (WebElement batsman:batsmen)
			{
					//get all details
			   for (int i=1;i<=8;i++)
			   {
				   String x=batsman.findElement(By.xpath("child::td["+i+"]")).getText();
				   System.out.print(x+ " ");
			   }
			   System.out.println(); // new line
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
		

		//Testcase 5 : get  batsman name in 1 st scorecard which as SR greater 100
		List<WebElement> batsmen1=wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(
																			By.xpath("(//table[contains(@class,'scorecard-table')])[1]/tbody//strong[text() >='50']/preceding::td[2]")));
		for (WebElement batsman:batsmen1)
		{
		System.out.println(batsman.getText());
				}
		
		//Testcase 6 : get  batsman name in 1 st scorecard got out for holder
		//	List<WebElement> batsmenrs=wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(
	//																		By.xpath("(//table[contains(@class,'scorecard-table')])[1]/tbody/tr/td[2]//span[contains(text(),'b Holder' or contains(text(),'c Holder' )]/preceding::td[1]")));
		List<WebElement> bs=wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("(//table[contains(@class,'scorecard-table')])[1]/tbody/tr/td[2]//span[contains(text(),'b Bumrah') or contains(text(),'c Bumrah')]/preceding::td[1]")));

		for (WebElement b:bs)
		{
		System.out.println(b.getText());
				}
		Thread.sleep(10000);
		//ws.closeSite(Abhi);
	}
}
		
	
		
			
		
		

