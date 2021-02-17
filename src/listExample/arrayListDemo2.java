package listExample;

import java.util.ArrayList;

public class arrayListDemo2 {

	public static void main(String[] args) 
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
		
		for(Object abc: obj1)
		{
			System.out.println("Elements: "+abc);
		}
	}

}
