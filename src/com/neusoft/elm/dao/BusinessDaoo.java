package com.neusoft.elm.dao;

import java.util.List;

import com.neusoft.elm.po.Businesss;

public interface BusinessDaoo {
	public List<Businesss> listBusiness(String businessName,String businessAddress);
	public int saveBusiness(String businessName);
	public int removeBusiness(int businessId);
	public Businesss getBusinessByIdByPass(Integer businessId,String password);
	public Businesss getBusinessById(Integer businessId);
	public int updateBusiness(Businesss business);
	public int changepassword(Integer businessId,String password);
}
