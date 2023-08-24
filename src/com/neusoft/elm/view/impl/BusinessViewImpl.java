package com.neusoft.elm.view.impl;

import java.util.List;
import java.util.Scanner;

import com.neusoft.elm.dao.BusinessDao;
import com.neusoft.elm.dao.impl.BusinessDaoImpl;
import com.neusoft.elm.po.Business;
import com.neusoft.elm.view.BusinessView;

public class BusinessViewImpl implements BusinessView {
	private Scanner input = new Scanner(System.in);

	public void listBusinessAll() {
		BusinessDao dao = new BusinessDaoImpl();
		List<Business> list = dao.listBusiness(null, null);
		System.out.println("商家编号\t商家名称\t商家地址\t商家介绍\t起送费\t配送费");
		for (Business b : list) {
			System.out.println(b.getBusinessId() + "\t" + b.getBusinessName() + "\t" + b.getBusinessAddress() + "\t"
					+ b.getBusinessExplain() + "\t" + b.getStarPrice() + "\t" + b.getDeliveryPrice());
		}
	}

	@Override
	public void listBusiness() {
		BusinessDao dao = new BusinessDaoImpl();
		String inputStr = "";
		String businessName = "";
		String businessAddress = "";
		System.out.println("是否需要输入商家名称关键词(y/n)：");
		inputStr = input.next();
		if (inputStr.equals("y")) {
			System.out.println("请输入商家名称关键词：");
			businessName = input.next();
		}

		System.out.println("是否需要输入商家地址关键词(y/n)：");
		inputStr = input.next();
		if (inputStr.equals("y")) {
			System.out.println("请输入商家地址关键词：");
			businessAddress = input.next();
		}

		List<Business> list = dao.listBusiness(businessName, businessAddress);
		System.out.println("商家编号\t商家名称\t商家地址\t商家介绍\t起送费\t配送费");
		for (Business b : list) {
			System.out.println(b.getBusinessId() + "\t" + b.getBusinessName() + "\t" + b.getBusinessAddress() + "\t"
					+ b.getBusinessExplain() + "\t" + b.getStarPrice() + "\t" + b.getDeliveryPrice());
		}
	}

}
