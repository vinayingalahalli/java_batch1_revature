package examples;

import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size = sc.nextInt();
		int ar2[] = new int[size];
		System.out.println("Enter " + size + " no of element/s");
		for (int i = 0; i < ar2.length; i++) {
			ar2[i] = sc.nextInt();
		}
		System.out.println("The elements which you entered are ");
		for (int i = 0; i < ar2.length; i++) {
			System.out.print(ar2[i] + "  ");
		}
		System.out.println("\nEnter the search element");
		int ele=sc.nextInt();
		boolean b=false;
		int c=0;
		for (int i = 0; i < ar2.length; i++) {
			if(ar2[i]==ele) {
				b=true;
				System.out.println(ele+" found at index "+(i+1));
				//break;
				c++;
			}
		}
		if(!b) {
			System.out.println(ele+" not found");
		}else {
			System.out.println(ele+" occured "+c+" no of time/s");
		}
		/*
			 * else { System.out.println(ele+" not found"); }
			 */

	}

}
