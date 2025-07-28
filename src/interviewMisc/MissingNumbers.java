package interviewMisc;

import java.util.Arrays;
import java.util.HashSet;

public class MissingNumbers {
	/*
	 * Can you find missing numbers from a series in an Array? int[] arr = {1, 2, 4,
	 * 6, 7, 10};
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 4, 6, 7, 10 };
		Arrays.sort(arr);

		HashSet<Integer> hashset = new HashSet<>();

		for (int i : arr) {
			hashset.add(i);
		}

		int start = arr[0];
		int end = arr[arr.length - 1];

		System.out.println("Missing numbers: ");
		for (int i = start; i <= end; i++) {
			if (!hashset.contains(i)) {
				System.out.print(i + " ");
			}
		}
	}

}
