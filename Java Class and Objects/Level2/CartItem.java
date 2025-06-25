package level2;

import java.util.ArrayList;
import java.util.Scanner;

public class CartItem {
    String itemName;
    double price;
    int quantity;
    static ArrayList<CartItem> cart = new ArrayList<>();

    
    CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    
    static void addItem(String itemName, double price, int quantity) {
        CartItem item = new CartItem(itemName, price, quantity);
        cart.add(item);
        System.out.println(itemName + " added to the cart.");
    }

   
    static void removeItem(String itemName) {
        boolean found = false;
        for (int i = 0; i < cart.size(); i++) {
            if (cart.get(i).itemName.equalsIgnoreCase(itemName)) {
                cart.remove(i);
                System.out.println(itemName + " removed from the cart.");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println(itemName + " not found in the cart.");
        }
    }

  
    static void displayTotalCost() {
        double total = 0;
        for (CartItem item : cart) {
            total += item.price * item.quantity;
        }
        System.out.println("Total cost of items in the cart: ₹" + total);
    }

   
    static void displayCartItems() {
        if (cart.isEmpty()) {
            System.out.println("Cart is empty.");
        } else {
            System.out.println("Items in the cart:");
            for (CartItem item : cart) {
                System.out.println(item.itemName + " - ₹" + item.price + " x " + item.quantity);
            }
        }
    }

   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int choice;

        do {
            System.out.println("\nShopping Cart Menu:");
            System.out.println("1. Add Item");
            System.out.println("2. Remove Item");
            System.out.println("3. View Cart");
            System.out.println("4. Total Cost");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Enter item name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter price: ");
                    double price = scanner.nextDouble();
                    System.out.print("Enter quantity: ");
                    int quantity = scanner.nextInt();
                    addItem(name, price, quantity);
                    break;

                case 2:
                    System.out.print("Enter item name to remove: ");
                    String removeName = scanner.nextLine();
                    removeItem(removeName);
                    break;

                case 3:
                    displayCartItems();
                    break;

                case 4:
                    displayTotalCost();
                    break;

                case 5:
                    System.out.println("Exiting... Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice! Please select a valid option.");
            }

        } while (choice != 5);
        scanner.close();
    }
}
