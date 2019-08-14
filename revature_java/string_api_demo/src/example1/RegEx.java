package example1;

public class RegEx {

	public static void main(String[] args) {
		/*
		 * Reg-Ex(Regular Expression)
		 * PMA - Pattern Matching Algorithm
		 * 
		 * [] - expression/pattern
		 * {} - length
		 * ^  - not
		 * [a-z]{3} - any 3 lower case letters
		 * [A-Z0-9]{5} - any 5 uppercase letters or digits
		 * [^0-9] - apart from digits
		 * [a-zA-Z]{4} - any 4 letters of any case
		 * [0-9]{1,} - minimum 1 digit should be there max any numbers
		 * [a-zA-Z0-9]{3,6} - any alphanumeric between 3 & 6
		 * +
		 * *
		 * ?
		 * () - grouping
		 */
		String s="UDEFU19891";
		if(s.matches("[A-Z]{5}[0-9]{4}[A-Z]{1}")) {
			System.out.println("Validated");
		}else {
			System.out.println("Invalid data");
		}
		
		String s1="As f**(w53489  afhga h ASL;";
		
		System.out.println(s1.replaceAll("[^a-zA-Z]", ""));
		System.out.println(s1.replaceAll("[^a-zA-Z]", "").length());
		System.out.println(s1.replaceAll("[^0-9]", ""));
		System.out.println(s1.replaceAll("[ a-zA-Z0-9]", ""));
		
	}
	
	

}
