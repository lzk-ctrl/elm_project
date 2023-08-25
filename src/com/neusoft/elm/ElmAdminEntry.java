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
		System.out.println("|\t\t\t ����ô��̨����ϵͳ \t\t\t|");
		System.out.println("-----------------------------------------------------------------");
		AdminView adminView = new AdminViewImpl();
		BusinessView businessView = new BusinessViewImpl();
		Admin admin = adminView.login();

		Scanner input = new Scanner(System.in);
		if (admin != null) {
			int menu = 0;
			while (menu != 5) {
				System.out.println("\n=======1.�����̼��б�=2.�����̼�=3.�½��̼�=4.ɾ���̼�=5.�˳�ϵͳ=======");
				System.out.println("���������ѡ��");
				menu = input.nextInt();
				switch (menu) {
				case 1:
					businessView.listBusinessAll();
					break;
				case 2:
					businessView.listBusiness();
					break;
				case 3:
					businessView.saveBusiness();
					break;
				case 4:
					businessView.removeBusiness();
					break;
				case 5:
					System.out.println("\n=======��ӭ�´ι���=======");
					break;
				default:
					System.out.println("\n=======û�����ѡ��=======");
					break;
				}
			}
		} else {
			System.out.println("\n����Ա���ƻ������������!\n");
		}
		input.close(); // �ر�Scanner���ͷ���Դ
	}

	public static void main(String[] args) {
		new ElmAdminEntry().work();
	}
}
