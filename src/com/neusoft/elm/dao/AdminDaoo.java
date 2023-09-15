package com.neusoft.elm.dao;

import com.neusoft.elm.po.Adminn;

public interface AdminDaoo {
	public Adminn getAdminByNameByPass(String adminName,String password);
	
}
