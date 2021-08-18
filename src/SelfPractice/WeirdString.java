package SelfPractice;

import java.util.HashMap;
import java.util.Map;

public class WeirdString {

	public static void main(String[] args) {

		String str1 = "This is a test string";
		String str2 = "tsit";

		Map<Character, Integer> map1 = new HashMap<>();

		for (char c : str1.toLowerCase().toCharArray()) {
			if (map1.containsKey(c)) {
				map1.put(c, (map1.get(c) + 1));
			} else {
				map1.put(c, 1);
			}

		}
		System.out.println(map1);

		Map<Character, Integer> map2 = new HashMap<>();

		for (char c : str2.toLowerCase().toCharArray()) {
			if (map2.containsKey(c)) {
				map2.put(c, (map2.get(c) + 1));
			} else {
				map2.put(c, 1);
			}

		}
		System.out.println(map2);

		int temp = Integer.MAX_VALUE;
		for (Map.Entry<Character, Integer> e : map2.entrySet()) {
			if (!map1.containsKey(e.getKey())) {
				System.out.println("No words possible.");
				break;
			} else {
				temp = Math.min(temp, map1.get(e.getKey())/(e.getValue()));
			}
		}
		
		System.out.println("Max number of words: " + temp);

	}

}
