// Class representing an item in the cart
class CartItem {
    String itemName;
    double price;
    int quantity;

    public CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }
}

// Class representing the shopping cart
class ShoppingCart {
    CartItem[] cartItems;
    int itemCount;

    public ShoppingCart(int size) {
        cartItems = new CartItem[size];
        itemCount = 0;
    }

    public void addItem(String itemName, double price, int quantity) {
        if (itemCount < cartItems.length) {
            cartItems[itemCount] = new CartItem(itemName, price, quantity);
            itemCount++;
            System.out.println(itemName + " added to cart.");
        } else {
            System.out.println("Cart is full. Cannot add more items.");
        }
    }

    public void removeItem(String itemName) {
        for (int i = 0; i < itemCount; i++) {
            if (cartItems[i].itemName.equalsIgnoreCase(itemName)) {
                for (int j = i; j < itemCount - 1; j++) {
                    cartItems[j] = cartItems[j + 1];
                }
                cartItems[itemCount - 1] = null;
                itemCount--;
                System.out.println(itemName + " removed from cart.");
                return;
            }
        }
        System.out.println(itemName + " not found in the cart.");
    }

    public void displayTotalCost() {
        double totalCost = 0;
        for (int i = 0; i < itemCount; i++) {
            totalCost += cartItems[i].price * cartItems[i].quantity;
        }
        System.out.println("Total Cost: $" + totalCost);
    }

    public void displayCart() {
        if (itemCount == 0) {
            System.out.println("Your cart is empty.");
            return;
        }
        System.out.println("Shopping Cart:");
        for (int i = 0; i < itemCount; i++) {
            System.out.println(cartItems[i].itemName + " - $" + cartItems[i].price + " x " + cartItems[i].quantity);
        }
    }
}

// Main class to test the implementation
public class ShoppingCartDemo {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart(10); // Maximum of 10 items
        cart.addItem("Laptop", 1000, 1);
        cart.addItem("Phone", 500, 2);
        cart.displayCart();
        cart.displayTotalCost();
        cart.removeItem("Phone");
        cart.displayCart();
        cart.displayTotalCost();
    }
}
