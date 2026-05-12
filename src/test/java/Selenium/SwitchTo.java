package Selenium;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo {

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
              //switch to 2nd tab
              List<String> l=new ArrayList<String>(x);
              driver.switchTo().window(l.get(1));
              Thread.sleep(5000);
              //close 2nd tab
              driver.close();
              driver.quit();
	}
}