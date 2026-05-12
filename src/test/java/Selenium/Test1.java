package Selenium;


import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test1 {

	public static void main(String[] args) {
		

		 
		   WebDriverManager.edgedriver().setup();
           EdgeDriver obj=new EdgeDriver();
           obj.get("https://my.aidaform.com/signup");
	}
}
