package example1;

import java.util.Arrays;

public class Demo1 {

	public static void main(String[] args) {
		String s1 = "hello";

		System.out.println(s1);
		System.out.println(s1.toUpperCase());
		System.out.println(s1);
		
		s1=s1.toUpperCase();
		System.out.println(s1);
		
		System.out.println(s1.equals("hello"));
		System.out.println(s1.equals("HELLO"));
		System.out.println(s1.equalsIgnoreCase("HeLLo"));
		
		
		System.out.println(s1.endsWith("ello".toUpperCase()));
		System.out.println(s1.startsWith("H"));
		System.out.println(s1.contains("EL"));
		System.out.println(s1.contains("LOL"));
		
		System.out.println(s1.substring(1));
		System.out.println(s1.substring(1,4));
		
		System.out.println(s1.length());
		System.out.println(s1.charAt(4));
		
		for (int i = 0; i <s1.length(); i++) {
			System.out.println(s1.charAt(i));
		}
		
		char c[]=s1.toCharArray();
		
		System.out.println(Arrays.toString(c));
		c[3]='m';
		c[0]='l';
		
		System.out.println(Arrays.toString(c));
		String s2=new String(c);
		System.out.println(s2);
		
		
		String s3="     skjdfhsdjfhdskjfh    ";
		System.out.println(s3);
		System.out.println(s3.trim());
		
		
		String s4="hello hi good morning. enjoying java programming?";
		String s5[]=s4.split(" ");
		for (int i = 0; i < s5.length; i++) {
			System.out.println(s5[i].toUpperCase());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
