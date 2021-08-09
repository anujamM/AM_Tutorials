package SelfPracticeNew;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Test {
	
	public static void revString() {
		String str = "ABCDEFGH123   4354u98698 908758747 0980979854,mbjhfghsdkhl;j";
		char[]  charArr = str.toCharArray();
		String rev = "";
		
		for(int i = charArr.length - 1; i>=0 ; i--) {
			rev = rev + charArr[i];
		}
		System.out.println(rev);
	}
	
	public static void repeatStr(String str) {
		ArrayList<String> arrList = new ArrayList<String>();
		arrList.addAll(Arrays.asList(str.split(" ")));
		System.out.println(arrList);
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		for(String s : arrList) {
			if(map.containsKey(s)) {
				map.put(s, (map.get(s) + 1));
			}
			else
				map.put(s, 1);
			
		}
		
		for(Map.Entry<String, Integer> e : map.entrySet()) {
			if(e.getValue() > 1) {
				System.out.println("String: " + e.getKey() + " " + "Count: " + e.getValue());
			}
			else if(e.getValue() < 1 )
				System.out.println("No repeating string!!!");
		}
		
	}
	
	
	public static void main(String args[]) {
		String str = "I am Anujam Mondal living in in in in";
		repeatStr(str);
	}
}
