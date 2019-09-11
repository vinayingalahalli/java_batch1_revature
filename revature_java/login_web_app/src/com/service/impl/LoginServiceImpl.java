package com.service.impl;

import com.dao.LoginDAO;
import com.dao.impl.LoginDaoImpl;
import com.exceptions.BusinessException;
import com.model.User;
import com.service.LoginService;

public class LoginServiceImpl implements LoginService {

	private LoginDAO loginDAO;
	
	@Override
	public boolean isValidUser(User user) throws BusinessException {
		boolean b = false;
		if (user != null && user.getUserName() != null && user.getPassword() != null 
				&& user.getUserName().matches("[a-z]{3,9}[0-9]{1,4}")
				&& user.getPassword().matches("[a-z]{2,6}@[0-9]{3,4}")) {
			b=getLoginDAO().isValidUser(user);
		}else {
			throw new BusinessException("Invalid Username/Password");
		}

		return b;
	}

	public LoginDAO getLoginDAO() {
		if(loginDAO==null) {
			loginDAO=new LoginDaoImpl();
		}
		return loginDAO;
	}

	

}
