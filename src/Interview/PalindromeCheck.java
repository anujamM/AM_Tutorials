package Interview;

import java.util.Scanner;

public class PalindromeCheck {
	
	public void checkPalindrome(int number) {
		int temp = number;
		int r, sum = 0;
		
		while(number>0) {
			r = number%10;
			sum = (sum*10)+r;
			number = number/10;
		}
		if(temp == sum) {
			System.out.println("The palindrome number is:" + temp);
		}
		else
			checkPalindrome(temp + 1);
		
	}
	
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number = scn.nextInt();
		System.out.println("The number you've entered is: " + number);
		PalindromeCheck pCheck = new PalindromeCheck();
		pCheck.checkPalindrome(number);
	}
}
