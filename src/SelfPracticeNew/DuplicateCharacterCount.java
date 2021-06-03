package SelfPracticeNew;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DuplicateCharacterCount {
	
	public static void charCount(String input) {
		
		char[] chars = input.toLowerCase().toCharArray();
		Map<Character, Integer> map = new HashMap<>();
		
		for(char c: chars) {
			if(map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			}
			else
			{
				map.put(c, 1);
			}
		}
		
		for(Map.Entry<Character, Integer> count: map.entrySet()) {
			if(count.getValue() > 1) {
				System.out.println("Character is : " + count.getKey() + " and number of occurence: " + count.getValue());
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		String input = scn.next();
		charCount(input);
	}

}
