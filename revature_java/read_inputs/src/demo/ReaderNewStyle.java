package demo;

import java.util.Scanner;

public class ReaderNewStyle {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter your name");
		String name=sc.nextLine();
		System.out.println("Enter your age");
		int age=sc.nextInt();
		
		//nextFloat
		//nextDouble
		//nextLong
		
		System.out.println("Enter gender");
		char gender= sc.next().charAt(0);
		
		System.out.println("Name : "+name);
		System.out.println("Age : "+age);
		System.out.println("Gender : "+gender);
	}

}
