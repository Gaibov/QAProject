package org.wipro.automation.uo.basePkg;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.wipro.automation.uo.utilitiesPkg.ReadPropFile;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InitiateBrowser 

{

	public WebDriver driver;
	
	
	@BeforeMethod
	public void launchBrowser() throws Exception
	{
		if (ReadPropFile.readconfigdata("BrowserName").equalsIgnoreCase("chrome"))
				{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		}
		
		else if (ReadPropFile.readconfigdata("BrowserName").equalsIgnoreCase("edge"))
		{
          WebDriverManager.edgedriver().setup();
          driver=new EdgeDriver();
        }
		
		else if (ReadPropFile.readconfigdata("BrowserName").equalsIgnoreCase("Safari"))
		{
          WebDriverManager.safaridriver().setup();
          driver=new SafariDriver();
        }
		
		else
		    {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			}	
		
		
		//driver.get("https://www.facebook.com/");
		driver.get(ReadPropFile.readconfigdata("ApplicationURL"));
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
	}
	
	
	@AfterMethod
	public void closeBrowser()
	{
	//	driver.quit();
	}
	
}
