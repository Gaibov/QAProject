package learnTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestScenario6 
{

	
	@Test
	public void first_testcase()
	{
		
		System.out.println("My first TC");
	}

	@Test
	public void second_testcase()
	{
		
		System.out.println("My second TC");
	}
	@Test
	public void third_testcase()
	{
		
		System.out.println("My 3 TC");
	}
	@Test
	public void forth_testcase()
	{
		
		System.out.println("My 4 TC");
	}
	@Test
	public void fifth_testcase()
	{
		
		System.out.println("My 5 TC");
		Assert.assertEquals("test", "testing");
	}
	@Test
	public void six_testcase()
	{
		
		System.out.println("My 6 TC");
	}
	@Test
	public void seven_testcase()
	{
		
		System.out.println("My 7 TC");
	}

}
