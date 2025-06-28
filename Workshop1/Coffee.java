package level2;
import java.util.*;

public class Coffee {

	public static void main(String [] args) {
		
		Scanner sc=new Scanner(System.in);
		 String coffeeType;
	        int quantity;
	        double price = 0;
	        double gstRate = 0.18;

	        while (true) {
	            System.out.print("\nEnter coffee type (espresso, cappuccino, latte, mocha) or type 'exit' to stop: ");
	            coffeeType = sc.nextLine().toLowerCase();
	            if (coffeeType.equals("exit")) {
	                System.out.println("Thank you for visiting Ravi's Cafe ");
	                break;
	            }

	            System.out.print("Enter quantity: ");
	            quantity = sc.nextInt();
	            sc.nextLine();  

	            switch (coffeeType) {
	                case "espresso":
	                    price = 100;
	                    break;
	                case "cappuccino":
	                    price = 120;
	                    break;
	                case "latte":
	                    price = 130;
	                    break;
	                case "mocha":
	                    price = 150;
	                    break;
	                default:
	                    System.out.println("Invalid coffee type. Please try again.");
	                    continue;
	            }

	            double bill = price * quantity;
	            double gstAmount = bill * gstRate;
	            double totalAmount = bill + gstAmount;

	            System.out.println("Bill without GST: " + bill);
	            System.out.println("GST (18%): " + gstAmount);
	            System.out.println("Total Amount to Pay: ₹" + totalAmount);
	            
	        }

	}
}
