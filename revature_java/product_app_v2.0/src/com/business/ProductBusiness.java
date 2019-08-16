package com.business;

import java.util.List;

import com.pojo.Product;

public interface ProductBusiness {

	public Product addProduct(Product product); //put
	public Product updateProductPrice(int pid, double newPrice); //get & put
	public void deleteProduct(int pid);//remove
	public Product getProductById(int pid); //get
	public List<Product> getProductsByName(String name); 
	//loop ->as you find product with searchname->add it to the list and return it
	
	public List<Product> getAllProducts();
	//values
}
