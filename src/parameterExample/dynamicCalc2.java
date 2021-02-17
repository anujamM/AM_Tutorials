package parameterExample;

public class dynamicCalc2 {

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
	
	public String getFullName(String first, String last)
	{
		String fullname = first + " " + last;
		return fullname;
	}
}
