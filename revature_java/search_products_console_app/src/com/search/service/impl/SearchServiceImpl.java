package com.search.service.impl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import com.search.dao.SearchDAO;
import com.search.dao.impl.SearchDaoImpl;
import com.search.exceptions.BusinessException;
import com.search.model.Product;
import com.search.service.SearchService;

public class SearchServiceImpl implements SearchService {

	private SearchDAO searchDao;
	
	@Override
	public Product getProductById(int id) throws BusinessException {
		Product product=null;
		if((id+"").matches("9[0-9]{3}")) {
			product=getSearchDao().getProductById(id);
		}else {
			throw new BusinessException("Product with id = "+id+" Invalid");
		}
		return product;
	}

	@Override
	public List<Product> getProductsByName(String name) throws BusinessException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> getProductsByPrice(double price) throws BusinessException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> getProductsByRating(float rating) throws BusinessException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> getProductsByManufacturedDate(String date) throws BusinessException {
		List<Product> productList=null;
		boolean b=false;
		if(date.matches("[0-9]{2}.[0-9]{2}.[0-9]{4}")) {
			SimpleDateFormat sdf=new SimpleDateFormat("dd.MM.yyyy");
			sdf.setLenient(false);
			try {
				sdf.parse(date);
				b=true;
				//code here for dao
				productList=getSearchDao().getProductsByManufacturedDate(date);
			} catch (ParseException e) {
				//throw new BusinessException("Date entered "+date+" is invalid");
			}
		}if(!b) {
			throw new BusinessException("Date entered "+date+" is invalid");
		}
		return productList;
	}

	@Override
	public List<Product> getProductsByManufacturerName(int mid) throws BusinessException {
		List<Product> productList=null;
		
		if(mid>99 && mid<1000) {
			productList=getSearchDao().getProductsByManufacturerName(mid);
		}else {
			throw new BusinessException("Invalid manufacturer id");
		}
		return productList;
	}

	@Override
	public List<Product> getAllProducts() throws BusinessException {
		// TODO Auto-generated method stub
		return null;
	}

	public SearchDAO getSearchDao() {
		if(searchDao==null) {
			searchDao=new SearchDaoImpl();
		}
		return searchDao;
	}

	

}