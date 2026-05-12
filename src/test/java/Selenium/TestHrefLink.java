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

public class TestHrefLink {

	public static void main(String[] args) throws Exception {
		
		  // TODO Auto-generated method stub
         WebDriver abhi = new ChromeDriver();
         
         abhi.get("https://www.w3schools.com");
         Thread.sleep(5000);
         //collect all elements
        List<WebElement> l1=abhi.findElements(By.xpath("//*"));
        
        List<WebElement> l2 =new ArrayList<WebElement>();
     // goto each element in that list
         for(WebElement e:l1)
         {
        	 if(e.getAttribute("href")!=null)//element has href attribute
        			 {
        		 l2.add(e);
        		 JavascriptExecutor js =(JavascriptExecutor) abhi;
        		 js.executeScript("arguments[0].style.border ='4px red dotted';", e);
        	 }
         }
         System.out.println(l1.size()); 
         System.out.println(l2.size()); 
         //driver.close();
        // abhi.close();
        
}
}
