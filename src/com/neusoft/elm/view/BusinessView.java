package com.neusoft.elm.view;

import com.neusoft.elm.po.Businesss;

public interface BusinessView {
	public void listBusinessAll();
	public void listBusiness();
	public void saveBusiness();
	public void removeBusiness();
	public Businesss login();
	public void showBusiness(Integer businessId);
	public void editBusiness(Integer businessId);
	public void changePassword(Integer businessId);
}
