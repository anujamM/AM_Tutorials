package SelfPractice;

public class AlternateInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 12345;
		int b = 678;
		
		String aa = Integer.toString(a);
		String bb = Integer.toString(b);
		
		StringBuffer stbf = new StringBuffer();
		
		int pos1 = 0;
		int pos2 = 0;
		
		for(int i = 0; i<aa.length(); i++) {
		if(i%2 == 0) {
			stbf.append(Character.toString(aa.charAt(pos1++)));
			
		}
		else
			stbf.append(Character.toString(bb.charAt(pos2++)));
		}
		System.out.println(stbf.toString());
	}
}
