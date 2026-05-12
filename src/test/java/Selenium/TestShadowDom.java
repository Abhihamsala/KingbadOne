package Selenium;


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestShadowDom {

	public static void main(String[] args) throws Exception {
		
		  // TODO Auto-generated method stub
         WebDriver abhi = new ChromeDriver();
         abhi.get("https://selectorshub.com/shadow-dom-in-iframe/");
         Thread.sleep(5000);
         abhi.switchTo().frame("pact");
         //target element inside single shodow Dom.
         WebElement shadowHostElement=abhi.findElement(By.id("Food Time"));
         SearchContext shadowRootelement=shadowHostElement.getShadowRoot();
         WebElement targetElement=shadowRootelement.findElement(By.className("food"));
          try
         {
            	targetElement.click(); 
         }
        
         catch(JavascriptException ex)
         {
        	 ((JavascriptExecutor) abhi).executeScript("arguments[0].click();",targetElement);
         }
}
}
