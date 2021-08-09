package SelfPractice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Anagram {

	public static void anagram(String input1, String input2) {
		
		ArrayList<Character> arrList1 = new ArrayList<>();
		ArrayList<Character> arrList2= new ArrayList<>();
		
		

		

		if (input1.length() == input2.length()) {
//			for(char a: input1.toCharArray()) {
//				arrList1.add(a);
//				System.out.println(arrList1);
//			}
//			for(char a: input2.toCharArray()) {
//				arrList2.add(a);
//				System.out.println(arrList2);
//		}		
//			if(arrList1.containsAll(arrList2)) {
//				System.out.println("Anagram");
//			}
//			else
//				System.out.println("Not!!!");
//			}
			List<Character> inp1 = input1.toLowerCase().chars().mapToObj(e->(char)e).collect(Collectors.toList());
			List<Character> inp2 = input2.toLowerCase().chars().mapToObj(e->(char)e).collect(Collectors.toList());
			
			if(inp1.containsAll(inp2) && !input1.equals(input2)){
				System.out.println("Anagram");
			}
			else
				System.out.println("Not!");
			
		}
		else
			System.out.println("Length Mismatch!");
		
		

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);

		String input1 = scn.next();
		String input2 = scn.next();
		anagram(input1, input2);
	}

}
