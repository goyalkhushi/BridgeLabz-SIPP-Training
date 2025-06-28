package level2;

import java.util.*;

public class MovieManagementSystem {
	
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maxSeats = 10;
        int totalPrice = 0;
        int ticketsBooked = 0;

        System.out.println("Enter number of tickets you want to book:");
        int tickets = sc.nextInt();

        if (tickets > maxSeats || tickets <= 0) {
            System.out.println("Invalid input! Total seats available are 10 only.");
        } 
        else {
            System.out.println("\nTicket Categories:");
            System.out.println("1 - Gold Ticket (Rs. 300)");
            System.out.println("2 - Silver Ticket (Rs. 200)");
            System.out.println("3 - Platinum Ticket (Rs. 500)");
            System.out.println("4 - Check Total Price (Balance)");
            System.out.println("5 - Check Vacant Seats");

            for (int i = 1; i <= tickets; i++) {
                System.out.print("\nEnter choice for seat " + i + ": ");
                int choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        totalPrice += 300;
                        ticketsBooked++;
                        break;
                    case 2:
                        totalPrice += 200;
                        ticketsBooked++;
                        break;
                    case 3:
                        totalPrice += 500;
                        ticketsBooked++;
                        break;
                    case 4:
                        System.out.println("Current Total Price (Balance): Rs. " + totalPrice);
                        i--;  
                        break;
                    case 5:
                        int vacantSeats = maxSeats - ticketsBooked;
                        System.out.println("Vacant seats available: " + vacantSeats);
                        i--;  
                        break;
                    default:
                        System.out.println("Invalid choice! Please enter a valid option.");
                        i--;  
                        break;
                }
            }

            System.out.println("\nFinal Booking Summary:");
            System.out.println("Total tickets booked: " + ticketsBooked);
            System.out.println("Total price to pay: Rs. " + totalPrice);
            System.out.println("Remaining vacant seats: " + (maxSeats - ticketsBooked));
        }

        
    }
}
