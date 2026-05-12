package JavaPratice;

import java.util.ArrayList;
import java.util.Collections;
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

public class MapExample2 {

	public static void main(String[] args) throws Exception
	{
		// TODO Auto-generated method stub
		
	Map<String,Integer>	 playerRuns= new HashMap<>();
	playerRuns.put("Vikram",120);
	playerRuns.put("Vasavi",100);
	playerRuns.put("Abhi",130);
	playerRuns.put("Abhi",130);
	playerRuns.put("Vikram",120);
	playerRuns.put("Murali",120);
	playerRuns.put("Vikram",120);
	playerRuns.put("Vasavi",100);
	
	//Step 1 : convert hashMap to list of map entry.
	List<Map.Entry<String,Integer>> entryList= new ArrayList<>(playerRuns.entrySet());
	//Step 2 : Sort the  list by value in descending
	Collections.sort(entryList,(e1,e2)->e2.getValue().compareTo(e1.getValue()));
	//Find the player with the maximum runs and min runs
	int maxRuns=entryList.get(0).getValue(); // first value is max value
	for(Map.Entry<String,Integer> entry:entryList)
	{
		if (entry.getValue()==maxRuns)
		{
			System.out.print(entry.getKey()+" ");
		}
	}
	System.out.println();
	int minRuns=entryList.get(entryList.size()-1).getValue(); //last value in min value
	for(Map.Entry<String,Integer> entry:entryList)
	{
		if (entry.getValue()==minRuns)
		{
			System.out.print(entry.getKey()+" ");
		}
	}
	
	}
	

}
