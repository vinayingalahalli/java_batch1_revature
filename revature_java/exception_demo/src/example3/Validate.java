package example3;

import com.exception.InvalidAgeException;

public class Validate {
	public boolean isValidAge(int age) {
		if(age<=0) {
			throw new InvalidAgeException("Age cannot be -ve or zero");
			
		}else if(age<18 || age>32) {
			throw new InvalidAgeException("Age should be between 18 and 32 ");
		}
		return true;
	}
}
