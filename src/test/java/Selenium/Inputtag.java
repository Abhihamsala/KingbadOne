package Selenium;

import java.util.List;
import java.util.Scanner;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Inputtag {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		//open browser
		WebDriver Abhi=new ChromeDriver();
		Abhi.manage().window().maximize();
		//launch site
		Abhi.get("http://www.amazon.in");
		Thread.sleep(6000);
		
		//segrate various type of Input tag
		List<WebElement> l=Abhi.findElements(By.tagName("input"));
		int rbc=0 ,chc=0,pbc=0,tbc=0,cbc=0,others=0;
		for(WebElement e:l)
		{
			String x=e.getAttribute("type");
			
			if(x.equals("text"))
			{
				tbc++;
			}
			else if(x.equals("radio"))
			{
				rbc++;
			}
			else if(x.equals("checkbox"))
			{
				cbc++;
			}
			else if(x.equals("password"))
			{
				pbc++;
			}
			else
			{
				others++;
			}
			
		}
		
		System.out.println("Text boxes count is "+tbc);
		System.out.println("Radio boxes count is "+rbc);
		System.out.println("Checkbox count is "+cbc);
		System.out.println("Password count is "+pbc);
		System.out.println("Other count is "+others);
		//close site
		//Abhi.close();
	}
	

}
