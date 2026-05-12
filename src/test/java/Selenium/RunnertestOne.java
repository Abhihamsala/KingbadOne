package Selenium;

import java.util.regex.Pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.FluentWait;
import static org.openqa.selenium.support.ui.ExpectedConditions.*;
import org.openqa.selenium.support.ui.ExpectedCondition;

import Pageclass.LoginPage;
import utilities.WebSiteUtility;

public class RunnertestOne {

	public static void main(String[] args) throws Exception
	{
		// TODO Auto-generated method stub
		WebSiteUtility ws = new WebSiteUtility();
		WebDriver Abhi=ws.openBrowser("Chrome");
		FluentWait<WebDriver> wait=ws.defexpwait(Abhi, 30, 1000);
		ws.launSite(Abhi,"https://github.com/login");
		//create an object to page class
		LoginPage lp=new LoginPage(Abhi,wait);
		//Do login with Wrong details
		lp.enterUsername("amod");
		lp.enterPassword("123");
		lp.clickLoginButton();
		if(lp.isErrorMsgDisplayed())
		{
			System.out.println("Test Passed for wrong data");
		}
		
		//Do relogin with correct details.
		lp.enterUsername("kalamgit143");
		lp.enterPassword("Magnitia@263264");
		lp.clickLoginButton();
		

	}

}
