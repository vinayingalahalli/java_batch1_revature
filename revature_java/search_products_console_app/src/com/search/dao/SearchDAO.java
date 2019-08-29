package com.search.dao;

import java.util.List;

import com.search.exceptions.BusinessException;
import com.search.model.Product;

public interface SearchDAO {
	public Product getProductById(int id) throws BusinessException;
	public List<Product> getProductsByName(String name) throws BusinessException;
	public List<Product> getProductsByPrice(double price) throws BusinessException;
	public List<Product> getProductsByRating(float rating) throws BusinessException;
	public List<Product> getProductsByManufacturedDate(String date) throws BusinessException;
	public List<Product> getProductsByManufacturerName(int mid) throws BusinessException;
	public List<Product> getAllProducts() throws BusinessException;
}
