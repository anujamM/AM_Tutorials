package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupedAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strs = { "eat", "tea", "tan", "ate", "nat", "bat" };

		HashMap<String, List<String>> hashmap = new HashMap<>();

		for (String s : strs) {
			char[] ch = s.toCharArray();
			Arrays.sort(ch);

			String key = new String(ch);

			if (!hashmap.containsKey(key)) {
				hashmap.put(key, new ArrayList<>());
			}

			hashmap.get(key).add(s);

		}

		for (String s : hashmap.keySet()) {
			System.out.println(s);
		}

		System.out.println(hashmap.values());

	}

}
