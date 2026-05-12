package bhargavaGluetwo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.asserts.SoftAssert;
import org.openqa.selenium.remote.*;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.asserts.SoftAssert;

import utilities.WebSiteUtility;

public class stepDef2 extends BassClass
{
	  @When("I enter for {string} word in search box and hit ENTER key")
	public void methodSearch(String word) throws Exception
   {
	driver.findElement(By.name("q")).sendKeys(word,Keys.ENTER);
	Thread.sleep(5000);
         }
	 
	 @And ("endclose site")
	 public void methodclose()
	 {
	 ws.closeSite(driver);
	 }
}
	 
	