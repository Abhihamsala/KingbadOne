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

public class MapBatsmen {



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
		
		//step 1 : locate one scorecard table in page source
		WebElement scorecards=wait.until(ExpectedConditions.visibilityOfElementLocated(
															By.xpath("(//table[contains(@class,'ci-scorecard-table')])[1]/tbody")));
		//Step 2 : locate all batmen rows in the scorecard table
		List<WebElement> batsmen=wait.until(ExpectedConditions.visibilityOfNestedElementsLocatedBy(
															scorecards,By.xpath("child::tr[count(td)=8 or count(td)=9]")));
		
		HashMap<String,Integer> playerruns=new HashMap<>();
		
		for (WebElement batmen:batsmen)
		{
		//Step 3: insert each batmen name and runs into hash map		
			String name=batmen.findElement(By.xpath("child::td[1]")).getText();
			String score=batmen.findElement(By.xpath("child::td[3]")).getText();
			int runs=Integer.parseInt(score);
			playerruns.put(name, runs);
		}
		//step 4: convert hashmap to list of map.entry
		List <Map.Entry<String,Integer>> entryList= new ArrayList<>(playerruns.entrySet());
		
		
		//Step5 : Sort the list by values in descending order 
		Collections.sort(entryList,(e1,e2)->e2.getValue().compareTo(e1.getValue()));
	
		
		//Step6: find player with maximum runs 
		int  maxRun=entryList.get(0).getValue();// first value is max value
		System.out.print("Heigest runs are "+ maxRun +" and scored by ");
		
		for(Map.Entry<String,Integer> entry:entryList)
		{
			if(entry.getValue()==maxRun)
			{
				System.out.print("   : " +entry.getKey());
				
			}
		}
		System.out.println();
		
		//Step7: find player with min runs
		int  minRun=entryList.get(entryList.size()-1).getValue();// first value is min value
		System.out.print("Lowest runs are "+minRun +"  and scored by ");
		
		for(Map.Entry<String,Integer> entry:entryList)
		{
			if(entry.getValue()==minRun)
			{
				System.out.print("   : " +entry.getKey());
				
			}
		}
		System.out.println();
	}
}
			

