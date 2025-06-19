package level1;
import java.util.*;

public class ArrayIndexBound {
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of names: ");
        int n = scanner.nextInt();
        scanner.nextLine(); 

        String[] names = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            names[i] = scanner.nextLine();
        }
        try {
            generateException(names);
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught exception in main: " + e);
        }

        System.out.println("\n--- Handling the Exception Gracefully ---");
        handleException(names);
    }
	
	 public static void generateException(String[] names) {
	     
	        System.out.println("Accessing names[5]: " + names[5]); // This will throw the exception
	    }

	    public static void handleException(String[] names) {
	        try {
	            System.out.println("Trying to access names[5] safely...");
	            System.out.println("Accessing names[5]: " + names[5]);
	        } 
	        catch (ArrayIndexOutOfBoundsException e) {
	            System.out.println("Caught ArrayIndexOutOfBoundsException!");
	            System.out.println("Exception message: " + e.getMessage());
	        } 
	        catch (RuntimeException e) {
	            System.out.println("Caught a generic RuntimeException!");
	            System.out.println("Exception message: " + e.getMessage());
	        }
	    }

}
