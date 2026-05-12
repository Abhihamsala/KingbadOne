package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate1 {

	public static void main(String[] args) throws Exception 
	{
		// TODO Auto-generated method stub
			WebDriver driver =new ChromeDriver();
			driver.get("http://www.w3schools.com");
			Thread.sleep(5000);
			//goto other site
			driver.navigate().to("http://wwww.facebook.com");
			Thread.sleep(6000);
			//back to previous site
			driver.navigate().back();
			Thread.sleep(6000);
			//forward
			driver.navigate().forward();
			Thread.sleep(5000);
			//refresh
			driver.navigate().refresh();
			By.ByName.name(null);
			
	}
	
}
