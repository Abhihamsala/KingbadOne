package Selenium;
import io.github.bonigarcia.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//download latest chrome Driver software
	//	ChromeOptions co=new ChromeOptions();
	//	co.setBinary("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe");
     //   WebDriverManager.chromedriver().setup();
    //    ChromeDriver driver= new ChromeDriver(co);
        
        
     //   WebDriverManager.chromedriver().setup();
     //   ChromeDriver driver= new ChromeDriver();
		//  EdgeDriver driver= new EdgeDriver();
		  
		          EdgeOptions eo=new EdgeOptions();
			      eo.setBinary("C:\\Program Files (x86)\\Microsoft\\Edge\\Application\\msedge.exe");
		          WebDriverManager.edgedriver().setup();
		          EdgeDriver driver= new EdgeDriver(eo);
		  
	}

}
