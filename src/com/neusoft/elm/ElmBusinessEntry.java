package com.neusoft.elm;

import java.util.Scanner;

import com.neusoft.elm.po.Business;
import com.neusoft.elm.view.BusinessView;
import com.neusoft.elm.view.impl.BusinessViewImpl;

public class ElmBusinessEntry {
	public void work() {
		Scanner input=new Scanner(System.in);
		System.out.println("-----------------------------------------------------------------");
		System.out.println("|\t\t\t 饿了么后台管理系统 \t\t\t|");
		System.out.println("-----------------------------------------------------------------");
	    BusinessView businessView= new BusinessViewImpl();
	    Business business=businessView.login();
	    if(business!=null) {
	    	int menu=0;
	    	while(menu!=5) {
	    		System.out.println("\n======= 一级菜单（商家管理）1.查看商家信息=2.修改商家信息=3.更新密码=4.所属商品管理=5.退出系统=======");
	    		System.out.println("请输入你的选择：");
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
	    			System.out.println("-----------------欢迎下次光临饿了么后台管理系统--------------------");
	    			break;            
	    		default:
	    			 System.out.println("没有这个选项！\n");
	    			 break;

	    		}
	    	}
	    }else {
	    	 System.out.println("商家编号或密码输入错误！");
	    }
	}
	public static void main(String[] args) {
		new ElmBusinessEntry().work();
	}
}
