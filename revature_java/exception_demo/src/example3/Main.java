package example3;

import com.exception.BusinessException;
import com.exception.InvalidAgeException;

public class Main {

	public static void main(String[] args) {

		Validate v = new Validate();

		try {
			if (v.isValidAge(38)) {
				System.out.println("Age Validated");
			}
		} catch (InvalidAgeException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			if (v.isValidContactNumber("adfsdfsdfds")) {
				System.out.println("Contact validated");
			}
		} catch (BusinessException e) {
			System.out.println(e.getMessage());
		}
		
	}

}
