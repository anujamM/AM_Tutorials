package stringClassExample;

public class starts_end_with {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name1 = "Selenium Webdriver";
		
		boolean status1 = name1.startsWith("Selenium");
		System.out.println("Status is: "+status1);
		
		String name2 = "Welcome to Selenium Webdriver world";
		
		boolean status2 = name2.endsWith("world"); 
		System.out.println("Status is: "+status2);

	}

}
