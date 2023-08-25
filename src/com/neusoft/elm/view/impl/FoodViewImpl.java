package com.neusoft.elm.view.impl;

import java.util.List;
import java.util.Scanner;

import com.neusoft.elm.dao.FoodDao;
import com.neusoft.elm.dao.impl.FoodDaoImpl;
import com.neusoft.elm.po.Food;
import com.neusoft.elm.view.FoodView;

public class FoodViewImpl implements FoodView {
	private Scanner input = new Scanner(System.in);

	public List<Food> showFoodList(Integer businessId) {
		FoodDao dao = new FoodDaoImpl();
		List<Food> list = dao.listFoodByBusinessId(businessId);
		System.out.println("ʳƷ���\tʳƷ����\tʳƷ����\tʳƷ�۸�");
		for (Food food : list) {
			System.out.println(food.getFoodId() + "\t" + food.getFoodName() + "\t" + food.getFoodExplain() + "\t"
					+ food.getFoodPrice());
		}
		return list;
	}

	@Override
	public void saveFood(Integer businessId) {
		Food food = new Food();
		System.out.println("������ʳƷ���ƣ�");
		food.setFoodName(input.next());
		System.out.println("������ʳƷ���ܣ�");
		food.setFoodExplain(input.next());
		System.out.println("������ʳƷ�۸�");
		food.setFoodPrice(input.nextDouble());
		food.setBusinessId(businessId);
		FoodDao dao = new FoodDaoImpl();
		int result = dao.saveFood(food);
		if (result > 0) {
			System.out.println("\n����ʳƷ�ɹ���\n");
		} else {
			System.out.println("\n����ʳƷʧ�ܣ�\n");
		}

	}

	@Override
	public void updateFood(Integer businessId) {
		FoodDao dao = new FoodDaoImpl();
		List<Food> list = showFoodList(businessId);
		if (list.size() == 0) {
			System.out.println("û���κ�ʳƷ!!!");
			return;
		}
		System.out.println("��ѡ��Ҫ���µ�ʳƷ��ţ�");
		int foodId = input.nextInt();
		Food food = dao.getFoodById(foodId);
		System.out.println(food);

		String inputStr = "";
		System.out.println("�Ƿ����ʳƷ����(y/n)��");
		inputStr = input.next();
		if (inputStr.equals("y")) {
			System.out.println("�������µ�ʳƷ���ƣ�");
			food.setFoodName(input.next());
		}

		System.out.println("�Ƿ����ʳƷ����(y/n)��");
		inputStr = input.next();
		if (inputStr.equals("y")) {
			System.out.println("�������µ�ʳƷ���ܣ�");
			food.setFoodExplain(input.next());
		}

		System.out.println("�Ƿ����ʳƷ�۸�(y/n)��");
		inputStr = input.next();
		if (inputStr.equals("y")) {
			System.out.println("�������µ�ʳƷ�۸�");
			food.setFoodPrice(input.nextDouble());
		}
		int result = dao.updateFood(food);
		if (result > 0) {
			System.out.println("\n�޸�ʳƷ�ɹ���\n");
		} else {
			System.out.println("\n�޸�ʳƷʧ�ܣ�\n");
		}

	}

	@Override
	public void removeFood(Integer businessId) {
		FoodDao dao = new FoodDaoImpl();
		List<Food> list = showFoodList(businessId);
		if (list.size() == 0) {
			System.out.println("û���κ�ʳƷ��");
			return;
		}
		System.out.println("��ѡ��Ҫɾ����ʳƷ��ţ�");
		int foodId = input.nextInt();

		System.out.println("ȷ��Ҫɾ����(y/n)��");
		if (input.next().equals("y")) {
			int result = dao.removeFood(foodId);
			if (result > 0) {
				System.out.println("\nɾ��ʳƷ�ɹ���\n");
			} else {
				System.out.println("\nɾ��ʳƷʧ�ܣ�\n");
				return;
			}
		}
	}

}
