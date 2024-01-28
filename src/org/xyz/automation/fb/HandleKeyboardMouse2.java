package org.xyz.automation.fb;

import java.util.Iterator;
import java.util.Set;

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

public class HandleKeyboardMouse2

{
	WebDriver driver;
	
	@Test
	public void handleFrames() throws Exception
	{
		//WebDriverManager.chromedriver().setup();
	    driver= new ChromeDriver(); //lunch chromedriver
		
		//driver.navigate().to("https://www.facebook.com/");
		driver.navigate().to("https://demoqa.com/frames");
		System.out.println(driver.findElement(By.xpath("//*[contains(text(),'Sample Iframe')]")).getText());
		driver.switchTo().frame("frame1");
		System.out.println(driver.findElement(By.xpath("//*[contains(text(),'This is a sample page')]")).getText());
		
		CaptureScreenshot.screenshotresults(driver,"handleFrames");
	}
	
	@Test
	public void handleAlerts() throws Exception
	{
		//WebDriverManager.chromedriver().setup();
	    driver= new ChromeDriver(); //lunch chromedriver
		
		//driver.navigate().to("https://www.facebook.com/");
		driver.navigate().to("https://mail.rediff.com/cgi-bin/login.cgi");
		CaptureScreenshot.screenshotresults(driver,"handleAlerts_1");
		driver.findElement(By.className("signinbtn")).click();
		driver.switchTo().alert().accept();
		CaptureScreenshot.screenshotresults(driver,"handleAlerts_2");
	}
	
	
	@Test(enabled=false)
	public void handleMouse() throws Exception
	{
		WebDriverManager.chromedriver().setup();
	    driver= new ChromeDriver(); //lunch chromedriver
		
		//driver.navigate().to("https://www.facebook.com/");
		driver.navigate().to("https://www.mphasis.com/home.html");
		
		Actions act=new Actions(driver);
		//act.click(driver.findElement(By.xpath("//a[text()='Our Approach']"))).perform();
		
		//act.doubleClick(driver.findElement(By.xpath("//a[text()='Our Approach']"))).perform();
		
		// Example Right click
		//act.contextClick(driver.findElement(By.xpath("//a[text()='Our Approach']"))).perform();  ///Right click is contextClick
		
		// Move to another menu
		act.moveToElement(driver.findElement(By.xpath("//a[text()='Industries']"))).perform();
		//act.click(driver.findElement(By.xpath("//span[contains(text(),'Hi-Tech')]"))).perform();
		
		//Example Keyboard+Mouse
		act.keyDown(Keys.CONTROL).click(driver.findElement(By.xpath("//span[contains(text(),'Hi-Tech')]"))).keyUp(Keys.CONTROL).perform();
	
		Set<String> winsid=driver.getWindowHandles();
		System.out.println(winsid);
		
		Iterator<String> itr=  winsid.iterator();
		String win1=itr.next();  // first window
		String win2=itr.next();    // second window
		
		//String win1= itr.next();
		//String win2= itr.next();
		//String win3= itr.next();
		
		driver.switchTo().window(win2);
		//driver.switchTo().window(win1);
		driver.quit();
	}
	@Test(enabled=false)
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
