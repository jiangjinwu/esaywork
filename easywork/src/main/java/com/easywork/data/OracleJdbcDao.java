package com.easywork.data;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

public class OracleJdbcDao<T>    {

	@Autowired
	NamedParameterJdbcTemplate namedParameterJdbcTemplate;
	T getObject(String sql,Map paramMap,RowMapper<T> rowMapper){
		return (T)namedParameterJdbcTemplate.queryForObject(sql, paramMap, rowMapper);
	}

}
