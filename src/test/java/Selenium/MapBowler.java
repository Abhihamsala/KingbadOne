package Selenium;



import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

public class MapBowler {



	public static void main(String[] args) throws Exception
	{
		// TODO Auto-generated method stub
		WebSiteUtility ws = new WebSiteUtility();
		System.setProperty("webdriver.chrome.logfile","target\\TestlogFeb2.txt");
		WebDriver Abhi=ws.openBrowser("Chrome");
		FluentWait<WebDriver> wait=ws.defexpwait(Abhi, 30, 1000);
		ws.launSite(Abhi,"https://www.espncricinfo.com/series/england-in-india-2023-24-1389386/"+"india-vs-england-2nd-test-1389400/full-scorecard");
		Thread.sleep(8000);
		
		//way 2: locate target elements heirachically
		
		//step 1 : locate one bowlers table in page source
		WebElement scorecards=wait.until(ExpectedConditions.visibilityOfElementLocated(
															By.xpath("(//th[text()='Bowling']/ancestor::table)[1]/tbody")));
		//Step 2 : locate all blower rows in the table
		List<WebElement> bowlers=wait.until(ExpectedConditions.visibilityOfNestedElementsLocatedBy(
																scorecards,By.xpath("child::tr[not(@class='ds-hidden')]")));
		
		HashMap<String,Integer> playerstat=new HashMap<>();
		
		for (WebElement bowler:bowlers)
		{
		//Step 3: insert each blower name and wickets into hash map		
		List<WebElement> details= bowler.findElements(By.xpath("child::td[not(contains(@class,'ds-hidden'))]"));	
							
			String name=details.get(0).getText();
			String temp=details.get(1).getText();
			int Wicket=Integer.parseInt(temp);
			playerstat.put(name, Wicket);
		}
		//step 4: convert hashmap to list of map.entry
		List <Map.Entry<String,Integer>> entryList= new ArrayList<>(playerstat.entrySet());
		
		
		//Step5 : Sort the list by values in descending order 
		Collections.sort(entryList,(e1,e2)->e2.getValue().compareTo(e1.getValue()));
	
		
		//Step6: find player with maximum runs 
		int  maxWickets=entryList.get(0).getValue();// first value is max value
		System.out.print("Heighest wickets are "+maxWickets +"and taken by ");
		
		for(Map.Entry<String,Integer> entry:entryList)
		{
			if(entry.getValue()==maxWickets)
			{
				System.out.print(entry.getKey()+"***");
				
			}
		}
		System.out.println();
		
		//Step7: find player with min runs
		int  minWickets=entryList.get(entryList.size()-1).getValue();// first value is min value
		System.out.print("Lowest wickets are "+minWickets +"and taken by ");
		
		for(Map.Entry<String,Integer> entry:entryList)
		{
			if(entry.getValue()==maxWickets)
			{
				System.out.print(entry.getKey()+"***");
				
			}
		}
		System.out.println();
	}
}
			

