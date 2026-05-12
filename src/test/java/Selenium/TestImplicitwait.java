package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestImplicitwait {

	public static void main(String[] args) throws Exception 
	{
		  // TODO Auto-generated method stub
        WebDriver abhi = new ChromeDriver();
        abhi.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_form_submit");
        //define implicit wait at top of the automation
        abhi.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));//300
        WebElement f=abhi.findElement(By.xpath("//div[@id='iframe']/descendant::iframe"));
        abhi.switchTo().frame(f);//2 frame in page source
        //fill fields and submit
        
        abhi.findElement(By.name("fname")).clear();
        abhi.findElement(By.name("fname")).sendKeys("kalam");
        
        abhi.findElement(By.name("lname")).clear();
        abhi.findElement(By.name("lname")).sendKeys("kalam sir");
        
        abhi.findElement(By.xpath("//input[@value='Submit']")).click();
      
        abhi.switchTo().defaultContent();//back to the page
        
       // abhi.close();
	}

}
