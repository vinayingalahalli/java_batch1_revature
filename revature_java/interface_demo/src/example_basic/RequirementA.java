package example_basic;

public interface RequirementA {

	void requirement1();
	void requirement2();
	void requirement3();
	void commonRequirement();
	
	//From Java 8
	default void sayHello() {
		System.out.println("Default methods within interface from Java 8");
	}
	
	//From Java 8
	public static void hiStatic() {
		System.out.println("Static methods from Java 8");
	}
}
