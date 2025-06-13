package level1;
import java.util.*;
public class Sum_of_numbers {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        double total = 0.0;
	        double value;

	        System.out.println("Enter numbers to sum (0 to stop):");
	        while ((value = sc.nextDouble()) != 0) {
	            total += value;
	        }
	        System.out.println("Total sum is: " + total);
	}

}
