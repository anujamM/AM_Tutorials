package SelfPractice;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	public static void anagram(String input1, String input2) {

		char[] arrList = input1.toLowerCase().toCharArray();
		char[] arrList2 = input2.toLowerCase().toCharArray();

		if (arrList.length == arrList2.length) {
			Arrays.sort(arrList);
			Arrays.sort(arrList2);

			boolean status = Arrays.equals(arrList, arrList2);

			if (status) {
				System.out.println("Anagram");
			} else
				System.out.println("Not");
		}
		else
			System.out.println("Length Mismatch!");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);

		String input1 = scn.next();
		String input2 = scn.next();
		anagram(input1, input2);
	}

}
