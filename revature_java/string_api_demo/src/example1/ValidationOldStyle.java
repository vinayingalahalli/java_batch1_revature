package example1;

public class ValidationOldStyle {

	public static void main(String[] args) {
		
		/*
		 * Given input's total length should be 10
		 *  first 5 letters should be uppercase
		 *  followed by 4 digits
		 *  last position should be a uppercase letter
		 */
		String s="1DEFU1989O";
		
		boolean b=false;
		
		if(s.length()==10 && Character.isUpperCase(s.charAt(9))) {
			int upper=0;
			for (int i = 0; i < 5; i++) {
				if(Character.isUpperCase(s.charAt(i))) {
					upper++;
				}
			}
			if(upper==5) {
				int digit=0;
				for (int i = 5; i < 9; i++) {
					if(Character.isDigit(s.charAt(i))) {
						digit++;
					}
				}
				if(digit==4) {
					b=true;
				}
			}
			
		}
		
		if(b) {
			System.out.println("Validated");
		}else {
			System.out.println("Not valid data");
		}

	}

}
