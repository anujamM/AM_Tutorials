package SelfPractice;

public class ReverseInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 1234;
		int r, sum = 0;
		
		while(n>0) {
			r = n%10;
			sum = (sum * 10) + r;
			n = n/10;
		}
		
		System.out.println(sum);
	}

}
