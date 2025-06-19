package level3;
import java.util.*;

public class Palindrome {
	
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter text to check for palindrome: ");
	        String input = scanner.nextLine();

	        boolean logic1 = isPalindromeIterative(input);
	        boolean logic2 = isPalindromeRecursive(input, 0, input.length() - 1);
	        boolean logic3 = isPalindromeUsingArrays(input);

	        System.out.println("\nPalindrome Check Results:");
	        System.out.println("Using Iterative Logic: " + logic1);
	        System.out.println("Using Recursive Logic: " + logic2);
	        System.out.println("Using Character Arrays: " + logic3);
	    }
	 
	
	  public static boolean isPalindromeIterative(String text) {
	        int start = 0;
	        int end = text.length() - 1;

	        while (start < end) {
	            if (text.charAt(start) != text.charAt(end)) return false;
	            start++;
	            end--;
	        }
	        return true;
	    }
	  
	  public static boolean isPalindromeRecursive(String text, int start, int end) {
	        if (start >= end) return true;
	        if (text.charAt(start) != text.charAt(end)) return false;
	        return isPalindromeRecursive(text, start + 1, end - 1);
	    }
	  
	  
	  public static boolean isPalindromeUsingArrays(String text) {
	        int len = text.length();
	        char[] original = text.toCharArray();
	        char[] reversed = new char[len];

	        for (int i = 0; i < len; i++) {
	            reversed[i] = text.charAt(len - 1 - i);
	        }

	        for (int i = 0; i < len; i++) {
	            if (original[i] != reversed[i]) return false;
	        }

	        return true;
	    }

}
