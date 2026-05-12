package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class TestScriptsTimeout {

	public static void main(String[] args) throws Exception 
	{
		  // TODO Auto-generated method stub
        WebDriver abhi = new ChromeDriver();
        //set javaScript code execution timeout
        Duration d=abhi.manage().timeouts().getScriptTimeout();
        System.out.println(d.getSeconds());//30 second
        abhi.manage().timeouts().scriptTimeout(Duration.ofMillis(30));
        abhi.get("https://www.gmail.com");
        WebElement e=abhi.findElement(By.name("identifier"));
        ((RemoteWebDriver) abhi).executeScript("arguments[0].style.border='5px red solid';",e);
       
	}
}
