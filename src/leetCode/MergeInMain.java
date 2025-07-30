package leetCode;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeInMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] arr = { { 1, 3 }, { 2, 4 }, { 6, 8 }, { 9, 10 } };

		Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));

		ArrayList<int[]> mergedArr = new ArrayList<>();

		int[] currArr = arr[0];
		
		mergedArr.add(currArr);

		for (int i = 1; i < arr.length; i++) {
			int[] nextArr = arr[i];

			if (nextArr[0] <= currArr[1]) {
				currArr[1] = Math.max(currArr[1], nextArr[1]);
			} else {
				currArr = nextArr;
				mergedArr.add(currArr);
			}

		}

		System.out.println("Merged intervals:");
		for (int[] interval : mergedArr) {
			System.out.println(Arrays.toString(interval));
		}

	}
}
