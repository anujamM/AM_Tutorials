package Interview;

import java.util.HashSet;

public class Repeating_Element {

	public static void main(String[] args) {
		int arr[] = { 1, 6, 9, 67, 33, 65, 87, 99, 99};
		printFirstRepeating(arr);
		
		int[] input = {1, 2, 3, 4, 1, 2, 3, 5, 6, 1, 2};
		int i = input.length;
	}
	
	public static void printFirstRepeating(int arr[]) {
		int length = arr.length;
		int min = 0;
		
		HashSet<Integer> set = new HashSet<>();
		
		for(int i = length-1; i>=0; i--) {
			if(set.contains(arr[i])) {
				min = i;
			}
			else
				set.add(arr[i]);
		}
		
		if(min!=0) {
			System.out.println("The first repeating element is: " + arr[min]);
		}
		else
			System.out.println("There are no repeating element.");
	}

}
