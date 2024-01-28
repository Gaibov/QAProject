package org.xyz.automation.fb;
                                        //THIS CLASS ONLY WRITE ONE TIME AND USE ANYWHERE
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class CaptureScreenshot 
{
                                              // for multiple name we use String name
	public static void screenshotresults(WebDriver driver, String name ) throws Exception
	{
		TakesScreenshot scr =  (TakesScreenshot) driver;    // we have a error for this situations we should be use WEBDRIVER and this string takes screen in memory
	
		File f=scr.getScreenshotAs(OutputType.FILE);
		File fd=new File("./TestResults/" + name + ".png");      // for multi name
		
			
		FileUtils.copyFile(f, fd);                                // For bringing FILE to Folder u need to use COMMON IO add to POM.xml or depencies
	}
}
