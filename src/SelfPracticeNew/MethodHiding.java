package SelfPracticeNew;

import java.util.ArrayList;
import java.util.List;

public class MethodHiding {

	public static void main(String[] args) {
		Parent p = new Child();
		p.abc(); //Method Hiding
		p.xyz();
		
		Child c = new Child();
		c.abc();
		c.xyz();
		
		c.aaa();
		TestInterface test = new Child();
		test.aaa();
		
		List<Integer> list = new ArrayList<>();
	}

}

class Parent {

	public static void abc() {
		System.out.println("Parent - Static");
	}
	
	public void xyz() {
		System.out.println("Parent - Non-Static");
	}

}

class Child extends Parent implements TestInterface{

	public static void abc() {
		System.out.println("Child - Static");

	}
	
	public void xyz() {
		System.out.println("Child - Non-Static");
	}

	@Override
	public void aaa() {
		System.out.println("Interface method");
		
	}
}

interface TestInterface {
	public void aaa();
}

// ====================================================================

class Solution {
	public static void main() {
		truncateSentence("Hello how are you Contestant", 4);
	}
    public static String truncateSentence(String s, int k) {
        String[] strArr = s.split(", ");
        System.out.println(strArr);
        
        return "ABC";
    }
    
}