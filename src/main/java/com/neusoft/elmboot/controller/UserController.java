package com.neusoft.elmboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.neusoft.elmboot.po.User;
import com.neusoft.elmboot.service.UserService;

@RestController
@RequestMapping("/UserController")
public class UserController {

	@Autowired
	private UserService userService;

	@RequestMapping("/getUserByIdByPass")
	public User getUserByIdByPass(User user) throws Exception {
		return userService.getUserByIdByPass(user);
	}
	

	@RequestMapping("/getUserById")
	public int getUserById(User user) throws Exception {
		return userService.getUserById(user.getUserId());
	}

	@RequestMapping("/saveUser")
	public int saveUser(User user) throws Exception {
		return userService.saveUser(user);
	}
	@RequestMapping("/updateUserPassword")
	public int updateUserPassword(User user) throws Exception {
		return userService.updateUserPassword(user.getUserId(),user.getPassword());
	}
	@RequestMapping("/updateUserName")
	public int updateUserName(User user) throws Exception {
		return userService.updateUserName(user.getUserId(),user.getUserName());
	}
	@RequestMapping("/updateUserSex")
	public int updateUserSex(User user) throws Exception {
		return userService.updateUserSex(user.getUserId(),user.getUserSex());
	}
}