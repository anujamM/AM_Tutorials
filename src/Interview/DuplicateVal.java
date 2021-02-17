package Interview;

import java.util.ArrayList;
import java.util.Scanner;

public class DuplicateVal {

	public static void duplicate(char[] input) {

		int count = input.length;
		ArrayList<Character> arr = new ArrayList<Character>();

		for (int i = 0; i < count; i++) {
			for (int j = i + 1; j < count; j++) {
				if (input[i] == input[j]) {
					if (!arr.contains(input[i])) {
						arr.add(input[i]);
					}
					break;
				}
			}
		}
		System.out.println(arr);

	}

	public static void main(String[] args) {

		// String duplicateVal = new String("ABCXYZPQRSABC");
		System.out.println("Input: ");
		Scanner scn = new Scanner(System.in);
		char[] input = scn.next().toCharArray();
		duplicate(input);

	}

}
