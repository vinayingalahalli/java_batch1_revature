package hash_algorithms;

import java.util.Scanner;

public class HashMain {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		String input="";
		
		// instantiate your method class
		MD5Demo md5=new MD5Demo();
		SHA1Demo sha1=new SHA1Demo();
		SHA256Demo sha256=new SHA256Demo();
		SHA512Demo sha512=new SHA512Demo();
		
		
		// call the algorithm
		
		
		
		
		// print the hash		
		
		
		
		
		
		int ch = 0;
		
		do {
			System.out.println("---------------------------------");
			System.out.println("Welcome to the Hash Algorithm App");
			System.out.println("---------------------------------");
			System.out.println("Select the Hash Algorithm to try ");
			System.out.println("1. MD5 ");
			System.out.println("2. SHA-1 ");
			System.out.println("3. SHA-256 ");
			System.out.println("4. SHA-516 ");
			System.out.println("5. Exit ");
			System.out.println("> ");
			ch=sc.nextInt();			
			
			switch (ch) {
			case 1:
				System.out.println("Type a string to try :");
				input=sc.next();
				
				// call the algorithm
				String outMD5 = md5.md5(input);
				
				// print the hash
				System.out.println(outMD5);				
				break;
			case 2:
				System.out.println("Type a string to try :");
				input=sc.next();
				
				// call the algorithm
				String out1 = sha1.sha1(input);
				
				// print the hash
				System.out.println(out1);		
				break;
			case 3:
				System.out.println("Type a string to try :");
				input=sc.next();
				
				// call the algorithm
				String out256 = sha256.sha256(input);
				
				// print the hash
				System.out.println(out256);		
				break;
			case 4:
				System.out.println("Type a string to try :");
				input=sc.next();
				
				// call the algorithm
				String out512 = sha512.sha512(input);
				
				// print the hash
				System.out.println(out512);
				break;
			case 5:
				System.out.println("Thanks for using the Hash Algorithm App");
				break;
			default:
				System.out.println("Try something else...");
				break;
			}			
		} while (ch != 5);
		
		
		
		sc.close();
	}

}
