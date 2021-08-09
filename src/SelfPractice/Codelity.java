package SelfPractice;

import java.util.ArrayList;
import java.util.Arrays;

public class Codelity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int[] A = {1,3,6,4,1,2};
		
	        // write your code in Java SE 8
	        Arrays.sort(A);
	        int a = A[A.length - 1];
	        ArrayList<Integer> arrList = new ArrayList<>();
	        for(Integer i: A) {
	        	arrList.add(i);
	        }
	        System.out.println(arrList);

//	        // return A[A.length -1 ] + 1;
//	        if(a < 1){
//	            return 1;
//	        }
//	        for(int i=1; i <= a; i++){
//	            if(!Arrays.asList(A).contains(i)){
//	                return i;
//	            }
//	        }
//	        return a+1;
	    }
	}
