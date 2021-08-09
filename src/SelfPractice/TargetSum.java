package SelfPractice;

import java.util.ArrayList;
import java.util.List;

public class TargetSum {

	// static void sum_up_recursive(ArrayList<Integer> numbers, int target,
	// ArrayList<Integer> partial) {

	// int s = 0;
	//
	// for (int x : partial)
	// s += x;
	//
	// if (s == target)
	// System.out.println("sum(" + Arrays.toString(partial.toArray()) + ")=" +
	// target);
	// if (s >= target)
	// return;
	//
	//
	// for (int i = 0; i < numbers.size(); i++) {
	// ArrayList<Integer> remaining = new ArrayList<Integer>();
	// int n = numbers.get(i);
	// for (int j = i + 1; j < numbers.size(); j++)
	// remaining.add(numbers.get(j));
	// ArrayList<Integer> partial_rec = new ArrayList<Integer>(partial);
	// partial_rec.add(n);
	// sum_up_recursive(remaining, target, partial_rec);
	// }
	// }
	//
	// static void sum_up(ArrayList<Integer> numbers, int target) {
	// sum_up_recursive(numbers, target, new ArrayList<Integer>());
	// }

	public static int[] twoSum(int[] nums, int target) {
		List<Integer> restOfTarget = new ArrayList<Integer>();
		int numsSize = nums.length;
		for (int i = 0; i < numsSize; i++) {
			if (restOfTarget.contains(nums[i])) {
				return new int[] { restOfTarget.indexOf(nums[i]), i };
			}
			restOfTarget.add(target - nums[i]);
		}
		System.out.println(restOfTarget);
		return null;
	}

	public static void main(String args[]) {
		int[] numbers = { 3, 9, 8, 4, 5, 7, 10 };
		int target = 15;
		twoSum(numbers, target);
	}

}
