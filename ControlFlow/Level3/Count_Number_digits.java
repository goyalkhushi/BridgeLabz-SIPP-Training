package level3;
import java.util.*;

public class Count_Number_digits {

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int number = sc.nextInt();
	        
	        int count = 0;
	        int originalNumber = number;
	        if (number == 0) {
	            count = 1;
	        } else {
	            while (number != 0) {
	                number = number / 10;  
	                count++;
	            }
	        }
	        System.out.println("Number of digits in " + originalNumber + " is: " + count);
	}

}
