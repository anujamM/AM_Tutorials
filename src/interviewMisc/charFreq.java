package interviewMisc;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class charFreq {

	/*
	 * Can you process an input string to count the frequency of each character and
	 * print the frequency next to the character that was the first occurrence in
	 * the input string?
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();

		char[] arr = str.toLowerCase().toCharArray();
		HashMap<Character, Integer> hashmap = new HashMap<>();

		for (char ch : arr) {
			hashmap.put(ch, hashmap.getOrDefault(ch, 0) + 1);
		}

		HashSet<Character> hashSet = new HashSet<>();

		for (char key : arr) {
			if (!hashSet.contains(key)) {
				System.out.print(key + "" + hashmap.get(key));
				hashSet.add(key);
			}
		}

		sc.close();

	}

}
