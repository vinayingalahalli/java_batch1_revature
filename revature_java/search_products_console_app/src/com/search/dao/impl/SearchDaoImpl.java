package com.search.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.dbutil.OracleConnection;
import com.search.dao.SearchDAO;
import com.search.exceptions.BusinessException;
import com.search.model.Manufacturer;
import com.search.model.Product;

public class SearchDaoImpl implements SearchDAO{

	@Override
	public Product getProductById(int id) throws BusinessException {
		Product product = null;
		try(Connection connection=OracleConnection.getConnection()){
			String sql="select p.name as product_name,p.price,p.ratings,p.manufactured_date,m.name as manufacturer_name,p.mid "
					+ "from products p join manufacturers m on m.mid=p.mid "
					+ "where p.id=?";
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setInt(1, id);
			ResultSet resultSet=preparedStatement.executeQuery();
			if(resultSet.next()) {
				product=new Product();
				product.setId(id);
				product.setName(resultSet.getString("product_name"));
				product.setManufactured_date(resultSet.getDate("manufactured_date"));
				product.setRatings(resultSet.getFloat("ratings"));
				product.setPrice(resultSet.getDouble("price"));
				Manufacturer m=new Manufacturer();
				m.setMid(resultSet.getInt("mid"));
				m.setName(resultSet.getString("manufacturer_name"));
				product.setManufacturer(m);
			}else {
				throw new BusinessException("Product with id = "+id+" not found");
			}
		} catch (ClassNotFoundException | SQLException e) {
			//System.out.println(e);
			throw new BusinessException("Internal Error....SYSADMIn is working on that");
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
		List<Product> productList=new ArrayList<>();
		try(Connection connection=OracleConnection.getConnection()){
			String sql="select p.id,p.name as product_name,p.price,p.ratings,p.mid,m.name as manufacturer_name "
					+ "from products p join manufacturers m on m.mid=p.mid "
					+ "where p.manufactured_date=?";
			Date date2=new SimpleDateFormat("dd.MM.yyyy").parse(date);
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			
			preparedStatement.setDate(1, new java.sql.Date( date2.getTime()));
			ResultSet resultSet=preparedStatement.executeQuery();
			while(resultSet.next()) {
				Product product=new Product();
				product.setId(resultSet.getInt("id"));
				product.setName(resultSet.getString("product_name"));
				product.setManufactured_date(date2);
				product.setRatings(resultSet.getFloat("ratings"));
				product.setPrice(resultSet.getDouble("price"));
				Manufacturer m=new Manufacturer();
				m.setMid(resultSet.getInt("mid"));
				m.setName(resultSet.getString("manufacturer_name"));
				product.setManufacturer(m);
				productList.add(product);
			}
			if(productList.size()==0) {
			
				throw new BusinessException("Product not found for the entered manfacturing date "+date);
			}
		} catch (ClassNotFoundException | SQLException | ParseException e) {
			//System.out.println(e);
			throw new BusinessException("Internal Error....SYSADMIn is working on that");
		}
		return productList;
	}

	@Override
	public List<Product> getProductsByManufacturerName(int mid) throws BusinessException {
		List<Product> productList=new ArrayList<>();
		try(Connection connection=OracleConnection.getConnection()){
			String sql="select p.id,p.name as product_name,p.price,p.ratings,p.manufactured_date,m.name as manufacturer_name "
					+ "from products p join manufacturers m on m.mid=p.mid "
					+ "where p.mid=?";
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setInt(1, mid);
			ResultSet resultSet=preparedStatement.executeQuery();
			while(resultSet.next()) {
				Product product=new Product();
				product.setId(resultSet.getInt("id"));
				product.setName(resultSet.getString("product_name"));
				product.setManufactured_date(resultSet.getDate("manufactured_date"));
				product.setRatings(resultSet.getFloat("ratings"));
				product.setPrice(resultSet.getDouble("price"));
				Manufacturer m=new Manufacturer();
				m.setMid(mid);
				m.setName(resultSet.getString("manufacturer_name"));
				product.setManufacturer(m);
				productList.add(product);
			}
			if(productList.size()==0) {
			
				throw new BusinessException("Product not found for the manufacturer = ");
			}
		} catch (ClassNotFoundException | SQLException e) {
			//System.out.println(e);
			throw new BusinessException("Internal Error....SYSADMIn is working on that");
		}
		return productList;
	}

	@Override
	public List<Product> getAllProducts() throws BusinessException {
		// TODO Auto-generated method stub
		return null;
	}

}