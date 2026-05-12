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

public class FlipkartpagenationPgNo {

	public static void main(String[] args) throws Exception {

		
		  // TODO Auto-generated method stub
         WebDriver abhi = new ChromeDriver();
         
         abhi.get("https://www.flipkart.com");
         Thread.sleep(3000);
         //close banner if exist
         try
         {
        	 abhi.findElement(By.xpath("//span[@role='button']")).click();
         }
         catch(Exception ex)
         {
        	 System.out.println("No banner exist");
         }
         //enter dynamic value.
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter the Item Name : ");
         String item=sc.nextLine();
         sc.close();
         
         //Search for the product
         abhi.findElement(By.name("q")).sendKeys(item);
         abhi.findElement(By.xpath("//*[name()='svg']/parent::button")).click();
         Thread.sleep(3000);
         int  index=0;
         int totalcount=0;
         Thread.sleep(3000);
         int  pn=2;
           
         while(true)//infinite loop for paginations
         {
        //collect all elements in each page
         List<WebElement> l1=abhi.findElements(By.xpath("//div[contains(@data-tkid,'SEARCH')]"));
         int pagecount=l1.size();
         totalcount=totalcount+pagecount;
         index++;
        
        System.out.println("Page No "+ index + " : Count of item in each page  :"+pagecount); 
         
        try
         {
        	
			abhi.findElement(By.linkText(""+pn)).click();
        	Thread.sleep(3000);
         }
        
        catch(Exception ex)
         {
            break;//terminate from loop	when next link disable       	   
          }
 
         
    
    	}

         System.out.println("Total Results in All pages  :"+totalcount); 
        
}
}

