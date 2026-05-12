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

public class TestShadowDom2Error {

	public static void main(String[] args) throws Exception {
		
		WebSiteUtility ws = new WebSiteUtility();
	//	System.setProperty("webdriver.chrome.logfile","target\\TestlogJan5.txt");
		WebDriver Abhi=ws.openBrowser("Chrome");
		FluentWait<WebDriver> wait=ws.defexpwait(Abhi, 30, 1000);
		ws.launSite(Abhi,"https://books-pwakit.appspot.com");
		//Element under a single shadow DOM
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("input"))).sendKeys("Abdul kalam ");
		
		//error org.openqa.selenium.TimeoutException target element in shadow dom
}
}
