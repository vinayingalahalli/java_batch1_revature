package example;

import java.util.Calendar;
import java.util.Date;

public class StaticDemo {

	public static void main(String[] args) {

		Date d = new Date();
		System.out.println(d);

		Calendar c = Calendar.getInstance();
		System.out.println(c);
		sayHello("Jack");
		sayHello("Jerry");
		StaticDemo obj=new StaticDemo();
		obj.helloNonStatic();
		sayHello("jackson");
		}
	
		public static void sayHello(String name) {
			System.out.println("Hello.... "+name);
		}
		
		public void helloNonStatic() {
			System.out.println("Non static method says hello.....");
		}

}
