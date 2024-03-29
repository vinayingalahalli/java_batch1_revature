package com.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.dao.LoginDAO;
import com.dbutil.OracleConnection;
import com.exceptions.BusinessException;
import com.model.User;

public class LoginDaoImpl implements LoginDAO {

	@Override
	public boolean isValidUser(User user) throws BusinessException {
		boolean b=false;
		try(Connection connection=OracleConnection.getConnection()){
			String sql="select username from loginmaster where username=? and password=?";
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setString(1, user.getUserName());
			preparedStatement.setString(2, user.getPassword());
			ResultSet resultSet=preparedStatement.executeQuery();
			if(resultSet.next()) {
				b=true;
			}else {
				throw new BusinessException("Invalid Username/Password");
			}
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e); // should be commented at production
			throw new BusinessException("Internal Error Occured... Please reach out support team.");
		}
		return b;
	}

}
