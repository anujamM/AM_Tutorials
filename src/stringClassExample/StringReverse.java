package stringClassExample;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuffer stringBfr = new StringBuffer("This is the interview requirement.");
		
		stringBfr.reverse();
		String s = stringBfr.substring(1);
		
		System.out.println(stringBfr);
		System.out.println(s);
	}

}
