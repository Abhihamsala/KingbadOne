package Selenium;


import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindElementmulttextbox {

	public static void main(String[] args) throws Exception {
		
		  // TODO Auto-generated method stub
         WebDriver abhi = new ChromeDriver();
         
         abhi.get("https://my.aidaform.com/signup");
         Thread.sleep(5000);
         //collect elements
         abhi.findElement(By.xpath("//input")).sendKeys("bhargava");
      
       //  abhi.close();
        
}
}
