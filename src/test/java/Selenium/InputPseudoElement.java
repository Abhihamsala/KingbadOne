package Selenium;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class InputPseudoElement {

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
		List<WebElement> l=Abhi.findElements(By.xpath("//*"));
		List<WebElement> l1= new ArrayList<WebElement>();
		System.out.println("Count of Input Tags : "+l.size());
		for(WebElement e:l)
		{
		
		if (e.getCssValue("background-image").contains("url"))
		{
			l1.add(e);
		}
		
		}
		System.out.println(l1.size());
	}
}
