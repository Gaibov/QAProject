package org.xyz.automation.fb;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitWebDriver

{
	WebDriver driver;
	
	@Test
	public void lunchBrowser() throws Exception
	{
		WebDriverManager.chromedriver().setup();
	    driver= new ChromeDriver(); //lunch chromedriver
		//driver.get("https://www.facebook.com/");
		driver.get("https://www.thetestingworld.com/testings/");   /// 60 sec wait
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));  // haw to manage waiting for page
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)); // IMPLICIT when we going topage 1 and page2  it wait 
 	
		
	    driver.findElement(By.name("fld_username")).sendKeys("user1");
	    driver.findElement(By.name("fld_username")).clear();
	    driver.findElement(By.name("fld_username")).sendKeys("user2");
	    driver.findElement(By.cssSelector("[value='home']")).click();
	    
	    Select gen=new Select(driver.findElement(By.name("sex")));
	    //gen.selectByIndex(1);    //male
	    //gen.selectByValue("2");  //female
	    gen.selectByVisibleText("Male");
	    
	    Select con=new Select(driver.findElement(By.name("country")));
	    con.selectByVisibleText("United States");
	   // con.selectByVisibleText("India");
	   // con.selectByVisibleText("United Kingdom");
	    
	    //con.deselectAll();
	    //con.deselectByVisibleText("India");
	    Select st=new Select(driver.findElement(By.name("state")));
	   // Thread.sleep(5000);
	    
	   // WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(20));
	  
	    //wait.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.id("stateId")), "Florida"));
	    
	    st.selectByVisibleText("Arizona");
	    Select ct=new Select(driver.findElement(By.name("city")));
	    ct.selectByVisibleText("Bouse");
	    
	    driver.findElement(By.name("terms")).click();
	    
	    WebElement t=driver.findElement(By.name("terms"));     // we can use webelement like variable
	    t.click();
	   
	    
	    //driver.findElement(By.className("displayPopup")).click();
	}
	
	
	
}
