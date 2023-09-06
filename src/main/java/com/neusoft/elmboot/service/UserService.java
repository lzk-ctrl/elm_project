package com.neusoft.elmboot.service;

import java.util.List;

import com.neusoft.elmboot.po.User;

public interface UserService {
	public User getUserByIdByPass(User user);

	public int getUserById(String userId);

	public int saveUser(User user);
	public int updateUserPassword(String userId,String password);
	public int updateUserName(String userId,String userName);
	public int updateUserSex(String userId,int userSex);
	public int getVip(String userId);
	
}