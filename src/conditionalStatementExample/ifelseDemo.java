package conditionalStatementExample;

public class ifelseDemo {
	
	public static void main(String[] args) {
			
	String browser = "Anujam";
	
	if(browser.equalsIgnoreCase("Firefox"))
	{
		System.out.println("The browser is Firefox!");
	}
	else if(browser.equalsIgnoreCase("Chrome"))
	{
		System.out.println("The browser is Chrome!");
	}
	else if(browser.equalsIgnoreCase("IE"))
	{
		System.out.println("The browser is Chrome!");
	}
	else
	{
		System.out.println("Please provide the right browser.");
	}
}
}
 