package SelfPracticeNew;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Anujam6 Mondal2";
		
		String[] str = s.split(" ");
		String[] ans = new String[10];
		StringBuilder sb = new StringBuilder();
		
		for(String e : str) {
			int index = (e.charAt(e.length() - 1)) - '0';
			ans[index - 1] = e.substring(0, e.length() - 1);
			
		}
		
		for(String ss : ans) {
			sb.append(ss).append(" ").trimToSize();
		}
		System.out.println(sb);
		
	}
}
