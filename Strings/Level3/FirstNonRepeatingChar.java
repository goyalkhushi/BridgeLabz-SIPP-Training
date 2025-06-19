package level3;
import java.util.*;

public class FirstNonRepeatingChar {
	
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter a string: ");
	        String input = scanner.nextLine();

	        char result = findFirstNonRepeating(input);

	        if (result != '\0') {
	            System.out.println("First non-repeating character: " + result);
	        } else {
	            System.out.println("No unique characters found in the string.");
	        }
	    }
	
	public static char findFirstNonRepeating(String input) {
        int[] freq = new int[256]; 
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            freq[ch]++;
        }

        
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (freq[ch] == 1) {
                return ch;
            }
        }
        return '\0'; 
	}
}
