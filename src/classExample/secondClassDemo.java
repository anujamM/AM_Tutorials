package classExample;

public class secondClassDemo {

	public static void main(String[] args) {
		
		
	calculator obj1 = new calculator();
	obj1.sum(); //non static method - can be called only through object
	obj1.div();
	
	System.out.println("My name is: "+obj1.name);
	System.out.println("My surname is: "+obj1.surname);

	}

}
