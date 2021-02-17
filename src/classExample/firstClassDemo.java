package classExample;

public class firstClassDemo {
	
	int x = 90;
	int y = 100;

	public static void main(String[] args) 
	{
		System.out.println("Program Started");
		firstClassDemo obj1 = new firstClassDemo();
		obj1.sum();
		System.out.println("Program Ended");
		
		
		firstClassDemo obj2 = new firstClassDemo();
		System.out.println("Value of X is: "+obj2.x);
		System.out.println("Value of Y is: "+obj2.y);

	}
	
	public void sum()
	{
		int a = 90;
		int b = 100;
		int c = a+b;
		System.out.println("The sum amount is: "+c);
	}

}
