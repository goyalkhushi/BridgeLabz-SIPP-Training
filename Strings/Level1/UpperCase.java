package level1;
import java.util.*;

public class UpperCase {
	
	 public static void main(String[] args) {
		 
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a string: ");
	        String input = scanner.nextLine();
	        String manualUpper = convertToUpperManually(input);
	        String builtInUpper = input.toUpperCase();

	        boolean isSame = compareStrings(manualUpper, builtInUpper);


	        System.out.println("\nManual Uppercase Conversion: " + manualUpper);
	        System.out.println("Built-in toUpperCase() Result: " + builtInUpper);
	        System.out.println("Do both conversions match? " + isSame);
	    }
	 
	    public static String convertToUpperManually(String input) {
		        StringBuilder result = new StringBuilder();
		        for (int i = 0; i < input.length(); i++) {
		            char ch = input.charAt(i);
		            if (ch >= 'a' && ch <= 'z') {
		                ch = (char) (ch - 32); 
		            }
		            result.append(ch);
		        }
		        return result.toString();
		   }
	    
	    
	    public static boolean compareStrings(String s1, String s2) {
	        if (s1.length() != s2.length()) return false;
	        for (int i = 0; i < s1.length(); i++) {
	            if (s1.charAt(i) != s2.charAt(i)) return false;
	        }
	        return true;
	    }

}
