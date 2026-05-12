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

public class MapSortAsc {

	public static void main(String[] args) throws Exception
	{
		// create map using key value pair
		
	Map<String,Integer>	 m= new HashMap<>();
	m.put("Vikram",120);
	m.put("Vasavi",100);
	m.put("Abhi",130);
	m.put("Abhi",130);
	m.put("Vikram",120);
	m.put("Bharg",120);
	m.put("Vikram",120);
	m.put("Vasavi",100);
	
	//Step1: Convert hash map to list
	List<Map.Entry<String,Integer>> entrylist=new ArrayList<>(m.entrySet());
	
	//Step2 : Sort the list by keys in ascending order
	Collections.sort(entrylist,(e1,e2)->e1.getKey().compareTo(e2.getKey()));
	
	// Display the map (given entire are not in order
	
	for(Map.Entry<String,Integer> e:entrylist)
	{
		System.out.println(e.getKey() +":"+e.getValue());
	}
	}
	
}
