package Interview;

public class Nearest_Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 131;
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
			System.out.println("r =" + r);
			sum = (sum * 10) + r;
			System.out.println("sum = " + sum);
			n = n / 10;
			System.out.println("n = " + n);

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
