package com.neusoft.elm;

import java.util.Scanner;

public class ElmAdminEntry {

	public void work() {

		System.out.println("---------------------------------------------------------");
		System.out.println("|\t\t\t ����ô��̨����ϵͳ \t\t\t|");
		System.out.println("---------------------------------------------------------");

		Scanner input = new Scanner(System.in);
		if (true) {
			int menu = 0;
			while (menu != 5) {
				System.out.println("\n=======1.�����̼��б�=2.�����̼�=3.�½��̼�=4.ɾ���̼�=5.�˳�ϵͳ=======");
				System.out.println("���������ѡ��");
				menu = input.nextInt();
				switch (menu) {
				case 1:
					// ִ��ѡ��1���߼�
					break;
				case 2:
					// ִ��ѡ��2���߼�
					break;
				case 3:
					// ִ��ѡ��3���߼�
					break;
				case 4:
					// ִ��ѡ��4���߼�
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
}
