package linkedlist;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class Ticket {
    int ticketId;
    String customerName;
    String movieName;
    String seatNumber;
    String bookingTime;
    Ticket next;

    Ticket(int ticketId, String customerName, String movieName, String seatNumber) {
        this.ticketId = ticketId;
        this.customerName = customerName;
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.bookingTime = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        this.next = null;
    }
}

class TicketCircularList {
    private Ticket tail = null;

    // Add ticket at end
    public void addTicket(int ticketId, String customerName, String movieName, String seatNumber) {
        Ticket newTicket = new Ticket(ticketId, customerName, movieName, seatNumber);
        if (tail == null) {
            tail = newTicket;
            tail.next = tail;
        } 
        else {
            newTicket.next = tail.next;
            tail.next = newTicket;
            tail = newTicket;
        }
        System.out.println("Ticket added successfully for " + customerName);
    }

    // Remove ticket by ID
    public void removeTicket(int ticketId) {
        if (tail == null) {
            System.out.println("No tickets to remove.");
            return;
        }

        Ticket curr = tail.next, prev = tail;
        boolean found = false;

        do {
            if (curr.ticketId == ticketId) {
                found = true;
                if (curr == tail && curr.next == tail) {
                    tail = null;
                } 
                else {
                    prev.next = curr.next;
                    if (curr == tail)
                        tail = prev;
                }
                System.out.println("Ticket ID " + ticketId + " removed successfully.");
                break;
            }
            prev = curr;
            curr = curr.next;
        }
        while (curr != tail.next);

        if (!found) {
            System.out.println("Ticket ID not found.");
        }
    }

    
    // Display all tickets
    public void displayTickets() {
        if (tail == null) {
            System.out.println("No tickets booked.");
            return;
        }

        Ticket curr = tail.next;
        System.out.println("\n--- Current Ticket Reservations ---");
        do {
            System.out.println("Ticket ID: " + curr.ticketId);
            System.out.println("Customer Name: " + curr.customerName);
            System.out.println("Movie Name: " + curr.movieName);
            System.out.println("Seat Number: " + curr.seatNumber);
            System.out.println("Booking Time: " + curr.bookingTime);
            System.out.println("---------------------------");
            curr = curr.next;
        } 
        while (curr != tail.next);
    }

    
    // Search tickets by customer name or movie name
    public void searchTickets(String keyword) {
        if (tail == null) {
            System.out.println("No tickets available for search.");
            return;
        }

        Ticket curr = tail.next;
        boolean found = false;

        System.out.println("\n--- Search Results for \"" + keyword + "\" ---");
        do {
            if (curr.customerName.equalsIgnoreCase(keyword) || curr.movieName.equalsIgnoreCase(keyword)) {
                found = true;
                System.out.println("Ticket ID: " + curr.ticketId + ", Customer: " + curr.customerName +
                                   ", Movie: " + curr.movieName + ", Seat: " + curr.seatNumber);
            }
            curr = curr.next;
        } while (curr != tail.next);

        if (!found) {
            System.out.println("No matching tickets found.");
        }
    }

    // Count total tickets
    public int countTickets() {
        if (tail == null) return 0;

        int count = 0;
        Ticket curr = tail.next;
        do {
            count++;
            curr = curr.next;
        } while (curr != tail.next);
        return count;
    }
}

public class ticket_system {
    public static void main(String[] args) {
        TicketCircularList system = new TicketCircularList();

        // Sample usage
        system.addTicket(101, "Alice", "Oppenheimer", "A1");
        system.addTicket(102, "Bob", "Inception", "B3");
        system.addTicket(103, "Charlie", "Oppenheimer", "C2");

        system.displayTickets();

        System.out.println("Total Booked Tickets: " + system.countTickets());

        system.searchTickets("Oppenheimer");
        system.searchTickets("Alice");

        system.removeTicket(102);

        system.displayTickets();
        System.out.println("Total Booked Tickets: " + system.countTickets());
    }
}
