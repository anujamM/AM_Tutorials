package SelfPractice;

import java.util.Scanner;

public class WhitespaceNoReplace {

	public static void main(String[] args) {
		System.out.println("Input: ");
		Scanner scn = new Scanner(System.in);
		char[] input = scn.nextLine().toCharArray();

		StringBuffer sbf = new StringBuffer();

		for (int i = 0; i < input.length; i++) {
			if (input[i] != ' ' && input[i] != '\t') {
				sbf.append(input[i]);
			}
		}
		System.out.println(sbf);
	}

}
