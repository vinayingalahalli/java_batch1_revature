package example1;

public class Calculator {

	int a;
	int b;
	
	public Calculator(String name) {
		System.out.println("Hello "+name);
	}
	
	public Calculator(int a,int b) {
		this.a=a;
		this.b=b;
	}
	
	public int add() {
		return a+b;
	}
	
	public int multiply() {
		return a*b;
	}
}
