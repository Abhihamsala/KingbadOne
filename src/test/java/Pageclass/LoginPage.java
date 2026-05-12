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
import org.openqa.selenium.support.ui.ExpectedCondition;



public class LoginPage 
{

	//private properties
	@FindBy(id="login_field") private WebElement usernameField;
	@FindBy(id="password") private WebElement passwordField;
	@FindBy(xpath="//input[@value='Sign in']") private WebElement loginButton;
	@FindBy(xpath="//div[@role='alert']") private WebElement errorMsg;
	private WebDriver Abhi;
	private FluentWait<WebDriver> wait;
	
	//public constructor to initialize elements
	public LoginPage(WebDriver Abhi,FluentWait<WebDriver> wait)
	{
		this.Abhi=Abhi;
		this.wait=wait;
		PageFactory.initElements(Abhi,this); //for lazy initialization
	}
	//public methods
	public void enterUsername(String username)
	{
		wait.until(visibilityOf(usernameField));
		usernameField.clear();
		usernameField.sendKeys(username);
	}
	
	public void enterPassword(String password)
	{
		wait.until(visibilityOf(passwordField));
		passwordField.clear();
		passwordField.sendKeys(password);
	}
	
	public void clickLoginButton()
	{
		wait.until(elementToBeClickable(loginButton)).click();
	
	}
	public boolean isErrorMsgDisplayed() throws TimeoutException
	{
		Pattern P= Pattern.compile("Incorrect username or passowrd");
		wait.until(textMatches(errorMsg,P));
		return(true);
	}
	private Function textMatches(WebElement errorMsg2, Pattern p) {
		// TODO Auto-generated method stub
		return null;
	}
}
