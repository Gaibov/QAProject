package org.wipro.automation.uo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.wipro.automation.uo.utilitiesPkg.ReadPropFile;

public class MenuPage 
{

	WebDriver driver; //global variable
	
	public MenuPage(WebDriver driver)  //local variable 
	{
				this.driver=driver;
	}
	
	public void click_menu() throws Exception
	{
		driver.findElement(By.cssSelector(ReadPropFile.readelementdata("UO_menu_css"))).click();
	
		
	}
	
	
	public void click_signinmenu() throws Exception
	{
		driver.findElement(By.xpath(ReadPropFile.readelementdata("UO_Menu_signIn_link_xpath"))).click();
	
	}	
	
	
	}
