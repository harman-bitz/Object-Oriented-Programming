package week2_assignment4;

import java.util.*;


interface Discountable {
	void applyDiscount(double percentage);
	String getDiscountDetails();
}


abstract class FoodItem implements Discountable {
	private String itemName;
	protected double price;
	protected int quantity;

	public FoodItem(String itemName, double price, int quantity) {
		this.itemName = itemName;
		this.price = price;
		this.quantity = quantity;
	}

	public abstract double calculateTotalPrice();

	public String getItemDetails() {
		return "Item: " + itemName + ", Price: " + price + ", Quantity: " + quantity;
	}

	@Override
	public void applyDiscount(double percentage) {
		price -= price * (percentage / 100);
	}

	@Override
	public String getDiscountDetails() {
		return "Discounted Price: " + price;
	}
}


class VegItem extends FoodItem {
	public VegItem(String itemName, double price, int quantity) {
		super(itemName, price, quantity);
	}

	@Override
	public double calculateTotalPrice() {
		return price * quantity;
	}
}


class NonVegItem extends FoodItem {
	private static final double EXTRA_CHARGE = 20.0; 

	public NonVegItem(String itemName, double price, int quantity) {
		super(itemName, price, quantity);
	}

 	@Override
 	public double calculateTotalPrice() {
 		return (price + EXTRA_CHARGE) * quantity;
 	}
}


public class FoodDeliverySystem {
	public static void main(String[] args) {
		List<FoodItem> order = new ArrayList<>();
		order.add(new VegItem("Paneer Butter Masala", 250, 2));
		order.add(new NonVegItem("Chicken Biryani", 350, 1));
		
		for (FoodItem item : order) {
			System.out.println(item.getItemDetails());
			System.out.println("Total Price: " + item.calculateTotalPrice());
			item.applyDiscount(10);
			System.out.println(item.getDiscountDetails());
			System.out.println("-----------------------------");
		}
	}
}

