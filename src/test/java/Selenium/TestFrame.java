package Selenium;


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestFrame {

	public static void main(String[] args) throws Exception {
		
		  // TODO Auto-generated method stub
         WebDriver abhi = new ChromeDriver();
         
         abhi.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_input_test");
         Thread.sleep(5000);
         abhi.switchTo().frame("iframeResult");
         abhi.findElement(By.id("fname")).sendKeys("abdul");
         abhi.findElement(By.id("lname")).sendKeys("kalam");
         Thread.sleep(5000);
         abhi.findElement(By.xpath("//*[@value='Submit']")).click();
}
}
