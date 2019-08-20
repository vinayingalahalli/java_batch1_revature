package example2;

import java.io.FileNotFoundException;

public class Main {

	public static void main(String[] args) {
		Validate v=new Validate();
		try {
			v.openFile("zdfsd");
		} catch (FileNotFoundException e) {
			System.out.println(e);
		}
		
		/*
		 * try { v.isValidContactNumber("dsfsdf"); } catch (Exception e1) {
		 * System.out.println(e1.getMessage()); }
		 */
		try {
			if(v.isValidContactNumber("+1-1234567890")) {
				System.out.println("Contact validated");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
		if(v.isValidAge(33)) {
			System.out.println("Age validated");
		}
		}catch(RuntimeException e) {
			System.out.println(e.getMessage());
		}
		
		
		v.divide(10, 0);

	}

}
