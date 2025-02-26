//Create an Item class with attributes itemCode, itemName, and price. Add a method to display item details and calculate the total cost for a given quantity.

import java.util.*;
class Item{
    private int itemCode;
    private String itemName;
    private double price;
    

    // call  constructor
    public Item(int itemCode, String itemName, double price){
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.printf("Price: $%.2f%n", price);
    }

    public double calculateTotalCost(int quantity) {
        return price * quantity;
    }


}

public class trackItems {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ItemCode");
        int itemCode= sc.nextInt();
        sc.nextLine();
        System.out.println("Enter ItemName ");
        String itemName = sc.nextLine();
        System.out.println("Enter price of the item ");
        double price = sc.nextDouble();
        Item item = new Item(itemCode,itemName,price);
        item.displayDetails();
        int quantity = 3;
        System.out.printf("Total cost for %d units: $%.2f%n", quantity, item.calculateTotalCost(quantity));
    }
}
