package SelfPractice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DuplicateValString {

	public static boolean duplicate(ArrayList<String> input) {

		//		int count = input.length();
		//		ArrayList<String> arr = new ArrayList<String>();
		//
		//		for (int i = 0; i < count; i++) {
		//			for (int j = i + 1; j < count; j++) {
		//				if (String.valueOf(i) == String.valueOf(j)) {
		//					if (!arr.contains(String.valueOf(i))) {
		//						arr.add(String.valueOf(i));
		//					}
		//					break;
		//				}
		//			}
		//		}
		//		System.out.println(arr);

//		Set<String> setString = new HashSet<String>(input);
		
		Set<String> setString = new HashSet<String>();
		for(int i = 0; i<input.size(); i++) {
			if(setString.contains(input.get(i))) {
				System.out.println(input.get(i));
			}
			else
				setString.add(input.get(i));
		}
		return setString.size() == input.size();

	}

	public static void main(String[] args) {

		//		 String duplicateVal = new String("ABCXYZPQRSABC");
		System.out.println("Input: ");
		Scanner scn = new Scanner(System.in);

		ArrayList<String> arrString = new ArrayList<String>();
		String input = scn.nextLine();
		String[] s = input.split("\\s+");
		
		for(int i = 0; i<s.length; i++) {
			arrString.add(s[i]);
//			System.out.println(arrString);
		}
		
		if(duplicate(arrString)) {
			System.out.println("No duplicate");
		}
		else
			System.out.println("Duplicate");

	}

}
