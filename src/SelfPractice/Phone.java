package SelfPractice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Phone {

	public static void main(String[] args) {

		String str = "2222*222*2";

		Map<Integer, List<Character>> map = new HashMap();

		ArrayList<Character> chars = new ArrayList<>();
		chars.add('A');
		chars.add('B');
		chars.add('C');

		map.put(2, chars);
		System.out.println(map);

		int count = 0;
		StringBuffer stbf = new StringBuffer();
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '*' && count !=0) {

				ArrayList<Character> al = (ArrayList<Character>) map.get((str.charAt(i - 1)));
				System.out.println(map.get((str.charAt(2))));
				switch (count % al.size()) {
				case 0:
					stbf.append(al.get(al.size() - 1));
					break;
				case 1:
					stbf.append(al.get(al.size() - 2 ));
					break;
				case 2:
					stbf.append(al.get(al.size() - 3 ));
					break;
				case 3:
					stbf.append(al.get(al.size() - 4 ));
					break;
				}
				
				count = 0;
			}

			else {
				count++;
			}
		}
		System.out.println(stbf.toString());

	}

}
