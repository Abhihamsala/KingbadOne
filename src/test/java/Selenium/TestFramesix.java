package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class TestFramesix {

	public static void main(String[] args) throws Exception 
	{
		  // TODO Auto-generated method stub
        WebDriver abhi = new ChromeDriver();
        abhi.get("https://chercher.tech/pratice/frames");
        Thread.sleep(5000);
       
        abhi.switchTo().frame(0);//2 frame in page source
        //fill fields and submit
        abhi.findElement(By.xpath("//b[@id='topic']/following-sibling::input")).sendKeys("Abdul Kalam Sir");
        Thread.sleep(5000);
        abhi.switchTo().defaultContent();//back to the page
	}

}
