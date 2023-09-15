package com.neusoft.elm.view.impl;

import java.util.Scanner;

import com.neusoft.elm.dao.AdminDaoo;
import com.neusoft.elm.dao.impl.AdminDaooImpl;
import com.neusoft.elm.po.Adminn;
import com.neusoft.elm.view.AdminView;

public class AdminViewImpl implements AdminView {
	private Scanner input = new Scanner(System.in);

	public Adminn login() {

		System.out.println("请输入管理员名称：");
		String adminName = input.next();
		System.out.println("请输入密码：");
		String password = input.next();

		AdminDaoo dao = new AdminDaooImpl();
		return dao.getAdminByNameByPass(adminName, password);
	}

}