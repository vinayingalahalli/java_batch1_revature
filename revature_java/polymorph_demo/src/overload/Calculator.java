package overload;

public class Calculator {

	public void add(int a, int b) {
		System.out.println("calling int,int result is " + (a + b));
	}

	public int add(int a, int b, int c) {
		return a + b + c;
	}

	public void add(float a, float b) {
		System.out.println("calling float,float result is " + (a + b));
	}
	
	public void add(int a,float b) {
		System.out.println("calling int,float result is "+(a+b));
	}
}
