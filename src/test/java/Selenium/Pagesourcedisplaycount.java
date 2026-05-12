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

public class Pagesourcedisplaycount {

	public static void main(String[] args) throws Exception {
		
		int ve = 0;
		int he = 0;	
		
		  // TODO Auto-generated method stub
         WebDriver abhi = new ChromeDriver();
         
         abhi.get("https://www.amazon.in");
         Thread.sleep(5000);
         
         //Search for the product
         abhi.findElement(By.id("twotabsearchtextbox")).sendKeys("Iphone");
         abhi.findElement(By.xpath("//input[@value='Go']")).click();
         //collect all elements
        List<WebElement> l1=abhi.findElements(By.xpath("//button[@class='a-button-text' and text()='Add to cart']"));
        
         // goto each image in that list
         for(WebElement e:l1)
         {
        	 if(e.isDisplayed())
        			 {
        		
        	ve++;
        			 }
        	 else
       	  {
       		 he++;
       	        	   }
        	        	   
         }
        
          System.out.println("Visible src count :"+ve); 
          System.out.println("Hidden image count :"+he); 
       
         //driver.close();
        // abhi.close();
        
}
}
