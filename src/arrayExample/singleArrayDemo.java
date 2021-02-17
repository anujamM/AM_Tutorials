 package arrayExample;

public class singleArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int student_id[] = new int[5];
		
		student_id [0] = (int) 90.5;
		student_id [1] = 20;
		student_id [2] = 30;
		student_id [3] = 40;
		student_id [4] = 50;
		
		int size = student_id.length;
		System.out.println("Size of Array is:" +size);
		
		for(int i=0; i<size; i++)
		{
			System.out.println(+i+ "th" +" "+ "position contains: "+student_id[i]);
		}
		
		
		String student_name[] = new String[5];
		
		student_name [0] = "A";
		student_name [1] = "B";
		student_name [2] = "C";
		student_name [3] = "D";
		student_name [4] = "E";
		
		for (int i=0; i<5; i++)
		{
			System.out.println("The "+ i +"th value of Student Name is: "+student_name[i]);
		}
	}

}
