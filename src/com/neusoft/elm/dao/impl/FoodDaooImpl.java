package com.neusoft.elm.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.neusoft.elm.dao.FoodDaoo;
import com.neusoft.elm.po.Foodd;
import com.neusoft.elm.util.DBUtill;

public class FoodDaooImpl implements FoodDaoo {
	private Connection con = null;
	private PreparedStatement pst = null;
	private ResultSet rs = null;

	@Override
	public List<Foodd> listFoodByBusinessId(Integer businessId) {
		List<Foodd> list = new ArrayList<>();
		String sql = "select * from food where businessId=?";
		try {
			con = DBUtill.getConnection();
			pst = con.prepareStatement(sql);
			pst.setInt(1, businessId);
			rs = pst.executeQuery();
			while (rs.next()) {
				Foodd food = new Foodd();
				food.setFoodId(rs.getInt("foodId"));
				food.setFoodName(rs.getString("foodName"));
				food.setFoodExplain(rs.getString("foodExplain"));
				food.setFoodPrice(rs.getDouble("foodPrice"));
				food.setBusinessId(rs.getInt("businessId"));
				list.add(food);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DBUtill.close(rs, pst, con);
		}
		return list;
	}

	@Override
	public int saveFood(Foodd food) {
		int result =0;
		String sql="insert into food values(null,?,?,?,?)";
		try {
			con=DBUtill.getConnection();
			pst=con.prepareStatement(sql);
			pst.setString(1, food.getFoodName());
			pst.setString(2, food.getFoodExplain());
			pst.setDouble(3, food.getFoodPrice());
			pst.setInt(4, food.getBusinessId());
			result=pst.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			DBUtill.close(null, pst, con);
		}
		return result;
	}

	@Override
	public int updateFood(Foodd food) {
		int result=0;
		String sql="update food set foodName=?,foodExplain=?,foodPrice=? where foodId=?";
		try {
			con=DBUtill.getConnection();
			pst=con.prepareStatement(sql);
			pst.setString(1, food.getFoodName());
			pst.setString(2, food.getFoodExplain());
			pst.setDouble(3, food.getFoodPrice());
			pst.setInt(4, food.getFoodId());
			result=pst.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			DBUtill.close(null, pst, con);
		}
		return result;
	}

	@Override
	public Foodd getFoodById(Integer foodId) {
		Foodd food = null;
		String sql="select * from food where foodId=? ";
		try {
			con=DBUtill.getConnection();
			pst=con.prepareStatement(sql);
			pst.setInt(1, foodId);
			rs=pst.executeQuery();
			if(rs.next()) {
				food=new Foodd();
				food.setBusinessId(rs.getInt("businessId"));
				food.setFoodExplain(rs.getString("foodExplain"));
				food.setFoodPrice(rs.getDouble("foodPrice"));
				food.setFoodName(rs.getString("foodName"));
				food.setFoodId(rs.getInt("foodId"));
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			DBUtill.close(rs, pst, con);
		}
		return food;
	}

	@Override
	public int removeFood(Integer foodId) {
		int result=0;
		String sql="delete from food where foodId=?";
		try {
			con=DBUtill.getConnection();
			pst=con.prepareStatement(sql);
			pst.setInt(1, foodId);
			result=pst.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			DBUtill.close(null, pst, con);
		}
		return result;
	}

}
