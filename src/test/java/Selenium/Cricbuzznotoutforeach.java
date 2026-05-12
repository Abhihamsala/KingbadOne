package Selenium;

import java.util.List;
import java.util.Scanner;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cricbuzznotoutforeach {

	

	public static void main(String[] args) throws Exception 
	
	{
		//Select your batman number
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Match URL :");
		String URL= sc.nextLine();
		System.out.println("Enter Innings Number 1 or 2 :");
		int INN= sc.nextInt();
		System.out.println("Enter batman postion  :");
		int pos = sc.nextInt();
		sc.close();
		if(pos>10 ||INN>2)
		{
			System.out.println(INN+ " : Inning is not valid  "+ pos+" : is not avaiable postion to bat");
			System.exit(0);
		}
		//open browser
		WebDriver Abhi= new ChromeDriver();
		Abhi.manage().window().maximize();
		
		//launch site
		Abhi.get(URL);
		Thread.sleep(5000);

		//get batman Name
		//System.out.println(temp);
		//get batman Name
		//String tempone=Abhi.findElement(By.xpath("(//div[contains(@class,'cb-col cb-col-33')]/following-sibling::div[contains(@class,'text-right text-bold') and text()!='R'])["+pos+"]")).getText();
		  
			 
	     String temp=Abhi.findElement(By.xpath("(//div[@id='innings_"+INN+"'and @class='ng-scope']//div[contains(@class,'cb-col cb-col-25 ')]/child::a[contains(@title,'View profile of ')])["+pos+"]")).getText();
	     String tempone=Abhi.findElement(By.xpath("(//div[@id='innings_"+INN+"']//div[contains(@class,'cb-col cb-col-33') and text()!='']/following-sibling::div[contains(@class,'text-right text-bold')])["+pos+"]")).getText();
	    
	     Thread.sleep(5000);
	     int run=Integer.parseInt(tempone);  //type conversation
		 System.out.println("Name : "+temp+" Runs : "+tempone);	
		 System.out.println("******************************************************************");	
		
		 List<WebElement>noele=Abhi.findElements(By.xpath("//div[@id='innings_"+INN+"'and @class='ng-scope']//*[text()='not out']"));
		 
		 for(WebElement noe:noele)
		 {
			 WebElement nobname=noe.findElement(By.xpath("preceding::div[1]"));
			 String nobrun=noe.findElement(By.xpath("following::div[1]")).getText();
			 System.out.println("Name : "+nobname.getText()+" Runs : "+nobrun);
			
		 }
		 System.out.println("******************************************************************");	
	
	}

}
