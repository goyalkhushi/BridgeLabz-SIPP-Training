package level1;

public class HotelBooking {
   
    String guestName;
    String roomType;
    int nights;

    
    public HotelBooking() {
        this("Guest", "Standard", 1);  
    }

    
    public HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    
    public HotelBooking(HotelBooking other) {
        this.guestName = other.guestName;
        this.roomType = other.roomType;
        this.nights = other.nights;
    }

    
    public void displayBookingInfo() {
        System.out.println("Guest Name: " + guestName);
        System.out.println("Room Type: " + roomType);
        System.out.println("Number of Nights: " + nights);
    }

    
    public static void main(String[] args) {
       
        HotelBooking booking1 = new HotelBooking();
        System.out.println("Default Booking:");
        booking1.displayBookingInfo();

        System.out.println();

       
        HotelBooking booking2 = new HotelBooking("John Doe", "Deluxe", 3);
        System.out.println("Parameterized Booking:");
        booking2.displayBookingInfo();

        System.out.println();

      
        HotelBooking booking3 = new HotelBooking(booking2);
        System.out.println("Copied Booking:");
        booking3.displayBookingInfo();
    }
}
