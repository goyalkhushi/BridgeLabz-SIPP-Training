package level1;
import java.util.*;

public class IllegalArgument {

	public static void main(String[] args) {
		 
		Scanner sc=new Scanner(System.in);
	        String st = sc.next();

	        try {
	            generateException(st);
	        } 
	        catch (IllegalArgumentException e) {
	            System.out.println("Exception caught in main: " + e);
	        }

	        System.out.println("\n--- Handling the Exception Gracefully ---");
	        handleException(st);
	    

	}
	 public static void generateException(String input) {
	        System.out.println("Trying to extract substring with invalid indices...");
	        String result = input.substring(5, 2); 
	        System.out.println("Result: " + result);
	    }
	 
	 public static void handleException(String input) {
	        try {
	            System.out.println("Attempting safe substring extraction...");
	            String result = input.substring(5, 2);  
	            System.out.println("Result: " + result);
	        }
	        catch (IllegalArgumentException e) {
	            System.out.println("Caught an IllegalArgumentException!");
	            System.out.println("Exception message: " + e.getMessage());
	        } 
	        catch (RuntimeException e) {
	            System.out.println("Caught a generic runtime exception!");
	            System.out.println("Exception message: " + e.getMessage());
	        }
	    }
}
