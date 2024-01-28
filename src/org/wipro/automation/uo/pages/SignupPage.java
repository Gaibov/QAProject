package org.wipro.automation.uo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.wipro.automation.uo.utilitiesPkg.ReadPropFile;

public class SignupPage 
{

	WebDriver driver; //global variable
	
	public SignupPage(WebDriver driver)  //local variable 
	{
				this.driver=driver;
	}
	
	public void click_createnewaccount() throws Exception
	{
		driver.findElement(By.xpath(ReadPropFile.readelementdata("FB_Login_CreateNewAccount_xpath"))).click();
			
	}
	
	
	
	public void enter_firstname(String fname) throws Exception
	{
		driver.findElement(By.name(ReadPropFile.readelementdata("FB_Signup_FirstName_name"))).sendKeys(fname);
		
	}
	
}
