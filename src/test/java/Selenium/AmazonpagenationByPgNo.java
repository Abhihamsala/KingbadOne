package Selenium;


import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonpagenationByPgNo {

	public static void main(String[] args) throws Exception {

		
		  // TODO Auto-generated method stub
         WebDriver abhi = new ChromeDriver();
         
         abhi.get("https://www.amazon.in");
         Thread.sleep(3000);
         //enter dynamic value.
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter the Item Name : ");
         String item=sc.nextLine();
         sc.close();
         
         //Search for the product
         abhi.findElement(By.id("twotabsearchtextbox")).sendKeys(item);
         abhi.findElement(By.xpath("//input[@value='Go']")).click();
         
         int  index=0;
         int totalcount=0;
         Thread.sleep(3000);
         int pn=1;
     

        
         while(true)
         {
        //collect all elements in each page
         List<WebElement> l1=abhi.findElements(By.xpath("//span[@class='a-price-whole']"));
         int pagecount=l1.size();
         totalcount=totalcount+pagecount;
         pn++;
        
         
         System.out.println("Page No "+ pn + " : Count of item in each page  :"+pagecount); 
         
        try
         {
        	abhi.findElement(By.linkText(""+pn)).click();
        	Thread.sleep(8000);
         }
        
        catch(Exception ex)
         {
            break;//terminate from loop	        	   
          }
 
         
    
    	}

         System.out.println("Total Results in All pages  :"+totalcount); 
        
}
}
//List<WebElement> l1=abhi.findElements(By.xpath("//div[@data-component-type='s-search-result']/descendant::span[@class='a-price']"));
//abhi.findElement(By.xpath("//a[text()='Next']")).click();
//abhi.findElement(By.xpath("//span[@class='a-list-item']")).click();


