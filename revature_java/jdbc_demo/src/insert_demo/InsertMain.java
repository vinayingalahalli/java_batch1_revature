package insert_demo;

import java.util.Scanner;

public class InsertMain {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter manufacturer id ");
		int mid=scanner.nextInt();
		System.out.println("Enter manufacturer name ");
		String name=scanner.next();
		System.out.println("Enter manufacturer city ");
		String city=scanner.next();
		System.out.println("Enter manufacturer contact ");
		long contact=scanner.nextLong();
		Manufacturer manufacturer=new Manufacturer(mid, name, city, contact);
		
		ManufacturerDAO dao=new ManufacturerDaoImpl();
		
		try {
			if(dao.registerManufacturer(manufacturer)!=null) {
				System.out.println("Manufacturer Registered with details ");
				System.out.println(manufacturer);
			}
		} catch (BusinessException e) {
			System.out.println(e.getMessage());
		}
		
		
	}

}
