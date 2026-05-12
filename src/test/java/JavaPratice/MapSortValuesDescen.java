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

public class MapSortValuesDescen {

	public static void main(String[] args) throws Exception
	{
		// create map using key value pair
		
	Map<String,Integer>	 m= new HashMap<>();
	m.put("Vikram",120);
	m.put("Vasavi",100);
	m.put("Abhi",130);
	m.put("Abhi",130);
	m.put("Vikram",120);
	m.put("Murali",125);
	m.put("Vikram",110);
	m.put("Vasavi",100);
	
	//Step1: Convert hash map to list
	List<Map.Entry<String,Integer>> entrylist=new ArrayList<>(m.entrySet());
	
	//Step2 : Sort the list by keys in descending order
	Collections.sort(entrylist,(e1,e2)->e2.getValue().compareTo(e1.getValue()));
	
	// Display the sorted list  
	
	for(Map.Entry<String,Integer> entry:entrylist)
	{
		System.out.println(entry.getKey() +":"+entry.getValue());
	}
	
	
	// find the player with maximum run
	int  maxRun=entrylist.get(0).getValue();// first value is max value
	
	
	for(Map.Entry<String,Integer> entry:entrylist)
	{
		if(entry.getValue()==maxRun)
		{
			System.out.print( "Max runs scored by : " +entry.getKey());
			
		}
	}

	}
	
}
