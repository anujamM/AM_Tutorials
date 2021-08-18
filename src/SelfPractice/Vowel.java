package SelfPractice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Vowel {
	
	public static void main(String[] args) {
		
		HashSet<Character> vowels = new HashSet<>();
		HashMap<Character, Integer> map = new HashMap<>();
		
		vowels.add('a');
		vowels.add('e');
		vowels.add('i');
		vowels.add('o');
		vowels.add('u');
		
		String str = "I am Anujam";
		
		for(char c : str.toLowerCase().toCharArray()) {
			if(vowels.contains(c)) {
				map.put(c, map.getOrDefault(c, 0) + 1);
			}
		}
		
		for(Map.Entry<Character, Integer> e : map.entrySet()) {
			System.out.println(e);
		}

	}

}
