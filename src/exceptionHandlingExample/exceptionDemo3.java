package exceptionHandlingExample;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class exceptionDemo3 {

	public static void main(String[] args) throws InterruptedException, AWTException {
//		System.out.println("Start");
//		Thread.sleep(5000);
//		System.out.println("End");
		
		FileInputStream fis;
		try {
			fis = new FileInputStream("");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.out.println("Cause is: " + e.fillInStackTrace());
		}
		
		Robot rbt = new Robot(); //Abstract Window Toolkit except
		

	}
}


