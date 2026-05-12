package Selenium;


import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestImghiddencount {

	private static Object elseif;

	public static void main(String[] args) throws Exception {
		
		int vc = 0;
		int hd = 0;	
		
		  // TODO Auto-generated method stub
         WebDriver abhi = new ChromeDriver();
         
         abhi.get("https://www.amazon.in");
         Thread.sleep(5000);
         //collect all elements
        List<WebElement> l1=abhi.findElements(By.xpath("//img"));
        
         // goto each element in that list
         for(WebElement e:l1)
         {
        	 if(e.isDisplayed())
        			 {
        		 vc++;//increase by 1
        	
        			 }
        	 else
        	  {
        		 hd++;
        	        	   }
         }
        System.out.println("visible image count :"+vc); 
        System.out.println("Hidden image count :"+hd); 
       
         //driver.close();
        // abhi.close();
        
}
}
