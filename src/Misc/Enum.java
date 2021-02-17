package Misc;

public class Enum {

	enum Levels { 
		Low,
		Medium,
		High 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Levels lvl = Levels.Medium;

		switch(lvl) {
		case Low:
			System.out.println("Low Level!!!");
			break;
			
		case Medium:
			System.out.println("Medium Level!!!");
			break;
			
		case High:
			System.out.println("High Level!!!");
			break;
		}
		
		for(Levels lvls : Levels.values()) {
			System.out.println(lvls);
		}
			
	}

}
