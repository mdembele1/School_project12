package org.perscholas.Files;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MainPoint {

	static HashMap<String, Integer> cart = new HashMap<String, Integer>();

	public static void main(String[] args) {
		Item i = new Item();
		String moreItems = "";
		Scanner scan = new Scanner(System.in);
		do {
			System.out.println("Enter Item Name:");
			i.setItemName(scan.next());
			System.out.println("Enter Item Quantity:");
			i.setItemqty(scan.nextInt());
			boolean b = add(i);
			if (b)
				System.out.println("Added to cart\n" + cart);
			System.out.println("Add more items(Y/N)?");
			moreItems = scan.next();
		} while (!moreItems.equalsIgnoreCase("N"));
		System.out.println("Thank You for shopping with us!!");
		scan.close();
	}

	public static boolean add(Item i) {
		if (cart.containsKey(i.getItemName())) {
			int totalqty = i.getItemqty() + cart.get(i.getItemName());
			cart.replace(i.getItemName(), totalqty);
		} else {
			cart.put(i.getItemName(), i.getItemqty());
		}
		return true;
	}
}
