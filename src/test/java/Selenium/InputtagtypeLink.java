package Selenium;

import java.util.List;
import java.util.Scanner;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class InputtagtypeLink {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		//open browser
		WebDriver Abhi=new ChromeDriver();
		Abhi.manage().window().maximize();
		//launch site
		Abhi.get("https://my.aidaform.com/signup");
		Thread.sleep(6000);
		
		//segrate various type of Input tag
	//	List<WebElement> l=Abhi.findElements(By.xpath("//input[@type='button' or @type='submit']"));
		List<WebElement> l=Abhi.findElements(By.xpath("(//a)|(//link)"));
		System.out.println("Count of Input Tags : "+l.size());
		for(WebElement e:l)
		{
			String x=e.getAttribute("type");
			System.out.println(x);
				}
		
		//close site
		//Abhi.close();
	}
	

}
