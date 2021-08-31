package SelfPracticeNew;

public class Concat {

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		String[] A = {"co", "dil", "ity"};
//		solution(A);
//	}
//	
//	public static int solution(String[] A) {
//        // write your code in Java SE 8
//        int count = 0;
//        for(int i = 0; i<A.length; i++){
//            for(int j = i+1; j<A.length; j++ ){
//                if(isUnique(A[i] + A[j])){
//                    count++;
//                }
//            }
//        
//                for(int k = 0; k<i; k++){
//                if(isUnique(A[i] + A[k])){
//                    count++;
//                }
//            }
//            
//        }
//        return count;
//    }
//
//    public static boolean isUnique(String str){
//    	System.out.println(str);
//        Set<Character> s = new HashSet<>();
//        for(char c : str.toCharArray()){
//            s.add(c);
//        }
//        
//        // Iterator i = s.iterator();
//        // String str1 = (String) i.next();
//        if(s.size() == str.length()){
//            return true;
//        }
//        return false;
//    }
	
	public static void main(String args[]) {
		truncateSentence("Hello how are you Contestant", 2);
	}
    public static String truncateSentence(String s, int k) {
        String[] str = s.split(" ");
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i<Math.min(str.length, k); i++) {
        	sb.append(str[i]).append(" ");
        }
        System.out.println(sb.toString());
        return sb.toString();
    }
}
