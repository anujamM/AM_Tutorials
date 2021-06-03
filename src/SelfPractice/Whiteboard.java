package SelfPractice;

import java.util.ArrayList;
import java.util.Collections;

import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;

public class Whiteboard {

	// public static int[] addtwo() {
	//
	// int[] nums = { 2, 7, 11, 15 };
	// int target = 9;
	//
	// for (int i = 0; i < nums.length; i++) {
	// for (int j = i + 1; j < nums.length; j++) {
	// if (nums[i] + nums[j] == target) {
	//
	// return new int[] { i, j };
	// }
	// }
	// }
	// return null;
	// }
	
public static ArrayList<Integer> findDuplicates(int[] nums) {
        
        ArrayList<Integer> arrList = new ArrayList<Integer>();
        
        for(int i=0; i<nums.length; i++){
            for(int j = 0; j<nums.length; j++) {
                if(i!=j && nums[i] == nums[j] && !arrList.contains(nums[i])){
                    arrList.add(nums[i]);
                }
            }
        }
        Collections.sort(arrList);
        return arrList;
        
    }

	public static void main(String args[]) {
		int[] num = {4,3,2,7,8,2,3,1};
		findDuplicates(num);
	}
	
	public void testingTest() {
		StringBuilder stb = new StringBuilder();
		StringBuffer sbf = new StringBuffer();
	}

}
