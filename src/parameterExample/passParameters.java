package parameterExample;

public class passParameters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		passParameters obj1 = new passParameters();
		obj1.add(400, 200);
		passParameters obj2 = new passParameters();
		obj2.sub(37.9, 45.1);
	}
	
	public void add(int a, int b) 
	{
		int c = a+b;
		System.out.println("The result of addition is = "+c);
	}
	
	public void sub(double x, double y) 
	{
		double z = y-x;
		System.out.println("The result of substraction is = "+z);
	}

}
