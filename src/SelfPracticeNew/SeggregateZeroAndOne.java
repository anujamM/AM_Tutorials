package SelfPracticeNew;

import java.util.ArrayList;

public class SeggregateZeroAndOne {
	
	public static void seggregateNums(int[] arr) {
		ArrayList<Integer> arrList = new ArrayList<Integer>();
		
		for(int i : arr) {
			if(i == 0) {
				arrList.add(0,i);
			}
			else
				arrList.add(i);
		}
		arrList.forEach(X -> System.out.print(" " + X));
		System.out.println(arrList);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {0, 1, 0, 1, 0, 0, 1, 1, 1, 0};
		seggregateNums(arr);
	}

}
