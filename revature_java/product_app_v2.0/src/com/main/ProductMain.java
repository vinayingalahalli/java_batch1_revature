package com.main;

import java.util.List;

import com.business.ProductBusiness;
import com.business.impl.ProductBusinessImpl;
import com.pojo.Product;

public class ProductMain {

	
	
	public static void main(String[] args) {
		
		ProductBusiness pb=new ProductBusinessImpl();
		//create a menu for all your requirements from ProductBusiness
		
	}
	
	public static void printProducts(List<Product> productList) {
		System.out.println("Total "+productList.size()+" no of product/s are existing");
		// print your products here
	}

}
