package collectionFramework;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcept {

	public static <E> void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> ll = new LinkedList<>();

		ll.add("Anujam");
		ll.add("Mondal");
		ll.add("Ram");
		ll.add("Kumar");

		System.out.println(ll);

		ll.addFirst("Mr.");
		ll.addLast("Last");

		System.out.println(ll);

		Iterator<String> it = ll.descendingIterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}

		Iterator<String> it2 = ll.listIterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		ll.removeFirst();
		System.out.println(ll);
		
		int n=0;
		while(ll.size()> n) {
			System.out.println(ll.get(n));
			n++;
		}
		
		
	}

}
