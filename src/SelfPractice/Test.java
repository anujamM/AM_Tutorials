package SelfPractice;

public class Test {
	static int a = 2;
	static int largest = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Test test = new Test();
//		test.a = 3;
//		System.out.println(a);
//		test.abc();
		
//		System.out.println(halvesAreAlike("book"));
		System.out.println(testLargest());
		
		
	}
	
//	public void abc() {
//		a = 4;
//		System.out.println(a);
//		Whitespace.xyz = 5;
//		Whitespace wht = new Whitespace();
//		wht.abc = 6;
//		
//		String str = "Anujam";
//		
//		String[] first = {str.substring(0, (str.length()/2-1)), str.substring((str.length()/2), (str.length()-1))};
//		
//		if(first.contains(sArr[i])
//		
//		
//		
//	}
	
//	 public static boolean halvesAreAlike(String str) {
//	        
//	        String[] twoHalves = {str.substring(0, (str.length()/2-1)), str.substring((str.length()/2), (str.length()-1))};
//	        
//	        System.out.println(twoHalves[0]);
//	        System.out.println(twoHalves[1]);
//	        
//	        String vowels[] = {"a", "e", "i", "o", "u"};
//	        
//	        return vowelCounter(twoHalves[0], vowels) == vowelCounter(twoHalves[1], vowels);
//	        
//	    
//	    }
//	    
//	    public static int vowelCounter(String s,  String[] sArr) {
//	        int count = 0;
//	        
//	        for(int i = 0; i<sArr.length; i++){
//	            if(s.toLowerCase().contains(sArr[i].toLowerCase())){
//	                count++;
//	            }
//	        }
//	        return count;
//	    }
	
	public static int testLargest() {
		int[] arr = {1, 1, 1};
		for(int i=0; i< arr.length; i++){
			if(arr[i] > largest){
				largest = arr[i];
			}
		}
		return largest;
	}

}
