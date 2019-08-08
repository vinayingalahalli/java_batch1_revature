package example3;

public class Product {

	int id;   // Global instance or object level variable
	String name;
	double price;
	static float discount=5.5f;  // class level variable
	
	public void printProduct() {
		int x=0; // local variable
		System.out.println("Id = "+id);
		System.out.println("Name = "+name);
		System.out.println("Price = "+price);
		System.out.println("Discount = "+discount);
	}
}
/*
Operators in Java
if if-else if elseif else and switch case

*/