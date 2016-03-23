package com.easywork.base.auth.view;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.easywork.base.auth.service.UserService;

@Controller
public class UserController {

	@Autowired
	UserService userService;
	
	
	@RequestMapping("login.html")
	public String loginPage(){
		return "login";
	}
	
	@RequestMapping("login.do")
	public String login(){
		userService.getUserInfoByAccount("1");
		return "login";
	}
}
