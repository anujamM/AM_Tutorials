package SelfPractice;

public class TargetArray {

	public int[] createTargetArray(int[] nums, int[] index) {

		int[] array = new int[nums.length];

		for (int i = 0, j = 0; i < index.length && j < nums.length; i++, j++) {
			array[index[i]] = nums[j];
		}

		for (int count : array) {
			System.out.println(count);

		}
		
		return array;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TargetArray trgt = new TargetArray();
		int[] nums = { 0, 1, 2, 3, 4 };
		int[] index = { 0, 1, 2, 2, 1 };
		trgt.createTargetArray(nums, index);
	}

}
