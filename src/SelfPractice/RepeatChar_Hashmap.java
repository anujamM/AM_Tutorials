package SelfPractice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RepeatChar_Hashmap {

	public static void countRepeatChar(String abc) {
		Map<Character, Integer> map = new HashMap<>();
		char[] charArr = abc.toLowerCase().toCharArray();
		for (char c : charArr) {
			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			} else
				map.put(c, 1);
		}
		
		for(Map.Entry<Character, Integer> count : map.entrySet()) {
			if(count.getValue() > 1) {
				System.out.println(count.getKey() + " " + count.getValue());
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
