package SelfPractice;

import java.util.Stack;

public class AdjacentDuplicate {

	public static String removeDuplicates(String s) {
		
		StringBuffer stbf = new StringBuffer();
		
        Stack<Character> stk = new Stack<>();
        for(char c: s.toCharArray()) {
        	if(stk.isEmpty() || !stk.peek().equals(c)) {
        		stk.add(c);
        	}
        	else {
        		stk.pop();
        	}
        }
        
        for(char ch: stk) {
        	stbf.append(String.valueOf(ch));
        	
        }
        
        return stbf.toString();
    }

}
