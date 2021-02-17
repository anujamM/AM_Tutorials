package InterfaceExample;

public class advancedCalc2 implements calc 
{

	public static void main(String[] args) 
	{
		//You can't create object of an interface if it does not contain a proper body
		//calc obj1 = new calc();

		//You can;t create object of an interface because it does not have an abstract method
		//advancedCalc2 obj1 = new calc();

		/*obj1.add();
		obj1.sub();
		obj1.calculateSin();
		obj1.calculateCos();*/
		calc obj1 = new advancedCalc2();
		obj1.add();
		obj1.sub();
		
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
