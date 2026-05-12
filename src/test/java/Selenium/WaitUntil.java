package Selenium;

import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import static org.openqa.selenium.support.ui.ExpectedConditions.*;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.JavascriptExecutor;

import utilities.WebSiteUtility;

public class WaitUntil  


{

	public static void main(String[] args)  throws Exception 
	
	{
		WebSiteUtility ws = new WebSiteUtility();
		WebDriver Abhi =ws.openBrowser("chrome");
		FluentWait<WebDriver> w=ws.defexpwait(Abhi, 20, 1000);
		ws.launSite(Abhi, "http://demos.telerik.com/aspnet-ajax/ajaxloadingpanel/functionality/"+"explicit-show-hide/defaultcs.aspx");
		//wDefine wait condition for calender
		w.until(visibilityOfElementLocated(By.xpath("//*[contains(@class,RadCalendar')]")));
		//Calendar to top
		WebElement e=Abhi.findElement(By.xpath("//*[contains(@class,'RadCalendar')]"));
		//get calaender
		((JavascriptExecutor) Abhi).executeScript("arguments[0].scrollIntoView();",e);
		//wait locate and click on day link
		
		w.until(elementToBeClickable(By.linkText("22"))).click();
		
		//Define wait condition for invisibility of loader spinner
		w.until(invisibilityOfElementLocated(By.className("raDiv")));
		
		ws.closeSite(Abhi);
		
	}

}
