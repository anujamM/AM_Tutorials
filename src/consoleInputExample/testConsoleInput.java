package consoleInputExample;

import java.io.IOException;
import java.util.Scanner;


public class testConsoleInput {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub


		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("Take first input: ");
		int a = input.nextInt();
		System.out.println("First Input is: " + a);

		System.out.println("Take second input: ");
		int b = input.nextInt();
		System.out.println("Second Input is: " + b);

		int c = a + b;
		System.out.println("The final output adding these two ints are: " + c);

		//		System.out.print("Write first input: " +  System.in.read());
		//		System.out.println("First input is: ");

		System.out.println("Write the first name: ");
		String fName = input.nextLine().trim();
		System.out.println("Write the last name: ");
		String lName = input.nextLine().trim();
		System.out.println("Full Name is: " + fName + " " + lName);
	}
}
