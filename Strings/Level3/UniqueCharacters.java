package level3;
import java.util.*;

public class UniqueCharacters {
	
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a string: ");
	        String userInput = scanner.nextLine();

	        char[] unique = findUniqueCharacters(userInput);

	        System.out.println("\nUnique characters in the string:");
	        for (char c : unique) {
	            System.out.print(c + " ");
	        }
	    }
	
	 public static int getLength(String text) {
	        int count = 0;
	        try {
	            while (true) {
	                text.charAt(count);
	                count++;
	            }
	        } catch (StringIndexOutOfBoundsException e) {}
	        return count;
	    }

	 public static char[] findUniqueCharacters(String input) {
	        int len = getLength(input);
	        char[] temp = new char[len];
	        int uniqueCount = 0;

	        for (int i = 0; i < len; i++) {
	            char current = input.charAt(i);
	            boolean isDuplicate = false;

	            for (int j = 0; j < i; j++) {
	                if (input.charAt(j) == current) {
	                    isDuplicate = true;
	                    break;
	                }
	            }

	            if (!isDuplicate) {
	                temp[uniqueCount] = current;
	                uniqueCount++;
	            }
	        }

	        // Create a properly sized array to hold the unique characters
	        char[] uniqueChars = new char[uniqueCount];
	        for (int k = 0; k < uniqueCount; k++) {
	            uniqueChars[k] = temp[k];
	        }

	        return uniqueChars;
	    }
}
