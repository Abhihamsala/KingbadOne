package Selenium;



import java.io.File;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.FluentWait;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;
import ru.yandex.qatools.ashot.shooting.ShootingStrategy;



import org.openqa.selenium.support.ui.ExpectedConditions;


import utilities.WebSiteUtility;

public class Ashotone {



	public static void main(String[] args) throws Exception
	{
		// TODO Auto-generated method stub
		WebSiteUtility ws = new WebSiteUtility();
		System.setProperty("webdriver.chrome.logfile","target\\TestlogDec40.txt");
		WebDriver Abhi=ws.openBrowser("Chrome");
		FluentWait<WebDriver> wait=ws.defexpwait(Abhi, 30, 1000);
		ws.launSite(Abhi,"https://semantic-ui.com/modules/dropdown.html");
		Thread.sleep(5000);
		//take visible area screenshot of page.
		File dest1= new File("target\\visibleareashot.png");
		File src1= ((RemoteWebDriver) Abhi).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src1, dest1);
		Thread.sleep(6000);
		//take full page screenshot by scrolling using Ashot
		AShot as =new AShot();
		ShootingStrategy shs=ShootingStrategies.viewportPasting(1000); //1  second delay
		Screenshot ss=as.shootingStrategy(shs).takeScreenshot(Abhi);
		File dest2=new File("target\\entirepageshot.png");
		ImageIO.write(ss.getImage(),"PNG",dest2);
		}
	
	}		
			
		
		



