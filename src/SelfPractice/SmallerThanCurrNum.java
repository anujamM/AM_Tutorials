package SelfPractice;

import java.util.ArrayList;

public class SmallerThanCurrNum {
	
    public int[] smallerNumbersThanCurrent(int[] nums) {
    	
    	int[] array = new int[nums.length];
        int count = 0;
        
        for(int i = 0; i<nums.length; i++){
            for(int j = i+1; j<nums.length; j++){
                if(j!=i && nums[j]<nums[i]){
                    count++;
                }
            }
            array[i] = count;
        }
    return array;
    }
	
	public static void main(String args[]) {
		
		int[] nums = {8,1,2,2,3};
		SmallerThanCurrNum test = new SmallerThanCurrNum();
		test.smallerNumbersThanCurrent(nums);
	}
}
