package setExample;

import java.util.HashSet;
import java.util.Set;

public class setDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<String> obj1 = new HashSet<>();
		
		obj1.add("Anujam");
		obj1.add("3");
		obj1.add("Chocolate");
		obj1.add("12.34");
		
		for(String val:obj1)
		{
			System.out.println(val);
		}
		System.out.println("===============================================");
		obj1.remove("Chocolate");
		for(String val2: obj1) {
			System.out.println(val2);
		}
	}

}
