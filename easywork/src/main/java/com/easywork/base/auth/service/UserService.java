package com.easywork.base.auth.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.easywork.base.auth.dao.UserDao;
import com.easywork.base.auth.model.UserInfo;

@Service
public class UserService {

	@Autowired
	UserDao userDao;
	
	public UserInfo getUserInfoByAccount(String account){
		return userDao.getUserInfoByAccount(account);
	}
}
