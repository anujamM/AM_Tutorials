package hashMapExample;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
			
		HashMap<String, String> obj1 = new HashMap<String, String>();
		obj1.put("1", "Anujam");
		obj1.put("10", "Ten");
		obj1.put("2", "Mondal");
				
		System.out.println(obj1);
		
		String abc = obj1.get("3");
		System.out.println(abc);
		
		for (Map.Entry<String, String> data : obj1.entrySet()) {
			System.out.println("Key from Map is " + data.getKey() + " and Value from Map is " + data.getValue());
		}
	}

}
