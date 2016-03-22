package com.easywork.config;

import javax.servlet.Filter;

import org.springframework.core.annotation.Order;
import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

@Order(3)
public class WebInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
	 @Override  
	     protected String[] getServletMappings() {  
	         return new String[]{"/"};  
	     }  
	    
	      
	     @SuppressWarnings({ "unchecked", "rawtypes" })  
	     @Override  
	     protected Class[] getRootConfigClasses() {  
	         return new Class[] {AppConfig.class};  
	     }  
	    
	     
	     @SuppressWarnings({ "unchecked", "rawtypes" })  
	     @Override  
	     protected Class[] getServletConfigClasses() {  
	         return new Class[] {WebConfig.class};  
	     }  
	     
	     @Override  
	     protected Filter[] getServletFilters() {  
	         CharacterEncodingFilter characterEncodingFilter = new CharacterEncodingFilter();  
	         characterEncodingFilter.setEncoding("UTF-8");  
	         characterEncodingFilter.setForceEncoding(true);  
	         return new Filter[] {characterEncodingFilter};  
	     }     

}
