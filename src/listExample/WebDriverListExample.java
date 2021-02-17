package listExample;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class WebDriverListExample {

	public static void main (String[] args) 
	{
		List<String> obj1 = new ArrayList<String>();
		
		obj1.add("Anujam");
		obj1.add("Mondal");
		obj1.add("Cerner");
		
		obj1.add("qqwee");
		
		for(String var: obj1)
		{
			System.out.println(var);
		}
	}

}
