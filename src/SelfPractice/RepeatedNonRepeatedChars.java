package SelfPractice;

import java.util.Scanner;

public class RepeatedNonRepeatedChars {

	public static void countRepeatChar(String abc) {
		int len = abc.length();
		char[] charAbc = abc.toCharArray();
		boolean foundFirstRepetativeNum = false, foundFirstnonRepetativeNum = false;
		
		for (int i = 0; i < len; i++) {
			int count = 1;
			if (foundFirstRepetativeNum && foundFirstnonRepetativeNum) {
				return;
			}
			for (int j = 0; j < len; j++) {
				if (i != j && charAbc[i] == charAbc[j]) {
					if(!foundFirstRepetativeNum) {
						System.out.println("foundFirstRepetativeNum: " + charAbc[i]);
						foundFirstRepetativeNum = true;
					}
					count++;
					
				}

			}
			if (count == 1 && !foundFirstnonRepetativeNum) {
				System.out.println("foundFirstnonRepetativeNum: " + charAbc[i]);
				foundFirstnonRepetativeNum = true;
			}

		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		String abc = scn.next();
		countRepeatChar(abc);
	}
}
