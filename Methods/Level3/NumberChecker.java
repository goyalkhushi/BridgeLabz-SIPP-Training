package level3;
import java.util.*;

public class NumberChecker {
	
	 public static void main(String[] args) {
		 
		 	Scanner sc=new Scanner(System.in);
	        int number = 153; 

	        System.out.println("Number: " + number);

	        int digitCount = countDigits(number);
	        System.out.println("Count of Digits: " + digitCount);

	        int[] digits = getDigits(number);
	        System.out.print("Digits: ");
	        for (int d : digits) System.out.print(d + " ");
	        System.out.println();

	        System.out.println("Is Duck Number? " + (isDuckNumber(digits) ? "Yes" : "No"));
	        System.out.println("Is Armstrong Number? " + (isArmstrongNumber(number, digits) ? "Yes" : "No"));

	        findLargestTwo(digits);
	        findSmallestTwo(digits);
	    }

   
    public static int countDigits(int number) {
        return String.valueOf(number).length();
    }

   
    public static int[] getDigits(int number) {
        String s = String.valueOf(number);
        int[] digits = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            digits[i] = s.charAt(i) - '0';
        }
        return digits;
    }

    
    public static boolean isDuckNumber(int[] digits) {
        for (int i = 1; i < digits.length; i++) {
            if (digits[i] == 0) {
                return true;
            }
        }
        return false;
    }

    
    public static boolean isArmstrongNumber(int number, int[] digits) {
        int power = digits.length;
        int sum = 0;
        for (int digit : digits) {
            sum += Math.pow(digit, power);
        }
        return sum == number;
    }

   
    public static void findLargestTwo(int[] digits) {
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE;

        for (int digit : digits) {
            if (digit > max1) {
                max2 = max1;
                max1 = digit;
            } else if (digit > max2 && digit != max1) {
                max2 = digit;
            }
        }

        System.out.println("Largest Digit: " + max1);
        System.out.println("Second Largest Digit: " + (max2 == Integer.MIN_VALUE ? "None" : max2));
    }

    
    public static void findSmallestTwo(int[] digits) {
        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;

        for (int digit : digits) {
            if (digit < min1) {
                min2 = min1;
                min1 = digit;
            } else if (digit < min2 && digit != min1) {
                min2 = digit;
            }
        }

        System.out.println("Smallest Digit: " + min1);
        System.out.println("Second Smallest Digit: " + (min2 == Integer.MAX_VALUE ? "None" : min2));
    }

   
}
