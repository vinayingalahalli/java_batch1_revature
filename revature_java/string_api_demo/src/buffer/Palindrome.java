package buffer;

public class Palindrome {

	public static void main(String[] args) {
		
		String s="madam";
		System.out.println(isPalindrome(s));
		System.out.println(isPalindrome("dkjsfhdskjfhdksjz"));
		int x=1211;
		System.out.println(isPalindrome(x+""));

	}
	
	public static boolean isPalindrome(String s) {
		//boolean b=false;
		/*StringBuffer sb=new StringBuffer(s);
		sb.reverse();
		String s2=sb.toString();
		if(s.equals(s2)) {
			b=true;
		}*/
		
		return new StringBuffer(s).reverse().toString().equals(s);
	}

}
