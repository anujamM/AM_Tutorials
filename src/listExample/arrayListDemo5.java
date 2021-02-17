package listExample;

import java.util.ArrayList;
import java.util.Iterator;

public class arrayListDemo5 {

	public static void main (String[] args) 
	{
		ArrayList<String> obj1 = new ArrayList<String>();
		
		obj1.add("Anujam");
		obj1.add("Mondal");
		obj1.add("Cerner");
		
		for(String var: obj1)
		{
			System.out.println(var);
		}
	}

}
