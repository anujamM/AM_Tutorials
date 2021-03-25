package Interview;

import java.util.ArrayList;
import java.util.Scanner;

public class RepeatChar {

	public static void countRepeatChar(String abc) {
		int len = abc.length();
		char[] charAbc = abc.toCharArray();
		ArrayList<String> arrList = new ArrayList<>();
		for (int i = 0; i < len; i++) {
			if (!arrList.contains(String.valueOf(charAbc[i]))) {
				int count = 1;
				for (int j = 0; j < len; j++) {
					if (i != j && charAbc[i] == charAbc[j]) {

						arrList.add(String.valueOf(charAbc[i]));
						count++;
					}

				}
				if (count >= 1) {
					System.out.println(charAbc[i] + " " + count);
				}
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
