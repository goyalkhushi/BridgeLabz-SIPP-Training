package level3;
import java.util.*;

public class NumberChecker2 {

	 public static void main(String[] args) {
		 
		 
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int number = scanner.nextInt();

	        int[] digits = getDigits(number);
	        int digitCount = countDigits(number);
	        int sum = sumOfDigits(digits);
	        int squareSum = sumOfSquares(digits);
	        boolean harshad = isHarshad(number, digits);
	        int[][] freq = digitFrequency(digits);

	        // Display results
	        System.out.println("\nNumber: " + number);
	        System.out.println("Total Digits: " + digitCount);

	        System.out.print("Digits: ");
	        for (int d : digits) System.out.print(d + " ");
	        System.out.println();

	        System.out.println("Sum of Digits: " + sum);
	        System.out.println("Sum of Squares of Digits: " + squareSum);
	        System.out.println("Is Harshad Number? " + (harshad ? "Yes" : "No"));

	        System.out.println("Digit Frequency:");
	        for (int[] row : freq) {
	            if (row[1] > 0) {
	                System.out.println("Digit " + row[0] + " → " + row[1] + " time(s)");
	            }
	        }

	        
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

	   
	    public static int sumOfDigits(int[] digits) {
	        int sum = 0;
	        for (int digit : digits) {
	            sum += digit;
	        }
	        return sum;
	    }

	    
	    public static int sumOfSquares(int[] digits) {
	        int sum = 0;
	        for (int digit : digits) {
	            sum += Math.pow(digit, 2);
	        }
	        return sum;
	    }

	    
	    public static boolean isHarshad(int number, int[] digits) {
	        int sum = sumOfDigits(digits);
	        return number % sum == 0;
	    }

	    
	    public static int[][] digitFrequency(int[] digits) {
	        int[][] frequency = new int[10][2]; // digit (0-9), count

	        for (int i = 0; i < 10; i++) {
	            frequency[i][0] = i;
	            frequency[i][1] = 0;
	        }

	        for (int digit : digits) {
	            frequency[digit][1]++;
	        }

	        return frequency;
	    }

	    
	   
	

}
