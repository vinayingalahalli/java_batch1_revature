package example1;

public class Demo1 {

	public static void main(String[] args) {
		Integer i1=10;
		Integer i2=20;
		Integer i3=10;
		Integer i4=new Integer(10);
		
		System.out.println("i1==i2"+(i1==i2)); //compares addresses
		System.out.println(i1==i3);
		System.out.println(i1==i4);
		
		
		System.out.println(i1.equals(i2)); //compares values
		System.out.println(i1.equals(i3));
		System.out.println(i1.equals(i4));
		
		//AUTOBOXING
		int x=20;
		Integer i5=x;
		System.out.println("i5 = "+i5);
		i5=99;
		x=i5;
		System.out.println("x = "+x);
		
		
		
		String s="121";
		i3=Integer.parseInt(s);   //ClassName.parseXYZ(String)
		System.out.println("i3 = "+i3);
		
		i3=10000;
		s=i3.toString();  // Object to String
		System.out.println("s = "+s);
		
		int z=1999;
		s=z+"";  // primitive to string
		System.out.println("s = " +s);
		
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		Integer i6=100;
		Integer i7=200;
		// compareTo -> if both values are same it will return 0
		//           -> if first object's value is greater than 2nd object's value it will return +ve result
		//           ->if 2nd object's value is greater than the 1st object's value it will return -ve result
		
		System.out.println(i7.compareTo(i6));
		
		System.out.println(i6.compareTo(i7));
		System.out.println(i7.compareTo(200));
		
		Double d=i7.doubleValue();
		System.out.println("d = "+d);
		
		d=1999.999999;
		i7=d.intValue(); // when object
		
		
		System.out.println("i7 = "+i7);
		double d1=2999.8888;
		i7=(int)d1; // when primitive
		
		System.out.println("i7 = "+i7);
		
		
		System.out.println(Integer.toBinaryString(20));
		
		
		
		//Float, Double, Long
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}