package Selenium;

import java.util.Scanner;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CricbuzzNamerun {

	public static void main(String[] args) throws Exception 
	
	{
		//Select your batman number
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Match URL :");
		String URL= sc.nextLine();
		System.out.println("Enter Innings Number  :");
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
		  
	
	 try
	 {
		 String tempone=Abhi.findElement(By.xpath("(//div[@id='innings_"+INN+"']//div[contains(@class,'cb-col cb-col-33') and text()!='']/following-sibling::div[contains(@class,'text-right text-bold')])["+pos+"]")).getText();
	     String temp=Abhi.findElement(By.xpath("(//div[@id='innings_"+INN+"'and @class='ng-scope']//div[contains(@class,'cb-col cb-col-25 ')]/child::a[contains(@title,'View profile of ')])["+pos+"]")).getText();
	     int run=Integer.parseInt(tempone);  //type conversation
		System.out.println("Name : "+temp+" Runs : "+tempone);	
	 }
	 catch(Exception ex)
	 {
		 if(pos==1)
		 {
			 System.out.println(pos+" st postion player didnot bat");
		 }
		 else if(pos==2)
		 {
			 System.out.println(pos+" nd postion player didnot bat");
		 }
		 else if(pos==3)
		 {
			 System.out.println(pos+" nd postion player didnot bat");
		 }
		 else if(pos==4)
		 {
			 System.out.println(pos+" nd postion player didnot bat");
		 }
		 else if(pos==5)
		 {
			 System.out.println(pos+" nd postion player didnot bat");
		 }
		 else if(pos==6)
		 {
			 System.out.println(pos+" nd postion player didnot bat");
		 }
		 else if(pos==7)
		 {
			 System.out.println(pos+" nd postion player didnot bat");
		 }
		 else if(pos==8)
		 {
			 System.out.println(pos+" nd postion player didnot bat");
		 }
		 else
		 {
		 System.out.println(pos+" :No such batman exist");
		 }
	 }
		Thread.sleep(30000);
	    //Abhi.close();
	    //WebElement tempone=Abhi.findElement(By.xpath("//div[contains(@class,'cb-col cb-col-25 ')]/a[@class='cb-text-link']"));
		//System.out.println("tempone");
	}

}
