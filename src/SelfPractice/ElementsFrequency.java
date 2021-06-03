package SelfPractice;

import java.util.ArrayList;
import java.util.Scanner;

public class ElementsFrequency {

	public static void setFreq(int arr[]) {
		int count = 0;
		ArrayList<Integer> arrList = new ArrayList<Integer>();
		for (int i = 0; i < arr.length; i++) {
			if (i == 0 || !arrList.contains(arr[i])) {
				int newCount = counter(arr, i);
				if (newCount > count) {
					for (int j = 0; j < newCount; j++) {
						arrList.add(0, arr[i]);
					}

					count = newCount;
				} else {
					for (int j = 0; j < newCount; j++) {
						arrList.add(arr[i]);
					}

					count = newCount;
				}
			}

		}

		System.out.println(arrList);

	}

	public static int counter(int arr[], int pos) {

		int count = 1;
		int num = arr[pos];

		for (int i = 0; i < arr.length; i++) {
			if (num == arr[i] && i != pos) {
				count++;
			}
		}
		return count;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		@SuppressWarnings("resource")
		Scanner scn = new Scanner(System.in);
		int arrSize = scn.nextInt();
		int arr[] = new int[arrSize];

		for (int i = 0; i < arrSize; i++) {
			arr[i] = scn.nextInt();
		}

		setFreq(arr);

	}

}
