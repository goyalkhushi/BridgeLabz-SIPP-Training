package level1;

public class LibraryBook {

	    
	    String title;
	    String author;
	    double price;
	    boolean isAvailable;

	    // Constructor
	    public LibraryBook(String title, String author, double price, boolean isAvailable) {
	        this.title = title;
	        this.author = author;
	        this.price = price;
	        this.isAvailable = isAvailable;
	    }

	   
	    public void borrowBook() {
	        if (isAvailable) {
	            isAvailable = false;
	            System.out.println("You have successfully borrowed: " + title);
	        } 
	        else {
	            System.out.println("Sorry, the book \"" + title + "\" is currently not available.");
	        }
	    }

	  
	    public void displayBookInfo() {
	        System.out.println("Title: " + title);
	        System.out.println("Author: " + author);
	        System.out.println("Price: ₹" + price);
	        System.out.println("Available: " + (isAvailable ? "Yes" : "No"));
	    }

	   
	    public static void main(String[] args) {
	        LibraryBook book1 = new LibraryBook("The Alchemist", "Paulo Coelho", 350.0, true);

	        System.out.println("Book Details:");
	        book1.displayBookInfo();

	        System.out.println("\nTrying to borrow the book:");
	        book1.borrowBook();

	        System.out.println("\nBook Details after borrowing:");
	        book1.displayBookInfo();

	        System.out.println("\nTrying to borrow the book again:");
	        book1.borrowBook();
	    }
	


}
