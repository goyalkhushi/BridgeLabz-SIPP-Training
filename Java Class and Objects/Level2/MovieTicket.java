package level2;


public class MovieTicket {

	
	
 String movieName;
 String seatNumber;
 double price;
 boolean isBooked;


 public MovieTicket() {

     this.isBooked = false;
 }


 public void bookTicket(String movieName, String seatNumber, double price) {
     if (!isBooked) {
         this.movieName = movieName;
         this.seatNumber = seatNumber;
         this.price = price;
         this.isBooked = true;
         System.out.println("Ticket booked successfully!");
     }
     else {
         System.out.println("Seat already booked!");
     }
 }

 
 public void displayTicketDetails() {
     if (isBooked) {
         System.out.println("🎟️ Ticket Details:");
         System.out.println("Movie Name : " + movieName);
         System.out.println("Seat Number: " + seatNumber);
         System.out.println("Price      : ₹" + price);
     } 
     else {
         System.out.println("No ticket booked yet.");
     }
 }


 public static void main(String[] args) {
     MovieTicket ticket = new MovieTicket();

   
     ticket.displayTicketDetails();
     System.out.println();

   
     ticket.bookTicket("Avengers: Endgame", "A10", 250.00);
     ticket.displayTicketDetails();
 }
}
