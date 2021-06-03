package SelfPractice;

import java.util.Scanner;

public class PalindromeCheck {
	
	public void checkPalindrome(int n) {
		int temp = n;
		int r, sum = 0;
		
		while(n>0) {
			r = n%10;
			sum = (sum*10) + r;
			n = n/10;
		}
		
		if(temp == sum) {
			System.out.println("The number is palindrome.");
		}
		else
			System.out.println("The number is not palindrome.");
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
