package level3;
import java.util.*;

public class NumberChecker4 {
	
	public static void main(String[] args) {
		
		
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        System.out.println("\nResults for number: " + number);
        System.out.println("Is Prime Number? " + (isPrime(number) ? "Yes" : "No"));
        System.out.println("Is Neon Number? " + (isNeon(number) ? "Yes" : "No"));
        System.out.println("Is Spy Number? " + (isSpy(number) ? "Yes" : "No"));
        System.out.println("Is Automorphic Number? " + (isAutomorphic(number) ? "Yes" : "No"));
        System.out.println("Is Buzz Number? " + (isBuzz(number) ? "Yes" : "No"));

    }

	
	    public static boolean isPrime(int number) {
	        if (number <= 1) return false;
	        for (int i = 2; i <= Math.sqrt(number); i++) {
	            if (number % i == 0) return false;
	        }
	        return true;
	    }

	   
	    public static boolean isNeon(int number) {
	        int square = number * number;
	        int sum = 0;
	        while (square > 0) {
	            sum += square % 10;
	            square /= 10;
	        }
	        return sum == number;
	    }

	 
	    public static boolean isSpy(int number) {
	        int sum = 0, product = 1;
	        int temp = number;
	        while (temp > 0) {
	            int digit = temp % 10;
	            sum += digit;
	            product *= digit;
	            temp /= 10;
	        }
	        return sum == product;
	    }

	    
	    public static boolean isAutomorphic(int number) {
	        int square = number * number;
	        return String.valueOf(square).endsWith(String.valueOf(number));
	    }

	   
	    public static boolean isBuzz(int number) {
	        return number % 7 == 0 || number % 10 == 7;
	    }
  


}
