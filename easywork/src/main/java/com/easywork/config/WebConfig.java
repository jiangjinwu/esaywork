package com.easywork.config;

import org.apache.log4j.Logger;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.HandlerAdapter;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.handler.SimpleServletHandlerAdapter;
import org.springframework.web.servlet.i18n.CookieLocaleResolver;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.easywork", useDefaultFilters = false, includeFilters = {  
@ComponentScan.Filter(type = FilterType.ANNOTATION, value = {Controller.class}) })

public class WebConfig extends WebMvcConfigurerAdapter {

	 private static final Logger logger = Logger  
			             .getLogger(WebConfig.class);  
			   
			    
			     @Bean  
			     public ViewResolver viewResolver() {  
			         logger.info("ViewResolver");  
			         InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();  
			         viewResolver.setPrefix("/WEB-INF/view/jsp/");  
			         viewResolver.setSuffix(".jsp");  
			         return viewResolver;  
			     }  
			       
			    
			     @Bean  
			     public MessageSource messageSource() {  
			         logger.info("MessageSource");  
			         ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();  
			         messageSource.setBasename("config.messages.messages");  
			           
			         return messageSource;  
			     }  
			       
			     
			     @Bean  
			     public HandlerAdapter servletHandlerAdapter(){  
			         logger.info("HandlerAdapter");  
			         return new SimpleServletHandlerAdapter();  
			     }  
			       
			   
			     @Bean  
			     public LocaleChangeInterceptor localeChangeInterceptor(){  
			         logger.info("LocaleChangeInterceptor");  
			         return new LocaleChangeInterceptor();  
			     }  
			       
			     
			     @Bean(name="localeResolver")  
			     public CookieLocaleResolver cookieLocaleResolver(){  
			         logger.info("CookieLocaleResolver");  
			         return new CookieLocaleResolver();  
			     }  
			       
			  
			       
			       
			       
			   
			 
			     
			     @Override  
			     public void addResourceHandlers(ResourceHandlerRegistry registry) {  
			         logger.info("addResourceHandlers");  
			         registry.addResourceHandler("/static/**").addResourceLocations("/WEB-INF/static/");  
			     }  
			       
			   

	
}
