package SelfPractice;

import java.util.Scanner;

public class SumBecomesSingleDigit {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scn = new Scanner(System.in);
		
		int val = 0;
		
		
		System.out.println("Please enter the input: ");
		if(scn.hasNextInt()) {
		
			val = Math.abs(scn.nextInt());
			System.out.println("The number you've entered is: " + val);
			int result = singleValCalc(val);
			
			while(result>9) {
				result = singleValCalc(result);
			}
			System.out.println("The output: " + result);
		}
		else
			System.out.println("Not an Integer value. Please type an Integer value.");
		
		
		
	}
	
	static int singleValCalc(int num) {
//		return num == 0 ? 0 : num%10 + singleValCalc(num/10);
		
		if(num == 0) {
			return 0;
		}
		else {
			
			num = num%10 + singleValCalc(num/10);
			return num;
		}
		
	}
//	public static int calc(int n) {
//		int sum = 0;
//		while(sum ==0 || sum>9) {
//		 for (sum =0; n >0; sum += n %10,n /=10);
//		 System.out.println("AAAAAAA:" + sum);
//		}
//		return sum;
//		
//	}

}
