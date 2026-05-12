package Selenium;


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import utilities.WebSiteUtility;

public class TestShadowDom2Error3 {

	public static void main(String[] args) throws Exception {
		
		WebSiteUtility ws = new WebSiteUtility();
	//	System.setProperty("webdriver.chrome.logfile","target\\TestlogJan5.txt");
		WebDriver Abhi=ws.openBrowser("Chrome");
		FluentWait<WebDriver> wait=ws.defexpwait(Abhi, 30, 1000);
		ws.launSite(Abhi,"chrome://settings/");
		Thread.sleep(5000);
		//this Element  is inside of nested shadow DOM
		wait.until(ExpectedConditions.visibilityOfElementLocated(
				       By.tagName("settings-ui")))  // goto shadow host
		              .getShadowRoot() //go to shadow root
		              .findElement(By.id("toolbar"))// goto shadow host
		              .getShadowRoot() //go to shadow root
		              .findElement(By.id("search"))// goto shadow host
		              .getShadowRoot() //go to shadow root
		              .findElement(By.id("searchInput")).sendKeys("abdulkalam");//operate  go to and fill target element
		
		//Passed scenario org.openqa.selenium.TimeoutException target element in shadow dom
}
}
