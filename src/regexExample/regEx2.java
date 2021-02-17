package regexExample;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regEx2 {

	public static void main(String[] args) {

		// System.out.println(Pattern.matches("[ABCDE]", "A"));
		// System.out.println(Pattern.matches("ABCDE", "AABBCCDDEE"));

		// X* Zero or more occurrences of X
		// X? Zero or One occurrences of X
		// X+ One or More occurrences of X
		// X{n} Exactly n occurrences of X
		// X{n, } At-least n occurrences of X
		// X{n, m} Count of occurrences of X is from n to m

		 System.out.println("=============================================Greedy Quantifier (One or More occurrences of A)=============================================");
		 Pattern p = Pattern.compile("A+");
		 Matcher m = p.matcher("AAABAAAACAAAAD");
		
		 while (m.find()) {
		 System.out.println("Pattern found from: " + m.start() + " to " + (m.end() -
		 1));
		 // System.out.println("Pattern found from: " + (m.start() + 1 ) + " to " +
		 // (m.end() - 1));
		 }
		 System.out.println("=============================================Reluctant Quantifier (Starts from first character and processes one character at a time)=============================================");
		 Pattern p1 = Pattern.compile("A+?");
		 Matcher m1 = p1.matcher("AABCCD");
		
		 while (m1.find()) {
		 System.out.println("Pattern found from: " + m1.start() + " to " + (m1.end() -
		 1));
		 // System.out.println("Pattern found from: " + (m.start() + 1 ) + " to " +
		 // (m.end() - 1));
		 }
		
		 System.out.println("=============================================Possesive Quantifier=============================================");
		 Pattern p2 = Pattern.compile("A++");
		 Matcher m2 = p2.matcher("AAABAAAACAAAAD");
		 while (m2.find()) {
		 System.out.println("Pattern found from: " + m2.start() + " to " + (m2.end() -
		 1));
		 }

		System.out.println(
				"=============================================Greedy and Possesive Quantifier=============================================");
		Pattern p3 = Pattern.compile("A+A");
		Matcher m3 = p3.matcher("AAABAAAACAAAAD");
		Pattern p4 = Pattern.compile("A++A");
		Matcher m4 = p4.matcher("AAABAAAACAAAAD");

		while (m3.find()) {
			System.out.println("Pattern found from: " + m3.start() + " to " + (m3.end() - 1));
		}
		System.out.println("====================//=======================");
		while (m4.find()) {
			System.out.println("Pattern found from: " + m4.start() + " to " + (m4.end() - 1));
		}

	}
}
