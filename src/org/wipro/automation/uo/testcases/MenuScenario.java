package org.wipro.automation.uo.testcases;

import org.testng.annotations.Test;
import org.wipro.automation.uo.basePkg.InitiateBrowser;
import org.wipro.automation.uo.pages.LoginPage;
import org.wipro.automation.uo.pages.MenuPage;

public class MenuScenario extends InitiateBrowser                         //Vizov CLASS
{

	@Test
	public void validateloginfunct() throws Exception
	{
		MenuPage menu = new MenuPage(driver);
		menu.click_menu();
		menu.click_signinmenu();
	}
}
