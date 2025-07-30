package leetCode;

/*Input:  nums = [1, 2, 3, 4]
Output: [24, 12, 8, 6]

Explanation:
- answer[0] = 2 * 3 * 4 = 24
- answer[1] = 1 * 3 * 4 = 12
- answer[2] = 1 * 2 * 4 = 8
- answer[3] = 1 * 2 * 3 = 6
*/

public class ProdutOfArray {

	public static void main(String[] args) {
		// Brute Force - Non recommended

		int[] nums = { 1, 2, 3, 4 };

		int n = nums.length;

		int[] result = new int[n];

		for (int i = 0; i < n; i++) {
			int prod = 1;
			for (int j = 0; j < n; j++) {
				if (i != j) {
					prod *= nums[j];
				}
			}
			result[i] = prod;
		}

		for (int i : result) {
			System.out.print(i + " ");
		}

	}

}
