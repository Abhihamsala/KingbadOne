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

public class IPhonesourcepathcount {

	public static void main(String[] args) throws Exception {
		
		int index = 0;
		int hd = 0;	
		
		  // TODO Auto-generated method stub
         WebDriver abhi = new ChromeDriver();
         
         abhi.get("https://www.amazon.in");
         Thread.sleep(5000);
         
         //Search for the product
         abhi.findElement(By.id("twotabsearchtextbox")).sendKeys("Iphone");
         abhi.findElement(By.xpath("//input[@value='Go']")).click();
         //collect all elements
        List<WebElement> l1=abhi.findElements(By.xpath("//img"));
        
         // goto each image in that list
         for(WebElement e:l1)
         {
        	 if(e.isDisplayed())
        			 {
        		 index++;
        		 System.out.println(index+" : " +e.getAttribute("src"));
        		
        	        	   }
         }
        
          System.out.println("Visible src count :"+index); 
       // System.out.println("Hidden image count :"+hd); 
       
         //driver.close();
        // abhi.close();
        
}
}
