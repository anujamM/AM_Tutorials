package SelfPractice;

import java.util.ArrayList;
import java.util.Scanner;

public class SixDigitNumberx2 {

	public void sixDigitNumCheck(int number) {

		ArrayList<Integer> arrNum = createList(number);
		ArrayList<Integer> arrResultNum = createList((number * 2));
		if (arrNum.size() == arrResultNum.size()) {
			if (arrNum.containsAll(arrResultNum)) {
				System.out.println("yeeeee!!");
			} else {
				System.out.println(":(");
			}

		}

	}

	public ArrayList<Integer> createList(int num) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		while (num > 0) {

			arr.add(num % 10);
			num = num / 10;
		}
		return arr;
	}

	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number = scn.nextInt();
		if (String.valueOf(number).length() == 6) {
			System.out.println("The number you've entered is: " + number);
			SixDigitNumberx2 pCheck = new SixDigitNumberx2();
			pCheck.sixDigitNumCheck(number);
		} else
			System.out.println("Invalid!");

	}
}
