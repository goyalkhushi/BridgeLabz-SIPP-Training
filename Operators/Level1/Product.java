package level1;

public class Product {
	
	static double discount;
	final int productId;
	
	String productName;
	double price;
	int quantity;
	
	Product(String productName, double price, int quantity, int productId){
		this.productName=productName;
		this.price=price;
		this.quantity=quantity;
		this.productId=productId;
		
	}
	
	static void updateDiscount(double newDiscount) {
        discount = newDiscount;
        System.out.println("Discount updated to: " + discount + "%");
    }

	
	void displayProductDetails() {
        System.out.println("Product ID: " + productId);
        System.out.println("Product Name: " + productName);
        System.out.println("Price: ₹" + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Current Discount: " + discount + "%");
    }
	
	
	 public static void main(String[] args) {
	       
		 
	        Product p1 = new Product("Laptop", 50000.0, 2, 101);
	        Product p2 = new Product("Headphones", 2000.0, 1, 102);

	      
	        if (p1 instanceof Product) {
	            System.out.println("\nProduct 1 Details:");
	            p1.displayProductDetails();
	        }

	        if (p2 instanceof Product) {
	            System.out.println("\nProduct 2 Details:");
	            p2.displayProductDetails();
	        }
	        
	        Product.updateDiscount(15.0);
	        System.out.println("\nAfter Updating Discount:");

	        
	        if (p1 instanceof Product) {
	            p1.displayProductDetails();
	        }

	        if (p2 instanceof Product) {
	            p2.displayProductDetails();
	        }
	    }

}
