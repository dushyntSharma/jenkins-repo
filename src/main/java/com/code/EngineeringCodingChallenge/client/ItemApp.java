package com.code.EngineeringCodingChallenge.client;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.code.EngineeringCodingChallenge.model.Item;
import com.code.EngineeringCodingChallenge.service.FileInputUser;
import com.code.EngineeringCodingChallenge.service.ItemService;
import com.code.EngineeringCodingChallenge.service.ItemServiceImpl;

public class ItemApp {
	static Scanner sc = new Scanner(System.in);
	static ItemService service = new ItemServiceImpl();

	public static void main(String[] args) {
		boolean flag = true;
		int choice = 0;
		do {
			displayMenu();
			System.out.println("Enter your choice");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				String s = addItemDetails();
				System.out.println(s);
				break;

			case 2:
				List<Item> item = service.displayShopDetails();
				System.out.println(item.toString());
				List<String> s1 = FileInputUser.fileFromUser();
				System.out.println(s1);

				break;

			case 3:
				List<Item> item1 = service.displayShopDetails();
				List<String> s2 = FileInputUser.fileFromUser();
				for (Iterator iterator = item1.iterator(); iterator.hasNext();) {
					String string = (String) iterator.next();
					for (Iterator iterator2 = s2.iterator(); iterator2.hasNext();) {
						String str = (String) iterator2.next();
												

					}

				}

			default:
				System.out.println("Invalid choice!!");
				break;
			}

		} while (flag);
	}

	private static void generateBill(List<Item> item) {
		// TODO Auto-generated method stub
		Item i = new Item();
		int p = (int) i.getPurchase() - ((int) i.getSell());
		System.out.println(p);
	}

	private static String addItemDetails() {
		// TODO Auto-generated method stub
		List<Item> item = new ArrayList<Item>();
		System.out.println("Enter the  ID");
		int id = sc.nextInt();
		System.out.println("Enter the  name");
		String name = sc.next();
		System.out.println("Enter the purchase");
		sc.nextLine();
		double purchase = sc.nextDouble();
		System.out.println("ENter the sell");
		double sell = sc.nextDouble();

		Item b = new Item(id, name, purchase, sell);
		item.add(b);

		String s = service.addShopDetails(item);
		return s;
	}

	private static void displayMenu() {
		// TODO Auto-generated method stub
		System.out.println("1.Add items ");
		System.out.println("2.check the user item");

		System.out.println();

	}

}
