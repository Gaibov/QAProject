package org.wipro.automation.uo.testcases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.wipro.automation.uo.basePkg.InitiateBrowser;
import org.wipro.automation.uo.pages.LoginPage;
import org.wipro.automation.uo.pages.SignupPage;

public class SignupScenario extends InitiateBrowser                         //Vizov CLASS
{

	@Test
	public void validatesignupfunct() throws Exception
	{
		SignupPage sign = new SignupPage(driver);
		sign.click_createnewaccount();
		sign.enter_firstname("Selenium");
		
		driver.findElement(By.name("lastname")).sendKeys("Java");
	}
}
