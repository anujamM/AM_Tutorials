package stringClassExample;

public class stringSplit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String fullname = "My name is Anujam Mondal";
		String[] split = fullname.split(" ");
		
		for(int i=0; i<split.length; i++)
		{
			System.out.println("Value for "+i+" is: "+split[i]);
		}
		
		
	}

}
