package com.business.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.business.ProductBusiness;
import com.pojo.Product;

public class ProductBusinessImpl implements ProductBusiness{

	private Map<Integer, Product> productMap=new HashMap<>();

	@Override
	public Product addProduct(Product product) {
		
		if(productMap.containsKey(product.getPid())) {
			return null;
		}else {
			productMap.put(product.getPid(), product);
			return product;
		}
		
	}

	@Override
	public Product updateProductPrice(int pid, double newPrice) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteProduct(int pid) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Product getProductById(int pid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> getProductsByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		return null;
	}
}
