package com.service;

import com.exceptions.BusinessException;
import com.model.User;

public interface LoginService {
	public boolean isValidUser(User user)throws BusinessException;
}
