package loopsExample;

import java.util.ArrayList;
import java.util.Iterator;

public class whileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 50;
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(1);
		arr.add(2);
		
		Iterator i = arr.iterator();
		
//		while(i.hasNext())
//		{
//			System.out.println("Values:"+i.next());
//		}
		
		for(Object a:arr) {
			System.out.println(a);
		}
	}

}
