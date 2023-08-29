package com.neusoft.elm.controller;

import javax.servlet.http.HttpServletRequest;

import com.neusoft.elm.po.User;

public class UserController {
	public Object login(HttpServletRequest request) {
		String username=request.getParameter("username");
		User user=new User();
		
		return user;
	}
	
}
