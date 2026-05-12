package Pageclass;

import org.openqa.selenium.WebDriver;
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



public class GooglesearchPage 
{

	//Rule 1: private properties driver and wait object
	private WebDriver Abhi;
	private FluentWait<WebDriver> wait;
	@FindBy(name="q") private WebElement searchBox;
		
	//Rule 2: public constructor to initialize elements
	public GooglesearchPage(WebDriver Abhi,FluentWait<WebDriver> wait)
	{
		this.Abhi=Abhi;
		this.wait=wait;
		PageFactory.initElements(Abhi,this); //for lazy initialization
	}
	//Rule 3 : public methods for operation element
	public void fillSearchBox(String value)
	{
		wait.until(visibilityOf(searchBox)).sendKeys(value,Keys.ENTER);
	    }
	
	
	//Rule 4 : public methods for Observe element
	public boolean VerifySearchBoxMaxLength(long expected)
	{
		String temp=wait.until(visibilityOf(searchBox)).getAttribute("maxlength");
		long actual=Long.parseLong(temp);
		if(expected==actual)
		{
			return(true);
				}
		else
		{
			return(false);
		}
	    
	}
	
	
	
	}

