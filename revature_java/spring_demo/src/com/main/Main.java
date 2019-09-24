package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.model.Hello;
import com.model.Player;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Player p1 = (Player) context.getBean("p1");
		System.out.println(p1);
		Player p2 = (Player) context.getBean("p2");
		System.out.println(p2);

		/*
		 * System.out.println("Obj1"); Hello h1=(Hello) context.getBean("h1");
		 * System.out.println(h1.getMessage()); System.out.println("Obj2"); Hello
		 * h2=(Hello) context.getBean("h2"); System.out.println(h2.getMessage());
		 */
		/*
		 * System.out.println("obj2"); Hello h1=context.getBean(com.model.Hello.class);
		 * System.out.println(h1.getMessage());
		 */

	}
}
