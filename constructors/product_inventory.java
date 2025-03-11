class Product {
	String productName;
	double price;
	static int totalProduct = 0;
	
	Product(String productName, double price) {
		this.productName = productName;
		this.price = price;
		totalProduct++;
	}
	
	void displayProductDetails() {
		System.out.println("ProductName : "+productName);
		System.out.println("Price : ₹"+price);
	}
	
	static void displayTotalProducts() {
		System.out.println("Total Products : "+totalProduct);
	}
}


public class product_inventory {

	public static void main(String[] args) {
		
		Product p1 = new Product("Chips",20.00);
		Product p2 = new Product("Palm Oil",40.23);
		
		p1.displayProductDetails();
		
		System.out.println();
		
		p2.displayProductDetails();
		
		System.out.println();
		
		Product.displayTotalProducts();

	}

}