package com.easywork.config;

import org.apache.log4j.Logger;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration  
@EnableTransactionManagement(proxyTargetClass = true)  
@Import({DataSourceConfig.class}) 

public class DaoConfig {
	private static final Logger logger = Logger.getLogger(DaoConfig.class);  
	  
	      
	  

}
