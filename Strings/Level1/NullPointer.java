package level1;
import java.util.*;

public class NullPointer {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
	
		System.out.println("Demonstrating the exception:");
        try {
            generateException();
        } 
        catch (NullPointerException e) {
            System.out.println("Exception occurred during generateException(): " + e);
        }

      
        System.out.println("\nHandling the exception safely:");
        handleException();

	}
	public static void generateException() {
        String text = null;

        System.out.println("Length of text: " + text.length());
    }
	
	 public static void handleException() {
	        String text = null;

	        try {
	         
	            System.out.println("Length of text: " + text.length());
	        }
	        catch (NullPointerException e) {
	            System.out.println("Caught a NullPointerException!");
	            System.out.println("Exception message: " + e.getMessage());
	        }
	    }

}
