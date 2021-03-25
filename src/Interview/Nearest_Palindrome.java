package Interview;

public class Nearest_Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
<<<<<<< HEAD
		int n = 131;
=======
		int n = 122;
>>>>>>> a5a935b3cb0e5d2e2471d09f2c69f4e2f34c7df8
		if (isPalindrome(n)) {
			System.out.println(n + " is a palindrome number.");
		} else
			System.out.println(n + " is not a palidrome number.");

		closestPalindrome(n);
	}

	public static boolean isPalindrome(int n) {
		if (String.valueOf(n).length() < 2) {
			return false;

		}
		int temp = n, r, sum = 0;
		while (n > 0) {
			r = n % 10;
			sum = (sum * 10) + r;
			n = n / 10;

		}

		if (temp == sum) {

			return true;
		} else

			return false;
	}

	public static void closestPalindrome(int n) {
		int temp = n;
		int RSum = n - 1;
		int SSum = n + 1;

		while (isPalindrome(RSum) == false && RSum>0) {
			RSum--;
		}

		while (isPalindrome(SSum) == false) {
			SSum++;
		}

		if (Math.abs(temp - RSum) < Math.abs(temp - SSum) && isPalindrome(RSum)) {
			System.out.println("Nearest Palindrome: " + RSum);
		} else
			System.out.println("Nearest Palindrome: " + SSum);
	}

}
