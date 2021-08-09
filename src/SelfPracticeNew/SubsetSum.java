package SelfPracticeNew;

import java.util.ArrayList;

public class SubsetSum {
	public static ArrayList<Integer> trimArray(int set[], int sum) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for(int i : set) {
			if(i<=sum) {
				arr.add(i);
			}
		}
		return arr;

	}
	
	public static boolean subSet(ArrayList<Integer> arr, int pos, int sum) {
		
//		1.subset(arr,0,9)
//		9-3 = 6 -> subset(arr,1,6) -> subset(arr,2,2) ->subset(arr,3,2) -> true
		if(pos >= arr.size())
			return false;
		
		if(sum - arr.get(pos) > 0) {
			return subSet(arr,pos++,sum - arr.get(pos));
			
		}
		else if(sum - arr.get(pos) < 0)
			return subSet(arr,pos++,sum);
		else
			return true;
			
	}
	
	public static void callerMethod(int[] set,int sum) {
		ArrayList<Integer> arr = trimArray(set,sum);
		
//		3, 4, 5, 2
//		i=0=>  subset(arr,0,9) ->
		for(int i = 0;i<arr.size();i++) {
			if(subSet(arr,i,sum)) {
				System.out.println("True");
				return;
			}
		}
		
		System.out.println("False");
		
	}

	public static void main(String[] args) {

		int[] set = { 3, 34, 4, 12, 5, 2 };
		int sum = 9;
		int n = set.length;
		
		callerMethod(set,sum);

	}

}
