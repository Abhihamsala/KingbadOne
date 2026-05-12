package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestFrameTwo {

	public static void main(String[] args) throws Exception 
	{
		  // TODO Auto-generated method stub
        WebDriver abhi = new ChromeDriver();
        abhi.get("https://the-internet.herokuapp.com/iframe");
        Thread.sleep(5000);
        abhi.switchTo().frame(0);
        String x= abhi.findElement(By.tagName("p")).getText();
        System.out.println(x);
        abhi.switchTo().defaultContent();
	}

}
