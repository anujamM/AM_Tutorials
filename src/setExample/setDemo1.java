package setExample;

import java.util.HashSet;

public class setDemo1 {

	public static void main(String[] args) {

		HashSet<String> obj1 = new HashSet<>();

		obj1.add("Anujam");
		obj1.add("3");
		obj1.add("Chocolate");
		obj1.add("3"); //Doesn't allow duplicate values
		obj1.add("12.34");

		System.out.println(obj1);

	}

}
