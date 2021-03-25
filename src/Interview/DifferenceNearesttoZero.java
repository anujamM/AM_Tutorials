package Interview;

import java.util.Scanner;

public class DifferenceNearesttoZero {

	private static void nearestToZero(int arr[]) {

		int min = arr[0] + arr[1];
		int n1= 0, n2 = 1;

		for(int i=0; i<arr.length; i++) {
			for(int j= i+1; j<arr.length; j++) {
				if(Math.abs(arr[i]+ arr[j]) < min ) {
					min = Math.abs(arr[i] + arr[j]);
					n1 = i;
					n2= j;
				}
			}
		}
		
		System.out.println(arr[n1] +", " +arr[n2]);


	}

	public static void main(String args[]) {

		Scanner scn = new Scanner(System.in);
		int arrSize = scn.nextInt();
		int arr[] = new int[arrSize];

		for (int i = 0; i < arrSize; i++) {
			arr[i] = scn.nextInt();
		}

		nearestToZero(arr);

	}

}
