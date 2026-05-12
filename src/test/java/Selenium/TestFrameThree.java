package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestFrameThree {

	public static void main(String[] args) throws Exception 
	{
		  // TODO Auto-generated method stub
        WebDriver abhi = new ChromeDriver();
        abhi.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_input_type_file");
        Thread.sleep(5000);
        abhi.switchTo().frame("iframeResult");
        //fill fields and submit
        abhi.findElement(By.xpath("(//input[@type='file'])[1]")).sendKeys("C:\\Users\\bharg\\OneDrive\\Desktop\\bhargava.jpg");
        abhi.findElement(By.xpath("(//input[@type='submit'])[1]")).click();
        Thread.sleep(5000);
        abhi.switchTo().defaultContent();//back to the page
	}

}
