package Selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gethandle2 {

	public static void main(String[] args) throws Exception 
	
	{
		     // TODO Auto-generated method stub
              WebDriver driver =new ChromeDriver();//open browser
              driver.get("http://www.w3schools.com");//launch site
              Thread.sleep(5000); //compiler is silence using throws
              driver.findElement(By.linkText("Try it Yourself")).click();
              Thread.sleep(5000);
              //get windows handle ID of all browser windows /tab
              Set<String> x=driver.getWindowHandles();
              System.out.println(x); 
              //close 1st tab
              driver.close();
              driver.manage();
	}
}