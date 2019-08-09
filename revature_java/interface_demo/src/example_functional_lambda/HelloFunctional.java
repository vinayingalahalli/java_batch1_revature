package example_functional_lambda;

@FunctionalInterface
public interface HelloFunctional {
	void hello();
//void h1();
}


@FunctionalInterface
interface Sum{
	int add(int a,int b);
}


@FunctionalInterface
interface Hey{
	void hello(String name);
}