package loopsExample;

import java.util.ArrayList;
import java.util.Iterator;

public class doWhileLoop {

	public static void main(String[] args) {
		
		int ticket = 75;
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(1);
		arr.add(2);
		
		Iterator i = arr.iterator();
		
		do {
			
			System.out.println("Current ticket number: "+arr);
			
			ticket++;
			
		}while(i.hasNext());
	}
}
