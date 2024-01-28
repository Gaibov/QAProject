package secondPkg;

public class Calculations {

	
	
	
	public void sum()   //method without parameters
	{
		int a=20;
		int b=30;
		int c=a+b;
		System.out.println(c);
	}

	public int add(int a, int b) // method with parametersor arguments
	{
		
		int c =a+b;
		System.out.println(c);
		return c;
	}
	
	public static void main(String[] args) {
		
		Calculations cal=new Calculations();
		cal.sum();
		cal.add(120, 30);
		cal.add(60,70);
		int x= cal.add(10, 20);
		cal.add(x, 20);
	}
}
