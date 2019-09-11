package com.dao;

import com.exceptions.BusinessException;
import com.model.User;

public interface LoginDAO {

	public boolean isValidUser(User user)throws BusinessException;
}
