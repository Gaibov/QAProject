package org.wipro.automation.uo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.wipro.automation.uo.utilitiesPkg.ReadPropFile;

public class LoginPage 
{

	WebDriver driver; //global variable
	
	public LoginPage(WebDriver driver)  //local variable 
	{
				this.driver=driver;
	}
	public void enter_username(String uname) throws Exception
	{
		driver.findElement(By.id(ReadPropFile.readelementdata("FB_Login_username_id"))).sendKeys(uname);
		
		
	}
	public void enter_password(String pass) throws Exception
	{
		driver.findElement(By.name(ReadPropFile.readelementdata("FB_Login_password_name"))).sendKeys(pass);
		
	}
	
	public void click_loginbttn() throws Exception
	{
		driver.findElement(By.cssSelector(ReadPropFile.readelementdata("FB_Login_loginbttn_css"))).click();
	
		
	}
}
