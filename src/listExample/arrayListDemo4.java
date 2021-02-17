package listExample;

import java.util.ArrayList;
import java.util.Iterator;

public class arrayListDemo4 {

	public static void main (String[] args) 
	{
		// TODO Auto-generated method stub
		
		ArrayList obj1 = new ArrayList();
		
		obj1.add(9);
		obj1.add("Anujam");
		obj1.add("Anujam");
		obj1.add(12.34);
		
		
		System.out.println(obj1);
		System.out.println(obj1.get(2));
		
		int listSize = obj1.size();
		System.out.println(listSize);
		
		/*Object abc = obj1.iterator();
		System.out.println(abc);*/
		
		Iterator itr = obj1.iterator();
		
		while(itr.hasNext())
		{
			Object abc = itr.next();
			System.out.println("Value: "+abc);
		}
	}

}
