package example2;

public class CalculatorMain {

	public static void main(String... args) {
		
		Calculator.sayHelloStatic();//static method
		
		Calculator c=new Calculator();
		c.sayHelloNonStatic();
		System.out.println(c.add(99, 89));
		int res=c.add(989, 786);
		System.out.println("res is "+res);
		
		System.out.println(new Calculator().add(123, 888));
		
	}

}
