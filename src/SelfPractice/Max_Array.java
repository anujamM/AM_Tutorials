package SelfPractice;

import java.util.ArrayList;

public class Max_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int arr[] = { 1, 6, 9, 67, 33, 65, 87, 99 };
		int arr[] = { 1, 6, 9, -54, 33, -87, 87, -1000 };
		int n = arr.length;
		maxProduct(arr, n);

		// ArrayList<Integer> arrEven = new ArrayList<Integer>();
		// arrEven.add(arr[n]);

	}

	public static void maxProduct(int arr[], int n) {
		if (n < 2) {
			System.out.println("Invalid!");
		} else if (n == 2) {
			System.out.println("Max product pair is: { " + arr[0] + " , " + arr[1] + " }");
		} else {

			int a = arr[0], b = arr[1];

			for (int i = 0; i < n; i++) {
				for (int j = i + 1; j < n; j++) {
					if ((arr[i] * arr[j]) > (a * b)) {
						a = arr[i];
						b = arr[j];
					}
				}

			}
			System.out.println("Max product pair is: { " + a + " , " + b + " }");
		}
	}

}
