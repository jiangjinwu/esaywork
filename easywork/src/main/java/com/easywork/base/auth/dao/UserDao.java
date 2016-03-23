package com.easywork.base.auth.dao;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.easywork.base.auth.model.UserInfo;
import com.easywork.data.OracleJdbcDao;

@Repository
public class UserDao {

	@Autowired
	OracleJdbcDao<UserInfo> jdbcDao;
	String getUserInfoByAccount="select * from t_member m where m.account = :account";
	public UserInfo getUserInfoByAccount(String account){
		Map<String,String> paramMap = new HashMap<String,String>();
		paramMap.put("account", account);
		return jdbcDao.getObject(getUserInfoByAccount, paramMap, new UserInfo());
	}
	
}
