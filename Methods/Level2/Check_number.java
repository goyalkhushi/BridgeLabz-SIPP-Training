package level2;
import java.util.*;

public class Check_number {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int[] numbers = new int[5];

        for (int i = 0; i < numbers.length; i++) {
           numbers[i] = sc.nextInt();
        }

        System.out.println("\n--- Number Analysis ---");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Number " + numbers[i] + " is ");
            if (isPositive(numbers[i])) {
                System.out.print("positive and ");
                if (isEven(numbers[i])) {
                    System.out.println("even.");
                } else {
                    System.out.println("odd.");
                }
            } else {
                System.out.println("negative.");
            }
        }

        // Compare first and last elements
        System.out.println("\n--- Comparing First and Last Elements ---");
        int result = compare(numbers[0], numbers[4]);

        if (result == 1) {
            System.out.println("First number (" + numbers[0] + ") is greater than the last number (" + numbers[4] + ").");
        } else if (result == 0) {
            System.out.println("First number and last number are equal (" + numbers[0] + ").");
        } else {
            System.out.println("First number (" + numbers[0] + ") is less than the last number (" + numbers[4] + ").");
        }	

	}
	 public static boolean isPositive(int num) {
	        return num >= 0;
	    }

	 
	    public static boolean isEven(int num) {
	        return num % 2 == 0;
	    }
	    public static int compare(int num1, int num2) {
	        if (num1 > num2)
	            return 1;
	        else if (num1 == num2)
	            return 0;
	        else
	            return -1;
	    }

}
