package level1;

public class Book {
   
	
    String title;
    String author;
    double price;

   
    public Book() {
        this.title = "Unknown Title";
        this.author = "Unknown Author";
        this.price = 0.0;
    }

    
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    
    public void displayBookInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
    }

   
    public static void main(String[] args) {
        
        Book book1 = new Book();
        book1.displayBookInfo();

        System.out.println();

      
        Book book2 = new Book("Ikigai", "Francesc Miralles", 299.99);
        book2.displayBookInfo();
    }
}
