package com.neusoft.elm;

import java.util.Scanner;

public class ElmAdminEntry {

	public void work() {

		System.out.println("---------------------------------------------------------");
		System.out.println("|\t\t\t 饿了么后台管理系统 \t\t\t|");
		System.out.println("---------------------------------------------------------");

		Scanner input = new Scanner(System.in);
		if (true) {
			int menu = 0;
			while (menu != 5) {
				System.out.println("\n=======1.所有商家列表=2.搜索商家=3.新建商家=4.删除商家=5.退出系统=======");
				System.out.println("请输入你的选择：");
				menu = input.nextInt();
				switch (menu) {
				case 1:
					// 执行选项1的逻辑
					break;
				case 2:
					// 执行选项2的逻辑
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
}
