package bhargavaGluetwo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.asserts.SoftAssert;
import org.openqa.selenium.remote.*;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


import utilities.WebSiteUtility;

public class stepDef1 extends BassClass
{
	@Given("I open {string} browser")
	public void methodOpen(String bn) throws Exception
	{
		 System.out.println( "Browser Name  :  "+bn);
		 ws= new WebSiteUtility();
		driver=ws.openBrowser(bn);
				}

	@When ("I launch google site")
	public void methodLaunch()  throws Exception
	{
			ws.launSite(driver, x);//launch site
		   System.out.println( "Launch site :  "+x);
			}
	
	@Then("I should see {string}  titled page")
	public void methodTitle(String tt) 
	{
		String at = driver.getTitle();//get title of the page
	
	if(tt.equals(at))
		{
		  Reporter.log("GOOGLE Test Passed");
		  System.out.println("Browser Title is : "+ tt);
		}
		else
		{
			  Reporter.log("GOOGLE Test Failed");
			System.out.println("Browser Title is : "+ at);
		}
			}
}
	
