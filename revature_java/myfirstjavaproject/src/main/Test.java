package main;

public class Test {

	private class Inner {

	}

	protected class Inner2 {

	}

	public static class InnserStatic {
		public static void innerStatic() {
			System.out.println("Hello inner static");
		}
		public void innerNonStatic() {
			System.out.println("Inner non static");
		}
	}

	public class S {
		public class S1 {

		}

		public void hello() {
			System.out.println("Heelo from inner class S");
		}

	}
}

class Z {

}

class X {

}

class M {

}