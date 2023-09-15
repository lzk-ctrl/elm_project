package com.neusoft.elm.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.neusoft.elm.dao.AdminDaoo;
import com.neusoft.elm.po.Adminn;
import com.neusoft.elm.util.DBUtill;

public class AdminDaooImpl implements AdminDaoo {
	private Connection con=null;
	private PreparedStatement pst=null;
	private ResultSet rs=null;
	public Adminn getAdminByNameByPass(String adminName, String password) {
		Adminn admin=null;
		String sql="select * from admin where adminName=? and password = ?";
		try {
			con=DBUtill.getConnection();
			pst=con.prepareStatement(sql);
			pst.setString(1, adminName);
			pst.setString(2, password);
			rs=pst.executeQuery();
			while(rs.next()) {
				admin=new Adminn();
				admin.setAdminId(rs.getInt("adminId"));
				admin.setAdminName(rs.getString("adminName"));
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			DBUtill.close(rs, pst, con);
		}
		return admin;
	}
	
}
