package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestFramefour {

	public static void main(String[] args) throws Exception 
	{
		  // TODO Auto-generated method stub
        WebDriver abhi = new ChromeDriver();
        abhi.get("http://www.maths.surrey.ac.uk/explore/nigelspages/frame2.htm");
        Thread.sleep(5000);
        abhi.switchTo().frame(0);
        abhi.findElement(By.partialLinkText("Background")).click();
        abhi.switchTo().defaultContent();
        Thread.sleep(5000);
        abhi.switchTo().frame(1);
        abhi.findElement(By.name("update")).click();
        abhi.switchTo().defaultContent();
        Thread.sleep(5000);
        abhi.switchTo().frame(2);
        abhi.findElement(By.xpath("(//a[normalize-space()='TRY CODING'])[1]")).click();
        abhi.switchTo().defaultContent();
        Thread.sleep(5000);
	}
	}

