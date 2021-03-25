package Interview;

public class First45NaturalNumbersSum {
	
	public int sumNum() {
		int sum = 0;
		for(int i = 1; i<= 45; i++) {
//			sum = sum + i;
			sum = ((i * (i+1)) / 2);
			
		}
		
		return sum;
	}


	public static void main(String args[]) {
		First45NaturalNumbersSum sum = new First45NaturalNumbersSum();
		System.out.println(sum.sumNum());
		
	}
}
