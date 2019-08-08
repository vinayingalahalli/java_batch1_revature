package example2;

public class Employee {
	int id;
	String name;
	int age;
	String city;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	public Employee(int id,String name) {
		this.id=id;
		this.name=name;
	}
	
	public Employee(int id,String name,int age,String city) {
		this(id,name);  //constructor chaining
		this.age=age;
		this.city=city;
	}
	
	
	public void printEmployee() {
		System.out.println("Id  = "+this.id);
		System.out.println("Name = "+this.name);
		System.out.println("Age = "+age);
		System.out.println("City = "+city);
	}
}
