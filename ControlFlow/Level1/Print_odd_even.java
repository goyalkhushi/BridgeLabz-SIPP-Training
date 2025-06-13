package level1;
import java.util.*;
public class Print_odd_even {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        int number = sc.nextInt();

	        if (number >= 1) {
	            for (int i = 1; i <= number; i++) {
	                if (i % 2 == 0) {
	                    System.out.println(i + " is an even number");
	                } else {
	                    System.out.println(i + " is an odd number");
	                }
	            }
	        } else {
	            System.out.println("Not a natural number");
	        }
	}

}
