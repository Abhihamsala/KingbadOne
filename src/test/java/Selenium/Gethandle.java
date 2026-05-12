package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gethandle {

	public static void main(String[] args) throws Exception 
	
	{
		// TODO Auto-generated method stub
              WebDriver driver =new ChromeDriver();//open browser
              driver.get("http://www.google.in");//launch site
              Thread.sleep(5000); //compiler is silence using throws
              String x=driver.getTitle();//get title of the page
              System.out.println("Title is :"+ x);
              String z=driver.getWindowHandle();
              System.out.println("Window Unque Number :"+ z);
        
	}

}
