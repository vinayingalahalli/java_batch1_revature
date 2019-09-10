package com.search.main;

import java.util.List;
import java.util.Scanner;

import org.apache.log4j.Logger;

import com.search.dao.impl.ManufacturerDaoImpl;
import com.search.exceptions.BusinessException;
import com.search.model.Manufacturer;
import com.search.model.Product;
import com.search.service.SearchService;
import com.search.service.impl.SearchServiceImpl;

public class SearchMain {

	private static final Logger log = Logger.getLogger(SearchMain.class);

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		log.info("Welcome to Search App V1.0");
		log.info("--------------------------------------------");
		int ch = 0;
		SearchService service = new SearchServiceImpl();
		do {
			log.info("Search Products By Below Options");
			log.info("1)By Id");
			log.info("2)By Name");
			log.info("3)By Price");
			log.info("4)By Rating");
			log.info("5)By Manufacturer Name");
			log.info("6)By Manufacturer Date");
			log.info("7)Get All Products");
			log.info("8)EXIT");
			log.info("Enter your choice(1-7)");
			try {
				ch = Integer.parseInt(scanner.next());
				switch (ch) {
				case 1:
					log.info("Enter Product Id");
					try {
						int id = Integer.parseInt(scanner.next());
						// Code here for Service Layer
						Product product = service.getProductById(id);
						if (product != null) {
							log.info("Product Found with details below");
							log.info(product);
						}
					} catch (NumberFormatException e) {
						log.info("Product should be integer only");
					} catch (BusinessException e) {
						log.info(e.getMessage());
					}

					break;
				case 2:
					log.info("Under Construction");

					break;
				case 3:
					log.info("Under Construction");

					break;

				case 4:
					log.info("Under Construction");

					break;
				case 5:
					List<Manufacturer> mlist=null;
					int option=0;
					try {
						 mlist = new ManufacturerDaoImpl().getAllManufacturers();
						int c = 1;
						for (Manufacturer m : mlist) {
							log.info((c++) + ")" + m.getName());
						}
						log.info("Please enter a valid option number to get the products");
						 option = Integer.parseInt(scanner.next());
						if (option > mlist.size()) {
							throw new BusinessException("Invalid Option");
						}
						List<Product> productList = service.getProductsByManufacturerName(mlist.get(--option).getMid());
						if (productList != null && productList.size() > 0) {
							log.info("Total " + productList.size() + " no of product/s found manufactured by "
									+ mlist.get(option).getName());
							log.info("Printing product/s");
							for (Product p : productList) {
								log.info(p);
							}
						}
					} catch (BusinessException e) {
						log.info(e.getMessage()+mlist.get(option).getName());
					}

					break;
				case 6:
					log.info("Enter manufactured date in(dd.MM.yyyy) format please"); 
					String date=scanner.next();
					try {
						List<Product> productsList=service.getProductsByManufacturedDate(date);
						if(productsList!=null&& productsList.size()>0) {
							log.info("Total we have "+productsList.size()+" no of product/s manufactured on  "+date);
							log.info("Printing product Details");
							for(Product p:productsList) {
								log.info(p);
							}
						}
					} catch (BusinessException e) {
						log.info(e.getMessage());
					}
					break;
				case 7:
					log.info("Under Construction");

					break;
				case 8:
					log.info("Thank you for using our APP.......");

					break;

				default:
					log.info("Invalid Option.... Please Retry");
					break;
				}
			} catch (NumberFormatException e) {
				log.info("Choice SHould be numbers(1-7) only");
			}
		} while (ch != 8);

	}

}