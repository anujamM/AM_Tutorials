package SelfPractice;

import java.util.Scanner;

public class StringReverse {

	public static void stringReverse(String input) {
//		String ip = input.replace(" ", "");
		char[] ch = input.toCharArray();
		String rev = "";

		for (int i = ch.length - 1; i >= 0; i--) {
			rev = rev + ch[i];
			
		}
		System.out.println(rev);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		String input = scn.nextLine();
		System.out.println(input);
		stringReverse(input);
	}

}
