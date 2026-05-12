package Selenium;


import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestFindelements {

	public static void main(String[] args) throws Exception {
		
		  // TODO Auto-generated method stub
         WebDriver abhi = new ChromeDriver();
         
         abhi.get("https://google.com");
         Thread.sleep(5000);
         //collect elements
        List<WebElement> l=abhi.findElements(By.xpath("//a"));
       System.out.println(l.size()); 
         List<WebElement> l1=abhi.findElements(By.xpath("//href"));
         System.out.println(l1.size()); 
         //driver.close();
         abhi.close();
        
}
}
