package example1;

public class Demo1 {

	public static void main(String[] args) {

		int a = 10;
		int b = 2;
		int res = 0;

		try {
			res = a / b;
			String s = "dsnfsdmn";
			System.out.println("Length od the given string is " + s.length());
			System.out.println(args[0]);
		} catch (ArithmeticException e) {
			System.out.println("You cannot divide by zero");
		} catch (NullPointerException e) {
			System.out.println("Something is null");
		}catch(Exception e) {
			System.out.println(e);
			System.out.println("Internal error occured.. We are working on that..");
		}

		finally {
			System.out.println("Result is " + res);
		}
		System.out.println("I wish to be printed too....");

	}

}
