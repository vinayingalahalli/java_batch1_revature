package callable_demo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Scanner;

import insert_demo.BusinessException;
import insert_demo.Manufacturer;
import insert_demo.ManufacturerDAO;
import insert_demo.ManufacturerDaoImpl;

public class ProductMain {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Welcome to Product Registration");
		System.out.println("======================================");
		Product product=new Product();
		System.out.println("Enter Product Name");
		product.setName(scanner.next());
		System.out.println("Enter Product Price");
		product.setPrice(scanner.nextDouble());
		System.out.println("Enter Product Rating");
		product.setRatings(scanner.nextFloat());
		System.out.println("Choose manufacturer option");
		ManufacturerDAO mdao=new ManufacturerDaoImpl();
		List<Manufacturer> mlist;
		try {
			mlist = mdao.getAllManufacturers();
			int c=1;
			for(Manufacturer m:mlist) {
				System.out.println((c++)+")"+m.getName());
			}
			System.out.println("Select the appropraite option");
			int option=scanner.nextInt();
		//	c--;
			product.setManufacturer(mlist.get(--option)); //mlist[position]
		} catch (BusinessException e1) {
			System.out.println(e1.getMessage());
		}
		
		System.out.println("Enter Manufactured Date(dd-MM-yyyy) format please");
		String s=scanner.next();
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
		try {
			product.setManufactured_date(sdf.parse(s));
			ProductDAO dao=new ProductDaoImpl();
			product=dao.registerProduct(product);
			if(product.getId()!=0) {
				System.out.println("Product added with below details");
				System.out.println(product);
			}
		} catch (ParseException e) {
			System.out.println("Invalid date format");
		} catch (BusinessException e) {
			System.out.println(e.getMessage());
		}
		
	}

}
