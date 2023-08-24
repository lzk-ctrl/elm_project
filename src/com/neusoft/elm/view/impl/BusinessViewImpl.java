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
		System.out.println("�̼ұ��\t�̼�����\t�̼ҵ�ַ\t�̼ҽ���\t���ͷ�\t���ͷ�");
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
		System.out.println("�Ƿ���Ҫ�����̼����ƹؼ���(y/n)��");
		inputStr = input.next();
		if (inputStr.equals("y")) {
			System.out.println("�������̼����ƹؼ��ʣ�");
			businessName = input.next();
		}

		System.out.println("�Ƿ���Ҫ�����̼ҵ�ַ�ؼ���(y/n)��");
		inputStr = input.next();
		if (inputStr.equals("y")) {
			System.out.println("�������̼ҵ�ַ�ؼ��ʣ�");
			businessAddress = input.next();
		}

		List<Business> list = dao.listBusiness(businessName, businessAddress);
		System.out.println("�̼ұ��\t�̼�����\t�̼ҵ�ַ\t�̼ҽ���\t���ͷ�\t���ͷ�");
		for (Business b : list) {
			System.out.println(b.getBusinessId() + "\t" + b.getBusinessName() + "\t" + b.getBusinessAddress() + "\t"
					+ b.getBusinessExplain() + "\t" + b.getStarPrice() + "\t" + b.getDeliveryPrice());
		}
	}

}
