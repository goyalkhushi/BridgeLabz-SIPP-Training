package level1;
import java.util.*;

public class NumberFormat {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a numeric string: ");
        String userInput = scanner.next();

        System.out.println("\n--- Generating the Exception ---");
        try {
            generateException(userInput);
        } 
        catch (NumberFormatException e) {
            System.out.println("Exception caught in main: " + e.getMessage());
        }

        System.out.println("\n--- Handling the Exception Gracefully ---");
        handleException(userInput);
    }
	
	 public static void generateException(String input) {
	        int number = Integer.parseInt(input);
	        System.out.println("Converted number: " + number);
	    }
	 
	public static void handleException(String input) {
        try {
            int number = Integer.parseInt(input);
            System.out.println("Converted number: " + number);
        } 
        catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException!");
            System.out.println("Exception message: " + e.getMessage());
        } 
        catch (RuntimeException e) {
            System.out.println("Caught a generic RuntimeException!");
            System.out.println("Exception message: " + e.getMessage());
        }
    }
}
