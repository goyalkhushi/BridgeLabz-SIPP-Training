package level1;

public class Book {
	
	static  String libraryName="Central Library";
	
	final String isbn;
	
	String title;
	String author;
	
	Book(String title,String author, String isbn){
		this.title=title;
		this.author=author;
		this.isbn=isbn;
	}
	
	
	static void displayLibraryName() {
		System.out.print("Library Name  " +libraryName);
	}
	
	void displayInfo() { 
		System.out.println("Title of Book: " +title);
		System.out.println("Author of Book: " +author);
		System.out.println("The ISBN of Book: " +isbn);
		
	}

	public static void main (String[] args) {
		
		Book obj1=new Book("It Ends With Us","Collen Hover","1234567890");
		Book obj2=new Book("It Start With Us","Collen Hover","2456181950");
		
		if(obj1 instanceof Book) {
			System.out.println("\n Book1 Details");
			obj1.displayInfo();
		
		}
		
		if(obj2 instanceof Book) {
			System.out.println("\n Book2 Details");
			obj2.displayInfo();
		
		}
		System.out.println();
		Book.displayLibraryName();
	}
	
}
