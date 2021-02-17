package setExample;

import java.util.LinkedHashSet;

public class setDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedHashSet<String> obj1 = new LinkedHashSet<>();
		
		obj1.add("Anujam");
		obj1.add("3");
		obj1.add("Chocolate");
		obj1.add("12.34");
		
		for(String val:obj1)
		{
			System.out.println(val);
		}
	}

}
