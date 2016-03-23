package com.easywork.base.auth.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class UserInfo implements RowMapper<UserInfo>{
@Override
public UserInfo mapRow(ResultSet arg0, int arg1) throws SQLException {
	UserInfo u = new UserInfo();
	return u;
}
	
}
