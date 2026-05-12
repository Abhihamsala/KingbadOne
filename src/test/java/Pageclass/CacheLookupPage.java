package Pageclass;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.FluentWait;
import static org.openqa.selenium.support.ui.ExpectedConditions.*;

import java.util.concurrent.TimeoutException;
import java.util.function.Function;
import java.util.regex.Pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedCondition;

public class CacheLookupPage {

	

		// TODO Auto-generated method stub
		private WebDriver Abhi;
		private FluentWait<WebDriver> wait;
		@FindBy(name="q") private WebElement searchBox;
		@FindBy(linkText="Gmail") private WebElement mylink1;
		@FindBy(linkText="Gmail") @CacheLookup private WebElement mylink2;
		
		//Rule 2: public constructor to initialize elements
		
		public CacheLookupPage(WebDriver Abhi, FluentWait<WebDriver> wait) 
		{
			// TODO Auto-generated constructor stub
			this.Abhi=Abhi;
			this.wait=wait;
			PageFactory.initElements(Abhi,this); //for lazy initialization
		}

		
		//Rule 3 : public methods for operation element
		public void fillSearchBox(String value)
		{
			wait.until(visibilityOf(searchBox)).sendKeys(value,Keys.ENTER);
		    }
		
		public long getTimeWithoutCachelookup()
		{
			long x=System.currentTimeMillis();
			for (int i=1;i<=1000;i++)
			{
				wait.until(visibilityOf(mylink1)).getText();
				
			}
			long y=System.currentTimeMillis();
			return((y-x)/1000);
		}
		public long getTimeWithCachelookup()
		{
			long x=System.currentTimeMillis();
			for (int i=1;i<=1000;i++)
			{
				wait.until(visibilityOf(mylink1)).getText();
				
			}
			long y=System.currentTimeMillis();
			return((y-x)/1000);
		}
	}


