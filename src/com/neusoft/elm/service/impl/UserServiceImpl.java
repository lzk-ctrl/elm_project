package com.neusoft.elm.service.impl;

import java.util.ArrayList;
import java.util.List;
import com.neusoft.elm.dao.UserDao;
import com.neusoft.elm.dao.impl.UserDaoImpl;
import com.neusoft.elm.po.DeliveryAddress;
import com.neusoft.elm.po.User;
import com.neusoft.elm.service.UserService;
import com.neusoft.elm.util.DBUtil;

public class UserServiceImpl implements UserService {
	@Override
	public User getUserByIdByPass(String userId, String password) {
		User user = null;
		UserDao dao = new UserDaoImpl();
		try {
			DBUtil.getConnection();
			user = dao.getUserByIdByPass(userId, password);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtil.close();
		}
		return user;
	}
	public User getUserByid(String userId) {
		User user = null;
		UserDao dao = new UserDaoImpl();
		try {
			DBUtil.getConnection();
			user = dao.getUserByid(userId);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtil.close();
		}
		return user;
	}

	@Override
	public int getUserById(String userId) {
		int result = 0;
		UserDao dao = new UserDaoImpl();
		try {
			DBUtil.getConnection();
			result = dao.getUserById(userId);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtil.close();
		}
		return result;
	}

	@Override
	public int saveUser(User user) {
		int result = 0;
		UserDao dao = new UserDaoImpl();
		try {
			DBUtil.getConnection();
			result = dao.saveUser(user);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtil.close();

		}
		return result;
	}
	public int updateUserPassword(String userId,String oldPassword,String newPassword) {
		int result=0;
		UserDao dao=new UserDaoImpl();
		User user=getUserByIdByPass(userId, oldPassword);
		if(user==null)
			return -1;
		user.setPassword(newPassword);
		try {
			DBUtil.getConnection();
			result=dao.updateUser(user);
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			DBUtil.close();
		}
		return result;
	}
	
	public int updateUserName(String userId,String userName) {
		int result=0;
		User user=getUserByid(userId);
		UserDao dao=new UserDaoImpl();
		if(user ==null)
			return -1;
		user.setUserName(userName);
		try {
			DBUtil.getConnection();
			result=dao.updateUser(user);
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			DBUtil.close();
		}
		return result;
	}
	public int updateUserSex(String userId,int userSex) {
		int result=0;
		User user=getUserByid(userId);
		UserDao dao=new UserDaoImpl();
		if(user ==null)
			return -1;
		user.setUserSex(userSex);
		try {
			DBUtil.getConnection();
			result=dao.updateUser(user);
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			DBUtil.close();
		}
		return result;
	}
}
