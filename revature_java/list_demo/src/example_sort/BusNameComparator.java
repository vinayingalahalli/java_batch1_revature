package example_sort;

import java.util.Comparator;

public class BusNameComparator implements Comparator<Bus> {

	@Override
	public int compare(Bus b1, Bus b2) {
		
		return b1.getName().compareTo(b2.getName());
	}

}
