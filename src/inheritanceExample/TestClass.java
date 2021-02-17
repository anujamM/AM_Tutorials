package inheritanceExample;

public class TestClass {
	public static void main(String[] args)
	// TODO Auto-generated method stub
	{
		childClass obj1 = new childClass();
		
		obj1.add();
		obj1.sub();
		obj1.div();
		obj1.mul();
		
		BaseClass obj2 = new childClass();
		obj2.add();
		obj2.sub();
		
		BaseClass obj3 = new BaseClass() {
			
			@Override
			public void sub() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void add() {
				// TODO Auto-generated method stub
				
			}
		};
	}
}
