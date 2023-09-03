package com.neusoft.elm.dao;

import com.neusoft.elm.po.User;

public interface UserDao {
	public User getUserByIdByPass(String userId, String password) throws Exception;
	public User getUserByid(String userId) throws Exception;//仅通过id查询用户
	public int getUserById(String userId) throws Exception;

	public int saveUser(User user) throws Exception;
	public int updateUser(User user) throws Exception;
}