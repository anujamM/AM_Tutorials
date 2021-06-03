package SelfPractice;

import java.util.ArrayList;
import java.util.List;

public class Iteration {

	public static void main(String[] args) {

		// int i1 =0;
		// int i2 =5;
		// int i3 =i2/i1;
		// try{
		// System.out.print("hello");
		// }
		// catch(Exception e){
		// System.out.print("world");
		// }

		// int i = 0;
		// int i1 = i++;
		// int i2 = ++i;
		// i = i1 + i2;
		// System.out.println(i);

//		int i = 0;
//		boolean t = true;
//		boolean f = false, b;
//
//		b = (t || ((i++) == 0));
//		System.out.println(i);
//		System.out.println(b);
//		b = (f || ((i += 2) > 0));
//		System.out.println(i);
//		System.out.println(b);
		
		List list = new ArrayList();
		list.add("hello");
		list.add(2);
		System.out.println(list.get(0) instanceof Object);
		System.out.println(list.get(1) instanceof Object);

	}

}
