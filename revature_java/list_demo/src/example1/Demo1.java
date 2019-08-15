package example1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Demo1 {

	public static void main(String[] args) {
		
		List li=new LinkedList();
		li.add("dsfhds");
		li.add(23.44);
		li.add(99);
		li.add(true);
		li.add('c');
		li.add(null);
		System.out.println(li);
		
		
		
		List<Integer> li2=new LinkedList<>();
		li2.add(123);
		li2.add(123);
		li2.add(4555);
		li2.add(1233);
		li2.add(999);
		li2.add(null);
		li2.add(null);
		li2.add(23);
		li2.add(44);
		li2.add(123);
		System.out.println(li2);
		li2.add(2, 9);
		System.out.println(li2);
		System.out.println(li2.size());
		li2.set(0, 1000);
		System.out.println(li2);
		Integer i=1000;
		li2.remove(i); // remove(object)
		System.out.println(li2);
		li2.remove(7);//remove(position)
		System.out.println(li2);
		Integer i2=123;
		while(li2.remove(i2)) {}  // removes a;; occurances of object i2
		System.out.println(li2);
		
		System.out.println(li2.get(0));
		
		for (int j = 0; j <li2.size(); j++) {
			System.out.println(li2.get(j));
		}
		
		
		List<Integer> li3=new ArrayList<>(li2);
		System.out.println(li3);
		li3.addAll(li2); //union all
		System.out.println(li3);
		
		
		List<Integer> li4=new ArrayList<>();
		li4.add(123);
		li4.add(44);
		li4.add(22);
		li4.add(77);
		li4.add(66);
		li4.add(1000);
		li4.add(1000);
		
		System.out.println("li4 = "+li4);
		System.out.println("li2 = "+li2);
		
		//li2.retainAll(li4);  intersection
		li2.removeAll(li4);    //minus
		System.out.println(li2);
		
		Collections.replaceAll(li2, null, 22); //replaceAll(collectionobj,oldvalue,newvalue)
		System.out.println(li2);
		//Collections.sort(li2);   // merge/bucket  -> ascending
		Collections.sort(li2,Collections.reverseOrder());   // desc
		System.out.println(li2);
		Collections.reverse(li2);
		System.out.println(li2);
		
		Collections.shuffle(li2);
		System.out.println(li2);
		
		Collections.sort(li2);
		System.out.println(li2);
		
		
		
		System.out.println(li2.contains(100));
		System.out.println(li2.contains(999));
		System.out.println(Collections.binarySearch(li2, 9));
		
		
		
		
		
		
		
		
		

	}

}
