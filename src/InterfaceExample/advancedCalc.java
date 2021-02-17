 package InterfaceExample;

public class advancedCalc implements calc 
{

	public static void main(String[] args) 
	{
		advancedCalc obj1 = new advancedCalc(); //Making instance of a class and using the methods which are defined locally
		
		obj1.add();
		obj1.sub();
		obj1.calculateSin();
		obj1.calculateCos();
		
	}
	
	@Override
	public void add() {
		System.out.println("Add");
	}

	@Override
	public void sub() {
		System.out.println("Substraction");
	}
	
	public void calculateSin()
	{
		System.out.println("SinTheta");
	}
	
	public void calculateCos()
	{
		System.out.println("CosTheta");
	} 

}
