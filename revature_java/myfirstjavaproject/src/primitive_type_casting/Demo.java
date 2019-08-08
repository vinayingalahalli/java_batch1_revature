package primitive_type_casting;

public class Demo {

	public static void main(String[] args) {
		/*
		 * Type Casting?
		 * Conversion of one data type to another.
		 * -> Implicit Casting - where smaller data type is converted to larger data type
		 *  implicitly by java compiler.
		 * -> Explicit Casting - here we convert larger data type to the smaller data type, where
		 * 			we programmers should explicitly say that to which smaller ones we are converting it to. 
		 */
		
		int x=10;
		long l=x;
		double d=x;
		float f=x;
		System.out.println("f = "+f);
		char c='A';
		x=c;
		System.out.println("x = "+x);
		x=99;
		char z=(char) x;
		System.out.println("z = "+z);
		
		double d1=123.4445555;
		int m=(int)d1;
		System.out.println("m = "+m);

	}

}
