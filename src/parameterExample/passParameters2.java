package parameterExample;

public class passParameters2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		passParameters2 obj1 = new passParameters2();
		int sum = obj1.add(400, 200);
		System.out.println("Addition = "+sum);
		
		passParameters2 obj2 = new passParameters2();
		double sub = obj2.sub(37.9, 45.1);
		System.out.println("Substraction = "+sub);
	}
	
	public int add(int a, int b) 
	{
		int c = a+b;
		//System.out.println("The result of addition is = "+c);
		return c;
	}
	
	public double sub(double x, double y) 
	{
		double z = y-x;
		//System.out.println("The result of substraction is = "+z);
		return z;
	}

}
