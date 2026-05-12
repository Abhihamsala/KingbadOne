package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getmethod {

	public static void main(String[] args) throws Exception 
	
	{
		// TODO Auto-generated method stub
              WebDriver driver =new ChromeDriver();//open browser
              driver.get("http://www.google.co.in");//launch site
              Thread.sleep(5000); //compiler is silence using throws
              String x=driver.getTitle();//get title of the page
              String y=driver.getPageSource();//get source code of page
              System.out.println("Title is :"+ x);
              System.out.println("Source is :"+ y);
              driver.close();
	}

}
