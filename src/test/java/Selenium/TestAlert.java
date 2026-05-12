package Selenium;


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.Alert;
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

public class TestAlert {

	public static void main(String[] args) throws Exception {
		
		  // TODO Auto-generated method stub
         WebDriver abhi = new ChromeDriver();
         abhi.manage().window().maximize();
         abhi.get("https://www.javatpoint.com/oprweb/test.jsp?filename=javascript-alert1");
         Thread.sleep(5000);
         //Switch to frame
         abhi.switchTo().frame("iframewrapper");
         //click on a button to get a web alert
         abhi.findElement(By.xpath("//input[@value='Click me']")).click();
         Thread.sleep(10000);
         //switch to alert
         Alert al=abhi.switchTo().alert();
 
         String x=al.getText();
         System.out.println(x);
         al.dismiss();
         //back to page
         abhi.switchTo().defaultContent();
}
}