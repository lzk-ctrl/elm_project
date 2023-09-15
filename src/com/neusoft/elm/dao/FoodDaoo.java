package com.neusoft.elm.dao;

import java.util.List;

import com.neusoft.elm.po.Foodd;

public interface FoodDaoo {
	public List<Foodd> listFoodByBusinessId(Integer businessId);
	public int saveFood(Foodd food);
	public int updateFood(Foodd food);
	public Foodd getFoodById(Integer foodId);
	public int removeFood(Integer foodId);
}
