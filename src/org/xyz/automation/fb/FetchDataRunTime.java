package org.xyz.automation.fb;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FetchDataRunTime

{
	WebDriver driver;
	
	@Test
	public void lunchBrowser() throws Exception
	{
		WebDriverManager.chromedriver().setup();
	    driver= new ChromeDriver(); //lunch chromedriver
	    String ExpURL= "https://www.facebook.com/";
	    driver.get(ExpURL);
		driver.manage().window().maximize();
		
		
		String ActURL=driver.getCurrentUrl();
		System.out.println(ActURL);
	    //Assert.assertEquals(ActURL,ExpURL);
		SoftAssert sa=new SoftAssert();
		sa.assertEquals(ActURL,ExpURL);
		
		String ExpTitle= "Facebook - log in or sign up";
		String ActTitle=driver.getTitle();
		System.out.println(ActTitle);
		sa.assertEquals(ActTitle, ExpTitle);
		
		String ExpUname="Email or phone number";
		String ActUname=driver.findElement(By.id("email")).getAttribute("placeholder");
		System.out.println(ActUname);
		sa.assertEquals(ActUname, ExpUname);
		
		String ExpLogin="Log In";
		String ActLogin=driver.findElement(By.name("login")).getText();
		System.out.println(ActLogin);
		sa.assertEquals(ActLogin, ExpLogin);
		
		Point loclogin=driver.findElement(By.name("login")).getLocation();
		System.out.println(loclogin);
		//System.out.println(driver.getPageSource());		
		
		boolean logEnab=driver.findElement(By.name("login")).isEnabled();
		System.out.println(logEnab);
		sa.assertEquals(logEnab, true);
				
		driver.quit();
		sa.assertAll();
	}
	
	
	
}
