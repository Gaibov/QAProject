package testPkg;

import secondPkg.Calculations;

public class QA1 {

	public void sum(int a, int b) // method with parametersor arguments
	{
		
		int c =a+b;
		System.out.println("sum of two int"+c);
	
	}
	
	public void sum(int a, float b) // method with parametersor arguments
	{
		
		float c =a+b;
		System.out.println(c);
	
	}
	
	public void main(String[] args) {
		
		QA1 q1=new QA1();
		q1.sum(30,40);
		
	}
	
	
}
