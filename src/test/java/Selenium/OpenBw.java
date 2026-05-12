package Selenium;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenBw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Browser name");
		String bn=sc.nextLine();
		WebDriver driver=null;
		if(bn.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();
		}
		else if (bn.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
		}
		else if (bn.equalsIgnoreCase("edge"))
		{
			driver=new EdgeDriver();
		}
		else
		{
			System.out.println("check browser name");
			System.exit(0);// Forcedly stop execution
		}
		
		//Launch site
		driver.get("https://www.google.co.in");
			
	}
}
