package level1;

public class Inventory {
	 
	int itemCode;
	String itemName;
	double price;
	
	
	public Inventory(int itemCode,String itemName,double price) {
		this.itemCode=itemCode;
		this.itemName=itemName;
		this.price=price;
			
	}
	
	public void displayDetails() {
		System.out.println("Inventory Details");
		System.out.println("Code: " +itemCode);
		System.out.println("Name: " +itemName);
		System.out.println("Price: " +price);
		
	}
	
	public double calculateprice(int quantity) {
		return quantity*price;
	}
	
	public static void main(String[] args) {
		Inventory inv=new Inventory(101,"Pen",50);
		inv.displayDetails();
		
		 	int quantity = 3;
	        double totalCost = inv.calculateprice(quantity);
	        System.out.println("Quantity   : " + quantity);
	        System.out.println("Total Cost : ₹" + totalCost);
		
		
	}

}
