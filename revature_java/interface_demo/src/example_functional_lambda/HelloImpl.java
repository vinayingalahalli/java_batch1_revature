package example_functional_lambda;

public class HelloImpl /* implements HelloFunctional */ {

	/*
	 * @Override public void hello() { // TODO Auto-generated method stub
	 * System.out.println("Hey"); }
	 */

	public static void main(String[] args) {

		/*
		 * HelloFunctional h=new HelloImpl(); h.hello();
		 */
		HelloFunctional h1 = () -> {
			System.out.println("Heyy Lambda");
		};

		HelloFunctional h2 = () -> {
			System.out.println("Heyy Lambda Again");
		};
		h1.hello();
		h2.hello();

		Sum s1 = (x, y) -> x + y;
		int x = s1.add(99, 99);
		System.out.println(x);

		System.out.println(s1.add(99, 99));
		System.out.println(s1.add(889, 9));

		Hey h = (String n) -> System.out.println("Hellooo " + n);
		h.hello("Sachin");
		h.hello("Ram");
	}

}
