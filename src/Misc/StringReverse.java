package Misc;

import java.util.Scanner;
import java.util.regex.Pattern;

public class StringReverse {

	public static String takeInput() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the string that you want to reverse: ");
		return input.nextLine();
	}

	public static String reverse(String aa) {
		String rev = "";
		if (aa == null || aa.isEmpty()) {
			System.out.println("Null String!!");
			return aa;
		} else {
			for (int i = aa.length() - 1; i >= 0; i--) {
				rev = rev + aa.charAt(i);
			}
		}
		return rev;
	}

	public static String reverseSentence(String sntc) {
		Pattern ptrn = Pattern.compile("\\s");

		String[] temp = ptrn.split(sntc);
		String result = "";

		if (sntc == null || sntc.isEmpty()) {
			System.out.println("Null String!!!");
		} 
		else {
			for (int i = 0; i < temp.length; i++) {
				if (i == temp.length - 1)
					result = temp[i] + result;
				else
					result = " " + temp[i] + result;

			}
		}
		return result;

	}

	public static void main(String[] args) {
		String str = takeInput();
		String revStr = reverse(str).trim();
		System.out.println("The reversed string is: " + revStr);

		StringBuffer strBfr = new StringBuffer(str);
		System.out.println("The reversed string is: " + strBfr.reverse()); // Using StringBuffer

		String revSntc = reverseSentence(str).trim();
		System.out.println("The reversed sentence is: " + revSntc);

	}

}
