package learnTestNG;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestScenario1 
{

	
	@Test(priority=1)
	public void first_testcase()
	{
		
		System.out.println("My first TC");
		Assert.assertEquals("Hello", "Hello World");
	}

	@Test(enabled=false)
	public void second_testcase()
	{
		
		System.out.println("My second TC");
	}
	@Test(priority=3)
	public void third_testcase()
	{
		
		System.out.println("My 3 TC");
		Assert.assertEquals("test", "testing");
	}
	@Test(priority=4)
	public void forth_testcase()
	{
		
		System.out.println("My 4 TC");
	}
	@Test
	public void fifth_testcase()
	{
		
		System.out.println("My 5 TC");
	}
	@Test(priority=6)
	public void six_testcase()
	{
		
		System.out.println("My 6 TC");
	}
	@Test(priority=-2)
	public void seven_testcase()
	{
		
		System.out.println("My 7 TC");
	}

}
