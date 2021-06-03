package SelfPractice;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
	public static void main(String args[]) {

		ArrayList<String> arrList = new ArrayList<String>();
		ArrayList<String> num = new ArrayList<String>();
		ArrayList<String> alpha = new ArrayList<String>();
		ArrayList<String> spcl = new ArrayList<String>();

		String str = "65432)(*&!@#$NBVFTYUJE%$#DFDB";
//		 Pattern p1 = Pattern.compile("([A-Z][a-z]*)([0-9]*)");
		Pattern p1 = Pattern.compile("\\d|\\D");
		Matcher m1 = p1.matcher(str);

		while (m1.find()) {
			arrList.add(m1.group());
		}

		for (int i = 0; i < arrList.size(); i++) {
			if (Pattern.matches("\\d", arrList.get(i))) {
				num.add(arrList.get(i));
			} else if (Pattern.matches("([A-Z][a-z]*)", arrList.get(i))) {
				alpha.add(arrList.get(i));
			} else
				spcl.add(arrList.get(i));

		}

		System.out.println(arrList);
		System.out.println(num);
		System.out.println(alpha);
		System.out.println(spcl);

	}
}
