package example_sort;

import java.util.HashSet;
import java.util.Set;

public class BusMain {

	public static void main(String[] args) {
		Set<Bus> busList = new HashSet<>();
		busList.add(new Bus(101, "Abc Travels", 1200.99, 2.5f));
		busList.add(new Bus(122, "K Travels", 1100.99, 1.5f));
		busList.add(new Bus(102, "Pqr Travels", 1300.99, 1.5f));
		busList.add(new Bus(231, "Jme Travels", 1100.99, 2.5f));
		busList.add(new Bus(121, "Jee Travels", 1200.99, 4.5f));
		busList.add(new Bus(141, "Java Travels", 1200.99, 4.8f));
		busList.add(new Bus(141, "Java Travels", 1200.99, 4.8f));
		busList.add(new Bus(122, "K Travels", 1100.99, 1.5f));
		busList.add(new Bus(133, "Kay Travels", 1300.99, 1.5f));
		busList.add(new Bus(101, "Abc Travels", 1200.99, 2.5f));
		printBuses(busList);
	}

	public static void printBuses(Set<Bus> busList) {
		//System.out.println("Total " + busList.size() + " no of buses available");
		System.out.println("Printing Bus Details");
		for(Bus b:busList) {
		//	System.out.println(b.hashCode());
			System.out.println(b);
		}
	}

}
