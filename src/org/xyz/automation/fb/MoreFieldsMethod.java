package org.xyz.automation.fb;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MoreFieldsMethod

{
	WebDriver driver;
	
	@Test
	public void handleKeyboard() throws Exception
	{
		WebDriverManager.chromedriver().setup();
	    driver= new ChromeDriver(); //lunch chromedriver
		
		driver.navigate().to("https://www.facebook.com/");
		
		Actions act=new Actions(driver);
		act.sendKeys("user1").perform();
		
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).perform();
		act.sendKeys("user2").perform();
		act.sendKeys(Keys.TAB).perform();   //After every keys we should be put PERFORM and test working
		act.sendKeys("pass1").perform();
		act.sendKeys(Keys.ENTER).perform();
		
		
	}
	
	
	
}
