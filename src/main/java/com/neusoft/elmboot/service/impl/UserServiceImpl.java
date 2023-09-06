package com.neusoft.elmboot.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.neusoft.elmboot.mapper.UserMapper;
import com.neusoft.elmboot.po.User;
import com.neusoft.elmboot.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;

	@Override
	public User getUserByIdByPass(User user) {
		return userMapper.getUserByIdByPass(user);
	}

	@Override
	public int getUserById(String userId) {
		return userMapper.getUserById(userId);
	}

	@Override
	public int saveUser(User user) {
		return userMapper.saveUser(user);
	}
	public int updateUserPassword(String userId,String password) {
		int result =0;
		User user=userMapper.getUserByid(userId);
		user.setPassword(password);
		result=userMapper.updateUser(user);
		return result; 
	}
	public int updateUserName(String userId,String userName) {
		int result =0;
		User user=userMapper.getUserByid(userId);
		user.setUserName(userName);
		result=userMapper.updateUser(user);
		return result; 
	}
	public int updateUserSex(String userId,int userSex) {
		int result =0;
		User user=userMapper.getUserByid(userId);
		user.setUserSex(userSex);
		result=userMapper.updateUser(user);
		return result; 
	}
}
