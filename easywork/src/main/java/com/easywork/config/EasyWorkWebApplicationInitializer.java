package com.easywork.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

import org.springframework.core.annotation.Order;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.util.Log4jConfigListener;

@Order(1)  

public class EasyWorkWebApplicationInitializer implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		servletContext.setInitParameter("log4jConfigLocation", "classpath:config/log4j.properties");  
		        servletContext.addListener(Log4jConfigListener.class);  
		
	}

}
