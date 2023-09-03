package com.neusoft.elm.service;

import com.neusoft.elm.po.User;

public interface UserService {
	public User getUserByIdByPass(String userId, String password);

	public int getUserById(String userId);
	public User getUserByid(String userId);
	public int saveUser(User user);
	public int updateUserPassword(String userId,String oldPassword,String newPassword);
	public int updateUserName(String userId,String userName);
	public int updateUserSex(String userId,int userSex);
}
