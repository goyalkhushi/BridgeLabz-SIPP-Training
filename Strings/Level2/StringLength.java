package level2;
import java.util.*;

public class StringLength {
	
	public static void main(String[] args) {
		
		
        Scanner scanner = new Scanner(System.in);

        
        String st = scanner.next();

        int builtInLength = st.length();

        int manualLength = customLength(st);

        System.out.println("\nCalculated using length(): " + builtInLength);
        System.out.println("Calculated without length(): " + manualLength);
        System.out.println("Match? " + (builtInLength == manualLength));
    } 
	
	public static int customLength(String input) {
	        int count = 0;

	        try {
	            while (true) {
	                input.charAt(count); 
	                count++;
	            }
	        }
	        catch (StringIndexOutOfBoundsException e) {
	        	 // When IndexOutOfBoundsException is thrown, we return the count
	        
	        }

	        return count;
	    }

}
