package example1;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Map<String, List<String>> countryMap = new LinkedHashMap<>();
		System.out.println("Enter number of countries");
		int n = scanner.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.println("Enter country - " + (i + 1) + " name - ");
			String country = scanner.next();
			System.out.println("Enter number of states you want in country - " + country);
			int c = scanner.nextInt();
			List<String> stateList = new ArrayList<>();
			System.out.println("Enter " + c + " number of state/s for the country " + country);
			for (int j = 0; j < c; j++) {
				stateList.add(scanner.next());
			}
			countryMap.put(country, stateList);
		}

		System.out.println("Printing all the countries and their states");
		for(Entry<String, List<String>>e:countryMap.entrySet()) {
			System.out.println("Country Name - "+e.getKey());
			List<String> stateList=e.getValue();
			System.out.println("List of states are");
			for(String s:stateList) {
				System.out.println(s);
			}
			
		}
	}

}


/*
 * Assignment
 * Map<Integer,String>
 * 1)print all KV pairs whose key is odd
 * 2)print all the KV pairs whose key is prime
 * 3)print all the KV pairs whose value starts with either E or A
 * 4)print all the KV pairs whose value is palindrome.
 * 5)print all the KV pairs whose value has all the vowels(aeiou) in it.
 */

