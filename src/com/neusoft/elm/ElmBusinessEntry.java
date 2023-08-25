package com.neusoft.elm;

import java.util.Scanner;

import com.neusoft.elm.po.Business;
import com.neusoft.elm.view.BusinessView;
import com.neusoft.elm.view.impl.BusinessViewImpl;

public class ElmBusinessEntry {
	public void work() {
		Scanner input=new Scanner(System.in);
		System.out.println("-----------------------------------------------------------------");
		System.out.println("|\t\t\t ����ô��̨����ϵͳ \t\t\t|");
		System.out.println("-----------------------------------------------------------------");
	    BusinessView businessView= new BusinessViewImpl();
	    Business business=businessView.login();
	    if(business!=null) {
	    	int menu=0;
	    	while(menu!=5) {
	    		System.out.println("\n======= һ���˵����̼ҹ���1.�鿴�̼���Ϣ=2.�޸��̼���Ϣ=3.��������=4.������Ʒ����=5.�˳�ϵͳ=======");
	    		System.out.println("���������ѡ��");
	    		menu = input.nextInt();
	    		switch(menu) {
	    		case 1:
	    			businessView.showBusiness(business.getBusinessId());
	    			break;
	    		case 2:
	    			businessView.editBusiness(business.getBusinessId());
	    			break;
	    		case 3:
	    			businessView.changePassword(business.getBusinessId());
	    			break;
	    		case 4:
	    			break;
	    		case 5:
	    			System.out.println("-----------------��ӭ�´ι��ٶ���ô��̨����ϵͳ--------------------");
	    			break;            
	    		default:
	    			 System.out.println("û�����ѡ�\n");
	    			 break;

	    		}
	    	}
	    }else {
	    	 System.out.println("�̼ұ�Ż������������");
	    }
	}
	public static void main(String[] args) {
		new ElmBusinessEntry().work();
	}
}
