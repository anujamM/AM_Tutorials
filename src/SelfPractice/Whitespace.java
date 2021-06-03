package SelfPractice;

import java.util.Scanner;

public class Whitespace {
	
	public int abc = 2;
	public static int xyz = 3;
	

	public static void main(String[] args) {
		System.out.println("Input: ");
		Scanner scn = new Scanner(System.in);
		String input = scn.nextLine();
		
		String output = input.replaceAll("\\s", "");
		System.out.println(output);
	}

}
