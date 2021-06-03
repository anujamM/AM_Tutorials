package SelfPractice;

import java.util.ArrayList;
import java.util.Collections;

public class StringProblem {
	/**
	 * Main, executable method THIS METHOD SHOULD PRINT ALL EXPECTED OUTPUT
	 * 
	 * @param args
	 */
	public static void main(String args[]) {
		String[] testStrings = { "Bernard", "Charlie", "Angie", "Andy", "Bertha", "Annie", "Carl", "Connie", "Dennis", "Caroline",
				"Bob", "Betty", "Bart", "Albert" };
		System.out.println("Let's begin...");
		largerThan(testStrings, "A", 4);
		equalOrLarge(testStrings, "B", 3);
		equalOrLarge(testStrings, "C", 5);

	}

	// YOU CAN ADD MORE PRIVATE METHODS HERE, IF NEEDED!
	private static void largerThan(String[] str, String start, int len) {
		ArrayList<String> arrList = new ArrayList<String>();

		for (int i = 0; i < str.length; i++) {
			if(str[i].startsWith(start) && str[i].length() > len)
			arrList.add(str[i]);
		}
		Collections.sort(arrList);
		System.out.println(arrList);
		
	}
	
	private static void equalOrLarge(String[] str, String start, int len) {
		ArrayList<String> arrList = new ArrayList<String>();

		for (int i = 0; i < str.length; i++) {
			if(str[i].startsWith(start) && str[i].length() >= len)
			arrList.add(str[i]);
		}
		Collections.sort(arrList);
		System.out.println(arrList);
		
	}

}
