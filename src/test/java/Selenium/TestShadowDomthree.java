package Selenium;


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestShadowDomthree {

	public static void main(String[] args) throws Exception {
		
		  // TODO Auto-generated method stub
         WebDriver abhi = new ChromeDriver();
         abhi.manage().window().maximize();
         abhi.get("https://selectorshub.com/xpath-practice-page/");
         Thread.sleep(5000);
       try
       {
    	   abhi.findElement(By.xpath("//img[@title='Close']")).click();
       }
     catch(Exception ex)
       {
    	 System.out.println("No Banner");
       }
       Thread.sleep(5000);
       //shadowdom closed
       WebElement shadowHostElement=abhi.findElement(By.id("userPass"));
       Thread.sleep(5000);
       shadowHostElement.click();
       Thread.sleep(5000);
       Actions act = new Actions(abhi);
       act.sendKeys(Keys.TAB,"Kalam").perform();
       Thread.sleep(5000);
}
}
