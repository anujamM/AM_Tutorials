package exceptionHandlingExample;

public class exceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a = 10/0;	
			System.out.println("Exception khabe: " + a);
		} catch (ArithmeticException e) {
			// TODO: handle exception
			//			System.out.println("Arithmetic Exception");
			System.out.println("Cause is: " + e.getCause());
			System.out.println("Exception is: " + e.getMessage());
			System.out.println("Localized: " + e.getLocalizedMessage());
			System.out.println(e.getClass());
			System.out.println(e.getStackTrace());
			System.out.println(e.getSuppressed());
		}
		finally {
			System.out.println("Finally Block");
		}

		try {
			String str = null;
			System.out.println(str.length());

		}
		catch (Exception e) { 
			System.out.println("Exception is: " + e.getMessage());
		}


	}

}
