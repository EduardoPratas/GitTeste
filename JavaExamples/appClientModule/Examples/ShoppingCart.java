package Examples;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import Examples.ParkingLot.Lot;
import Examples.ShoppingCart.Item;

import java.text.NumberFormat;

// ***************************************************************
//  Uses the Item class to create items and add them to a shopping
//  cart stored in an ArrayList.
//***************************************************************

public class ShoppingCart {

	static ArrayList<Item> items = new ArrayList<Item>();

	public void addToCart(String itemName, double price, int quantity) {

		Item it = new Item(itemName, price, quantity);
		items.add(it);

	}

	public void addToCart(Item it) {
		items.add(it);
	}

	public void removeFromCart(String itemName) {
		Iterator<Item> itr = items.iterator();
		while (itr.hasNext()) {
			Item it = itr.next();
			if (it.name.equals(itemName)) {
				itr.remove();

			}
		}
	}

	// -------------------------------------------------------
	// Return a string with the information about the item
	// -------------------------------------------------------
	public String toString() {
		String s = "";
		for (Item i : items)
			s += "Name: " + i.name + " Price: " + i.price + " Quantity: " + i.quantity + "\n";

		return s;
	}

	public static class Item {
		private String name;
		private double price;
		private int quantity;

		// -------------------------------------------------------
		// Create a new item with the given attributes.
		// -------------------------------------------------------
		public Item(String itemName, double itemPrice, int numPurchased) {
			name = itemName;
			price = itemPrice;
			quantity = numPurchased;
		}

		// -------------------------------------------------
		// Returns the unit price of the item
		// -------------------------------------------------
		public double getPrice() {
			return price;
		}

		// -------------------------------------------------
		// Returns the name of the item
		// -------------------------------------------------
		public String getName() {
			return name;
		}

		// -------------------------------------------------
		// Returns the quantity of the item
		// -------------------------------------------------
		public int getQuantity() {
			return quantity;
		}

		// -------------------------------------------------
		// @Override equals
		// -------------------------------------------------
		@Override
		public boolean equals(Object o) {
			return (((Item) o).name == this.name);
		}

	}

	public static void main(String[] args) {
		// ArrayList<Item> cart = new ArrayList<Item>();

		ShoppingCart shoppingCart = new ShoppingCart();
		String itemName;
		double itemPrice;
		int quantity;

		ShoppingCart.Item item1 = new Item("item 1", 10, 2);
		ShoppingCart.Item item2 = new Item("item 2", 20, 1);
		ShoppingCart.Item item3 = new Item("item 3", 30, 2);

		shoppingCart.addToCart(item1);
		shoppingCart.addToCart(item2);
		shoppingCart.addToCart(item3);
		
		shoppingCart.removeFromCart("item 1");

		System.out.println("" + shoppingCart);

		/*
		 * do { System.out.print("Enter the name of the item: "); itemName =
		 * scan.next();
		 * 
		 * System.out.print("Enter the unit price: "); itemPrice = scan.nextDouble();
		 * 
		 * System.out.print("Enter the quantity: "); quantity = scan.nextInt();
		 * 
		 * // *** create a new item and add it to the cart cart1.addToCart(itemName,
		 * itemPrice, quantity);
		 * 
		 * // *** print the contents of the cart object using println
		 * System.out.println(cart1);
		 * 
		 * System.out.print("Continue shopping (y/n)? "); keepShopping = scan.next();
		 * 
		 * } while (keepShopping.equals("y"));
		 * 
		 */

	}
}
