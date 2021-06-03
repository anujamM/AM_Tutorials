package SelfPractice;

public class NthMaxNumber {

	public int maxnums(int[] nums) {

//		int max = 0;
//		for (int i = 0; i < nums.length; i++) {
//			for (int j = i + 1; j < nums.length; j++) {
//				if (nums[i] > nums[j] && i!=j) {
//					max = nums[i];
//					nums[i] = nums[j];
//					nums[j] = max;
//				}
//			}
//		}
		int firstMax =  firstMax(nums);
		//when length < 3 return max
		if(nums.length < 3) {
			return firstMax;
		}
		else { //return third max
			//second max
			int secondMax = nums[0];
			for(int i= 0;i<nums.length;i++) {
				if(nums[i] > secondMax && nums[i] < firstMax) {
					secondMax = nums[i];
				}
			}
			
			//third max
			int thirdMax = nums[0];
			for(int i = 0;i<nums.length;i++) {
				if(nums[i] > thirdMax && nums[i] < secondMax) {
					thirdMax = nums[i];
				}
			}
			
			return thirdMax;
		}
		

	}
	
	public int firstMax(int[] nums) {
		int max = nums[0];
		for(int i = 0; i<nums.length; i++) {
			if(nums[i]> max) {
				max = nums[i];
			}
		}
		
		return max;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NthMaxNumber trgt = new NthMaxNumber();
		int[] nums = { 0, 4 };
		System.out.println("nums: " + trgt.maxnums(nums));
	}

}
