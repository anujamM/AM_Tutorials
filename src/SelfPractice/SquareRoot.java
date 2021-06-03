package SelfPractice;

public class SquareRoot {
	
	public static void main(String args[]) {
		
		int num = 25;
		double sqr = num/2;
		
		double temp;
		
		do {
			temp = sqr; //12
			sqr = (temp+(num/temp))/2; //(12+(25/12))/2
									   //(7+(25/7))/2
			
		}while(temp!=sqr);
		
		System.out.println("The square root is: " + sqr);
		
		
		
		double mathLib = Math.sqrt(num);
		System.out.println("Square root of a number using library function : " + mathLib);
	}
}
