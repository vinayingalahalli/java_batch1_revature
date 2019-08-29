package callable_demo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import insert_demo.BusinessException;

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
		System.out.println("Enter Manufacturer Id");
		product.setMid(scanner.nextInt());
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
