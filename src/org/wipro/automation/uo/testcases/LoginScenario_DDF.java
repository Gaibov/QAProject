package org.wipro.automation.uo.testcases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.wipro.automation.uo.basePkg.InitiateBrowser;
import org.wipro.automation.uo.dataGenerator.TestDataGenerator;
import org.wipro.automation.uo.pages.LoginPage;

public class LoginScenario_DDF extends InitiateBrowser                         //Vizov CLASS
{

	@Test(dataProvider="staticdata",dataProviderClass=TestDataGenerator.class)
	public void validateloginfunct(String username, String password) throws Exception
	{
		LoginPage login = new LoginPage(driver);
		login.enter_username(username);
		login.enter_password(password);
		login.click_loginbttn();
	}
	
}
