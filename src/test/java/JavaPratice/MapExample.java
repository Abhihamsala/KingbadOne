package JavaPratice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import utilities.WebSiteUtility;

public class MapExample {

	public static void main(String[] args) throws Exception
	{
		// TODO Auto-generated method stub
		
		WebSiteUtility ws = new WebSiteUtility();
		System.setProperty("webdriver.chrome.logfile","target\\TestlogJan31.txt");
		WebDriver Abhi=ws.openBrowser("Chrome");
		FluentWait<WebDriver> wait=ws.defexpwait(Abhi, 30, 1000);
		ws.launSite(Abhi,"https://www.espncricinfo.com/series/west-indies-in-australia-2023-24-1375837/australia-vs-west-indies-2nd-t20i-1375851/full-scorecard");
		Thread.sleep(3000);
		//locate scorecard table
		List<WebElement> batsmen =wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("(//table[contains(@class,'scorecard-table')])[1]/tbody/tr[count(td)=8 or count(td)=9]")));
		//goto each batman name and runs
		Map<String,Integer> m= new HashMap<>();
		for (WebElement batsman:batsmen)
		{
			String name=batsman.findElement(By.xpath("child::td[1]")).getText();
			String temp=batsman.findElement(By.xpath("child::td[3]")).getText();
			int runs=Integer.parseInt(temp);
			m.put(name, runs);// insert into map
		}
		//ws.closeSite(Abhi);
		// print map
		for(Map.Entry<String,Integer> entry:m.entrySet())
		{
			System.out.println(" Name : " +entry.getKey() + "Scored : " +entry.getValue());
			
		}
		
	}

}
