package compilePolymorExample;

public class compileDemo1 {
	
	public static void main(String[] args)
	{
		compileDemo1 obj1 = new compileDemo1();
		
		obj1.add(20, 30);
		
		obj1.add(25, 35, 100);
		
		obj1.add(10, 20.005);
		
		obj1.add(30.5555, 5);
		
	}

	
	public void add(int a, int b)
	{
		int c = a+b;
		System.out.println("The result of addition is: "+c);
		
	}
	
	public void add(int a, int b, int d)
	{
		int c = d-(a+b);
		System.out.println("The result of addition is: "+c);
		
	}
	
	public void add(int a, double b) //Upcasting
	{
		double c = a+b;
		System.out.println("The result of addition is: "+c);
		
	}
	
	public void add(double a, int b) //Upcasting
	{
		double c = a+b;
		System.out.println("The result of addition is: "+c);
		
	}
}
