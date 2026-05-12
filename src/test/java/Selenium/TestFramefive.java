package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestFramefive {

	public static void main(String[] args) throws Exception 
	{
		  // TODO Auto-generated method stub
        WebDriver abhi = new ChromeDriver();
        abhi.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_form_submit");
        Thread.sleep(5000);
        WebElement f=abhi.findElement(By.xpath("//div[@id='iframe']/descendant::iframe"));
        abhi.switchTo().frame(f);//2 frame in page source
        //fill fields and submit
        
        abhi.findElement(By.name("fname")).clear();
        abhi.findElement(By.name("fname")).sendKeys("kalam");
        Thread.sleep(5000);
        abhi.findElement(By.name("lname")).clear();
        abhi.findElement(By.name("lname")).sendKeys("kalam sir");
        Thread.sleep(5000);
        abhi.findElement(By.xpath("//input[@value='Submit']")).click();
        Thread.sleep(5000);
        abhi.switchTo().defaultContent();//back to the page
	}

}
