package org.wipro.automation.uo.dataGenerator;

import org.testng.annotations.DataProvider;

public class TestDataGenerator {

	@DataProvider(name="staticdata")
	public Object[][] testdata()
	{
	//Object[] userpass={"user1","pass1"}	;
	Object[] [] data= {{"user1","pass1"},{"user2","pass2"},{"user3","pass3"}};
		return data;
	}
	
	
	
}
