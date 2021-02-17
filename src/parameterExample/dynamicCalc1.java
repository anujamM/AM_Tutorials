package parameterExample;

public class dynamicCalc1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dynamicCalc2 obj1 = new dynamicCalc2();
		int sum = obj1.add(400, 200);
		System.out.println("Addition = "+sum);
		
		dynamicCalc2 obj2 = new dynamicCalc2();
		double sub = obj2.sub(37.9, 45.1);
		System.out.println("Substraction = "+sub);
		
		dynamicCalc2 obj3 = new dynamicCalc2();
		String fullname = obj3.getFullName("Anujam", "Mondal");
		System.out.println("My full name is: "+fullname);
	}
	

}
