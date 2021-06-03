package SelfPractice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DuplicateValInt {
	
	public static void countRepeatInt(int abc[]) {
		Map<Integer, Integer> map = new HashMap<>();
		for(int c: abc) {
			if(map.containsKey(c)) {
				map.put(c, map.get(c)+1);
			}
			else
				map.put(c, 1);
		}
		
		for(Map.Entry<Integer, Integer> entry: map.entrySet()) {
			if(entry.getValue() > 1) {
				System.out.println(entry.getKey() + " " + entry.getValue());
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int arrSize = scn.nextInt();
		System.out.println(arrSize);
		int arr[] = new int[arrSize];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = scn.nextInt();
			System.out.println(arr);
		}
		
		countRepeatInt(arr);
	}

}
