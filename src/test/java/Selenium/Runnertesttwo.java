package Selenium;

import java.util.regex.Pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.FluentWait;
import static org.openqa.selenium.support.ui.ExpectedConditions.*;
import org.openqa.selenium.support.ui.ExpectedCondition;

import Pageclass.GooglesearchPage;
import Pageclass.LoginPage;
import utilities.WebSiteUtility;

public class Runnertesttwo {

	public static void main(String[] args) throws Exception
	{
		// TODO Auto-generated method stub
		WebSiteUtility ws = new WebSiteUtility();
		WebDriver Abhi=ws.openBrowser("Chrome");
		FluentWait<WebDriver> wait=ws.defexpwait(Abhi, 30, 1000);
		ws.launSite(Abhi,"https://www.google.com");
		//create an object to page class
		GooglesearchPage Gp=new GooglesearchPage(Abhi,wait);
		//Do login with  details
		Gp.fillSearchBox("Bhargava");
		
	}

}
