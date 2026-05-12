package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getmethod2 {

	public static void main(String[] args) throws Exception 
	
	{
		// TODO Auto-generated method stub
              WebDriver driver =new ChromeDriver();//open browser
              driver.get("http://www.sentia.in");//launch site
              Thread.sleep(5000); //compiler is silence using throws
              String x=driver.getTitle();//get title of the page
              System.out.println("Title is :"+ x);
            
              String z=driver.getCurrentUrl();
              System.out.println("Current URL  is :"+ z);
           // *  if(z.startsWith("https"))
            //  {
            //	  System.out.println("Secured site");
           //   }
           //   else
           //   {
            //	  System.out.println("Not secured site");
            //  }*//
              
                       // driver.close();//close browser
	}

}
