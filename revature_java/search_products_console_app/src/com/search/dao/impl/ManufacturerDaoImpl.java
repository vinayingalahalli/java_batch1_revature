package com.search.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.dbutil.OracleConnection;
import com.search.dao.ManufacturerDAO;
import com.search.exceptions.BusinessException;
import com.search.model.Manufacturer;

public class ManufacturerDaoImpl implements ManufacturerDAO {

	

	@Override
	public List<Manufacturer> getAllManufacturers() throws BusinessException {
		List<Manufacturer> mlist=new ArrayList<>();
		try(Connection connection=OracleConnection.getConnection()){
			String sql="select mid,name,city,contact from manufacturers";
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			ResultSet resultSet=preparedStatement.executeQuery();
			while(resultSet.next()) {
				Manufacturer m=new Manufacturer();
				m.setMid(resultSet.getInt("mid"));
				m.setCity(resultSet.getString("city"));
				m.setName(resultSet.getString("name"));
				m.setContact(resultSet.getLong("contact"));
				mlist.add(m);
			}
		} catch (ClassNotFoundException | SQLException e) {
			//System.out.println(e);
			throw new BusinessException("Internal error");
		}
		
		return mlist;
	}

}
