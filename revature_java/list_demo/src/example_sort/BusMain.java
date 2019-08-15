package example_sort;

import java.util.ArrayList;
import java.util.List;

public class BusMain {

	public static void main(String[] args) {
		List<Bus> busList = new ArrayList<>();
		busList.add(new Bus(101, "Abc Travels", 1200.99, 2.5f));
		busList.add(new Bus(122, "K Travels", 1100.99, 1.5f));
		busList.add(new Bus(102, "Pqr Travels", 1300.99, 1.5f));
		busList.add(new Bus(231, "Jme Travels", 1100.99, 2.5f));
		busList.add(new Bus(121, "Jee Travels", 1200.99, 4.5f));
		busList.add(new Bus(141, "Java Travels", 1200.99, 4.8f));

		// printBuses(busList);
		int ch = 0;
		do {
			System.out.println("Bus Menu");
			System.out.println("===========");
			System.out.println("1)Print All Buses");
			System.out.println("2)Sort Bus By Id");
			System.out.println("3)Sort Bus By Name");
			System.out.println("4)Sort Bus By Fare");
			System.out.println("5)Sort Bus By Rating");
			System.out.println("6)EXIT");
			switch (ch) {
			case 1:printBuses(busList);

				break;
			case 2:

				break;
			case 3:

				break;
			case 4:

				break;
			case 5:

				break;
			case 6:
				System.out.println("Thankq for using search Bus App V1.0");

				break;
			default:
				System.out.println("Invalid Option... Please Re-enter");
				break;
			}

		} while (ch != 6);
	}

	public static void printBuses(List<Bus> busList) {
		System.out.println("Total " + busList.size() + " no of buses available");
		System.out.println("Printing Bus Details");
		for (int i = 0; i < busList.size(); i++) {
			System.out.println(busList.get(i));
		}
	}

}
