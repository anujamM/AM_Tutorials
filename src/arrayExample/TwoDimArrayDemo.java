package arrayExample;

public class TwoDimArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int student_id[][] = new int[2][2];

		student_id[0][0] = 12;
		student_id[0][1] = 34;
		student_id[1][0] = 56;
		student_id[1][1] = 78;

		System.out.println("Total number of rows:" + student_id.length);
		System.out.println("Total number of columns:" + student_id[0].length);

		for (int row = 0; row < student_id.length; row++) {
			for (int col = 0; col < student_id[0].length; col++) {
				System.out.println("The value of row " + row + col + " is: " + student_id[row][col]);
			}
		}
	}
}
