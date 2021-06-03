package SelfPractice;

import java.util.ArrayList;

public class ArraySeg_CityCountry {
	
	public static void cityCountry(String abc[]) {
		ArrayList<String> country = new ArrayList<String>();
		ArrayList<String> city = new ArrayList<String>();
		
		for(int i = 0; i<abc.length; i++) {
			if(i%2==0){
				country.add(abc[i]);
			}
			else
			{
			city.add(abc[i]);
			}
			
		}
		System.out.println(country);
		System.out.println(city);
	}
	public static void main(String args[]) {
		String abc[] ={"Bangalore" , "India" , "Mysore" , "London"};
		cityCountry(abc);
	}
}
