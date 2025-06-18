package level3;
import java.util.*; 

public class NumberChecker3 {
	
	 public static void main(String[] args) {
		 
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int number = scanner.nextInt();

	        int[] digits = getDigits(number);
	        int[] reversed = reverseDigits(digits);
	        boolean isPalindrome = isPalindrome(digits);
	        boolean isDuck = isDuckNumber(digits);

	        
	        System.out.println("\nNumber: " + number);
	        System.out.println("Digit Count: " + countDigits(number));

	        System.out.print("Digits: ");
	        for (int d : digits) System.out.print(d + " ");
	        System.out.println();

	        System.out.print("Reversed Digits: ");
	        for (int d : reversed) System.out.print(d + " ");
	        System.out.println();

	        System.out.println("Is Palindrome? " + (isPalindrome ? "Yes" : "No"));
	        System.out.println("Is Duck Number? " + (isDuck ? "Yes" : "No"));

	        scanner.close();
	    }



	    public static int countDigits(int number) {
	        return String.valueOf(number).length();
	    }

	   
	    public static int[] getDigits(int number) {
	        String str = String.valueOf(number);
	        int[] digits = new int[str.length()];
	        for (int i = 0; i < str.length(); i++) {
	            digits[i] = str.charAt(i) - '0';
	        }
	        return digits;
	    }

	   
	    public static int[] reverseDigits(int[] digits) {
	        int[] reversed = new int[digits.length];
	        for (int i = 0; i < digits.length; i++) {
	            reversed[i] = digits[digits.length - 1 - i];
	        }
	        return reversed;
	    }

	   
	    public static boolean areArraysEqual(int[] a, int[] b) {
	        return Arrays.equals(a, b);
	    }

	    public static boolean isPalindrome(int[] digits) {
	        int[] reversed = reverseDigits(digits);
	        return areArraysEqual(digits, reversed);
	    }

	    public static boolean isDuckNumber(int[] digits) {
	        for (int i = 1; i < digits.length; i++) {
	            if (digits[i] == 0) return true;
	        }
	        return false;
	    }

	   
	   
	

}
