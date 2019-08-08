package examples;

import java.util.Scanner;

public class Demo3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size = sc.nextInt();
		int ar2[] = new int[size];
		System.out.println("Enter " + size + " no of element/s");
		for (int i = 0; i < ar2.length; i++) {
			ar2[i] = sc.nextInt();
		}
		Demo3 d3=new Demo3();
		d3.printArray(ar2);//pass by reference
		System.out.println("Enter the search element");
		int ele=sc.nextInt();
		if(!d3.searchArray(ar2, ele)) {
			System.out.println(ele+" not found");
		}

	}
	
	public void printArray(int arr[]) {
		System.out.println("Contents of your array is");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	public boolean searchArray(int ar[],int ele) {
		boolean b=false;
		int c=0;
		for (int i = 0; i < ar.length; i++) {
			if(ar[i]==ele) {
				b=true;
				System.out.println(ele+" found at index "+(i+1));
				//break;
				c++;
			}
		}
		System.out.println(ele+" occured "+c+" no of time/s");
		return b;
	}
	
}
