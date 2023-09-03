package com.neusoft.elm.controller;

import java.util.List;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import com.neusoft.elm.po.User;
import com.neusoft.elm.service.UserService;
import com.neusoft.elm.service.impl.UserServiceImpl;

public class UserController {
	public Object getUserByIdByPass(HttpServletRequest request) throws Exception {
		String userId = request.getParameter("userId");
		String password = request.getParameter("password");
		UserService service = new UserServiceImpl();
		User user = service.getUserByIdByPass(userId, password);
		return user;
	}


	public Object getUserById(HttpServletRequest request) throws Exception {
		String userId = request.getParameter("userId");
		UserService service = new UserServiceImpl();
		int result = service.getUserById(userId);
		return result;
	}

	public Object saveUser(HttpServletRequest request) throws Exception {
		User user = new User();
		user.setUserId(request.getParameter("userId"));
		user.setPassword(request.getParameter("password"));
		user.setUserName(request.getParameter("userName"));
		user.setUserSex(Integer.valueOf(request.getParameter("userSex")));
		UserService service = new UserServiceImpl();
		int result = service.saveUser(user);
		return result;
	}
	public Object updateUserPassword(HttpServletRequest request) throws Exception{
		String userId=request.getParameter("userId");
		String oldPassword=request.getParameter("oldPassword");
		String newPassword=request.getParameter("newPassword");
		UserService service =new UserServiceImpl();
		int result=service.updateUserPassword(userId, oldPassword, newPassword);
		return result;
	}
	public Object updateUserName(HttpServletRequest request) throws Exception{
		String userId=request.getParameter("userId");
		String userName=request.getParameter("userName");
		UserService service =new UserServiceImpl();
		int result=service.updateUserName(userId, userName);
		return result;
	}
	public Object updateUserSex(HttpServletRequest request) throws Exception{
		String userId=request.getParameter("userId");
		int userSex=Integer.valueOf(request.getParameter("userSex"));
		UserService service =new UserServiceImpl();
		int result=service.updateUserSex(userId, userSex);
		return result;
	}
	
}