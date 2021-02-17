package Interview;

import java.util.Scanner;

public class Whitespace {

	public static void main(String[] args) {
		System.out.println("Input: ");
		Scanner scn = new Scanner(System.in);
		String input = scn.nextLine();
		
		String output = input.replaceAll("\\s", "");
		System.out.println(output);
	}

}
