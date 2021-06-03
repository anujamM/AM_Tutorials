package SelfPractice;

import java.util.HashMap;
import java.util.Map;

public class CountVowels {

	public static void vowels(String str) {
		char[] ch = str.toLowerCase().toCharArray();
		int length = ch.length;
		int count = 0;
		for (int i = 0; i < length; i++) {
			if (ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u') {
				count++;
			}
		}
		System.out.println(count);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "India is best country";
		vowels(str);
	}

}
