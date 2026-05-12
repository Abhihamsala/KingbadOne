package Selenium;


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testsvg {

	public static void main(String[] args) throws Exception {
		
		  // TODO Auto-generated method stub
         WebDriver abhi = new ChromeDriver();
         
         abhi.get("https://my.aidaform.com/signup");
         Thread.sleep(5000);
         abhi.findElement(By.name("nickname")).sendKeys("abdulkalam");
         abhi.findElement(By.name("email")).sendKeys("apj23@abdulKalam.com");
         abhi.findElement(By.name("password")).sendKeys("KingabdulKalam.com");
         abhi.findElement(By.name("confirm")).sendKeys("KingabdulKalam.com");
         abhi.findElement(By.xpath("(//*[name()='svg'])[4]")).click();
         abhi.findElement(By.xpath("//*[contains(text(),'My Free')]")).click();
}
}
