package InterfaceExample;

public class advancedCalc3 implements calc 
{

	public static void main(String[] args) 
	{
	 //Can't over ride the value of x which is defined in interface	
	//x = 100;
		
		int x = 100;
	}
	
	public void calculateSin()
	{
		System.out.println("SinTheta");
	}
	
	public void calculateCos()
	{
		System.out.println("CosTheta");
	}

	@Override
	public void add() {
		System.out.println("Add");
	}

	@Override
	public void sub() {
		System.out.println("Substraction");
	}

}
