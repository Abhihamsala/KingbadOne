package Selenium;


import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazondynamicvaluePriceHighlight {

	public static void main(String[] args) throws Exception {
		
		int visibleelement = 0;
		int hiddenelement = 0;	
		
		  // TODO Auto-generated method stub
         WebDriver abhi = new ChromeDriver();
         
         abhi.get("https://www.amazon.in");
         Thread.sleep(5000);
         //enter dynamic value.
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter the Item Name : ");
         String item=sc.nextLine();
         sc.close();
         
         //Search for the product
         abhi.findElement(By.id("twotabsearchtextbox")).sendKeys(item);
         abhi.findElement(By.xpath("//input[@value='Go']")).click();
         //collect all elements
       List<WebElement> l1=abhi.findElements(By.xpath("//span [@class='a-price-whole']"));


        System.out.println("All results in first page is "+l1.size()); 
         // goto each image in that list
         for(WebElement e:l1)
         {
        	 if(e.isDisplayed())
        			 {
        		
        		 visibleelement++;
        		 JavascriptExecutor js =(JavascriptExecutor) abhi;
        		 js.executeScript("arguments[0].style.border='2px red dotted';",e);
        			 }
        	 else
       	  {
        		 hiddenelement++;
        		
       	        	   }
        	        	   
         }
      
          System.out.println("Visible Element Count :"+visibleelement); 
          System.out.println("Hidden Element count :"+hiddenelement); 
       
         //driver.close();
        // abhi.close();
        
}
}
