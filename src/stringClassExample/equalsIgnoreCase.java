package stringClassExample;

public class equalsIgnoreCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name1 = "My Name is Anujam";
		String name2 = "my name is anujam";
		
		boolean status = name1.equalsIgnoreCase(name2);
		System.out.println("Status is: "+status);
		
		
	}

}
