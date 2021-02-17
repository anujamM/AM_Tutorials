package setExample;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class setDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<String> obj1 = new HashSet<>();
		
		obj1.add("Anujam");
		obj1.add("3");
		obj1.add("Chocolate");
		obj1.add("12.34");
		obj1.add("abc");
		
		System.out.println(obj1);
		
		System.out.println("===============================================");
		
		ArrayList<String> val = new ArrayList<>(obj1);
		System.out.println(val.get(4));
		
		/*for(String val2: val)
		{
			System.out.println(val2);
		}*/
	}

}
