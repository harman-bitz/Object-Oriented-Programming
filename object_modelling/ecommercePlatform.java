import java.util.ArrayList;
import java.util.List;

class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return this.name;
    }

    public double getPrice() {
        return this.price;
    }

    // Display product details
    public void displayProductInfo() {
        System.out.println("Product: " + this.name + ", Price: $" + this.price);
    }
}

// Order class represents an order made by a customer and aggregates products
class Order {
    private static int orderCounter = 1;
    private int orderId;
    private List<Product> products;
    private Customer customer;

    public Order(Customer customer) {
        this.orderId = orderCounter++;
        this.customer = customer;
        this.products = new ArrayList<>();
    }

    // Add a product to the order
    public void addProduct(Product product) {
        products.add(product);
    }

    // Display order details
    public void displayOrderInfo() {
        System.out.println("Order ID: " + this.orderId + " placed by " + customer.getName());
        System.out.println("Products in this order:");
        for (Product product : products) {
            product.displayProductInfo();
        }
        System.out.println("Total amount: $" + calculateTotalAmount());
    }

    // Calculate the total amount for the order
    public double calculateTotalAmount() {
        double total = 0;
        for (Product product : products) {
            total += product.getPrice();
        }
        return total;
    }
}

// Customer class represents a customer who places orders
class Customer {
    private String name;
    private List<Order> orders;

    public Customer(String name) {
        this.name = name;
        this.orders = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    // Customer places an order
    public Order placeOrder() {
        Order order = new Order(this);  // Create a new order associated with this customer
        orders.add(order);              // Add the order to the customer's list of orders
        return order;                   // Return the created order
    }

    // Display customer order history
    public void displayCustomerOrders() {
        System.out.println("Orders placed by " + this.name + ":");
        for (Order order : orders) {
            order.displayOrderInfo();
        }
    }
}

public class ecommercePlatform {

    public static void main(String[] args) {
        // Create products
        Product product1 = new Product("Laptop", 1200);
        Product product2 = new Product("Smartphone", 800);
        Product product3 = new Product("Headphones", 150);

        // Create a customer
        Customer customer = new Customer("Alice");

        // Customer places an order
        Order order1 = customer.placeOrder();
        order1.addProduct(product1);
        order1.addProduct(product2);

        // Customer places another order
        Order order2 = customer.placeOrder();
        order2.addProduct(product3);

        // Display customer orders
        customer.displayCustomerOrders();
    }
}
