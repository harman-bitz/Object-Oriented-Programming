class Order {
    String orderId;
    String orderDate;
    
    // Constructor
    public Order(String orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }
    
    // Method to get order status
    public String getOrderStatus() {
        return "Order placed";
    }
    
    // Method to display order details
    public void displayOrderDetails() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Order Date: " + orderDate);
        System.out.println("Status: " + getOrderStatus());
    }
}

// Subclass: ShippedOrder (inherits from Order)
class ShippedOrder extends Order {
    String trackingNumber;
    
    // Constructor
    public ShippedOrder(String orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate); // Calling the superclass constructor
        this.trackingNumber = trackingNumber;
    }
    
    // Overriding getOrderStatus() to update status
    @Override
    public String getOrderStatus() {
        return "Order shipped with tracking number: " + trackingNumber;
    }
}

// Subclass: DeliveredOrder (inherits from ShippedOrder)
class DeliveredOrder extends ShippedOrder {
    String deliveryDate;
    
    // Constructor
    public DeliveredOrder(String orderId, String orderDate, String trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber); // Calling the superclass constructor
        this.deliveryDate = deliveryDate;
    }
    
    // Overriding getOrderStatus() to update status
    @Override
    public String getOrderStatus() {
        return "Order delivered on: " + deliveryDate;
    }
}

public class onlineRetailOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Order order = new Order("O1001", "2025-02-13");
	        order.displayOrderDetails();
	        
	        System.out.println("----------------------");
	        
	        // Creating a ShippedOrder object
	        ShippedOrder shippedOrder = new ShippedOrder("O1002", "2025-02-12", "TRK12345");
	        shippedOrder.displayOrderDetails();
	        
	        System.out.println("----------------------");
	        
	        // Creating a DeliveredOrder object
	        DeliveredOrder deliveredOrder = new DeliveredOrder("O1003", "2025-02-10", "TRK67890", "2025-02-13");
	        deliveredOrder.displayOrderDetails();

	}

}
