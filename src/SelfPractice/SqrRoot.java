package SelfPractice;

public class SqrRoot {
	public static void main(String args[]) {
		double num = 625;
		double temp;
		
		do {
			temp = num/2; //4
			num = ((temp + (num/temp))/2); //(4+(9/4))/2 = (4+2)/2
			
		}while(temp==0);
		
		System.out.println(num);
	}
}
