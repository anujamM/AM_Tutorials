package SelfPracticeNew;

import java.util.List;

public class ItemMatch {

public static String[] token = {"type", "color", "name"};
    
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int key= findKey(ruleKey);
        int count = 0;
        if(key<0) {
        	System.out.println("Invalid!!");
        	return count;
        }
        
        for(List<String> item : items) {
        	if(item.get(key).equals(ruleValue)) {
        		count++;
        	}
        }
        return count;
    }
    
    public int findKey(String ruleKey){
        for(int i=0; i<token.length; i++) {
        	if(ruleKey.equals(token[i])) {
        		return i;
        	}
        }
        return -1;
    }

}
