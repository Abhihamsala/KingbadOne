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

public class MapExample3 {

	public static void main(String[] args) throws Exception
	{
		// create map using key value pair
		
	Map<String,Integer>	 m= new HashMap<>();
	m.put("Vikram",120);
	m.put("Vasavi",100);
	m.put("Abhi",130);
	m.put("Abhi",130);
	m.put("Vikram",120);
	m.put("Murali",120);
	m.put("Vikram",120);
	m.put("Vasavi",100);
	// Display the map (given entriw are not in order
	
	for(Map.Entry<String,Integer> e:m.entrySet())
	{
		System.out.println(e.getKey() +":"+e.getValue());
	}
	}
	
}
