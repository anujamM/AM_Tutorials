package regexExample;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regEx {

	public static void main(String[] args) {

		Pattern p = Pattern.compile(".s");
		Matcher m = p.matcher("as");
		boolean b = m.matches();
		System.out.println(b);

		boolean b2 = Pattern.compile("...l").matcher("bell").matches();
		System.out.println(b2);
		
		boolean b3 = Pattern.matches("..l", "oil");
		System.out.println(b3);
	}

}
