package collectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee("Anujam", 28, "PA");
		Employee e2 = new Employee("Amal", 30, "Arch");
		Employee e3 = new Employee("Kamal", 35, "Claims");

		ArrayList<Employee> arrList = new ArrayList<>();
		arrList.add(e1);
		arrList.add(e2);
		arrList.add(e3);

		Employee e4 = new Employee("Bimal", 55, "PA");
		Employee e5 = new Employee("Amal", 30, "Arch");
		Employee e6 = new Employee("Kumar", 10, "Claims");

		ArrayList<Employee> arrList2 = new ArrayList<>();
		arrList.add(e4);
		arrList.add(e5);
		arrList.add(e6);
		
		Employee e7 = new Employee("Babai", 28, "PA");
		arrList.set(0, e7);

//		arrList.retainAll(arrList2);
//		for(int i=0; i<arrList.size(); i++) {
//			System.out.println(arrList.get(i));
//		}
		
		ArrayList<Employee> arrList3 = new ArrayList<>();
		arrList3.addAll(arrList);
		arrList3.addAll(arrList2);

//		 Iterator<Employee> it = arrList.iterator();
//		
//		 while (it.hasNext()) {
//		 Employee emp = it.next();
//		 System.out.println("Employee name is: " + emp.name);
//		 System.out.println("Employee age is: " + emp.age);
//		 System.out.println("Employee department is: " + emp.dept);
//		 }
		
		
		 Iterator<Employee> it2 = arrList3.iterator();
		
		 while (it2.hasNext()) {
		 Employee emp = it2.next();
		 System.out.println("Employee name is: " + emp.name);
		 System.out.println("Employee age is: " + emp.age);
		 System.out.println("Employee department is: " + emp.dept);
		 }
		 
		 arrList3.removeAll(arrList);

	}

}
