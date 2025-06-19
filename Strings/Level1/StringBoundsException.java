package level1;
import java.util.*;

public class StringBoundsException {

	public static void main(String[] args) {
		
		 Scanner scanner = new Scanner(System.in);
	        String st = scanner.next();

	       
	        try {
	            generateException(st);
	        } 
	        catch (StringIndexOutOfBoundsException e) {
	            System.out.println("Exception caught in main: " + e);
	        }

	        System.out.println("\n--- Handling the Exception ---");
	        handleException(st);
	}
	
	 public static void generateException(String input) {
	        
	        System.out.println("Character at index " + input.length() + ": " + input.charAt(input.length()));
	    }
	 
	 public static void handleException(String input) {
	        try {
	            
	            System.out.println("Character at index " + input.length() + ": " + input.charAt(input.length()));
	        } 
	        catch (StringIndexOutOfBoundsException e) {
	            System.out.println("Caught StringIndexOutOfBoundsException!");
	            System.out.println("Exception message: " + e.getMessage());
	        }
	    }

}
