package com.neusoft.elm;

import java.util.Scanner;

import com.neusoft.elm.po.Admin;
import com.neusoft.elm.view.AdminView;
import com.neusoft.elm.view.BusinessView;
import com.neusoft.elm.view.impl.AdminViewImpl;
import com.neusoft.elm.view.impl.BusinessViewImpl;

public class ElmAdminEntry {

	public void work() {

		System.out.println("-----------------------------------------------------------------");
		System.out.println("|\t\t\t 饿了么后台管理系统 \t\t\t|");
		System.out.println("-----------------------------------------------------------------");
		AdminView adminView = new AdminViewImpl();
		BusinessView businessView = new BusinessViewImpl();
		Admin admin = adminView.login();

		Scanner input = new Scanner(System.in);
		if (admin != null) {
			int menu = 0;
			while (menu != 5) {
				System.out.println("\n=======1.所有商家列表=2.搜索商家=3.新建商家=4.删除商家=5.退出系统=======");
				System.out.println("请输入你的选择：");
				menu = input.nextInt();
				switch (menu) {
				case 1:
					businessView.listBusinessAll();
					break;
				case 2:
					businessView.listBusiness();
					break;
				case 3:
					// 执行选项3的逻辑
					break;
				case 4:
					// 执行选项4的逻辑
					break;
				case 5:
					System.out.println("\n=======欢迎下次光临=======");
					break;
				default:
					System.out.println("\n=======没有这个选项=======");
					break;
				}
			}
		} else {
			System.out.println("\n管理员名称或密码输入错误!\n");
		}
		input.close(); // 关闭Scanner以释放资源
	}

	public static void main(String[] args) {
		new ElmAdminEntry().work();
	}
}
