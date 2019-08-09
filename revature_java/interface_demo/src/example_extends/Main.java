package example_extends;

public class Main {

	public static void main(String[] args) {
		
		Child c=new ParentChildImpl();
		c.child1();
		c.child2();
		c.method1();
		c.method2();
		c.method3();
		System.out.println(c.getClass());
		
		Parent p=new ParentChildImpl();
		p.method1();
		p.method2();
		p.method3();
		System.out.println(p.hashCode());

	}

}
